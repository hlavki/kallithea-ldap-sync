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
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import static org.kallithea.ldap.sync.jooq.Tables.USERS;
import org.kallithea.ldap.sync.jooq.tables.records.UsersRecord;
import org.kallithea.ldap.sync.model.Group;
import org.kallithea.ldap.sync.model.User;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Michal Hlavac <hlavki@hlavki.eu>
 */
public class ReadOnlyKallitheaService extends KallitheaService {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ReadOnlyKallitheaService.class);

    public ReadOnlyKallitheaService(Properties config) {
        super(config);
    }

    @Override
    public void addOrUpdateUsers(Collection<User> users) {
        Connection conn = null;
        try {
            conn = ConnectionProvider.getKallitheaConnection(config);
            int updated = 0;
            for (User user : users) {
                DSLContext create = DSL.using(conn/*, SQLDialect.POSTGRES*/);
                UsersRecord userRec = create.fetchOne(USERS, USERS.USERNAME.eq(user.getUsername()));
                if (userRec == null) {
                    log.info("User " + user.getUsername() + " will be created");
                } else {
                    updated++;
                }
            }
            log.info(updated + " users will be updated");
        } catch (SQLException e) {
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

    @Override
    public void removeUsers(Set<User> users) {
        for (User user : users) {
            log.info("User " + user.getUsername() + " will be removed");
        }
    }

    @Override
    public void updateGroups(Set<Group> destGroups, Set<Group> ldapGroups, Map<String, User> dnUsers) {
        Set<Group> addGroups = new HashSet<>(ldapGroups);
        addGroups.removeAll(destGroups);
        for (Group group : addGroups) {
            log.info("Group " + group.getName() + " will be created with " + group.getMemberDNs().size() + " members");
        }

        for (Group group : destGroups) {
            Group ldapGroup = getGroupFromSet(group, ldapGroups);
            if (ldapGroup != null) {
                updateGroupMembership(group, ldapGroup, dnUsers);
            }
        }
    }

    private void updateGroupMembership(Group destGroup, Group ldapGroup, Map<String, User> dnUsers) {
        Set<String> addMemberships = new HashSet<>(ldapGroup.getMemberDNs());
        addMemberships.removeAll(destGroup.getMemberDNs());

        Set<String> removeMemberships = new HashSet<>(destGroup.getMemberDNs());
        removeMemberships.removeAll(ldapGroup.getMemberDNs());

        int added = 0;
        for (String memberDn : addMemberships) {
            User user = dnUsers.get(memberDn);
            if (user != null) {
                added++;
            } else {
                log.warn("Can't read user " + memberDn);
            }
        }
        int removed = 0;
        for (String memberDn : removeMemberships) {
            User user = dnUsers.get(memberDn);
            if (user != null) {
                removed++;
            }
        }
        log.info("Updated Group " + destGroup.getName() + " with id " + destGroup.getId() + ". All members: "
                + destGroup.getMemberDNs().size() + " Added members: " + added + " Removed members: " + removed);
    }
}
