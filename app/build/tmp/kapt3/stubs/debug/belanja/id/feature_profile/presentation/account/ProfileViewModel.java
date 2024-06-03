package belanja.id.feature_profile.presentation.account;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lbelanja/id/feature_profile/presentation/account/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "profileRepository", "Lbelanja/id/feature_profile/data/repository/ProfileRepository;", "logoutUseCase", "Lbelanja/id/feature_auth/domain/usecase/LogoutUseCase;", "gson", "Lcom/google/gson/Gson;", "(Lbelanja/id/feature_profile/data/repository/ProfileRepository;Lbelanja/id/feature_auth/domain/usecase/LogoutUseCase;Lcom/google/gson/Gson;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lbelanja/id/core/util/UiEvents;", "_profileState", "Landroidx/compose/runtime/MutableState;", "Lbelanja/id/feature_profile/domain/model/User;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "profileState", "Landroidx/compose/runtime/State;", "getProfileState", "()Landroidx/compose/runtime/State;", "getProfile", "", "logout", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_profile.data.repository.ProfileRepository profileRepository = null;
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_auth.domain.usecase.LogoutUseCase logoutUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<belanja.id.feature_profile.domain.model.User> _profileState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<belanja.id.feature_profile.domain.model.User> profileState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<belanja.id.core.util.UiEvents> _eventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<belanja.id.core.util.UiEvents> eventFlow = null;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    belanja.id.feature_profile.data.repository.ProfileRepository profileRepository, @org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.domain.usecase.LogoutUseCase logoutUseCase, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<belanja.id.feature_profile.domain.model.User> getProfileState() {
        return null;
    }
    
    public final void getProfile() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<belanja.id.core.util.UiEvents> getEventFlow() {
        return null;
    }
    
    public final void logout() {
    }
}