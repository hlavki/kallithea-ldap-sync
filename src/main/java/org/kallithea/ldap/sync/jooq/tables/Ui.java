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
public class Ui extends org.jooq.impl.TableImpl<org.kallithea.ldap.sync.jooq.tables.records.UiRecord> {

	private static final long serialVersionUID = -2070827626;

	/**
	 * The singleton instance of <code>public.ui</code>
	 */
	public static final org.kallithea.ldap.sync.jooq.tables.Ui UI = new org.kallithea.ldap.sync.jooq.tables.Ui();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.kallithea.ldap.sync.jooq.tables.records.UiRecord> getRecordType() {
		return org.kallithea.ldap.sync.jooq.tables.records.UiRecord.class;
	}

	/**
	 * The column <code>public.ui.ui_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UiRecord, java.lang.Integer> UI_ID = createField("ui_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.ui.ui_section</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UiRecord, java.lang.String> UI_SECTION = createField("ui_section", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.ui.ui_key</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UiRecord, java.lang.String> UI_KEY = createField("ui_key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.ui.ui_value</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UiRecord, java.lang.String> UI_VALUE = createField("ui_value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.ui.ui_active</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UiRecord, java.lang.Boolean> UI_ACTIVE = createField("ui_active", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * Create a <code>public.ui</code> table reference
	 */
	public Ui() {
		super("ui", org.kallithea.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.ui</code> table reference
	 */
	public Ui(java.lang.String alias) {
		super(alias, org.kallithea.ldap.sync.jooq.Public.PUBLIC, org.kallithea.ldap.sync.jooq.tables.Ui.UI);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.kallithea.ldap.sync.jooq.tables.records.UiRecord, java.lang.Integer> getIdentity() {
		return org.kallithea.ldap.sync.jooq.Keys.IDENTITY_UI;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UiRecord> getPrimaryKey() {
		return org.kallithea.ldap.sync.jooq.Keys.UI_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UiRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UiRecord>>asList(org.kallithea.ldap.sync.jooq.Keys.UI_PKEY, org.kallithea.ldap.sync.jooq.Keys.UI_UI_KEY_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.kallithea.ldap.sync.jooq.tables.Ui as(java.lang.String alias) {
		return new org.kallithea.ldap.sync.jooq.tables.Ui(alias);
	}
}