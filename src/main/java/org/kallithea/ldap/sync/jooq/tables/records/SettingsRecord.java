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
public class SettingsRecord extends org.jooq.impl.UpdatableRecordImpl<org.kallithea.ldap.sync.jooq.tables.records.SettingsRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 2003646308;

	/**
	 * Setter for <code>public.settings.app_settings_id</code>.
	 */
	public void setAppSettingsId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.settings.app_settings_id</code>.
	 */
	public java.lang.Integer getAppSettingsId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.settings.app_settings_name</code>.
	 */
	public void setAppSettingsName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.settings.app_settings_name</code>.
	 */
	public java.lang.String getAppSettingsName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.settings.app_settings_value</code>.
	 */
	public void setAppSettingsValue(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.settings.app_settings_value</code>.
	 */
	public java.lang.String getAppSettingsValue() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.settings.app_settings_type</code>.
	 */
	public void setAppSettingsType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.settings.app_settings_type</code>.
	 */
	public java.lang.String getAppSettingsType() {
		return (java.lang.String) getValue(3);
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
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.kallithea.ldap.sync.jooq.tables.Settings.SETTINGS.APP_SETTINGS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.kallithea.ldap.sync.jooq.tables.Settings.SETTINGS.APP_SETTINGS_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.kallithea.ldap.sync.jooq.tables.Settings.SETTINGS.APP_SETTINGS_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.kallithea.ldap.sync.jooq.tables.Settings.SETTINGS.APP_SETTINGS_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getAppSettingsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAppSettingsName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAppSettingsValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getAppSettingsType();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SettingsRecord
	 */
	public SettingsRecord() {
		super(org.kallithea.ldap.sync.jooq.tables.Settings.SETTINGS);
	}

	/**
	 * Create a detached, initialised SettingsRecord
	 */
	public SettingsRecord(java.lang.Integer appSettingsId, java.lang.String appSettingsName, java.lang.String appSettingsValue, java.lang.String appSettingsType) {
		super(org.kallithea.ldap.sync.jooq.tables.Settings.SETTINGS);

		setValue(0, appSettingsId);
		setValue(1, appSettingsName);
		setValue(2, appSettingsValue);
		setValue(3, appSettingsType);
	}
}
