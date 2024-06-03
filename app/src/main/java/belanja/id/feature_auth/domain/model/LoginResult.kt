package belanja.id.feature_auth.domain.model

import belanja.id.core.util.Resource

data class LoginResult(
    val passwordError: String? = null,
    val usernameError: String? = null,
    val result: Resource<Unit>? = null
)
