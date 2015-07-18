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
public class ChangesetStatusesRecord extends org.jooq.impl.UpdatableRecordImpl<org.rhodecode.ldap.sync.jooq.tables.records.ChangesetStatusesRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1396789681;

	/**
	 * Setter for <code>public.changeset_statuses.changeset_status_id</code>.
	 */
	public void setChangesetStatusId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.changeset_statuses.changeset_status_id</code>.
	 */
	public java.lang.Integer getChangesetStatusId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.changeset_statuses.repo_id</code>.
	 */
	public void setRepoId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.changeset_statuses.repo_id</code>.
	 */
	public java.lang.Integer getRepoId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.changeset_statuses.user_id</code>.
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.changeset_statuses.user_id</code>.
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.changeset_statuses.revision</code>.
	 */
	public void setRevision(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.changeset_statuses.revision</code>.
	 */
	public java.lang.String getRevision() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.changeset_statuses.status</code>.
	 */
	public void setStatus(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.changeset_statuses.status</code>.
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.changeset_statuses.changeset_comment_id</code>.
	 */
	public void setChangesetCommentId(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.changeset_statuses.changeset_comment_id</code>.
	 */
	public java.lang.Integer getChangesetCommentId() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.changeset_statuses.modified_at</code>.
	 */
	public void setModifiedAt(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.changeset_statuses.modified_at</code>.
	 */
	public java.sql.Timestamp getModifiedAt() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>public.changeset_statuses.version</code>.
	 */
	public void setVersion(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.changeset_statuses.version</code>.
	 */
	public java.lang.Integer getVersion() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>public.changeset_statuses.pull_request_id</code>.
	 */
	public void setPullRequestId(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.changeset_statuses.pull_request_id</code>.
	 */
	public java.lang.Integer getPullRequestId() {
		return (java.lang.Integer) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES.CHANGESET_STATUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES.REPO_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES.REVISION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES.CHANGESET_COMMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES.MODIFIED_AT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES.PULL_REQUEST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getChangesetStatusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getRepoId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getRevision();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getChangesetCommentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getModifiedAt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getPullRequestId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ChangesetStatusesRecord
	 */
	public ChangesetStatusesRecord() {
		super(org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES);
	}

	/**
	 * Create a detached, initialised ChangesetStatusesRecord
	 */
	public ChangesetStatusesRecord(java.lang.Integer changesetStatusId, java.lang.Integer repoId, java.lang.Integer userId, java.lang.String revision, java.lang.String status, java.lang.Integer changesetCommentId, java.sql.Timestamp modifiedAt, java.lang.Integer version, java.lang.Integer pullRequestId) {
		super(org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES);

		setValue(0, changesetStatusId);
		setValue(1, repoId);
		setValue(2, userId);
		setValue(3, revision);
		setValue(4, status);
		setValue(5, changesetCommentId);
		setValue(6, modifiedAt);
		setValue(7, version);
		setValue(8, pullRequestId);
	}
}
