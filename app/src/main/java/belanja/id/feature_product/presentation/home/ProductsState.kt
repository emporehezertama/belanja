package belanja.id.feature_product.presentation.home

import belanja.id.feature_product.domain.model.Product

data class ProductsState(
    val products: List<Product> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)