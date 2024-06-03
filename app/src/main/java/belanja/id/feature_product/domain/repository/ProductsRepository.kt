package belanja.id.feature_product.domain.repository

import belanja.id.core.util.Resource
import belanja.id.feature_product.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProducts(): Flow<Resource<List<Product>>>
}