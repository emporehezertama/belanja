package belanja.id.feature_auth.data.repository

import belanja.id.core.util.Resource
import belanja.id.feature_auth.data.local.AuthPreferences
import belanja.id.feature_auth.data.remote.AuthApiService
import belanja.id.feature_auth.data.remote.request.LoginRequest
import belanja.id.feature_auth.domain.repository.LoginRepository
import kotlinx.coroutines.flow.first
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException

class LoginRepositoryImpl(
    private val authApiService: AuthApiService,
    private val authPreferences: AuthPreferences
) : LoginRepository {

    override suspend fun login(loginRequest: LoginRequest, rememberMe: Boolean): Resource<Unit> {
        Timber.d("Login called")
        return try {
            val response = authApiService.loginUser(loginRequest)
            Timber.d("Login Token: ${response.token}")
            if (rememberMe) {
                authPreferences.saveAccessToken(response.token)
            }
            Resource.Success(Unit)
        } catch (e: IOException) {
            Resource.Error(message = "Could not reach the server, please check your internet connection!")
        } catch (e: HttpException) {
            Resource.Error(message = "An Unknown error occurred, please try again!")
        }
    }

    override suspend fun logout(): Resource<Unit> {
        return try {
            authPreferences.clearAccessToken()
            val fetchedToken = authPreferences.getAccessToken.first()
            Timber.d("token: $fetchedToken")

            if (fetchedToken.isEmpty()) {
                Resource.Success(Unit)
            } else {
                Resource.Error("Unknown Error")
            }
        } catch (e: Exception) {
            return Resource.Error("Unknown error occurred")
        }
    }

}