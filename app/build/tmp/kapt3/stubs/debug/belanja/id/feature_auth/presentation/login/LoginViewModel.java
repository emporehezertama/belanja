package belanja.id.feature_auth.presentation.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000eJ\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017\u00a8\u0006%"}, d2 = {"Lbelanja/id/feature_auth/presentation/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginUseCase", "Lbelanja/id/feature_auth/domain/usecase/LoginUseCase;", "(Lbelanja/id/feature_auth/domain/usecase/LoginUseCase;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lbelanja/id/core/util/UiEvents;", "_loginState", "Landroidx/compose/runtime/MutableState;", "Lbelanja/id/feature_auth/presentation/login/LoginState;", "_passwordState", "Lbelanja/id/core/domain/TextFieldState;", "_rememberMeState", "", "_usernameState", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "loginState", "Landroidx/compose/runtime/State;", "getLoginState", "()Landroidx/compose/runtime/State;", "passwordState", "getPasswordState", "rememberMeState", "getRememberMeState", "usernameState", "getUsernameState", "loginUser", "", "setPassword", "value", "", "setRememberMe", "setUsername", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_auth.domain.usecase.LoginUseCase loginUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<belanja.id.core.domain.TextFieldState> _usernameState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<belanja.id.core.domain.TextFieldState> usernameState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<belanja.id.core.domain.TextFieldState> _passwordState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<belanja.id.core.domain.TextFieldState> passwordState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _rememberMeState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<java.lang.Boolean> rememberMeState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<belanja.id.feature_auth.presentation.login.LoginState> _loginState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<belanja.id.feature_auth.presentation.login.LoginState> loginState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<belanja.id.core.util.UiEvents> _eventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<belanja.id.core.util.UiEvents> eventFlow = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.domain.usecase.LoginUseCase loginUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<belanja.id.core.domain.TextFieldState> getUsernameState() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<belanja.id.core.domain.TextFieldState> getPasswordState() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<java.lang.Boolean> getRememberMeState() {
        return null;
    }
    
    public final void setRememberMe(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<belanja.id.feature_auth.presentation.login.LoginState> getLoginState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<belanja.id.core.util.UiEvents> getEventFlow() {
        return null;
    }
    
    public final void loginUser() {
    }
}