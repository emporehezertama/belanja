package belanja.id.feature_product.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(
    val src: String
): Parcelable
