package belanja.id.feature_cart.data.repository

import belanja.id.core.util.Resource
import belanja.id.feature_cart.data.remote.CartApiService
import belanja.id.feature_cart.data.remote.dto.CartProductDto
import belanja.id.feature_cart.domain.model.CartProduct
import belanja.id.feature_cart.domain.repository.CartRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException

class CartRepositoryImpl(
    private val cartApiService: CartApiService
) : CartRepository {
    override suspend fun getAllCartItems(id: Int): Flow<Resource<List<CartProduct>>> = flow {
        Timber.d("Get all cart items called")
        emit(Resource.Loading())
        try {
            val response = cartApiService.cartItems(id)
            val cartItems = ArrayList<CartProduct>()
            response.forEach { it1 ->
                it1.cartProductDtos.forEach {

                }
            }
            emit(Resource.Success(cartItems.toList().distinctBy { it.title }))
        } catch (e: IOException) {
            emit(Resource.Error(message = "Could not reach the server, please check your internet connection!"))
        } catch (e: HttpException) {
            emit(Resource.Error(message = "Oops, something went wrong!"))
        }
    }

    override suspend fun addCartItems(
        id: Int,
        request: CartProductDto
    ): Flow<Resource<CartProduct>> = flow {
        Timber.d("Get all cart items called")
        emit(Resource.Loading())
        try {
            val response = cartApiService.cartItems(id)
            val cartItems = ArrayList<CartProduct>()
            response.forEach { it1 ->
                it1.cartProductDtos.forEach {

                }
            }
//            emit(Resource.Success(cartItems.toList().distinctBy { it.title }))
        } catch (e: IOException) {
            emit(Resource.Error(message = "Could not reach the server, please check your internet connection!"))
        } catch (e: HttpException) {
            emit(Resource.Error(message = "Oops, something went wrong!"))
        }
    }
}