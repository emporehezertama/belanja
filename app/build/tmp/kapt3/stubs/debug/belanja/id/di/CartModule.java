package belanja.id.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lbelanja/id/di/CartModule;", "", "()V", "provideCartApiService", "Lbelanja/id/feature_cart/data/remote/CartApiService;", "provideCartRepository", "Lbelanja/id/feature_cart/domain/repository/CartRepository;", "cartApiService", "provideGetCartItemsUseCase", "Lbelanja/id/feature_cart/domain/usecase/GetCartItemsUseCase;", "cartRepository", "authPreferences", "Lbelanja/id/feature_auth/data/local/AuthPreferences;", "gson", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class CartModule {
    @org.jetbrains.annotations.NotNull
    public static final belanja.id.di.CartModule INSTANCE = null;
    
    private CartModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_cart.data.remote.CartApiService provideCartApiService() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_cart.domain.repository.CartRepository provideCartRepository(@org.jetbrains.annotations.NotNull
    belanja.id.feature_cart.data.remote.CartApiService cartApiService) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_cart.domain.usecase.GetCartItemsUseCase provideGetCartItemsUseCase(@org.jetbrains.annotations.NotNull
    belanja.id.feature_cart.domain.repository.CartRepository cartRepository, @org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.local.AuthPreferences authPreferences, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        return null;
    }
}