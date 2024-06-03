package belanja.id.feature_auth.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lbelanja/id/feature_auth/data/local/AuthPreferences;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "gson", "Lcom/google/gson/Gson;", "(Landroidx/datastore/core/DataStore;Lcom/google/gson/Gson;)V", "getAccessToken", "Lkotlinx/coroutines/flow/Flow;", "", "getGetAccessToken", "()Lkotlinx/coroutines/flow/Flow;", "getUserData", "getGetUserData", "clearAccessToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAccessToken", "accessToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserdata", "user", "Lbelanja/id/feature_auth/data/dto/Customer;", "(Lbelanja/id/feature_auth/data/dto/Customer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AuthPreferences {
    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> getAccessToken = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> getUserData = null;
    
    public AuthPreferences(@org.jetbrains.annotations.NotNull
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveAccessToken(@org.jetbrains.annotations.NotNull
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getGetAccessToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearAccessToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveUserdata(@org.jetbrains.annotations.NotNull
    belanja.id.feature_auth.data.dto.Customer user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getGetUserData() {
        return null;
    }
}