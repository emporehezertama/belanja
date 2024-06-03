package belanja.id.feature_product.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import belanja.id.core.util.Constants
import belanja.id.core.util.Resource
import belanja.id.core.util.UiEvents
import belanja.id.feature_product.domain.usecase.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase,
) :
    ViewModel() {

    private val _selectedCategory = mutableStateOf("All")
    val selectedCategory: State<String> = _selectedCategory
    fun setCategory(value: String) {
        _selectedCategory.value = value
    }

    private val _productsState = mutableStateOf(ProductsState())
    val productsState: State<ProductsState> = _productsState

    private val _categoriesState = mutableStateOf(emptyList<String>())
    val categoriesState: State<List<String>> = _categoriesState

    private val _bannerImageState =
        mutableStateOf(Constants.BANNER_URL)
    val bannerImageState: State<String> = _bannerImageState

    private val _searchTerm = mutableStateOf("")
    val searchTerm: State<String> = _searchTerm

    fun setSearchTerm(term: String) {
        _searchTerm.value = term
    }

    private val _eventFlow = MutableSharedFlow<UiEvents>()
    val eventFlow: SharedFlow<UiEvents> = _eventFlow.asSharedFlow()

    init {
        getProducts(selectedCategory.value)

    }

    fun getProducts(category: String = "All", searchTerm: String = "") {
        viewModelScope.launch {
            getProductsUseCase().collectLatest { result ->
                when (result) {
                    is Resource.Success -> {
                        if (category == "All") {
                            _productsState.value = productsState.value.copy(
                                products = if (searchTerm.isEmpty()) {
                                    result.data ?: emptyList()
                                } else {
                                    result.data?.filter {
                                        it.title.contains(
                                            searchTerm,
                                            ignoreCase = true
                                        )
                                    } ?: emptyList()
                                },
                                isLoading = false
                            )
                        }
                    }
                    is Resource.Loading -> {
                        _productsState.value = productsState.value.copy(
                            isLoading = true
                        )
                    }
                    is Resource.Error -> {
                        _productsState.value = productsState.value.copy(
                            isLoading = false,
                            error = result.message
                        )
                        _eventFlow.emit(
                            UiEvents.SnackbarEvent(
                                message = result.message ?: "Unknown error occurred!"
                            )
                        )
                    }
                }
            }
        }
    }
}