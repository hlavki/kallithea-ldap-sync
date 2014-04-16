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
package org.rhodecode.ldap.sync;

import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.SearchResult;
import com.unboundid.ldap.sdk.SearchResultEntry;
import com.unboundid.ldap.sdk.SearchScope;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.rhodecode.ldap.sync.model.Group;
import org.rhodecode.ldap.sync.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Michal Hlavac <hlavki@hlavki.eu>
 */
public class LdapReader {

    private static final Logger log = LoggerFactory.getLogger(LdapReader.class);
    private static final String LDAP_HOST_PROP = "ldap.host";
    private static final String LDAP_PORT_PROP = "ldap.port";
    private static final String LDAP_BIND_DN_PROP = "ldap.bindDn";
    private static final String LDAP_PASSWORD_PROP = "ldap.password";
    private static final String DEFAULT_PORT = "389";
    private static final String LDAP_USER_SEARCH_BASE_PROP = "ldap.user.searchbase";
    private static final String LDAP_USER_SEARCH_FILTER_PROP = "ldap.user.filter";
    private static final String LDAP_USER_USERNAME_ATTR_PROP = "ldap.user.username.attr";
    private static final String LDAP_USER_FIRST_NAME_ATTR_PROP = "ldap.user.firstName.attr";
    private static final String LDAP_USER_LAST_NAME_ATTR_PROP = "ldap.user.lastName.attr";
    private static final String LDAP_USER_MAIL_ATTR_PROP = "ldap.user.mail.attr";
    private static final String LDAP_GROUP_BASE_PROP = "ldap.group.base";
    private static final String LDAP_GROUP_FILTER_PROP = "ldap.group.filter";
    private static final String LDAP_GROUP_NAME_ATTR_PROP = "ldap.group.name.attr";
    private static final String LDAP_GROUP_DESCRIPTION_ATTR_PROP = "ldap.group.description.attr";
    private static final String LDAP_GROUP_MEMBER_ATTR_PROP = "ldap.group.member.attr";
    private static final String LDAP_CHILD_ORG_FILTER_PROP = "ldap.child.org.filter";

    private final LDAPConnection conn;
    private final Properties config;

    public LdapReader(Properties config) throws LDAPException {
        this.config = config;
        String host = config.getProperty(LDAP_HOST_PROP);
        int port = Integer.parseInt(config.getProperty(LDAP_PORT_PROP, DEFAULT_PORT));
        String bindDn = config.getProperty(LDAP_BIND_DN_PROP);
        String password = config.getProperty(LDAP_PASSWORD_PROP);
        conn = new LDAPConnection(host, port, bindDn, password);
    }

    public Map<String, User> getUsers() throws LDAPException {
        String userSearchBaseDN = config.getProperty(LDAP_USER_SEARCH_BASE_PROP);
        Map<String, User> users = new HashMap<>();
        readUsers(users, userSearchBaseDN);
        return users;
    }

    private void readUsers(Map<String, User> result, String baseDn) throws LDAPException {
        String userSearchFilter = config.getProperty(LDAP_USER_SEARCH_FILTER_PROP);
        String usernameAttr = config.getProperty(LDAP_USER_USERNAME_ATTR_PROP);
        String firstNameAttr = config.getProperty(LDAP_USER_FIRST_NAME_ATTR_PROP);
        String lastNameAttr = config.getProperty(LDAP_USER_LAST_NAME_ATTR_PROP);
        String mailAttr = config.getProperty(LDAP_USER_MAIL_ATTR_PROP);
        String childOrgFilter = config.getProperty(LDAP_CHILD_ORG_FILTER_PROP);
        SearchResult search = conn.search(baseDn, SearchScope.ONE, userSearchFilter,
                usernameAttr, firstNameAttr, lastNameAttr, mailAttr);
        for (SearchResultEntry entry : search.getSearchEntries()) {
            String username = entry.getAttributeValue(usernameAttr).toLowerCase();
            String firstName = entry.getAttributeValue(firstNameAttr);
            String lastName = entry.getAttributeValue(lastNameAttr);
            String mail = entry.getAttributeValue(mailAttr);
            String dn = entry.getDN().toLowerCase();
            result.put(dn, new User(dn, username, firstName, lastName, mail));
        }
        search = conn.search(baseDn, SearchScope.ONE, childOrgFilter, "cn");
        for (SearchResultEntry entry : search.getSearchEntries()) {
            readUsers(result, entry.getDN());
        }
    }

    public User getUser(String dn) throws LDAPException {
        String usernameAttr = config.getProperty(LDAP_USER_USERNAME_ATTR_PROP);
        String firstNameAttr = config.getProperty(LDAP_USER_FIRST_NAME_ATTR_PROP);
        String lastNameAttr = config.getProperty(LDAP_USER_LAST_NAME_ATTR_PROP);
        String mailAttr = config.getProperty(LDAP_USER_MAIL_ATTR_PROP);
        SearchResult search = conn.search(dn, SearchScope.BASE, "(&)",
                usernameAttr, firstNameAttr, lastNameAttr, mailAttr);
        SearchResultEntry entry = search.getSearchEntry(dn);
        String username = entry.getAttributeValue(usernameAttr).toLowerCase();
        String firstName = entry.getAttributeValue(firstNameAttr);
        String lastName = entry.getAttributeValue(lastNameAttr);
        String mail = entry.getAttributeValue(mailAttr);
        String userDn = entry.getDN().toLowerCase();
        return new User(userDn, username, firstName, lastName, mail);
    }

    public Set<Group> getGroups() throws LDAPException {
        String baseDN = config.getProperty(LDAP_GROUP_BASE_PROP);
        String filter = config.getProperty(LDAP_GROUP_FILTER_PROP);
        String nameAttr = config.getProperty(LDAP_GROUP_NAME_ATTR_PROP);
        String descriptionAttr = config.getProperty(LDAP_GROUP_DESCRIPTION_ATTR_PROP);
        String memberAttr = config.getProperty(LDAP_GROUP_MEMBER_ATTR_PROP);
        Set<Group> groups = new HashSet<>();
        log.debug("Getting groups. Filter: " + filter);
        SearchResult search = conn.search(baseDN, SearchScope.ONE, filter, nameAttr, descriptionAttr, memberAttr);
        for (SearchResultEntry entry : search.getSearchEntries()) {
            String dn = entry.getDN().toLowerCase();
            String[] members = entry.getAttributeValues(memberAttr);
            Set<String> memberDNs = Collections.emptySet();
            if (members != null) {
                memberDNs = new HashSet<>(Arrays.asList(members));
            }
            String name = entry.getAttributeValue(nameAttr);
            String description = entry.getAttributeValue(descriptionAttr);
            groups.add(new Group(dn, name, description, memberDNs));
        }
        return groups;
    }

    public void finish() {
        if (conn != null) conn.close();
    }
}
