package belanja.id.feature_cart.data.remote

import belanja.id.feature_cart.data.remote.dto.CartProductDto
import belanja.id.feature_cart.data.remote.dto.UserCartResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CartApiService {

    @GET("carts/{id}")
    suspend fun cartItems(
        @Path("id") id: Int
    ): List<UserCartResponseDto>

    @POST("carts/{id}/items")
    suspend fun addCartItem(
        @Path("id") cartId: Int,
        @Body request: CartProductDto
    ): UserCartResponseDto
}