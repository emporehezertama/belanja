package belanja.id.feature_auth.data.remote

import belanja.id.feature_auth.data.remote.request.LoginRequest
import belanja.id.feature_auth.data.remote.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {

    @POST("auth/login")
    suspend fun loginUser(
        @Body loginRequest: LoginRequest
    ): LoginResponse

}