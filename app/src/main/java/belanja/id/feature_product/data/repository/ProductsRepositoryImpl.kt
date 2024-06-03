package belanja.id.feature_product.data.repository

import belanja.id.core.util.Resource
import belanja.id.feature_product.data.remote.ProductsApiService
import belanja.id.feature_product.data.remote.mappers.toDomain
import belanja.id.feature_product.domain.model.Product
import belanja.id.feature_product.domain.repository.ProductsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class ProductsRepositoryImpl(private val productsApiService: ProductsApiService) :
    ProductsRepository {
    override suspend fun getProducts(): Flow<Resource<List<Product>>> = flow {
        emit(Resource.Loading())
        try {
            val response = productsApiService.getProducts()
            emit(Resource.Success(response.map { it.toDomain() }))
        } catch (e: IOException) {
            emit(Resource.Error(message = "Could not reach the server, please check your internet connection!"))
        } catch (e: HttpException) {
            emit(Resource.Error(message = "Oops, something went wrong!"))
        }
    }

}