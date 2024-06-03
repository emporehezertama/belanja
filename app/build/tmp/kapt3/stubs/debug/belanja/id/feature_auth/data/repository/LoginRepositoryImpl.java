package belanja.id.feature_auth.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lbelanja/id/feature_auth/data/repository/LoginRepositoryImpl;", "Lbelanja/id/feature_auth/domain/repository/LoginRepository;", "authApiService", "Lbelanja/id/feature_auth/data/remote/AuthApiService;", "authPreferences", "Lbelanja/id/feature_auth/data/local/AuthPreferences;", "(Lbelanja/id/feature_auth/data/remote/AuthApiService;Lbelanja/id/feature_auth/data/local/AuthPreferences;)V", "login", "Lbelanja/id/core/util/Resource;", "", "loginRequest", "Lbelanja/id/feature_auth/data/remote/request/LoginRequest;", "rememberMe", "", "(Lbelanja/id/feature_auth/data/remote/request/LoginRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginRepositoryImpl implements belanja.id.feature_auth.domain.repository.LoginRepository {
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_auth.data.remote.AuthApiService authApiService = null;
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_auth.data.local.AuthPreferences authPreferences = null;
    
    public LoginRepositoryImpl(@org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.remote.AuthApiService authApiService, @org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.local.AuthPreferences authPreferences) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object login(@org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.remote.request.LoginRequest loginRequest, boolean rememberMe, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super belanja.id.core.util.Resource<kotlin.Unit>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object logout(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super belanja.id.core.util.Resource<kotlin.Unit>> $completion) {
        return null;
    }
}