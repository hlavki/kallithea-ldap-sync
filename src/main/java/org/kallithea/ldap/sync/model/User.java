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
package org.kallithea.ldap.sync.model;

/**
 *
 * @author Michal Hlavac <hlavki@hlavki.eu>
 */
public class User {

    private Integer id;
    private String dn;
    private String username;
    private String firstName;
    private String lastName;
    private String mail;

    public User() {
    }

    public User(String dn, String username, String firstName, String lastName, String mail) {
        this.dn = dn;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
    }

    public User(Integer id, String dn, String username, String firstName, String lastName, String mail) {
        this.id = id;
        this.dn = dn;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.username != null ? this.username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final User other = (User) obj;
        if ((this.username == null) ? (other.username != null) : !this.username.equals(other.username))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getUsername();
    }

}
