package belanja.id.feature_profile.data

import belanja.id.feature_auth.data.dto.Customer
import belanja.id.feature_profile.domain.model.User

internal fun Customer.toDomain(): User {
    return User(
        email = email,
        id = id,
        firstName = firstName,
        lastName = lastName,
        password = password,
        phone = phone,
    )
}