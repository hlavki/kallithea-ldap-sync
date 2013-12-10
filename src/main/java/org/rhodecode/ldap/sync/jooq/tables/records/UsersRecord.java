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
public class UsersRecord extends org.jooq.impl.UpdatableRecordImpl<org.rhodecode.ldap.sync.jooq.tables.records.UsersRecord> implements org.jooq.Record15<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, byte[]> {

	private static final long serialVersionUID = 852971237;

	/**
	 * Setter for <code>public.users.user_id</code>. 
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.users.user_id</code>. 
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.users.username</code>. 
	 */
	public void setUsername(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.users.username</code>. 
	 */
	public java.lang.String getUsername() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.users.password</code>. 
	 */
	public void setPassword(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.users.password</code>. 
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.users.active</code>. 
	 */
	public void setActive(java.lang.Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.users.active</code>. 
	 */
	public java.lang.Boolean getActive() {
		return (java.lang.Boolean) getValue(3);
	}

	/**
	 * Setter for <code>public.users.admin</code>. 
	 */
	public void setAdmin(java.lang.Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.users.admin</code>. 
	 */
	public java.lang.Boolean getAdmin() {
		return (java.lang.Boolean) getValue(4);
	}

	/**
	 * Setter for <code>public.users.firstname</code>. 
	 */
	public void setFirstname(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.users.firstname</code>. 
	 */
	public java.lang.String getFirstname() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.users.lastname</code>. 
	 */
	public void setLastname(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.users.lastname</code>. 
	 */
	public java.lang.String getLastname() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>public.users.email</code>. 
	 */
	public void setEmail(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.users.email</code>. 
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>public.users.last_login</code>. 
	 */
	public void setLastLogin(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.users.last_login</code>. 
	 */
	public java.sql.Timestamp getLastLogin() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>public.users.extern_type</code>. 
	 */
	public void setExternType(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.users.extern_type</code>. 
	 */
	public java.lang.String getExternType() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>public.users.extern_name</code>. 
	 */
	public void setExternName(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.users.extern_name</code>. 
	 */
	public java.lang.String getExternName() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>public.users.api_key</code>. 
	 */
	public void setApiKey(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.users.api_key</code>. 
	 */
	public java.lang.String getApiKey() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>public.users.inherit_default_permissions</code>. 
	 */
	public void setInheritDefaultPermissions(java.lang.Boolean value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>public.users.inherit_default_permissions</code>. 
	 */
	public java.lang.Boolean getInheritDefaultPermissions() {
		return (java.lang.Boolean) getValue(12);
	}

	/**
	 * Setter for <code>public.users.created_on</code>. 
	 */
	public void setCreatedOn(java.sql.Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>public.users.created_on</code>. 
	 */
	public java.sql.Timestamp getCreatedOn() {
		return (java.sql.Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>public.users.user_data</code>. 
	 */
	public void setUserData(byte[] value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>public.users.user_data</code>. 
	 */
	public byte[] getUserData() {
		return (byte[]) getValue(14);
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
	// Record15 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, byte[]> fieldsRow() {
		return (org.jooq.Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, byte[]> valuesRow() {
		return (org.jooq.Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.ADMIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.FIRSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.LASTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.LAST_LOGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.EXTERN_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.EXTERN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.API_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field13() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.INHERIT_DEFAULT_PERMISSIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field14() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.CREATED_ON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field15() {
		return org.rhodecode.ldap.sync.jooq.tables.Users.USERS.USER_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getActive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getAdmin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getFirstname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getLastname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getLastLogin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getExternType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getExternName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getApiKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value13() {
		return getInheritDefaultPermissions();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value14() {
		return getCreatedOn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value15() {
		return getUserData();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UsersRecord
	 */
	public UsersRecord() {
		super(org.rhodecode.ldap.sync.jooq.tables.Users.USERS);
	}

	/**
	 * Create a detached, initialised UsersRecord
	 */
	public UsersRecord(java.lang.Integer userId, java.lang.String username, java.lang.String password, java.lang.Boolean active, java.lang.Boolean admin, java.lang.String firstname, java.lang.String lastname, java.lang.String email, java.sql.Timestamp lastLogin, java.lang.String externType, java.lang.String externName, java.lang.String apiKey, java.lang.Boolean inheritDefaultPermissions, java.sql.Timestamp createdOn, byte[] userData) {
		super(org.rhodecode.ldap.sync.jooq.tables.Users.USERS);

		setValue(0, userId);
		setValue(1, username);
		setValue(2, password);
		setValue(3, active);
		setValue(4, admin);
		setValue(5, firstname);
		setValue(6, lastname);
		setValue(7, email);
		setValue(8, lastLogin);
		setValue(9, externType);
		setValue(10, externName);
		setValue(11, apiKey);
		setValue(12, inheritDefaultPermissions);
		setValue(13, createdOn);
		setValue(14, userData);
	}
}
