/**
 * This class is generated by jOOQ
 */
package org.rhodecode.ldap.sync.jooq;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all tables in public
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.7" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table public.cache_invalidation
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.CacheInvalidation CACHE_INVALIDATION = org.rhodecode.ldap.sync.jooq.tables.CacheInvalidation.CACHE_INVALIDATION;

	/**
	 * The table public.changeset_comments
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.ChangesetComments CHANGESET_COMMENTS = org.rhodecode.ldap.sync.jooq.tables.ChangesetComments.CHANGESET_COMMENTS;

	/**
	 * The table public.changeset_statuses
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses CHANGESET_STATUSES = org.rhodecode.ldap.sync.jooq.tables.ChangesetStatuses.CHANGESET_STATUSES;

	/**
	 * The table public.db_migrate_version
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.DbMigrateVersion DB_MIGRATE_VERSION = org.rhodecode.ldap.sync.jooq.tables.DbMigrateVersion.DB_MIGRATE_VERSION;

	/**
	 * The table public.gists
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Gists GISTS = org.rhodecode.ldap.sync.jooq.tables.Gists.GISTS;

	/**
	 * The table public.groups
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Groups GROUPS = org.rhodecode.ldap.sync.jooq.tables.Groups.GROUPS;

	/**
	 * The table public.notifications
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Notifications NOTIFICATIONS = org.rhodecode.ldap.sync.jooq.tables.Notifications.NOTIFICATIONS;

	/**
	 * The table public.permissions
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Permissions PERMISSIONS = org.rhodecode.ldap.sync.jooq.tables.Permissions.PERMISSIONS;

	/**
	 * The table public.pull_request_reviewers
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.PullRequestReviewers PULL_REQUEST_REVIEWERS = org.rhodecode.ldap.sync.jooq.tables.PullRequestReviewers.PULL_REQUEST_REVIEWERS;

	/**
	 * The table public.pull_requests
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.PullRequests PULL_REQUESTS = org.rhodecode.ldap.sync.jooq.tables.PullRequests.PULL_REQUESTS;

	/**
	 * The table public.repositories
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Repositories REPOSITORIES = org.rhodecode.ldap.sync.jooq.tables.Repositories.REPOSITORIES;

	/**
	 * The table public.repositories_fields
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.RepositoriesFields REPOSITORIES_FIELDS = org.rhodecode.ldap.sync.jooq.tables.RepositoriesFields.REPOSITORIES_FIELDS;

	/**
	 * The table public.repo_to_perm
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.RepoToPerm REPO_TO_PERM = org.rhodecode.ldap.sync.jooq.tables.RepoToPerm.REPO_TO_PERM;

	/**
	 * The table public.settings
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Settings SETTINGS = org.rhodecode.ldap.sync.jooq.tables.Settings.SETTINGS;

	/**
	 * The table public.statistics
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Statistics STATISTICS = org.rhodecode.ldap.sync.jooq.tables.Statistics.STATISTICS;

	/**
	 * The table public.ui
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Ui UI = org.rhodecode.ldap.sync.jooq.tables.Ui.UI;

	/**
	 * The table public.user_api_keys
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserApiKeys USER_API_KEYS = org.rhodecode.ldap.sync.jooq.tables.UserApiKeys.USER_API_KEYS;

	/**
	 * The table public.user_email_map
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserEmailMap USER_EMAIL_MAP = org.rhodecode.ldap.sync.jooq.tables.UserEmailMap.USER_EMAIL_MAP;

	/**
	 * The table public.user_followings
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserFollowings USER_FOLLOWINGS = org.rhodecode.ldap.sync.jooq.tables.UserFollowings.USER_FOLLOWINGS;

	/**
	 * The table public.user_group_user_group_to_perm
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserGroupUserGroupToPerm USER_GROUP_USER_GROUP_TO_PERM = org.rhodecode.ldap.sync.jooq.tables.UserGroupUserGroupToPerm.USER_GROUP_USER_GROUP_TO_PERM;

	/**
	 * The table public.user_ip_map
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserIpMap USER_IP_MAP = org.rhodecode.ldap.sync.jooq.tables.UserIpMap.USER_IP_MAP;

	/**
	 * The table public.user_logs
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserLogs USER_LOGS = org.rhodecode.ldap.sync.jooq.tables.UserLogs.USER_LOGS;

	/**
	 * The table public.user_repo_group_to_perm
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserRepoGroupToPerm USER_REPO_GROUP_TO_PERM = org.rhodecode.ldap.sync.jooq.tables.UserRepoGroupToPerm.USER_REPO_GROUP_TO_PERM;

	/**
	 * The table public.users
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.Users USERS = org.rhodecode.ldap.sync.jooq.tables.Users.USERS;

	/**
	 * The table public.users_group_repo_group_to_perm
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UsersGroupRepoGroupToPerm USERS_GROUP_REPO_GROUP_TO_PERM = org.rhodecode.ldap.sync.jooq.tables.UsersGroupRepoGroupToPerm.USERS_GROUP_REPO_GROUP_TO_PERM;

	/**
	 * The table public.users_group_repo_to_perm
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UsersGroupRepoToPerm USERS_GROUP_REPO_TO_PERM = org.rhodecode.ldap.sync.jooq.tables.UsersGroupRepoToPerm.USERS_GROUP_REPO_TO_PERM;

	/**
	 * The table public.users_groups
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UsersGroups USERS_GROUPS = org.rhodecode.ldap.sync.jooq.tables.UsersGroups.USERS_GROUPS;

	/**
	 * The table public.users_groups_members
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UsersGroupsMembers USERS_GROUPS_MEMBERS = org.rhodecode.ldap.sync.jooq.tables.UsersGroupsMembers.USERS_GROUPS_MEMBERS;

	/**
	 * The table public.users_group_to_perm
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UsersGroupToPerm USERS_GROUP_TO_PERM = org.rhodecode.ldap.sync.jooq.tables.UsersGroupToPerm.USERS_GROUP_TO_PERM;

	/**
	 * The table public.user_to_notification
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserToNotification USER_TO_NOTIFICATION = org.rhodecode.ldap.sync.jooq.tables.UserToNotification.USER_TO_NOTIFICATION;

	/**
	 * The table public.user_to_perm
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserToPerm USER_TO_PERM = org.rhodecode.ldap.sync.jooq.tables.UserToPerm.USER_TO_PERM;

	/**
	 * The table public.user_user_group_to_perm
	 */
	public static final org.rhodecode.ldap.sync.jooq.tables.UserUserGroupToPerm USER_USER_GROUP_TO_PERM = org.rhodecode.ldap.sync.jooq.tables.UserUserGroupToPerm.USER_USER_GROUP_TO_PERM;
}
