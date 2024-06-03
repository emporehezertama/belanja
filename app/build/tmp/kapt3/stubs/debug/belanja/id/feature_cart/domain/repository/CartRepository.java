package belanja.id.feature_cart.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lbelanja/id/feature_cart/domain/repository/CartRepository;", "", "addCartItems", "Lkotlinx/coroutines/flow/Flow;", "Lbelanja/id/core/util/Resource;", "Lbelanja/id/feature_cart/domain/model/CartProduct;", "id", "", "request", "Lbelanja/id/feature_cart/data/remote/dto/CartProductDto;", "(ILbelanja/id/feature_cart/data/remote/dto/CartProductDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCartItems", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CartRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllCartItems(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends belanja.id.core.util.Resource<java.util.List<belanja.id.feature_cart.domain.model.CartProduct>>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addCartItems(int id, @org.jetbrains.annotations.NotNull
    belanja.id.feature_cart.data.remote.dto.CartProductDto request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends belanja.id.core.util.Resource<belanja.id.feature_cart.domain.model.CartProduct>>> $completion);
}