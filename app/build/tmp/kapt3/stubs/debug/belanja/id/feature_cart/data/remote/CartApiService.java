package belanja.id.feature_cart.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lbelanja/id/feature_cart/data/remote/CartApiService;", "", "addCartItem", "Lbelanja/id/feature_cart/data/remote/dto/UserCartResponseDto;", "cartId", "", "request", "Lbelanja/id/feature_cart/data/remote/dto/CartProductDto;", "(ILbelanja/id/feature_cart/data/remote/dto/CartProductDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cartItems", "", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CartApiService {
    
    @retrofit2.http.GET(value = "carts/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object cartItems(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<belanja.id.feature_cart.data.remote.dto.UserCartResponseDto>> $completion);
    
    @retrofit2.http.POST(value = "carts/{id}/items")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addCartItem(@retrofit2.http.Path(value = "id")
    int cartId, @retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    belanja.id.feature_cart.data.remote.dto.CartProductDto request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super belanja.id.feature_cart.data.remote.dto.UserCartResponseDto> $completion);
}