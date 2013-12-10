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
package org.rhodecode.ldap.sync.model;

import java.util.Set;

/**
 *
 * @author Michal Hlavac <hlavki@hlavki.eu>
 */
public class Group {

    private Integer id;
    private String dn;
    private String name;
    private String description;
    private Set<String> memberDNs;

    public Group() {
    }

    public Group(String dn, String name, String description, Set<String> memberDNs) {
        this.dn = dn;
        this.name = name;
        this.description = description;
        this.memberDNs = memberDNs;
    }

    public Group(Integer id, String dn, String name, String description, Set<String> memberDNs) {
        this.id = id;
        this.dn = dn;
        this.name = name;
        this.description = description;
        this.memberDNs = memberDNs;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getMemberDNs() {
        return memberDNs;
    }

    public void setMemberDNs(Set<String> memberDNs) {
        this.memberDNs = memberDNs;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Group other = (Group) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) return false;
        return true;
    }

    @Override
    public String toString() {
        return getName();
    }

}
