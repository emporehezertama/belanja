package belanja.id.feature_cart.data.remote.dto

import com.google.gson.annotations.SerializedName

class CartProductDto (
    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("graph_variant_id")
    val variantID: String
)