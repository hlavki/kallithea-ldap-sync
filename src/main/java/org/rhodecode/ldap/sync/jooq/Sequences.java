/**
 * This class is generated by jOOQ
 */
package org.rhodecode.ldap.sync.jooq;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in public
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.7" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.cache_invalidation_cache_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> CACHE_INVALIDATION_CACHE_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("cache_invalidation_cache_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.changeset_comments_comment_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> CHANGESET_COMMENTS_COMMENT_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("changeset_comments_comment_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.changeset_statuses_changeset_status_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> CHANGESET_STATUSES_CHANGESET_STATUS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("changeset_statuses_changeset_status_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.gists_gist_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> GISTS_GIST_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("gists_gist_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.groups_group_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> GROUPS_GROUP_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("groups_group_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.notifications_notification_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> NOTIFICATIONS_NOTIFICATION_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("notifications_notification_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.permissions_permission_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> PERMISSIONS_PERMISSION_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("permissions_permission_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.pull_request_reviewers_pull_requests_reviewers_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> PULL_REQUEST_REVIEWERS_PULL_REQUESTS_REVIEWERS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("pull_request_reviewers_pull_requests_reviewers_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.pull_requests_pull_request_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> PULL_REQUESTS_PULL_REQUEST_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("pull_requests_pull_request_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.repositories_fields_repo_field_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> REPOSITORIES_FIELDS_REPO_FIELD_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("repositories_fields_repo_field_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.repositories_repo_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> REPOSITORIES_REPO_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("repositories_repo_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.repo_to_perm_repo_to_perm_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> REPO_TO_PERM_REPO_TO_PERM_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("repo_to_perm_repo_to_perm_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.settings_app_settings_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SETTINGS_APP_SETTINGS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("settings_app_settings_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.statistics_stat_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> STATISTICS_STAT_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("statistics_stat_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.ui_ui_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> UI_UI_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("ui_ui_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_api_keys_user_api_key_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_API_KEYS_USER_API_KEY_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_api_keys_user_api_key_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_email_map_email_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_EMAIL_MAP_EMAIL_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_email_map_email_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_followings_user_following_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_FOLLOWINGS_USER_FOLLOWING_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_followings_user_following_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_group_user_group_to_perm_user_group_user_group_to_perm_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_GROUP_USER_GROUP_TO_PERM_USER_GROUP_USER_GROUP_TO_PERM_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_group_user_group_to_perm_user_group_user_group_to_perm_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_ip_map_ip_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_IP_MAP_IP_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_ip_map_ip_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_logs_user_log_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_LOGS_USER_LOG_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_logs_user_log_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_repo_group_to_perm_group_to_perm_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_REPO_GROUP_TO_PERM_GROUP_TO_PERM_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_repo_group_to_perm_group_to_perm_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.users_group_repo_group_to_per_users_group_repo_group_to_per_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USERS_GROUP_REPO_GROUP_TO_PER_USERS_GROUP_REPO_GROUP_TO_PER_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("users_group_repo_group_to_per_users_group_repo_group_to_per_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.users_group_repo_to_perm_users_group_to_perm_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USERS_GROUP_REPO_TO_PERM_USERS_GROUP_TO_PERM_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("users_group_repo_to_perm_users_group_to_perm_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.users_groups_members_users_group_member_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USERS_GROUPS_MEMBERS_USERS_GROUP_MEMBER_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("users_groups_members_users_group_member_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.users_groups_users_group_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USERS_GROUPS_USERS_GROUP_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("users_groups_users_group_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.users_group_to_perm_users_group_to_perm_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USERS_GROUP_TO_PERM_USERS_GROUP_TO_PERM_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("users_group_to_perm_users_group_to_perm_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.users_user_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USERS_USER_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("users_user_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_to_perm_user_to_perm_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_TO_PERM_USER_TO_PERM_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_to_perm_user_to_perm_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.user_user_group_to_perm_user_user_group_to_perm_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> USER_USER_GROUP_TO_PERM_USER_USER_GROUP_TO_PERM_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("user_user_group_to_perm_user_user_group_to_perm_id_seq", org.rhodecode.ldap.sync.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
