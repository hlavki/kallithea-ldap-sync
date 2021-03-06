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
public class UserApiKeys extends org.jooq.impl.TableImpl<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord> {

	private static final long serialVersionUID = 1394888887;

	/**
	 * The singleton instance of <code>public.user_api_keys</code>
	 */
	public static final org.kallithea.ldap.sync.jooq.tables.UserApiKeys USER_API_KEYS = new org.kallithea.ldap.sync.jooq.tables.UserApiKeys();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord> getRecordType() {
		return org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord.class;
	}

	/**
	 * The column <code>public.user_api_keys.user_api_key_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord, java.lang.Integer> USER_API_KEY_ID = createField("user_api_key_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.user_api_keys.user_id</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord, java.lang.Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.user_api_keys.api_key</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord, java.lang.String> API_KEY = createField("api_key", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>public.user_api_keys.description</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>public.user_api_keys.expires</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord, java.lang.Double> EXPIRES = createField("expires", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this);

	/**
	 * The column <code>public.user_api_keys.created_on</code>.
	 */
	public final org.jooq.TableField<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord, java.sql.Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * Create a <code>public.user_api_keys</code> table reference
	 */
	public UserApiKeys() {
		super("user_api_keys", org.kallithea.ldap.sync.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.user_api_keys</code> table reference
	 */
	public UserApiKeys(java.lang.String alias) {
		super(alias, org.kallithea.ldap.sync.jooq.Public.PUBLIC, org.kallithea.ldap.sync.jooq.tables.UserApiKeys.USER_API_KEYS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord, java.lang.Integer> getIdentity() {
		return org.kallithea.ldap.sync.jooq.Keys.IDENTITY_USER_API_KEYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord> getPrimaryKey() {
		return org.kallithea.ldap.sync.jooq.Keys.USER_API_KEYS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord>>asList(org.kallithea.ldap.sync.jooq.Keys.USER_API_KEYS_PKEY, org.kallithea.ldap.sync.jooq.Keys.USER_API_KEYS_API_KEY_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.kallithea.ldap.sync.jooq.tables.records.UserApiKeysRecord, ?>>asList(org.kallithea.ldap.sync.jooq.Keys.USER_API_KEYS__USER_API_KEYS_USER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.kallithea.ldap.sync.jooq.tables.UserApiKeys as(java.lang.String alias) {
		return new org.kallithea.ldap.sync.jooq.tables.UserApiKeys(alias);
	}
}
