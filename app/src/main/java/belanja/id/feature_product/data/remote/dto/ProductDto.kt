package belanja.id.feature_product.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ProductDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("body_html")
    val body: String,
    @SerializedName("tags")
    val tags: String,
    @SerializedName("variants")
    val variants: List<ProductVariantDto>,
    @SerializedName("image")
    val image: ProducImageDto
)
