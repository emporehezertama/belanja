package belanja.id.feature_cart.presentation

import belanja.id.feature_cart.domain.model.CartProduct

data class CartItemsState(
    val cartItems: List<CartProduct> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)