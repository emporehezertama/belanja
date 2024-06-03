package belanja.id.feature_product.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lbelanja/id/feature_product/domain/repository/ProductsRepository;", "", "getProducts", "Lkotlinx/coroutines/flow/Flow;", "Lbelanja/id/core/util/Resource;", "", "Lbelanja/id/feature_product/domain/model/Product;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProductsRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends belanja.id.core.util.Resource<java.util.List<belanja.id.feature_product.domain.model.Product>>>> $completion);
}