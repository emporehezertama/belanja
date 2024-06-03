package belanja.id.feature_cart.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lbelanja/id/feature_cart/presentation/CartViewModel;", "Landroidx/lifecycle/ViewModel;", "getCartItemsUseCase", "Lbelanja/id/feature_cart/domain/usecase/GetCartItemsUseCase;", "(Lbelanja/id/feature_cart/domain/usecase/GetCartItemsUseCase;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lbelanja/id/core/util/UiEvents;", "_state", "Landroidx/compose/runtime/MutableState;", "Lbelanja/id/feature_cart/presentation/CartItemsState;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getCartItems", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CartViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_cart.domain.usecase.GetCartItemsUseCase getCartItemsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<belanja.id.feature_cart.presentation.CartItemsState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<belanja.id.feature_cart.presentation.CartItemsState> state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<belanja.id.core.util.UiEvents> _eventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<belanja.id.core.util.UiEvents> eventFlow = null;
    
    @javax.inject.Inject
    public CartViewModel(@org.jetbrains.annotations.NotNull
    belanja.id.feature_cart.domain.usecase.GetCartItemsUseCase getCartItemsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<belanja.id.feature_cart.presentation.CartItemsState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<belanja.id.core.util.UiEvents> getEventFlow() {
        return null;
    }
    
    private final java.lang.Object getCartItems(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}