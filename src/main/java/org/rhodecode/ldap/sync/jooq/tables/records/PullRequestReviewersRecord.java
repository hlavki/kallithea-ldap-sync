/**
 * This class is generated by jOOQ
 */
package org.rhodecode.ldap.sync.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PullRequestReviewersRecord extends org.jooq.impl.UpdatableRecordImpl<org.rhodecode.ldap.sync.jooq.tables.records.PullRequestReviewersRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1256556151;

	/**
	 * Setter for <code>public.pull_request_reviewers.pull_requests_reviewers_id</code>. 
	 */
	public void setPullRequestsReviewersId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.pull_request_reviewers.pull_requests_reviewers_id</code>. 
	 */
	public java.lang.Integer getPullRequestsReviewersId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.pull_request_reviewers.pull_request_id</code>. 
	 */
	public void setPullRequestId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.pull_request_reviewers.pull_request_id</code>. 
	 */
	public java.lang.Integer getPullRequestId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.pull_request_reviewers.user_id</code>. 
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.pull_request_reviewers.user_id</code>. 
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(2);
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
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.rhodecode.ldap.sync.jooq.tables.PullRequestReviewers.PULL_REQUEST_REVIEWERS.PULL_REQUESTS_REVIEWERS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.rhodecode.ldap.sync.jooq.tables.PullRequestReviewers.PULL_REQUEST_REVIEWERS.PULL_REQUEST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.rhodecode.ldap.sync.jooq.tables.PullRequestReviewers.PULL_REQUEST_REVIEWERS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getPullRequestsReviewersId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getPullRequestId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getUserId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PullRequestReviewersRecord
	 */
	public PullRequestReviewersRecord() {
		super(org.rhodecode.ldap.sync.jooq.tables.PullRequestReviewers.PULL_REQUEST_REVIEWERS);
	}

	/**
	 * Create a detached, initialised PullRequestReviewersRecord
	 */
	public PullRequestReviewersRecord(java.lang.Integer pullRequestsReviewersId, java.lang.Integer pullRequestId, java.lang.Integer userId) {
		super(org.rhodecode.ldap.sync.jooq.tables.PullRequestReviewers.PULL_REQUEST_REVIEWERS);

		setValue(0, pullRequestsReviewersId);
		setValue(1, pullRequestId);
		setValue(2, userId);
	}
}
