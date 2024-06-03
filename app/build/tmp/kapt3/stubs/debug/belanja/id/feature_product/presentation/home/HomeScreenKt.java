package belanja.id.feature_product.presentation.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u001a\u001a\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001aJ\u0010\r\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u001a@\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0007\u001a\"\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0003\u00a8\u0006\u001c"}, d2 = {"Categories", "", "categories", "", "", "onSelectCategory", "Lkotlin/Function1;", "selectedCategory", "HomeScreen", "navigator", "Lcom/ramcosta/composedestinations/navigation/DestinationsNavigator;", "viewModel", "Lbelanja/id/feature_product/presentation/home/HomeViewModel;", "HomeScreenContent", "productsState", "Lbelanja/id/feature_product/presentation/home/ProductsState;", "bannerImageUrl", "MyTopAppBar", "currentSearchText", "onSearchTextChange", "onSearch", "Lkotlin/Function0;", "onToggleExpand", "ProductItem", "product", "Lbelanja/id/feature_product/domain/model/Product;", "modifier", "Landroidx/compose/ui/Modifier;", "app_debug"})
public final class HomeScreenKt {
    
    @android.annotation.SuppressLint(value = {"UnusedMaterialScaffoldPaddingParameter"})
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
    @com.ramcosta.composedestinations.annotation.Destination
    @androidx.compose.runtime.Composable
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    com.ramcosta.composedestinations.navigation.DestinationsNavigator navigator, @org.jetbrains.annotations.NotNull
    belanja.id.feature_product.presentation.home.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    private static final void HomeScreenContent(java.util.List<java.lang.String> categories, belanja.id.feature_product.presentation.home.ProductsState productsState, com.ramcosta.composedestinations.navigation.DestinationsNavigator navigator, java.lang.String bannerImageUrl, java.lang.String selectedCategory, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSelectCategory) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void ProductItem(belanja.id.feature_product.domain.model.Product product, com.ramcosta.composedestinations.navigation.DestinationsNavigator navigator, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MyTopAppBar(@org.jetbrains.annotations.NotNull
    java.lang.String currentSearchText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchTextChange, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearch, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleExpand) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Categories(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSelectCategory, @org.jetbrains.annotations.NotNull
    java.lang.String selectedCategory) {
    }
}