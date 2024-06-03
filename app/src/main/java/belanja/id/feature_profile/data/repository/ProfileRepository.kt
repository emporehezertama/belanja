package belanja.id.feature_profile.data.repository

import belanja.id.feature_auth.data.local.AuthPreferences
import kotlinx.coroutines.flow.Flow

class ProfileRepository(private val authPreferences: AuthPreferences) {
    fun getUserProfile(): Flow<String> {
        return authPreferences.getUserData
    }
}