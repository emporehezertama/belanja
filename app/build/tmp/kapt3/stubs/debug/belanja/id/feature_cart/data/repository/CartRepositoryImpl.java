package belanja.id.feature_cart.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lbelanja/id/feature_cart/data/repository/CartRepositoryImpl;", "Lbelanja/id/feature_cart/domain/repository/CartRepository;", "cartApiService", "Lbelanja/id/feature_cart/data/remote/CartApiService;", "(Lbelanja/id/feature_cart/data/remote/CartApiService;)V", "addCartItems", "Lkotlinx/coroutines/flow/Flow;", "Lbelanja/id/core/util/Resource;", "Lbelanja/id/feature_cart/domain/model/CartProduct;", "id", "", "request", "Lbelanja/id/feature_cart/data/remote/dto/CartProductDto;", "(ILbelanja/id/feature_cart/data/remote/dto/CartProductDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCartItems", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CartRepositoryImpl implements belanja.id.feature_cart.domain.repository.CartRepository {
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_cart.data.remote.CartApiService cartApiService = null;
    
    public CartRepositoryImpl(@org.jetbrains.annotations.NotNull
    belanja.id.feature_cart.data.remote.CartApiService cartApiService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getAllCartItems(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends belanja.id.core.util.Resource<java.util.List<belanja.id.feature_cart.domain.model.CartProduct>>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addCartItems(int id, @org.jetbrains.annotations.NotNull
    belanja.id.feature_cart.data.remote.dto.CartProductDto request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends belanja.id.core.util.Resource<belanja.id.feature_cart.domain.model.CartProduct>>> $completion) {
        return null;
    }
}