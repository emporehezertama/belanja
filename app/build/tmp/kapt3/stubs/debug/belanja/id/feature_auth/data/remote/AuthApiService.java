package belanja.id.feature_auth.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lbelanja/id/feature_auth/data/remote/AuthApiService;", "", "loginUser", "Lbelanja/id/feature_auth/data/remote/response/LoginResponse;", "loginRequest", "Lbelanja/id/feature_auth/data/remote/request/LoginRequest;", "(Lbelanja/id/feature_auth/data/remote/request/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AuthApiService {
    
    @retrofit2.http.POST(value = "auth/login")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loginUser(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.remote.request.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super belanja.id.feature_auth.data.remote.response.LoginResponse> $completion);
}