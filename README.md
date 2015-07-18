# LDAP to Kallithea Synchronizer

Synchronize users and groups from LDAP to Kallithea database. Supported databases are:

*    PostgreSQL
*    MySQL

#### Download

Latest snapshots: [kallithea-ldap-sync-0.2.2-SNAPSHOT.tar.gz](https://bitbucket.org/hlavki/kallithea-ldap-sync/downloads/kallithea-ldap-sync-0.2.2-SNAPSHOT.tar.gz)

#### Example configuration:
```properties
ldap.host=localhost
ldap.port=389
ldap.bindDn=cn=Directory Manager
ldap.password=password
# base DN
ldap.user.searchbase=dc=company,dc=com
# filter for user search
ldap.user.filter=(objectClass=person)
# users are search recursively with scope ONE. You need to define filter for nested search
ldap.child.org.filter=(|(objectClass=organization)(objectClass=organizationalUnit))
# username ldap attribute
ldap.user.username.attr=uid
# first name ldap attribute
ldap.user.firstName.attr=givenName
# last name ldap attribute
ldap.user.lastName.attr=sn
# e-mail ldap attribute
ldap.user.mail.attr=mail
# if you want to create group with all ldap users, ucomment this line
#ldap.alluser.group.name=ALL_USERS

#base DN for groups (absolute)
ldap.group.base=ou=Groups,dc=company,dc=com
# filter for group mapping (include group names is recommended)
ldap.group.filter=(&(objectClass=groupOfUniqueNames)(|(cn=EMPLOYEES)(cn=EXTERNAL)))
# ldap group name attribute
ldap.group.name.attr=cn
# ldap description attribute
ldap.group.description.attr=description
# member attribute in group
ldap.group.member.attr=uniqueMember

# define JDBC driver class
kallithea.jdbc.driver=org.postgresql.Driver
# JDBC URL
kallithea.jdbc.url=jdbc:postgresql://localhost:5432/kallithea
kallithea.jdbc.username=kallithea
kallithea.jdbc.password=password
# All objects will be created under this user id (primary key from table USERS)
kallithea.creator.id=2
# define identifier of default user (primary key from table USERS)
kallithea.defaultUser.id=1
# define identifier of admin user (primary key from table USERS)
kallithea.adminUser.id=2
# default user group permission (primary key from table PERMISSIONS e.g. 10 means usergroup.none)
kallithea.userGroupReadPerm.id=10
# identifier of permission that will be granted to admin user (admin user is defined in kallithea.adminUser property)
kallithea.userGroupAdminPerm.id=13
```

#### Usage:
Be aware of that this code is under development and probably contains bugs. **Use on own responsibility!!!**
It is recommended to test it on TEST environment.

```bash
#dry run (only shows what will be changed)
./run.sh --dry

#normal run (write changes)
./run.sh

# custom configuration file
./run.sh -c conf/ldap-sync-test.properties
```

### License

All source code is licensed under Apache License 2.0.
