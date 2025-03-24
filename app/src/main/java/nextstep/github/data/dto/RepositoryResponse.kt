package nextstep.github.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import nextstep.github.domain.model.GithubRepo

@Serializable
data class RepositoryResponse(
    @SerialName("full_name") val fullName: String?,
    @SerialName("description") val description: String?,
    @SerialName("stargazers_count") val stargazersCount: Int?,
)

fun RepositoryResponse.toGithubRepo() = GithubRepo(
    fullName = this.fullName ?: "",
    description = this.description ?: "",
    stargazersCount = this.stargazersCount ?: 0,
)
