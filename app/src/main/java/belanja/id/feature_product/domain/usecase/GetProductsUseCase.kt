package belanja.id.feature_product.domain.usecase

import belanja.id.core.util.Resource
import belanja.id.feature_product.domain.model.Product
import belanja.id.feature_product.domain.repository.ProductsRepository
import kotlinx.coroutines.flow.Flow

class GetProductsUseCase(
    private val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(): Flow<Resource<List<Product>>> {
        return productsRepository.getProducts()
    }
}