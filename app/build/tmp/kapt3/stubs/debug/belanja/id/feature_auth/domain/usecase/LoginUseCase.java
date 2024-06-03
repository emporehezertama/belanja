package belanja.id.feature_auth.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lbelanja/id/feature_auth/domain/usecase/LoginUseCase;", "", "loginRepository", "Lbelanja/id/feature_auth/domain/repository/LoginRepository;", "(Lbelanja/id/feature_auth/domain/repository/LoginRepository;)V", "invoke", "Lbelanja/id/feature_auth/domain/model/LoginResult;", "username", "", "password", "rememberMe", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginUseCase {
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_auth.domain.repository.LoginRepository loginRepository = null;
    
    public LoginUseCase(@org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.domain.repository.LoginRepository loginRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, boolean rememberMe, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super belanja.id.feature_auth.domain.model.LoginResult> $completion) {
        return null;
    }
}