package belanja.id.feature_auth.domain.usecase

import belanja.id.core.util.Resource
import belanja.id.feature_auth.domain.repository.LoginRepository

class LogoutUseCase(
    private val loginRepository: LoginRepository
) {
    suspend operator fun invoke(): Resource<Unit> {
        return loginRepository.logout()
    }
}
