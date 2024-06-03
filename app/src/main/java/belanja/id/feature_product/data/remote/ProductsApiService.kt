package belanja.id.feature_product.data.remote

import belanja.id.feature_product.data.remote.dto.ProductDto
import retrofit2.http.GET

interface ProductsApiService {

    @GET("products.json")
    suspend fun getProducts(): List<ProductDto>

}