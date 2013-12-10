/**
 * This class is generated by jOOQ
 */
package org.rhodecode.ldap.sync.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Repositories extends org.jooq.impl.TableImpl<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord> {

	private static final long serialVersionUID = 139145778;

	/**
	 * The singleton instance of <code>public.repositories</code>
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Repositories REPOSITORIES = new org.rhodecode.ldap.sync.jooq.tables.Repositories();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord> getRecordType() {
		return org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord.class;
	}

	/**
	 * The column <code>public.repositories.repo_id</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.Integer> REPO_ID = createField("repo_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.repositories.repo_name</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.String> REPO_NAME = createField("repo_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>public.repositories.clone_uri</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.String> CLONE_URI = createField("clone_uri", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.repositories.repo_type</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.String> REPO_TYPE = createField("repo_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>public.repositories.user_id</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.repositories.private</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.Boolean> PRIVATE = createField("private", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.repositories.statistics</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.Boolean> STATISTICS = createField("statistics", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.repositories.downloads</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.Boolean> DOWNLOADS = createField("downloads", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.repositories.description</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(10000), this);

	/**
	 * The column <code>public.repositories.created_on</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.sql.Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>public.repositories.updated_on</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.sql.Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>public.repositories.landing_revision</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.String> LANDING_REVISION = createField("landing_revision", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>public.repositories.enable_locking</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.Boolean> ENABLE_LOCKING = createField("enable_locking", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this);

	/**
	 * The column <code>public.repositories.locked</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.String> LOCKED = createField("locked", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.repositories.changeset_cache</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, byte[]> CHANGESET_CACHE = createField("changeset_cache", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The column <code>public.repositories.fork_id</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.Integer> FORK_ID = createField("fork_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.repositories.group_id</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.repositories.repo_state</code>. 
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.String> REPO_STATE = createField("repo_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>public.repositories</code> table reference
	 */
	public Repositories() {
		super("repositories", org.rhodecode.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.repositories</code> table reference
	 */
	public Repositories(java.lang.String alias) {
		super(alias, org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.rhodecode.ldap.sync.jooq.tables.Repositories.REPOSITORIES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, java.lang.Integer> getIdentity() {
		return org.rhodecode.ldap.sync.jooq.Keys.IDENTITY_REPOSITORIES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord> getPrimaryKey() {
		return org.rhodecode.ldap.sync.jooq.Keys.REPOSITORIES_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord>>asList(org.rhodecode.ldap.sync.jooq.Keys.REPOSITORIES_PKEY, org.rhodecode.ldap.sync.jooq.Keys.REPOSITORIES_REPO_NAME_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.rhodecode.ldap.sync.jooq.tables.records.RepositoriesRecord, ?>>asList(org.rhodecode.ldap.sync.jooq.Keys.REPOSITORIES__REPOSITORIES_USER_ID_FKEY, org.rhodecode.ldap.sync.jooq.Keys.REPOSITORIES__REPOSITORIES_FORK_ID_FKEY, org.rhodecode.ldap.sync.jooq.Keys.REPOSITORIES__REPOSITORIES_GROUP_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.rhodecode.ldap.sync.jooq.tables.Repositories as(java.lang.String alias) {
		return new org.rhodecode.ldap.sync.jooq.tables.Repositories(alias);
	}
}
