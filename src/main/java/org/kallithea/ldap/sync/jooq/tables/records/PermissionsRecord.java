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
public class PermissionsRecord extends org.jooq.impl.UpdatableRecordImpl<org.kallithea.ldap.sync.jooq.tables.records.PermissionsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -53862591;

	/**
	 * Setter for <code>public.permissions.permission_id</code>.
	 */
	public void setPermissionId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.permissions.permission_id</code>.
	 */
	public java.lang.Integer getPermissionId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.permissions.permission_name</code>.
	 */
	public void setPermissionName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.permissions.permission_name</code>.
	 */
	public java.lang.String getPermissionName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.permissions.permission_longname</code>.
	 */
	public void setPermissionLongname(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.permissions.permission_longname</code>.
	 */
	public java.lang.String getPermissionLongname() {
		return (java.lang.String) getValue(2);
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
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.kallithea.ldap.sync.jooq.tables.Permissions.PERMISSIONS.PERMISSION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.kallithea.ldap.sync.jooq.tables.Permissions.PERMISSIONS.PERMISSION_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.kallithea.ldap.sync.jooq.tables.Permissions.PERMISSIONS.PERMISSION_LONGNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getPermissionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getPermissionName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPermissionLongname();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PermissionsRecord
	 */
	public PermissionsRecord() {
		super(org.kallithea.ldap.sync.jooq.tables.Permissions.PERMISSIONS);
	}

	/**
	 * Create a detached, initialised PermissionsRecord
	 */
	public PermissionsRecord(java.lang.Integer permissionId, java.lang.String permissionName, java.lang.String permissionLongname) {
		super(org.kallithea.ldap.sync.jooq.tables.Permissions.PERMISSIONS);

		setValue(0, permissionId);
		setValue(1, permissionName);
		setValue(2, permissionLongname);
	}
}
