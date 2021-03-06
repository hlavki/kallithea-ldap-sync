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

import com.beust.jcommander.JCommander;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.kallithea.ldap.sync.cmd.MainCmdArgs;
import org.kallithea.ldap.sync.model.Group;
import org.kallithea.ldap.sync.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Michal Hlavac <hlavki@hlavki.eu>
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String ALL_USERS_GROUP_NAME_PROP = "ldap.alluser.group.name";

    public static void main(String[] args) throws Exception {

        final MainCmdArgs cmdArgs = new MainCmdArgs();
        JCommander jc = new JCommander(cmdArgs, args);
        if (cmdArgs.isUsage()) {
            jc.usage();
            return;
        }

        log.info("Using " + cmdArgs.getConfig().getPath() + " configuration file");
        Properties props = new Properties();
        props.load(new FileInputStream(cmdArgs.getConfig()));
        LdapReader ldapReader = new LdapReader(props);
        KallitheaService kallithea;
        if (cmdArgs.isDryRun()) {
            log.info("Using DRY run mode");
            kallithea = new ReadOnlyKallitheaService(props);
        } else {
            log.info("Using production write mode");
            kallithea = new KallitheaService(props);
        }
        try {
            Set<Group> ldapGroups = ldapReader.getGroups();
            Map<String, User> ldapUsers = ldapReader.getUsers();

            String allUsersGroupName = props.getProperty(ALL_USERS_GROUP_NAME_PROP);
            if (allUsersGroupName != null) {
                Group allUsersGroup = new Group((String) null, allUsersGroupName, "All Users Group", ldapUsers.keySet());
                ldapGroups.add(allUsersGroup);
            }

            log.info("All LDAP users count: " + ldapUsers.size());

            kallithea.addOrUpdateUsers(ldapUsers.values());

            // read all kallithea users again
            Set<User> destUsers = kallithea.getUsers();

            Map<String, User> createdUsers = new HashMap<>();
            for (User user : destUsers) {
                createdUsers.put(user.getDn(), user);
            }
            Set<Group> destGroups = kallithea.getGroups();
            kallithea.updateGroups(destGroups, ldapGroups, createdUsers);

            Set<User> usersToRemove = new HashSet<>(destUsers);
            usersToRemove.removeAll(ldapUsers.values());
            log.info("users to remove: " + usersToRemove);
//            kallithea.removeUsers(usersToRemove);
        } finally {
            ldapReader.finish();
        }
    }
}
