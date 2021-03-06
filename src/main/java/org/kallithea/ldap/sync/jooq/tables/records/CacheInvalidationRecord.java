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
public class CacheInvalidationRecord extends org.jooq.impl.UpdatableRecordImpl<org.kallithea.ldap.sync.jooq.tables.records.CacheInvalidationRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean> {

	private static final long serialVersionUID = 950986053;

	/**
	 * Setter for <code>public.cache_invalidation.cache_id</code>.
	 */
	public void setCacheId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.cache_invalidation.cache_id</code>.
	 */
	public java.lang.Integer getCacheId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.cache_invalidation.cache_key</code>.
	 */
	public void setCacheKey(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.cache_invalidation.cache_key</code>.
	 */
	public java.lang.String getCacheKey() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.cache_invalidation.cache_args</code>.
	 */
	public void setCacheArgs(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.cache_invalidation.cache_args</code>.
	 */
	public java.lang.String getCacheArgs() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.cache_invalidation.cache_active</code>.
	 */
	public void setCacheActive(java.lang.Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.cache_invalidation.cache_active</code>.
	 */
	public java.lang.Boolean getCacheActive() {
		return (java.lang.Boolean) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.kallithea.ldap.sync.jooq.tables.CacheInvalidation.CACHE_INVALIDATION.CACHE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.kallithea.ldap.sync.jooq.tables.CacheInvalidation.CACHE_INVALIDATION.CACHE_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.kallithea.ldap.sync.jooq.tables.CacheInvalidation.CACHE_INVALIDATION.CACHE_ARGS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return org.kallithea.ldap.sync.jooq.tables.CacheInvalidation.CACHE_INVALIDATION.CACHE_ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getCacheId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCacheKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getCacheArgs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getCacheActive();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CacheInvalidationRecord
	 */
	public CacheInvalidationRecord() {
		super(org.kallithea.ldap.sync.jooq.tables.CacheInvalidation.CACHE_INVALIDATION);
	}

	/**
	 * Create a detached, initialised CacheInvalidationRecord
	 */
	public CacheInvalidationRecord(java.lang.Integer cacheId, java.lang.String cacheKey, java.lang.String cacheArgs, java.lang.Boolean cacheActive) {
		super(org.kallithea.ldap.sync.jooq.tables.CacheInvalidation.CACHE_INVALIDATION);

		setValue(0, cacheId);
		setValue(1, cacheKey);
		setValue(2, cacheArgs);
		setValue(3, cacheActive);
	}
}
