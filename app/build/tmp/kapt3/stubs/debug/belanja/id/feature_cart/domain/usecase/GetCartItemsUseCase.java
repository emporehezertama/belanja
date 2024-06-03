package belanja.id.feature_cart.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lbelanja/id/feature_cart/domain/usecase/GetCartItemsUseCase;", "", "cartRepository", "Lbelanja/id/feature_cart/domain/repository/CartRepository;", "authPreferences", "Lbelanja/id/feature_auth/data/local/AuthPreferences;", "gson", "Lcom/google/gson/Gson;", "(Lbelanja/id/feature_cart/domain/repository/CartRepository;Lbelanja/id/feature_auth/data/local/AuthPreferences;Lcom/google/gson/Gson;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lbelanja/id/core/util/Resource;", "", "Lbelanja/id/feature_cart/domain/model/CartProduct;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetCartItemsUseCase {
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_cart.domain.repository.CartRepository cartRepository = null;
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_auth.data.local.AuthPreferences authPreferences = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    
    public GetCartItemsUseCase(@org.jetbrains.annotations.NotNull
    belanja.id.feature_cart.domain.repository.CartRepository cartRepository, @org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.local.AuthPreferences authPreferences, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends belanja.id.core.util.Resource<java.util.List<belanja.id.feature_cart.domain.model.CartProduct>>>> $completion) {
        return null;
    }
}