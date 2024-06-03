package belanja.id.feature_product.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    val id: Int,
    val title: String,
    val bodyHtml: String,
    val tags: String,
    val variants: List<Variant>,
    val image: Image
) : Parcelable
