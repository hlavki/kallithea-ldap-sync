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
public class UsersGroupToPerm extends org.jooq.impl.TableImpl<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord> {

	private static final long serialVersionUID = -850860446;

	/**
	 * The singleton instance of <code>public.users_group_to_perm</code>
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UsersGroupToPerm USERS_GROUP_TO_PERM = new org.rhodecode.ldap.sync.jooq.tables.UsersGroupToPerm();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord> getRecordType() {
		return org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord.class;
	}

	/**
	 * The column <code>public.users_group_to_perm.users_group_to_perm_id</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord, java.lang.Integer> USERS_GROUP_TO_PERM_ID = createField("users_group_to_perm_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.users_group_to_perm.users_group_id</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord, java.lang.Integer> USERS_GROUP_ID = createField("users_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.users_group_to_perm.permission_id</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord, java.lang.Integer> PERMISSION_ID = createField("permission_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * Create a <code>public.users_group_to_perm</code> table reference
	 */
	public UsersGroupToPerm() {
		super("users_group_to_perm", org.rhodecode.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.users_group_to_perm</code> table reference
	 */
	public UsersGroupToPerm(java.lang.String alias) {
		super(alias, org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.rhodecode.ldap.sync.jooq.tables.UsersGroupToPerm.USERS_GROUP_TO_PERM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord, java.lang.Integer> getIdentity() {
		return org.rhodecode.ldap.sync.jooq.Keys.IDENTITY_USERS_GROUP_TO_PERM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord> getPrimaryKey() {
		return org.rhodecode.ldap.sync.jooq.Keys.USERS_GROUP_TO_PERM_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord>>asList(org.rhodecode.ldap.sync.jooq.Keys.USERS_GROUP_TO_PERM_PKEY, org.rhodecode.ldap.sync.jooq.Keys.USERS_GROUP_TO_PERM_USERS_GROUP_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.rhodecode.ldap.sync.jooq.tables.records.UsersGroupToPermRecord, ?>>asList(org.rhodecode.ldap.sync.jooq.Keys.USERS_GROUP_TO_PERM__USERS_GROUP_TO_PERM_USERS_GROUP_ID_FKEY, org.rhodecode.ldap.sync.jooq.Keys.USERS_GROUP_TO_PERM__USERS_GROUP_TO_PERM_PERMISSION_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.rhodecode.ldap.sync.jooq.tables.UsersGroupToPerm as(java.lang.String alias) {
		return new org.rhodecode.ldap.sync.jooq.tables.UsersGroupToPerm(alias);
	}
}
