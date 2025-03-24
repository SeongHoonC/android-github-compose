package nextstep.github.model

data class GithubRepo(
    val fullName: String,
    val description: String,
    val stargazersCount: Int,
) {
    val isPopular: Boolean
        get() = stargazersCount > 50
}
