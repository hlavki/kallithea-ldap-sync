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
public class Statistics extends org.jooq.impl.TableImpl<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord> {

	private static final long serialVersionUID = -1997529811;

	/**
	 * The singleton instance of <code>public.statistics</code>
	 */
	public static final org.kallithea.ldap.sync.jooq.tables.Statistics STATISTICS = new org.kallithea.ldap.sync.jooq.tables.Statistics();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord> getRecordType() {
		return org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord.class;
	}

	/**
	 * The column <code>public.statistics.stat_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord, java.lang.Integer> STAT_ID = createField("stat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.statistics.repository_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord, java.lang.Integer> REPOSITORY_ID = createField("repository_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.statistics.stat_on_revision</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord, java.lang.Integer> STAT_ON_REVISION = createField("stat_on_revision", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.statistics.commit_activity</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord, byte[]> COMMIT_ACTIVITY = createField("commit_activity", org.jooq.impl.SQLDataType.BLOB.nullable(false), this);

	/**
	 * The column <code>public.statistics.commit_activity_combined</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord, byte[]> COMMIT_ACTIVITY_COMBINED = createField("commit_activity_combined", org.jooq.impl.SQLDataType.BLOB.nullable(false), this);

	/**
	 * The column <code>public.statistics.languages</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord, byte[]> LANGUAGES = createField("languages", org.jooq.impl.SQLDataType.BLOB.nullable(false), this);

	/**
	 * Create a <code>public.statistics</code> table reference
	 */
	public Statistics() {
		super("statistics", org.kallithea.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.statistics</code> table reference
	 */
	public Statistics(java.lang.String alias) {
		super(alias, org.kallithea.ldap.sync.jooq.Public.PUBLIC, org.kallithea.ldap.sync.jooq.tables.Statistics.STATISTICS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord, java.lang.Integer> getIdentity() {
		return org.kallithea.ldap.sync.jooq.Keys.IDENTITY_STATISTICS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord> getPrimaryKey() {
		return org.kallithea.ldap.sync.jooq.Keys.STATISTICS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord>>asList(org.kallithea.ldap.sync.jooq.Keys.STATISTICS_PKEY, org.kallithea.ldap.sync.jooq.Keys.STATISTICS_REPOSITORY_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.StatisticsRecord, ?>>asList(org.kallithea.ldap.sync.jooq.Keys.STATISTICS__STATISTICS_REPOSITORY_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.kallithea.ldap.sync.jooq.tables.Statistics as(java.lang.String alias) {
		return new org.kallithea.ldap.sync.jooq.tables.Statistics(alias);
	}
}