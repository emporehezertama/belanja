package belanja.id.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0006H\u0007\u00a8\u0006\u000f"}, d2 = {"Lbelanja/id/di/AuthModule;", "", "()V", "provideAuthApiService", "Lbelanja/id/feature_auth/data/remote/AuthApiService;", "provideLoginRepository", "Lbelanja/id/feature_auth/domain/repository/LoginRepository;", "authApiService", "authPreferences", "Lbelanja/id/feature_auth/data/local/AuthPreferences;", "provideLoginUseCase", "Lbelanja/id/feature_auth/domain/usecase/LoginUseCase;", "loginRepository", "provideLogoutUseCase", "Lbelanja/id/feature_auth/domain/usecase/LogoutUseCase;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AuthModule {
    @org.jetbrains.annotations.NotNull
    public static final belanja.id.di.AuthModule INSTANCE = null;
    
    private AuthModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_auth.data.remote.AuthApiService provideAuthApiService() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_auth.domain.repository.LoginRepository provideLoginRepository(@org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.remote.AuthApiService authApiService, @org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.local.AuthPreferences authPreferences) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_auth.domain.usecase.LoginUseCase provideLoginUseCase(@org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.domain.repository.LoginRepository loginRepository) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_auth.domain.usecase.LogoutUseCase provideLogoutUseCase(@org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.domain.repository.LoginRepository loginRepository) {
        return null;
    }
}