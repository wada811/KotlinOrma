package com.wada811.kotlinorma.data

import com.github.gfx.android.orma.annotation.Column
import com.github.gfx.android.orma.annotation.PrimaryKey
import com.github.gfx.android.orma.annotation.Setter
import com.github.gfx.android.orma.annotation.Table
import org.threeten.bp.ZonedDateTime

@Table("repositories")
data class RepositoryEntity(
    @Setter("user") @Column(indexed = true) val user: UserEntity,
    @Setter("id") @Column @PrimaryKey val id: Long,
    @Setter("name") @Column val name: String,
    @Setter("full_name") @Column val full_name: String,
    @Setter("owner_login") @Column val owner_login: String,
    @Setter("owner_id") @Column val owner_id: Long,
    @Setter("owner_avatar_url") @Column val owner_avatar_url: String,
    @Setter("owner_gravatar_id") @Column val owner_gravatar_id: String,
    @Setter("owner_url") @Column val owner_url: String,
    @Setter("owner_html_url") @Column val owner_html_url: String,
    @Setter("owner_followers_url") @Column val owner_followers_url: String,
    @Setter("owner_following_url") @Column val owner_following_url: String,
    @Setter("owner_gists_url") @Column val owner_gists_url: String,
    @Setter("owner_starred_url") @Column val owner_starred_url: String,
    @Setter("owner_subscriptions_url") @Column val owner_subscriptions_url: String,
    @Setter("owner_organizations_url") @Column val owner_organizations_url: String,
    @Setter("owner_repos_url") @Column val owner_repos_url: String,
    @Setter("owner_events_url") @Column val owner_events_url: String,
    @Setter("owner_received_events_url") @Column val owner_received_events_url: String,
    @Setter("owner_type") @Column val owner_type: String,
    @Setter("owner_site_admin") @Column val owner_site_admin: Boolean,
    @Setter("is_private") @Column val is_private: Boolean,
    @Setter("html_url") @Column val html_url: String,
    @Setter("description") @Column val description: String?,
    @Setter("fork") @Column val fork: Boolean,
    @Setter("url") @Column val url: String,
    @Setter("forks_url") @Column val forks_url: String,
    @Setter("keys_url") @Column val keys_url: String,
    @Setter("collaborators_url") @Column val collaborators_url: String,
    @Setter("teams_url") @Column val teams_url: String,
    @Setter("hooks_url") @Column val hooks_url: String,
    @Setter("issue_events_url") @Column val issue_events_url: String,
    @Setter("events_url") @Column val events_url: String,
    @Setter("assignees_url") @Column val assignees_url: String,
    @Setter("branches_url") @Column val branches_url: String,
    @Setter("tags_url") @Column val tags_url: String,
    @Setter("blobs_url") @Column val blobs_url: String,
    @Setter("git_tags_url") @Column val git_tags_url: String,
    @Setter("git_refs_url") @Column val git_refs_url: String,
    @Setter("trees_url") @Column val trees_url: String,
    @Setter("statuses_url") @Column val statuses_url: String,
    @Setter("languages_url") @Column val languages_url: String,
    @Setter("stargazers_url") @Column val stargazers_url: String,
    @Setter("contributors_url") @Column val contributors_url: String,
    @Setter("subscribers_url") @Column val subscribers_url: String,
    @Setter("subscription_url") @Column val subscription_url: String,
    @Setter("commits_url") @Column val commits_url: String,
    @Setter("git_commits_url") @Column val git_commits_url: String,
    @Setter("comments_url") @Column val comments_url: String,
    @Setter("issue_comment_url") @Column val issue_comment_url: String,
    @Setter("contents_url") @Column val contents_url: String,
    @Setter("compare_url") @Column val compare_url: String,
    @Setter("merges_url") @Column val merges_url: String,
    @Setter("archive_url") @Column val archive_url: String,
    @Setter("downloads_url") @Column val downloads_url: String,
    @Setter("issues_url") @Column val issues_url: String,
    @Setter("pulls_url") @Column val pulls_url: String,
    @Setter("milestones_url") @Column val milestones_url: String,
    @Setter("notifications_url") @Column val notifications_url: String,
    @Setter("labels_url") @Column val labels_url: String,
    @Setter("releases_url") @Column val releases_url: String,
    @Setter("deployments_url") @Column val deployments_url: String,
    @Setter("created_at") @Column val created_at: ZonedDateTime,
    @Setter("updated_at") @Column val updated_at: ZonedDateTime,
    @Setter("pushed_at") @Column val pushed_at: ZonedDateTime,
    @Setter("git_url") @Column val git_url: String,
    @Setter("ssh_url") @Column val ssh_url: String,
    @Setter("clone_url") @Column val clone_url: String,
    @Setter("svn_url") @Column val svn_url: String,
    @Setter("homepage") @Column val homepage: String?,
    @Setter("size") @Column val size: Int,
    @Setter("stargazers_count") @Column val stargazers_count: Int,
    @Setter("watchers_count") @Column val watchers_count: Int,
    @Setter("language") @Column val language: String?,
    @Setter("has_issues") @Column val has_issues: Boolean,
    @Setter("has_downloads") @Column val has_downloads: Boolean,
    @Setter("has_wiki") @Column val has_wiki: Boolean,
    @Setter("has_pages") @Column val has_pages: Boolean,
    @Setter("forks_count") @Column val forks_count: Int,
    @Setter("mirror_url") @Column val mirror_url: String?,
    @Setter("open_issues_count") @Column val open_issues_count: Int,
    @Setter("forks") @Column val forks: Int,
    @Setter("open_issues") @Column val open_issues: Int,
    @Setter("watchers") @Column val watchers: Int,
    @Setter("default_branch") @Column val default_branch: String,
    @Setter("permission_admin") @Column val permission_admin: Boolean,
    @Setter("permission_push") @Column val permission_push: Boolean,
    @Setter("permission_pull") @Column val permission_pull: Boolean
)