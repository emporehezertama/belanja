package belanja.id.feature_auth.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lbelanja/id/feature_auth/domain/repository/LoginRepository;", "", "login", "Lbelanja/id/core/util/Resource;", "", "loginRequest", "Lbelanja/id/feature_auth/data/remote/request/LoginRequest;", "rememberMe", "", "(Lbelanja/id/feature_auth/data/remote/request/LoginRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LoginRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.remote.request.LoginRequest loginRequest, boolean rememberMe, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super belanja.id.core.util.Resource<kotlin.Unit>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object logout(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super belanja.id.core.util.Resource<kotlin.Unit>> $completion);
}