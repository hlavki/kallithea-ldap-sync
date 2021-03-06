/**
 * This class is generated by jOOQ
 */
package org.kallithea.ldap.sync.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.7" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersGroupToPermRecord extends org.jooq.impl.UpdatableRecordImpl<org.kallithea.ldap.sync.jooq.tables.records.UsersGroupToPermRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1807306470;

	/**
	 * Setter for <code>public.users_group_to_perm.users_group_to_perm_id</code>.
	 */
	public void setUsersGroupToPermId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.users_group_to_perm.users_group_to_perm_id</code>.
	 */
	public java.lang.Integer getUsersGroupToPermId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.users_group_to_perm.users_group_id</code>.
	 */
	public void setUsersGroupId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.users_group_to_perm.users_group_id</code>.
	 */
	public java.lang.Integer getUsersGroupId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.users_group_to_perm.permission_id</code>.
	 */
	public void setPermissionId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.users_group_to_perm.permission_id</code>.
	 */
	public java.lang.Integer getPermissionId() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.kallithea.ldap.sync.jooq.tables.UsersGroupToPerm.USERS_GROUP_TO_PERM.USERS_GROUP_TO_PERM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.kallithea.ldap.sync.jooq.tables.UsersGroupToPerm.USERS_GROUP_TO_PERM.USERS_GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.kallithea.ldap.sync.jooq.tables.UsersGroupToPerm.USERS_GROUP_TO_PERM.PERMISSION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getUsersGroupToPermId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUsersGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getPermissionId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UsersGroupToPermRecord
	 */
	public UsersGroupToPermRecord() {
		super(org.kallithea.ldap.sync.jooq.tables.UsersGroupToPerm.USERS_GROUP_TO_PERM);
	}

	/**
	 * Create a detached, initialised UsersGroupToPermRecord
	 */
	public UsersGroupToPermRecord(java.lang.Integer usersGroupToPermId, java.lang.Integer usersGroupId, java.lang.Integer permissionId) {
		super(org.kallithea.ldap.sync.jooq.tables.UsersGroupToPerm.USERS_GROUP_TO_PERM);

		setValue(0, usersGroupToPermId);
		setValue(1, usersGroupId);
		setValue(2, permissionId);
	}
}
