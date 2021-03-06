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
public class ChangesetComments extends org.jooq.impl.TableImpl<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord> {

	private static final long serialVersionUID = -1626440007;

	/**
	 * The singleton instance of <code>public.changeset_comments</code>
	 */
	public static final org.kallithea.ldap.sync.jooq.tables.ChangesetComments CHANGESET_COMMENTS = new org.kallithea.ldap.sync.jooq.tables.ChangesetComments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord> getRecordType() {
		return org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord.class;
	}

	/**
	 * The column <code>public.changeset_comments.comment_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.Integer> COMMENT_ID = createField("comment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.changeset_comments.repo_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.Integer> REPO_ID = createField("repo_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.changeset_comments.revision</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.String> REVISION = createField("revision", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>public.changeset_comments.pull_request_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.Integer> PULL_REQUEST_ID = createField("pull_request_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.changeset_comments.line_no</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.String> LINE_NO = createField("line_no", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>public.changeset_comments.hl_lines</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.String> HL_LINES = createField("hl_lines", org.jooq.impl.SQLDataType.VARCHAR.length(512), this);

	/**
	 * The column <code>public.changeset_comments.f_path</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.String> F_PATH = createField("f_path", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this);

	/**
	 * The column <code>public.changeset_comments.user_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.changeset_comments.text</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.String> TEXT = createField("text", org.jooq.impl.SQLDataType.CLOB.nullable(false), this);

	/**
	 * The column <code>public.changeset_comments.created_on</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.sql.Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>public.changeset_comments.modified_at</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.sql.Timestamp> MODIFIED_AT = createField("modified_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * Create a <code>public.changeset_comments</code> table reference
	 */
	public ChangesetComments() {
		super("changeset_comments", org.kallithea.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.changeset_comments</code> table reference
	 */
	public ChangesetComments(java.lang.String alias) {
		super(alias, org.kallithea.ldap.sync.jooq.Public.PUBLIC, org.kallithea.ldap.sync.jooq.tables.ChangesetComments.CHANGESET_COMMENTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, java.lang.Integer> getIdentity() {
		return org.kallithea.ldap.sync.jooq.Keys.IDENTITY_CHANGESET_COMMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord> getPrimaryKey() {
		return org.kallithea.ldap.sync.jooq.Keys.CHANGESET_COMMENTS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord>>asList(org.kallithea.ldap.sync.jooq.Keys.CHANGESET_COMMENTS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.ChangesetCommentsRecord, ?>>asList(org.kallithea.ldap.sync.jooq.Keys.CHANGESET_COMMENTS__CHANGESET_COMMENTS_REPO_ID_FKEY, org.kallithea.ldap.sync.jooq.Keys.CHANGESET_COMMENTS__CHANGESET_COMMENTS_PULL_REQUEST_ID_FKEY, org.kallithea.ldap.sync.jooq.Keys.CHANGESET_COMMENTS__CHANGESET_COMMENTS_USER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.kallithea.ldap.sync.jooq.tables.ChangesetComments as(java.lang.String alias) {
		return new org.kallithea.ldap.sync.jooq.tables.ChangesetComments(alias);
	}
}
