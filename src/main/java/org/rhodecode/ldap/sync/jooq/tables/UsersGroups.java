/**
 * This class is generated by jOOQ
 */
package org.rhodecode.ldap.sync.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersGroups extends org.jooq.impl.TableImpl<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord> {

	private static final long serialVersionUID = -1740590934;

	/**
	 * The singleton instance of <code>public.users_groups</code>
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UsersGroups USERS_GROUPS = new org.rhodecode.ldap.sync.jooq.tables.UsersGroups();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord> getRecordType() {
		return org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord.class;
	}

	/**
	 * The column <code>public.users_groups.users_group_id</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, java.lang.Integer> USERS_GROUP_ID = createField("users_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.users_groups.users_group_name</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, java.lang.String> USERS_GROUP_NAME = createField("users_group_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>public.users_groups.user_group_description</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, java.lang.String> USER_GROUP_DESCRIPTION = createField("user_group_description", org.jooq.impl.SQLDataType.VARCHAR.length(10000), this);

	/**
	 * The column <code>public.users_groups.users_group_active</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, java.lang.Boolean> USERS_GROUP_ACTIVE = createField("users_group_active", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.users_groups.users_group_inherit_default_permissions</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, java.lang.Boolean> USERS_GROUP_INHERIT_DEFAULT_PERMISSIONS = createField("users_group_inherit_default_permissions", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this);

	/**
	 * The column <code>public.users_groups.user_id</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, java.lang.Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.users_groups.created_on</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, java.sql.Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>public.users_groups.group_data</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, byte[]> GROUP_DATA = createField("group_data", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * Create a <code>public.users_groups</code> table reference
	 */
	public UsersGroups() {
		super("users_groups", org.rhodecode.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.users_groups</code> table reference
	 */
	public UsersGroups(java.lang.String alias) {
		super(alias, org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.rhodecode.ldap.sync.jooq.tables.UsersGroups.USERS_GROUPS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, java.lang.Integer> getIdentity() {
		return org.rhodecode.ldap.sync.jooq.Keys.IDENTITY_USERS_GROUPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord> getPrimaryKey() {
		return org.rhodecode.ldap.sync.jooq.Keys.USERS_GROUPS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord>>asList(org.rhodecode.ldap.sync.jooq.Keys.USERS_GROUPS_PKEY, org.rhodecode.ldap.sync.jooq.Keys.USERS_GROUPS_USERS_GROUP_NAME_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupsRecord, ?>>asList(org.rhodecode.ldap.sync.jooq.Keys.USERS_GROUPS__USERS_GROUPS_USER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.rhodecode.ldap.sync.jooq.tables.UsersGroups as(java.lang.String alias) {
		return new org.rhodecode.ldap.sync.jooq.tables.UsersGroups(alias);
	}
}
