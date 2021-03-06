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
public class RepositoriesFields extends org.jooq.impl.TableImpl<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord> {

	private static final long serialVersionUID = 1829654788;

	/**
	 * The singleton instance of <code>public.repositories_fields</code>
	 */
	public static final org.kallithea.ldap.sync.jooq.tables.RepositoriesFields REPOSITORIES_FIELDS = new org.kallithea.ldap.sync.jooq.tables.RepositoriesFields();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord> getRecordType() {
		return org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord.class;
	}

	/**
	 * The column <code>public.repositories_fields.repo_field_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, java.lang.Integer> REPO_FIELD_ID = createField("repo_field_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.repositories_fields.repository_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, java.lang.Integer> REPOSITORY_ID = createField("repository_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.repositories_fields.field_key</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, java.lang.String> FIELD_KEY = createField("field_key", org.jooq.impl.SQLDataType.VARCHAR.length(250), this);

	/**
	 * The column <code>public.repositories_fields.field_label</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, java.lang.String> FIELD_LABEL = createField("field_label", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this);

	/**
	 * The column <code>public.repositories_fields.field_value</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, java.lang.String> FIELD_VALUE = createField("field_value", org.jooq.impl.SQLDataType.VARCHAR.length(10000).nullable(false), this);

	/**
	 * The column <code>public.repositories_fields.field_desc</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, java.lang.String> FIELD_DESC = createField("field_desc", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this);

	/**
	 * The column <code>public.repositories_fields.field_type</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, java.lang.String> FIELD_TYPE = createField("field_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>public.repositories_fields.created_on</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, java.sql.Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * Create a <code>public.repositories_fields</code> table reference
	 */
	public RepositoriesFields() {
		super("repositories_fields", org.kallithea.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.repositories_fields</code> table reference
	 */
	public RepositoriesFields(java.lang.String alias) {
		super(alias, org.kallithea.ldap.sync.jooq.Public.PUBLIC, org.kallithea.ldap.sync.jooq.tables.RepositoriesFields.REPOSITORIES_FIELDS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, java.lang.Integer> getIdentity() {
		return org.kallithea.ldap.sync.jooq.Keys.IDENTITY_REPOSITORIES_FIELDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord> getPrimaryKey() {
		return org.kallithea.ldap.sync.jooq.Keys.REPOSITORIES_FIELDS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord>>asList(org.kallithea.ldap.sync.jooq.Keys.REPOSITORIES_FIELDS_PKEY, org.kallithea.ldap.sync.jooq.Keys.REPOSITORIES_FIELDS_REPOSITORY_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.RepositoriesFieldsRecord, ?>>asList(org.kallithea.ldap.sync.jooq.Keys.REPOSITORIES_FIELDS__REPOSITORIES_FIELDS_REPOSITORY_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.kallithea.ldap.sync.jooq.tables.RepositoriesFields as(java.lang.String alias) {
		return new org.kallithea.ldap.sync.jooq.tables.RepositoriesFields(alias);
	}
}
