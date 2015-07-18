/**
 * This class is generated by jOOQ
 */
package org.kallithea.ldap.sync.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.7" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends org.jooq.impl.TableImpl<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord> {

	private static final long serialVersionUID = 1349745626;

	/**
	 * The singleton instance of <code>public.users</code>
	 */
	public static final org.kallithea.ldap.sync.jooq.tables.Users USERS = new org.kallithea.ldap.sync.jooq.tables.Users();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord> getRecordType() {
		return org.kallithea.ldap.sync.jooq.tables.records.UsersRecord.class;
	}

	/**
	 * The column <code>public.users.user_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.users.username</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.password</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.active</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.users.admin</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.Boolean> ADMIN = createField("admin", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.users.firstname</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.lastname</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.email</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.last_login</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.sql.Timestamp> LAST_LOGIN = createField("last_login", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>public.users.extern_type</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.String> EXTERN_TYPE = createField("extern_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.extern_name</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.String> EXTERN_NAME = createField("extern_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.api_key</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.String> API_KEY = createField("api_key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.users.inherit_default_permissions</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.Boolean> INHERIT_DEFAULT_PERMISSIONS = createField("inherit_default_permissions", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this);

	/**
	 * The column <code>public.users.created_on</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.sql.Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>public.users.user_data</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, byte[]> USER_DATA = createField("user_data", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * Create a <code>public.users</code> table reference
	 */
	public Users() {
		super("users", org.kallithea.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.users</code> table reference
	 */
	public Users(java.lang.String alias) {
		super(alias, org.kallithea.ldap.sync.jooq.Public.PUBLIC, org.kallithea.ldap.sync.jooq.tables.Users.USERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord, java.lang.Integer> getIdentity() {
		return org.kallithea.ldap.sync.jooq.Keys.IDENTITY_USERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord> getPrimaryKey() {
		return org.kallithea.ldap.sync.jooq.Keys.USERS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UsersRecord>>asList(org.kallithea.ldap.sync.jooq.Keys.USERS_PKEY, org.kallithea.ldap.sync.jooq.Keys.USERS_USERNAME_KEY, org.kallithea.ldap.sync.jooq.Keys.USERS_EMAIL_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.kallithea.ldap.sync.jooq.tables.Users as(java.lang.String alias) {
		return new org.kallithea.ldap.sync.jooq.tables.Users(alias);
	}
}