/*
 * Copyright 2013 Michal Hlavac <hlavki@hlavki.eu>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kallithea.ldap.sync;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import static org.kallithea.ldap.sync.jooq.Tables.*;
import org.kallithea.ldap.sync.jooq.tables.records.UserUserGroupToPermRecord;
import org.kallithea.ldap.sync.jooq.tables.records.UsersGroupsMembersRecord;
import org.kallithea.ldap.sync.jooq.tables.records.UsersGroupsRecord;
import org.kallithea.ldap.sync.jooq.tables.records.UsersRecord;
import org.kallithea.ldap.sync.model.Group;
import org.kallithea.ldap.sync.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Michal Hlavac <hlavki@hlavki.eu>
 */
public class KallitheaService {

    private static final Logger log = LoggerFactory.getLogger(KallitheaService.class);
    private static final String RC_CREATOR_ID_PROP = "kallithea.creator.id";
    private static final String RC_USER_GROUP_READ_PERM_ID_PROP = "kallithea.userGroupReadPerm.id";
    private static final String RC_USER_GROUP_ADMIN_PERM_ID_PROP = "kallithea.userGroupAdminPerm.id";
    private static final String RC_DEFAULT_USER_ID_PROP = "kallithea.defaultUser.id";
    private static final String RC_USER_ADMIN_USER_ID_PROP = "kallithea.adminUser.id";
    private static final String RC_JDBC_DRIVER_PROP = "kallithea.jdbc.driver";

    protected final Properties config;

    public KallitheaService(Properties config) {
        this.config = config;
        try {
            Class.forName(config.getProperty(RC_JDBC_DRIVER_PROP));
        } catch (ClassNotFoundException e) {
            log.error("Can't load database driver");
        }
    }

