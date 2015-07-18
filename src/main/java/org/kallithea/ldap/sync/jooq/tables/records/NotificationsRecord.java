/**
 * This class is generated by jOOQ
 */
package org.kallithea.ldap.sync.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.7" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationsRecord extends org.jooq.impl.UpdatableRecordImpl<org.kallithea.ldap.sync.jooq.tables.records.NotificationsRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = -220472588;

	/**
	 * Setter for <code>public.notifications.notification_id</code>.
	 */
	public void setNotificationId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.notifications.notification_id</code>.
	 */
	public java.lang.Integer getNotificationId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.notifications.subject</code>.
	 */
	public void setSubject(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.notifications.subject</code>.
	 */
	public java.lang.String getSubject() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.notifications.body</code>.
	 */
	public void setBody(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.notifications.body</code>.
	 */
	public java.lang.String getBody() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.notifications.created_by</code>.
	 */
	public void setCreatedBy(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.notifications.created_by</code>.
	 */
	public java.lang.Integer getCreatedBy() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.notifications.created_on</code>.
	 */
	public void setCreatedOn(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.notifications.created_on</code>.
	 */
	public java.sql.Timestamp getCreatedOn() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>public.notifications.type</code>.
	 */
	public void setType(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.notifications.type</code>.
	 */
	public java.lang.String getType() {
		return (java.lang.String) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.kallithea.ldap.sync.jooq.tables.Notifications.NOTIFICATIONS.NOTIFICATION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.kallithea.ldap.sync.jooq.tables.Notifications.NOTIFICATIONS.SUBJECT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.kallithea.ldap.sync.jooq.tables.Notifications.NOTIFICATIONS.BODY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.kallithea.ldap.sync.jooq.tables.Notifications.NOTIFICATIONS.CREATED_BY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.kallithea.ldap.sync.jooq.tables.Notifications.NOTIFICATIONS.CREATED_ON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.kallithea.ldap.sync.jooq.tables.Notifications.NOTIFICATIONS.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getNotificationId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getSubject();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getBody();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getCreatedBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getCreatedOn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getType();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NotificationsRecord
	 */
	public NotificationsRecord() {
		super(org.kallithea.ldap.sync.jooq.tables.Notifications.NOTIFICATIONS);
	}

	/**
	 * Create a detached, initialised NotificationsRecord
	 */
	public NotificationsRecord(java.lang.Integer notificationId, java.lang.String subject, java.lang.String body, java.lang.Integer createdBy, java.sql.Timestamp createdOn, java.lang.String type) {
		super(org.kallithea.ldap.sync.jooq.tables.Notifications.NOTIFICATIONS);

		setValue(0, notificationId);
		setValue(1, subject);
		setValue(2, body);
		setValue(3, createdBy);
		setValue(4, createdOn);
		setValue(5, type);
	}
}