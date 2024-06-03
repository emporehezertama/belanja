package belanja.id.feature_auth.domain.repository

import belanja.id.core.util.Resource
import belanja.id.feature_auth.data.remote.request.LoginRequest

interface LoginRepository {
    suspend fun login(loginRequest: LoginRequest, rememberMe: Boolean): Resource<Unit>
    suspend fun logout(): Resource<Unit>
}
