package belanja.id.feature_auth.data.dto

import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("address1")
    val address1: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("province")
    val province: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("zip")
    val zip: String,
)
