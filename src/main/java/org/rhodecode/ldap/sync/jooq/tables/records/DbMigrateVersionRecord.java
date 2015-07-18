/**
 * This class is generated by jOOQ
 */
package org.rhodecode.ldap.sync.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.7" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DbMigrateVersionRecord extends org.jooq.impl.UpdatableRecordImpl<org.rhodecode.ldap.sync.jooq.tables.records.DbMigrateVersionRecord> implements org.jooq.Record3<java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 638128305;

	/**
	 * Setter for <code>public.db_migrate_version.repository_id</code>.
	 */
	public void setRepositoryId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.db_migrate_version.repository_id</code>.
	 */
	public java.lang.String getRepositoryId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.db_migrate_version.repository_path</code>.
	 */
	public void setRepositoryPath(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.db_migrate_version.repository_path</code>.
	 */
	public java.lang.String getRepositoryPath() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.db_migrate_version.version</code>.
	 */
	public void setVersion(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.db_migrate_version.version</code>.
	 */
	public java.lang.Integer getVersion() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.rhodecode.ldap.sync.jooq.tables.DbMigrateVersion.DB_MIGRATE_VERSION.REPOSITORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.rhodecode.ldap.sync.jooq.tables.DbMigrateVersion.DB_MIGRATE_VERSION.REPOSITORY_PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.rhodecode.ldap.sync.jooq.tables.DbMigrateVersion.DB_MIGRATE_VERSION.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getRepositoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getRepositoryPath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getVersion();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DbMigrateVersionRecord
	 */
	public DbMigrateVersionRecord() {
		super(org.rhodecode.ldap.sync.jooq.tables.DbMigrateVersion.DB_MIGRATE_VERSION);
	}

	/**
	 * Create a detached, initialised DbMigrateVersionRecord
	 */
	public DbMigrateVersionRecord(java.lang.String repositoryId, java.lang.String repositoryPath, java.lang.Integer version) {
		super(org.rhodecode.ldap.sync.jooq.tables.DbMigrateVersion.DB_MIGRATE_VERSION);

		setValue(0, repositoryId);
		setValue(1, repositoryPath);
		setValue(2, version);
	}
}
