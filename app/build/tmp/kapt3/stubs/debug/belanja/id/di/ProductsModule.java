package belanja.id.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0007\u00a8\u0006\u000b"}, d2 = {"Lbelanja/id/di/ProductsModule;", "", "()V", "provideGetProductsUseCase", "Lbelanja/id/feature_product/domain/usecase/GetProductsUseCase;", "productsRepository", "Lbelanja/id/feature_product/domain/repository/ProductsRepository;", "provideProductsApiService", "Lbelanja/id/feature_product/data/remote/ProductsApiService;", "provideProductsRepository", "productsApiService", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ProductsModule {
    @org.jetbrains.annotations.NotNull
    public static final belanja.id.di.ProductsModule INSTANCE = null;
    
    private ProductsModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.data.remote.ProductsApiService provideProductsApiService() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.domain.repository.ProductsRepository provideProductsRepository(@org.jetbrains.annotations.NotNull
    belanja.id.feature_product.data.remote.ProductsApiService productsApiService) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.domain.usecase.GetProductsUseCase provideGetProductsUseCase(@org.jetbrains.annotations.NotNull
    belanja.id.feature_product.domain.repository.ProductsRepository productsRepository) {
        return null;
    }
}