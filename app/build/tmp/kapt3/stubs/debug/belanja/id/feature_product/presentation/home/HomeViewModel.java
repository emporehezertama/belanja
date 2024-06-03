package belanja.id.feature_product.presentation.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014\u00a8\u0006("}, d2 = {"Lbelanja/id/feature_product/presentation/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "getProductsUseCase", "Lbelanja/id/feature_product/domain/usecase/GetProductsUseCase;", "(Lbelanja/id/feature_product/domain/usecase/GetProductsUseCase;)V", "_bannerImageState", "Landroidx/compose/runtime/MutableState;", "", "_categoriesState", "", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lbelanja/id/core/util/UiEvents;", "_productsState", "Lbelanja/id/feature_product/presentation/home/ProductsState;", "_searchTerm", "_selectedCategory", "bannerImageState", "Landroidx/compose/runtime/State;", "getBannerImageState", "()Landroidx/compose/runtime/State;", "categoriesState", "getCategoriesState", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "productsState", "getProductsState", "searchTerm", "getSearchTerm", "selectedCategory", "getSelectedCategory", "getProducts", "", "category", "setCategory", "value", "setSearchTerm", "term", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_product.domain.usecase.GetProductsUseCase getProductsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> _selectedCategory = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<java.lang.String> selectedCategory = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<belanja.id.feature_product.presentation.home.ProductsState> _productsState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<belanja.id.feature_product.presentation.home.ProductsState> productsState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> _categoriesState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<java.util.List<java.lang.String>> categoriesState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> _bannerImageState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<java.lang.String> bannerImageState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> _searchTerm = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<java.lang.String> searchTerm = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<belanja.id.core.util.UiEvents> _eventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<belanja.id.core.util.UiEvents> eventFlow = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    belanja.id.feature_product.domain.usecase.GetProductsUseCase getProductsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<java.lang.String> getSelectedCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<belanja.id.feature_product.presentation.home.ProductsState> getProductsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<java.util.List<java.lang.String>> getCategoriesState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<java.lang.String> getBannerImageState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<java.lang.String> getSearchTerm() {
        return null;
    }
    
    public final void setSearchTerm(@org.jetbrains.annotations.NotNull
    java.lang.String term) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<belanja.id.core.util.UiEvents> getEventFlow() {
        return null;
    }
    
    public final void getProducts(@org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    java.lang.String searchTerm) {
    }
}