package belanja.id.feature_product.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b6\u0018\u00002\u00020\u0001B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lbelanja/id/feature_product/domain/model/BottomNavItem;", "", "icon", "", "destination", "Landroidx/navigation/ActivityNavigator$Destination;", "(ILandroidx/navigation/ActivityNavigator$Destination;)V", "getDestination", "()Landroidx/navigation/ActivityNavigator$Destination;", "setDestination", "(Landroidx/navigation/ActivityNavigator$Destination;)V", "getIcon", "()I", "setIcon", "(I)V", "app_debug"})
public abstract class BottomNavItem {
    private int icon;
    @org.jetbrains.annotations.NotNull
    private androidx.navigation.ActivityNavigator.Destination destination;
    
    private BottomNavItem(int icon, androidx.navigation.ActivityNavigator.Destination destination) {
        super();
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final void setIcon(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.ActivityNavigator.Destination getDestination() {
        return null;
    }
    
    public final void setDestination(@org.jetbrains.annotations.NotNull
    androidx.navigation.ActivityNavigator.Destination p0) {
    }
}