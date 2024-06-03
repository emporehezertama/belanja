package belanja.id.feature_cart.domain.usecase

import belanja.id.core.util.Resource
import belanja.id.feature_auth.data.dto.Customer
import belanja.id.feature_auth.data.local.AuthPreferences
import belanja.id.feature_cart.domain.model.CartProduct
import belanja.id.feature_cart.domain.repository.CartRepository
import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first

class AddCartItemsUseCase(
    private val cartRepository: CartRepository,
    private val authPreferences: AuthPreferences,
    private val gson: Gson

) {
//    suspend operator fun invoke(): Flow<Resource<List<CartProduct>>> {
//        val data = authPreferences.getUserData.first()
//        val user = gson.fromJson(data, Customer::class.java)
//        return cartRepository.addCartItems(user.id)
//    }
}