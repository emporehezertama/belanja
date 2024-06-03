package belanja.id.di

import belanja.id.core.util.AppInterceptor
import belanja.id.core.util.Constants
import belanja.id.feature_product.data.remote.ProductsApiService
import belanja.id.feature_product.data.repository.ProductsRepositoryImpl
import belanja.id.feature_product.domain.repository.ProductsRepository
import belanja.id.feature_product.domain.usecase.GetProductsUseCase
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
object ProductsModule {

    @Provides
    @Singleton
    fun provideProductsApiService(): ProductsApiService {

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(AppInterceptor())
            .build()

        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductsApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideProductsRepository(
        productsApiService: ProductsApiService
    ): ProductsRepository {
        return ProductsRepositoryImpl(
            productsApiService
        )
    }

    @Provides
    @Singleton
    fun provideGetProductsUseCase(productsRepository: ProductsRepository): GetProductsUseCase {
        return GetProductsUseCase(productsRepository)
    }

}