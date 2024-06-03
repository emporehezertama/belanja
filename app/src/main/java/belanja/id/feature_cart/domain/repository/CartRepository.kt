package belanja.id.feature_cart.domain.repository

import belanja.id.core.util.Resource
import belanja.id.feature_cart.data.remote.dto.CartProductDto
import belanja.id.feature_cart.domain.model.CartProduct
import kotlinx.coroutines.flow.Flow

interface CartRepository {
    suspend fun getAllCartItems(id: Int): Flow<Resource<List<CartProduct>>>
    suspend fun addCartItems(id: Int, request: CartProductDto): Flow<Resource<CartProduct>>
}