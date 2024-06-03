package belanja.id.feature_cart.domain.model

import belanja.id.feature_product.domain.model.Image
import belanja.id.feature_product.domain.model.Variant

data class CartProduct(
    val title: String,
    val quantity: Int,
    val variants: List<Variant>,
    val image: Image
)
