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
public class UserLogs extends org.jooq.impl.TableImpl<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord> {

	private static final long serialVersionUID = 61909632;

	/**
	 * The singleton instance of <code>public.user_logs</code>
	 */
	public static final org.kallithea.ldap.sync.jooq.tables.UserLogs USER_LOGS = new org.kallithea.ldap.sync.jooq.tables.UserLogs();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord> getRecordType() {
		return org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord.class;
	}

	/**
	 * The column <code>public.user_logs.user_log_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, java.lang.Integer> USER_LOG_ID = createField("user_log_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.user_logs.user_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, java.lang.Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.user_logs.username</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.user_logs.repository_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, java.lang.Integer> REPOSITORY_ID = createField("repository_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.user_logs.repository_name</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, java.lang.String> REPOSITORY_NAME = createField("repository_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.user_logs.user_ip</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, java.lang.String> USER_IP = createField("user_ip", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.user_logs.action</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, java.lang.String> ACTION = createField("action", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>public.user_logs.action_date</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, java.sql.Timestamp> ACTION_DATE = createField("action_date", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>public.user_logs</code> table reference
	 */
	public UserLogs() {
		super("user_logs", org.kallithea.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.user_logs</code> table reference
	 */
	public UserLogs(java.lang.String alias) {
		super(alias, org.kallithea.ldap.sync.jooq.Public.PUBLIC, org.kallithea.ldap.sync.jooq.tables.UserLogs.USER_LOGS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, java.lang.Integer> getIdentity() {
		return org.kallithea.ldap.sync.jooq.Keys.IDENTITY_USER_LOGS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord> getPrimaryKey() {
		return org.kallithea.ldap.sync.jooq.Keys.USER_LOGS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord>>asList(org.kallithea.ldap.sync.jooq.Keys.USER_LOGS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.UserLogsRecord, ?>>asList(org.kallithea.ldap.sync.jooq.Keys.USER_LOGS__USER_LOGS_USER_ID_FKEY, org.kallithea.ldap.sync.jooq.Keys.USER_LOGS__USER_LOGS_REPOSITORY_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.kallithea.ldap.sync.jooq.tables.UserLogs as(java.lang.String alias) {
		return new org.kallithea.ldap.sync.jooq.tables.UserLogs(alias);
	}
}