    public Set<User> getUsers() {
        Connection conn = null;
        Set<User> users = new HashSet<>();
        try {
            conn = ConnectionProvider.getKallitheaConnection(config);
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);
            Result<Record> result = create.select().from(USERS).where(USERS.EXTERN_TYPE.equal("ldap")).fetch();
            for (Record r : result) {
                Integer id = r.getValue(USERS.USER_ID);
                String username = r.getValue(USERS.USERNAME);
                String firstName = r.getValue(USERS.FIRSTNAME);
                String lastName = r.getValue(USERS.LASTNAME);
                String dn = r.getValue(USERS.EXTERN_NAME);
                String mail = r.getValue(USERS.EMAIL);
                User user = new User(id, dn, username, firstName, lastName, mail);
                users.add(user);
            }
        } catch (SQLException e) {
            log.error("Error occured while reading users from database", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    log.warn("Can't close SQL connection", e);
                }
            }
        }
        return users;
    }

    public Set<Group> getGroups() {
        Connection conn = null;
        Set<Group> groups = new HashSet<>();
        try {
            conn = ConnectionProvider.getKallitheaConnection(config);
            DSLContext create = DSL.using(conn /*, SQLDialect.POSTGRES*/);
            Result<Record> groupSelect = create.select().from(USERS_GROUPS).fetch();
            for (Record r : groupSelect) {
                Integer id = r.getValue(USERS_GROUPS.USERS_GROUP_ID);
                String name = r.getValue(USERS_GROUPS.USERS_GROUP_NAME);
                String description = r.getValue(USERS_GROUPS.USER_GROUP_DESCRIPTION);
                Result<Record1<String>> memberSelect = create.select(USERS.EXTERN_NAME).from(USERS)
                        .join(USERS_GROUPS_MEMBERS).on(USERS_GROUPS_MEMBERS.USER_ID.eq(USERS.USER_ID))
                        .where(USERS_GROUPS_MEMBERS.USERS_GROUP_ID.eq(id)).fetch();
                Set<String> memberDNs = new HashSet<>();
                for (Record1<String> member : memberSelect) {
                    memberDNs.add(member.value1());
                }
                Group group = new Group(id, name, name, description, memberDNs);
                groups.add(group);
            }
        } catch (SQLException e) {
            log.error("Error occured while reading users from database", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    log.warn("Can't close SQL connection", e);
                }
            }
        }
        return groups;
    }

    public void addOrUpdateUsers(Collection<User> users) {
        Connection conn = null;
        try {
            conn = ConnectionProvider.getKallitheaConnection(config);
            conn.setAutoCommit(false);
            int updated = 0;
            for (User user : users) {
                DSLContext create = DSL.using(conn/*, SQLDialect.POSTGRES*/);
                UsersRecord userRec = create.fetchOne(USERS, USERS.USERNAME.eq(user.getUsername()));
                boolean createNew = false;
                if (userRec == null) {
                    userRec = create.newRecord(USERS);
                    userRec.setCreatedOn(new Timestamp(System.currentTimeMillis()));
                    userRec.setExternType("ldap");
                    userRec.setActive(Boolean.TRUE);
                    userRec.setInheritDefaultPermissions(Boolean.TRUE);
                    userRec.setAdmin(Boolean.FALSE);
                    createNew = true;
                }
                userRec.setUsername(user.getUsername());
                userRec.setFirstname(user.getFirstName());
                userRec.setLastname(user.getLastName());
                userRec.setEmail(user.getMail());
                userRec.setExternName(user.getDn());
                if (createNew) {
                    log.info("Creating new user {}", user.getUsername());
                }
                userRec.store();
                user.setId(userRec.getUserId());
                if (createNew) {
                    log.info("Created user {} with id {}", new Object[]{user.getUsername(), user.getId()});
                } else {
                    updated++;
                }
            }
            log.info(updated + " users updated");
            conn.commit();
        } catch (SQLException | DataAccessException e) {
            try {
                if (conn != null) conn.rollback();
            } catch (SQLException e1) {
                log.warn("Can't rollback transaction", e1);
            }
            log.error("Error occured while adding users to database", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    log.warn("Can't close SQL connection", e);
                }
            }
        }
    }

    public void removeUsers(Set<User> users) {
        Connection conn = null;
        try {
            conn = ConnectionProvider.getKallitheaConnection(config);
            conn.setAutoCommit(false);

            for (User user : users) {
                DSLContext create = DSL.using(conn /*, SQLDialect.POSTGRES*/);
                create.delete(USERS_GROUPS_MEMBERS).where(USERS_GROUPS_MEMBERS.USER_ID.eq(user.getId())).execute();
                UsersRecord userRec = create.fetchOne(USERS, USERS.USER_ID.eq(user.getId()));
                log.info("Removing user " + user.getUsername() + " with id " + user.getId());
                userRec.delete();
            }
            conn.commit();
        } catch (SQLException e) {
            try {
                if (conn != null) conn.rollback();
            } catch (SQLException e1) {
                log.warn("Can't rollback transaction", e1);
            }
            log.error("Error occured while adding users to database", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    log.warn("Can't close SQL connection", e);
                }
            }
        }
    }

    public void updateGroups(Set<Group> rhodeGroups, Set<Group> ldapGroups, Map<String, User> dnUsers) {
        Integer creatorId = Integer.parseInt(config.getProperty(RC_CREATOR_ID_PROP));
        Integer userGroupReadPermId = Integer.parseInt(config.getProperty(RC_USER_GROUP_READ_PERM_ID_PROP));
        Integer userGroupAdminPermId = Integer.parseInt(config.getProperty(RC_USER_GROUP_ADMIN_PERM_ID_PROP));
        Integer defaultUserId = Integer.parseInt(config.getProperty(RC_DEFAULT_USER_ID_PROP));
        Integer adminUserId = Integer.parseInt(config.getProperty(RC_USER_ADMIN_USER_ID_PROP));

        Set<Group> addGroups = new HashSet<>(ldapGroups);
        addGroups.removeAll(rhodeGroups);

        Connection conn = null;
        try {
            conn = ConnectionProvider.getKallitheaConnection(config);
            conn.setAutoCommit(false);
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);

            for (Group group : addGroups) {
                UsersGroupsRecord groupRec = create.newRecord(USERS_GROUPS);
                groupRec.setUserId(creatorId);
                groupRec.setUsersGroupActive(Boolean.TRUE);
                groupRec.setUsersGroupName(group.getName());
                groupRec.setUserGroupDescription(group.getDescription());
                groupRec.setCreatedOn(new Timestamp(System.currentTimeMillis()));
                groupRec.setUsersGroupInheritDefaultPermissions(Boolean.TRUE);
                groupRec.store();
                group.setId(groupRec.getUsersGroupId());

                Group rhodeGroup = new Group(group.getId(), group.getDn(), group.getName(), group.getDescription(), Collections.<String>emptySet());
                updateGroupMembership(create, rhodeGroup, getGroupFromSet(group, ldapGroups), dnUsers);

                UserUserGroupToPermRecord permRec = create.newRecord(USER_USER_GROUP_TO_PERM);
                permRec.setUserId(defaultUserId);
                permRec.setUserGroupId(group.getId());
                permRec.setPermissionId(userGroupReadPermId);
                permRec.store();
                permRec = create.newRecord(USER_USER_GROUP_TO_PERM);
                permRec.setUserId(adminUserId);
                permRec.setUserGroupId(group.getId());
                permRec.setPermissionId(userGroupAdminPermId);
                permRec.store();
                log.info("Created Group " + group.getName() + " with id " + group.getId() + " and " + group.getMemberDNs().size() + " members");
            }

            for (Group group : rhodeGroups) {
                Group ldapGroup = getGroupFromSet(group, ldapGroups);
                if (ldapGroup != null) {
                    updateGroupMembership(create, group, ldapGroup, dnUsers);
                }
            }
            conn.commit();
        } catch (SQLException e) {
            try {
                if (conn != null) conn.rollback();
            } catch (SQLException e1) {
                log.warn("Can't rollback transaction", e1);
            }
            log.error("Error occured while adding users to database", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    log.warn("Can't close SQL connection", e);
                }
            }
        }
    }

    protected Group getGroupFromSet(Group searchGroup, Set<Group> groups) {
        Group result = null;
        for (Group group : groups) {
            if (searchGroup.equals(group)) {
                result = group;
            }
        }
        return result;
    }

    private void updateGroupMembership(DSLContext create, Group rhodeGroup, Group ldapGroup,
            Map<String, User> dnUsers) throws SQLException {
        Set<String> addMemberships = new HashSet<>(ldapGroup.getMemberDNs());
        addMemberships.removeAll(rhodeGroup.getMemberDNs());

        Set<String> removeMemberships = new HashSet<>(rhodeGroup.getMemberDNs());
        removeMemberships.removeAll(ldapGroup.getMemberDNs());

        int added = 0;
        for (String memberDn : addMemberships) {
            User user = dnUsers.get(memberDn.toLowerCase());
            if (user != null) {
                Integer userId = user.getId();
                UsersGroupsMembersRecord memberRec = create.newRecord(USERS_GROUPS_MEMBERS);
                memberRec.setUserId(userId);
                memberRec.setUsersGroupId(rhodeGroup.getId());
                memberRec.store();
                added++;
            } else {
                log.warn("Can't read user " + memberDn);
            }
        }
        int removed = 0;
        for (String memberDn : removeMemberships) {
            User user = dnUsers.get(memberDn);
            if (user != null) {
                removed += create.delete(USERS_GROUPS_MEMBERS)
                        .where(USERS_GROUPS_MEMBERS.USER_ID.eq(user.getId())
                                .and(USERS_GROUPS_MEMBERS.USERS_GROUP_ID.equal(rhodeGroup.getId()))).execute();
            }
        }
        log.info("Updated Group " + rhodeGroup.getName() + " with id " + rhodeGroup.getId() + ". All members: "
                + rhodeGroup.getMemberDNs().size() + " Added members: " + added + " Removed members: " + removed);
    }

}
