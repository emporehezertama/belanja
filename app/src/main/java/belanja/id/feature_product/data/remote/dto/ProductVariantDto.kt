package belanja.id.feature_product.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ProductVariantDto(
    @SerializedName("price")
    val price: String
)
