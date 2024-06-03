package belanja.id.feature_product.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lbelanja/id/feature_product/data/repository/ProductsRepositoryImpl;", "Lbelanja/id/feature_product/domain/repository/ProductsRepository;", "productsApiService", "Lbelanja/id/feature_product/data/remote/ProductsApiService;", "(Lbelanja/id/feature_product/data/remote/ProductsApiService;)V", "getProducts", "Lkotlinx/coroutines/flow/Flow;", "Lbelanja/id/core/util/Resource;", "", "Lbelanja/id/feature_product/domain/model/Product;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProductsRepositoryImpl implements belanja.id.feature_product.domain.repository.ProductsRepository {
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_product.data.remote.ProductsApiService productsApiService = null;
    
    public ProductsRepositoryImpl(@org.jetbrains.annotations.NotNull
    belanja.id.feature_product.data.remote.ProductsApiService productsApiService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends belanja.id.core.util.Resource<java.util.List<belanja.id.feature_product.domain.model.Product>>>> $completion) {
        return null;
    }
}