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
public class UsersGroupRepoGroupToPermRecord extends org.jooq.impl.UpdatableRecordImpl<org.kallithea.ldap.sync.jooq.tables.records.UsersGroupRepoGroupToPermRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -478604793;

	/**
	 * Setter for <code>public.users_group_repo_group_to_perm.users_group_repo_group_to_perm_id</code>.
	 */
	public void setUsersGroupRepoGroupToPermId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.users_group_repo_group_to_perm.users_group_repo_group_to_perm_id</code>.
	 */
	public java.lang.Integer getUsersGroupRepoGroupToPermId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.users_group_repo_group_to_perm.users_group_id</code>.
	 */
	public void setUsersGroupId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.users_group_repo_group_to_perm.users_group_id</code>.
	 */
	public java.lang.Integer getUsersGroupId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.users_group_repo_group_to_perm.group_id</code>.
	 */
	public void setGroupId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.users_group_repo_group_to_perm.group_id</code>.
	 */
	public java.lang.Integer getGroupId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.users_group_repo_group_to_perm.permission_id</code>.
	 */
	public void setPermissionId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.users_group_repo_group_to_perm.permission_id</code>.
	 */
	public java.lang.Integer getPermissionId() {
		return (java.lang.Integer) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.kallithea.ldap.sync.jooq.tables.UsersGroupRepoGroupToPerm.USERS_GROUP_REPO_GROUP_TO_PERM.USERS_GROUP_REPO_GROUP_TO_PERM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.kallithea.ldap.sync.jooq.tables.UsersGroupRepoGroupToPerm.USERS_GROUP_REPO_GROUP_TO_PERM.USERS_GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.kallithea.ldap.sync.jooq.tables.UsersGroupRepoGroupToPerm.USERS_GROUP_REPO_GROUP_TO_PERM.GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.kallithea.ldap.sync.jooq.tables.UsersGroupRepoGroupToPerm.USERS_GROUP_REPO_GROUP_TO_PERM.PERMISSION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getUsersGroupRepoGroupToPermId();
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
		return getGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getPermissionId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UsersGroupRepoGroupToPermRecord
	 */
	public UsersGroupRepoGroupToPermRecord() {
		super(org.kallithea.ldap.sync.jooq.tables.UsersGroupRepoGroupToPerm.USERS_GROUP_REPO_GROUP_TO_PERM);
	}

	/**
	 * Create a detached, initialised UsersGroupRepoGroupToPermRecord
	 */
	public UsersGroupRepoGroupToPermRecord(java.lang.Integer usersGroupRepoGroupToPermId, java.lang.Integer usersGroupId, java.lang.Integer groupId, java.lang.Integer permissionId) {
		super(org.kallithea.ldap.sync.jooq.tables.UsersGroupRepoGroupToPerm.USERS_GROUP_REPO_GROUP_TO_PERM);

		setValue(0, usersGroupRepoGroupToPermId);
		setValue(1, usersGroupId);
		setValue(2, groupId);
		setValue(3, permissionId);
	}
}