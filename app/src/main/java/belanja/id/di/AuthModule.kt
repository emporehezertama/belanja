package belanja.id.di

import belanja.id.core.util.AppInterceptor
import belanja.id.core.util.Constants.BASE_URL
import belanja.id.feature_auth.data.local.AuthPreferences
import belanja.id.feature_auth.data.remote.AuthApiService
import belanja.id.feature_auth.data.repository.LoginRepositoryImpl
import belanja.id.feature_auth.domain.repository.LoginRepository
import belanja.id.feature_auth.domain.usecase.LoginUseCase
import belanja.id.feature_auth.domain.usecase.LogoutUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {

    @Provides
    @Singleton
    fun provideAuthApiService(): AuthApiService {

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(AppInterceptor())
            .build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AuthApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideLoginRepository(
        authApiService: AuthApiService,
        authPreferences: AuthPreferences
    ): LoginRepository {
        return LoginRepositoryImpl(
            authApiService = authApiService,
            authPreferences = authPreferences
        )
    }

    @Provides
    @Singleton
    fun provideLoginUseCase(loginRepository: LoginRepository): LoginUseCase {
        return LoginUseCase(loginRepository)
    }

    @Provides
    @Singleton
    fun provideLogoutUseCase(loginRepository: LoginRepository): LogoutUseCase {
        return LogoutUseCase(loginRepository)
    }
}
