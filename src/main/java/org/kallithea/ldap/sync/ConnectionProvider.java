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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Michal Hlavac <hlavki@hlavki.eu>
 */
public class ConnectionProvider {

    private static final String RC_JDBC_URL_PROP = "kallithea.jdbc.url";
    private static final String RC_JDBC_USERNAME_PROP = "kallithea.jdbc.username";
    private static final String RC_JDBC_PASSWORD_PROP = "kallithea.jdbc.password";

    public static Connection getKallitheaConnection(Properties config) throws SQLException {
        String url = config.getProperty(RC_JDBC_URL_PROP);
        String username = config.getProperty(RC_JDBC_USERNAME_PROP);
        String password = config.getProperty(RC_JDBC_PASSWORD_PROP);
        return DriverManager.getConnection(url, username, password);
    }
}
