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
public class DbMigrateVersion extends org.jooq.impl.TableImpl<org.kallithea.ldap.sync.jooq.tables.records.DbMigrateVersionRecord> {

	private static final long serialVersionUID = 1897394573;

	/**
	 * The singleton instance of <code>public.db_migrate_version</code>
	 */
	public static final org.kallithea.ldap.sync.jooq.tables.DbMigrateVersion DB_MIGRATE_VERSION = new org.kallithea.ldap.sync.jooq.tables.DbMigrateVersion();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.kallithea.ldap.sync.jooq.tables.records.DbMigrateVersionRecord> getRecordType() {
		return org.kallithea.ldap.sync.jooq.tables.records.DbMigrateVersionRecord.class;
	}

	/**
	 * The column <code>public.db_migrate_version.repository_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.DbMigrateVersionRecord, java.lang.String> REPOSITORY_ID = createField("repository_id", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this);

	/**
	 * The column <code>public.db_migrate_version.repository_path</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.DbMigrateVersionRecord, java.lang.String> REPOSITORY_PATH = createField("repository_path", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>public.db_migrate_version.version</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.DbMigrateVersionRecord, java.lang.Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>public.db_migrate_version</code> table reference
	 */
	public DbMigrateVersion() {
		super("db_migrate_version", org.kallithea.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.db_migrate_version</code> table reference
	 */
	public DbMigrateVersion(java.lang.String alias) {
		super(alias, org.kallithea.ldap.sync.jooq.Public.PUBLIC, org.kallithea.ldap.sync.jooq.tables.DbMigrateVersion.DB_MIGRATE_VERSION);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.DbMigrateVersionRecord> getPrimaryKey() {
		return org.kallithea.ldap.sync.jooq.Keys.DB_MIGRATE_VERSION_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.DbMigrateVersionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.DbMigrateVersionRecord>>asList(org.kallithea.ldap.sync.jooq.Keys.DB_MIGRATE_VERSION_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.kallithea.ldap.sync.jooq.tables.DbMigrateVersion as(java.lang.String alias) {
		return new org.kallithea.ldap.sync.jooq.tables.DbMigrateVersion(alias);
	}
}
