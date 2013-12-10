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
public class UserFollowingsRecord extends org.jooq.impl.UpdatableRecordImpl<org.rhodecode.ldap.sync.jooq.tables.records.UserFollowingsRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp> {

	private static final long serialVersionUID = 1792937093;

	/**
	 * Setter for <code>public.user_followings.user_following_id</code>. 
	 */
	public void setUserFollowingId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.user_followings.user_following_id</code>. 
	 */
	public java.lang.Integer getUserFollowingId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.user_followings.user_id</code>. 
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.user_followings.user_id</code>. 
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.user_followings.follows_repository_id</code>. 
	 */
	public void setFollowsRepositoryId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.user_followings.follows_repository_id</code>. 
	 */
	public java.lang.Integer getFollowsRepositoryId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.user_followings.follows_user_id</code>. 
	 */
	public void setFollowsUserId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.user_followings.follows_user_id</code>. 
	 */
	public java.lang.Integer getFollowsUserId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.user_followings.follows_from</code>. 
	 */
	public void setFollowsFrom(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.user_followings.follows_from</code>. 
	 */
	public java.sql.Timestamp getFollowsFrom() {
		return (java.sql.Timestamp) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.rhodecode.ldap.sync.jooq.tables.UserFollowings.USER_FOLLOWINGS.USER_FOLLOWING_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.rhodecode.ldap.sync.jooq.tables.UserFollowings.USER_FOLLOWINGS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.rhodecode.ldap.sync.jooq.tables.UserFollowings.USER_FOLLOWINGS.FOLLOWS_REPOSITORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.rhodecode.ldap.sync.jooq.tables.UserFollowings.USER_FOLLOWINGS.FOLLOWS_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.rhodecode.ldap.sync.jooq.tables.UserFollowings.USER_FOLLOWINGS.FOLLOWS_FROM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getUserFollowingId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getFollowsRepositoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getFollowsUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getFollowsFrom();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserFollowingsRecord
	 */
	public UserFollowingsRecord() {
		super(org.rhodecode.ldap.sync.jooq.tables.UserFollowings.USER_FOLLOWINGS);
	}

	/**
	 * Create a detached, initialised UserFollowingsRecord
	 */
	public UserFollowingsRecord(java.lang.Integer userFollowingId, java.lang.Integer userId, java.lang.Integer followsRepositoryId, java.lang.Integer followsUserId, java.sql.Timestamp followsFrom) {
		super(org.rhodecode.ldap.sync.jooq.tables.UserFollowings.USER_FOLLOWINGS);

		setValue(0, userFollowingId);
		setValue(1, userId);
		setValue(2, followsRepositoryId);
		setValue(3, followsUserId);
		setValue(4, followsFrom);
	}
}
