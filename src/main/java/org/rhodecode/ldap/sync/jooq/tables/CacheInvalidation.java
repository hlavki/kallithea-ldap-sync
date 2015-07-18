/**
 * This class is generated by jOOQ
 */
package org.rhodecode.ldap.sync.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.7" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CacheInvalidation extends org.jooq.impl.TableImpl<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord> {

	private static final long serialVersionUID = -323380412;

	/**
	 * The singleton instance of <code>public.cache_invalidation</code>
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.CacheInvalidation CACHE_INVALIDATION = new org.rhodecode.ldap.sync.jooq.tables.CacheInvalidation();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord> getRecordType() {
		return org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord.class;
	}

	/**
	 * The column <code>public.cache_invalidation.cache_id</code>.
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord, java.lang.Integer> CACHE_ID = createField("cache_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.cache_invalidation.cache_key</code>.
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord, java.lang.String> CACHE_KEY = createField("cache_key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.cache_invalidation.cache_args</code>.
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord, java.lang.String> CACHE_ARGS = createField("cache_args", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>public.cache_invalidation.cache_active</code>.
	 */
	public final org.jooq.TableField<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord, java.lang.Boolean> CACHE_ACTIVE = createField("cache_active", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * Create a <code>public.cache_invalidation</code> table reference
	 */
	public CacheInvalidation() {
		super("cache_invalidation", org.rhodecode.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.cache_invalidation</code> table reference
	 */
	public CacheInvalidation(java.lang.String alias) {
		super(alias, org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.rhodecode.ldap.sync.jooq.tables.CacheInvalidation.CACHE_INVALIDATION);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord, java.lang.Integer> getIdentity() {
		return org.rhodecode.ldap.sync.jooq.Keys.IDENTITY_CACHE_INVALIDATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord> getPrimaryKey() {
		return org.rhodecode.ldap.sync.jooq.Keys.CACHE_INVALIDATION_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.rhodecode.ldap.sync.jooq.tables.records.CacheInvalidationRecord>>asList(org.rhodecode.ldap.sync.jooq.Keys.CACHE_INVALIDATION_PKEY, org.rhodecode.ldap.sync.jooq.Keys.CACHE_INVALIDATION_CACHE_KEY_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.rhodecode.ldap.sync.jooq.tables.CacheInvalidation as(java.lang.String alias) {
		return new org.rhodecode.ldap.sync.jooq.tables.CacheInvalidation(alias);
	}
}
