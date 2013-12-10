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
public class UserIpMapRecord extends org.jooq.impl.UpdatableRecordImpl<org.rhodecode.ldap.sync.jooq.tables.records.UserIpMapRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean> {

	private static final long serialVersionUID = -2139580564;

	/**
	 * Setter for <code>public.user_ip_map.ip_id</code>. 
	 */
	public void setIpId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.user_ip_map.ip_id</code>. 
	 */
	public java.lang.Integer getIpId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.user_ip_map.user_id</code>. 
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.user_ip_map.user_id</code>. 
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.user_ip_map.ip_addr</code>. 
	 */
	public void setIpAddr(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.user_ip_map.ip_addr</code>. 
	 */
	public java.lang.String getIpAddr() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.user_ip_map.active</code>. 
	 */
	public void setActive(java.lang.Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.user_ip_map.active</code>. 
	 */
	public java.lang.Boolean getActive() {
		return (java.lang.Boolean) getValue(3);
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
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.rhodecode.ldap.sync.jooq.tables.UserIpMap.USER_IP_MAP.IP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.rhodecode.ldap.sync.jooq.tables.UserIpMap.USER_IP_MAP.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.rhodecode.ldap.sync.jooq.tables.UserIpMap.USER_IP_MAP.IP_ADDR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return org.rhodecode.ldap.sync.jooq.tables.UserIpMap.USER_IP_MAP.ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIpId();
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
	public java.lang.String value3() {
		return getIpAddr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getActive();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserIpMapRecord
	 */
	public UserIpMapRecord() {
		super(org.rhodecode.ldap.sync.jooq.tables.UserIpMap.USER_IP_MAP);
	}

	/**
	 * Create a detached, initialised UserIpMapRecord
	 */
	public UserIpMapRecord(java.lang.Integer ipId, java.lang.Integer userId, java.lang.String ipAddr, java.lang.Boolean active) {
		super(org.rhodecode.ldap.sync.jooq.tables.UserIpMap.USER_IP_MAP);

		setValue(0, ipId);
		setValue(1, userId);
		setValue(2, ipAddr);
		setValue(3, active);
	}
}
