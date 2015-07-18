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
public class PullRequestReviewers extends org.jooq.impl.TableImpl<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord> {

	private static final long serialVersionUID = 761736004;

	/**
	 * The singleton instance of <code>public.pull_request_reviewers</code>
	 */
	public static final org.kallithea.ldap.sync.jooq.tables.PullRequestReviewers PULL_REQUEST_REVIEWERS = new org.kallithea.ldap.sync.jooq.tables.PullRequestReviewers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord> getRecordType() {
		return org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord.class;
	}

	/**
	 * The column <code>public.pull_request_reviewers.pull_requests_reviewers_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord, java.lang.Integer> PULL_REQUESTS_REVIEWERS_ID = createField("pull_requests_reviewers_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.pull_request_reviewers.pull_request_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord, java.lang.Integer> PULL_REQUEST_ID = createField("pull_request_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.pull_request_reviewers.user_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord, java.lang.Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>public.pull_request_reviewers</code> table reference
	 */
	public PullRequestReviewers() {
		super("pull_request_reviewers", org.kallithea.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.pull_request_reviewers</code> table reference
	 */
	public PullRequestReviewers(java.lang.String alias) {
		super(alias, org.kallithea.ldap.sync.jooq.Public.PUBLIC, org.kallithea.ldap.sync.jooq.tables.PullRequestReviewers.PULL_REQUEST_REVIEWERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord, java.lang.Integer> getIdentity() {
		return org.kallithea.ldap.sync.jooq.Keys.IDENTITY_PULL_REQUEST_REVIEWERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord> getPrimaryKey() {
		return org.kallithea.ldap.sync.jooq.Keys.PULL_REQUEST_REVIEWERS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord>>asList(org.kallithea.ldap.sync.jooq.Keys.PULL_REQUEST_REVIEWERS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.PullRequestReviewersRecord, ?>>asList(org.kallithea.ldap.sync.jooq.Keys.PULL_REQUEST_REVIEWERS__PULL_REQUEST_REVIEWERS_PULL_REQUEST_ID_FKEY, org.kallithea.ldap.sync.jooq.Keys.PULL_REQUEST_REVIEWERS__PULL_REQUEST_REVIEWERS_USER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.kallithea.ldap.sync.jooq.tables.PullRequestReviewers as(java.lang.String alias) {
		return new org.kallithea.ldap.sync.jooq.tables.PullRequestReviewers(alias);
	}
}