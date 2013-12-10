/**
 * This class is generated by jOOQ
 */
package org.rhodecode.ldap.sync.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserUserGroupToPermRecord extends org.jooq.impl.UpdatableRecordImpl<org.rhodecode.ldap.sync.jooq.tables.records.UserUserGroupToPermRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 2124864089;

	/**
	 * Setter for <code>public.user_user_group_to_perm.user_user_group_to_perm_id</code>. 
	 */
	public void setUserUserGroupToPermId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.user_user_group_to_perm.user_user_group_to_perm_id</code>. 
	 */
	public java.lang.Integer getUserUserGroupToPermId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.user_user_group_to_perm.user_id</code>. 
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.user_user_group_to_perm.user_id</code>. 
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.user_user_group_to_perm.permission_id</code>. 
	 */
	public void setPermissionId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.user_user_group_to_perm.permission_id</code>. 
	 */
	public java.lang.Integer getPermissionId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.user_user_group_to_perm.user_group_id</code>. 
	 */
	public void setUserGroupId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.user_user_group_to_perm.user_group_id</code>. 
	 */
	public java.lang.Integer getUserGroupId() {
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
		return org.rhodecode.ldap.sync.jooq.tables.UserUserGroupToPerm.USER_USER_GROUP_TO_PERM.USER_USER_GROUP_TO_PERM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.rhodecode.ldap.sync.jooq.tables.UserUserGroupToPerm.USER_USER_GROUP_TO_PERM.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.rhodecode.ldap.sync.jooq.tables.UserUserGroupToPerm.USER_USER_GROUP_TO_PERM.PERMISSION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.rhodecode.ldap.sync.jooq.tables.UserUserGroupToPerm.USER_USER_GROUP_TO_PERM.USER_GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getUserUserGroupToPermId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getPermissionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getUserGroupId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserUserGroupToPermRecord
	 */
	public UserUserGroupToPermRecord() {
		super(org.rhodecode.ldap.sync.jooq.tables.UserUserGroupToPerm.USER_USER_GROUP_TO_PERM);
	}

	/**
	 * Create a detached, initialised UserUserGroupToPermRecord
	 */
	public UserUserGroupToPermRecord(java.lang.Integer userUserGroupToPermId, java.lang.Integer userId, java.lang.Integer permissionId, java.lang.Integer userGroupId) {
		super(org.rhodecode.ldap.sync.jooq.tables.UserUserGroupToPerm.USER_USER_GROUP_TO_PERM);

		setValue(0, userUserGroupToPermId);
		setValue(1, userId);
		setValue(2, permissionId);
		setValue(3, userGroupId);
	}
}
