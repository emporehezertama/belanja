package belanja.id.di

import belanja.id.core.util.AppInterceptor
import belanja.id.core.util.Constants
import belanja.id.feature_auth.data.local.AuthPreferences
import belanja.id.feature_cart.data.remote.CartApiService
import belanja.id.feature_cart.data.repository.CartRepositoryImpl
import belanja.id.feature_cart.domain.repository.CartRepository
import belanja.id.feature_cart.domain.usecase.GetCartItemsUseCase
import com.google.gson.Gson
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
object CartModule {

    @Provides
    @Singleton
    fun provideCartApiService(): CartApiService {

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(AppInterceptor())
            .build()

        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CartApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideCartRepository(
        cartApiService: CartApiService
    ): CartRepository {
        return CartRepositoryImpl(
            cartApiService
        )
    }

    @Provides
    @Singleton
    fun provideGetCartItemsUseCase(
        cartRepository: CartRepository,
        authPreferences: AuthPreferences,
        gson: Gson
    ): GetCartItemsUseCase {
        return GetCartItemsUseCase(cartRepository, authPreferences, gson)
    }
}