# LDAP to RhodeCode Synchronizer

Synchronize users and groups from LDAP to RhodeCode database. Supported databases are:
*    PostgreSQL
*    MySQL

#### Example configuration:

    ldap.host=localhost
    ldap.port=389
    ldap.bindDn=cn=Directory Manager
    ldap.password=password
    ldap.user.searchbase=dc=company,dc=com
    ldap.user.filter=(objectClass=person)
    ldap.child.org.filter=(|(objectClass=organization)(objectClass=organizationalUnit))
    ldap.user.username.attr=uid
    ldap.user.firstName.attr=givenName
    ldap.user.lastName.attr=sn
    ldap.user.mail.attr=mail
    #ldap.alluser.group.name=ALL_USERS

    ldap.group.base=ou=Groups,dc=company,dc=com
    ldap.group.filter=(&(objectClass=groupOfUniqueNames)(|(cn=EMPLOYEES)(cn=EXTERNAL)))
    ldap.group.name.attr=cn
    ldap.group.description.attr=description
    ldap.group.member.attr=uniqueMember

    rhodecode.jdbc.driver=org.postgresql.Driver
    rhodecode.jdbc.url=jdbc:postgresql://localhost:5432/rhodecode
    rhodecode.jdbc.username=rhodecode
    rhodecode.jdbc.password=password
    rhodecode.creator.id=2
    rhodecode.userGroupReadPerm.id=10
    rhodecode.userGroupAdminPerm.id=13
    rhodecode.defaultUser.id=1
    rhodecode.adminUser.id=2


#### Usage:
Be aware of that this code is under development and probably contains bugs. **Use on own responsibility!!!**
It is recommended that you don't use production database and test it on TEST environment.

    #dry run (only shows what will be changed)
    ./run.sh --dry

    #normal run (write changes)
    ./run.sh

    # custom configuration file
    ./run.sh -c conf/ldap-sync-test.properties

### License

All source code is licensed under Apache License 2.0. Important note is that binary rule tree files (*.lem) are **NOT** licensed under Apache License 2.0 and can be used only for non-commercial projects.
