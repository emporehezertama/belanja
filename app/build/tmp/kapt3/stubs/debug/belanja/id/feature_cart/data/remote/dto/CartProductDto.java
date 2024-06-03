package belanja.id.feature_cart.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lbelanja/id/feature_cart/data/remote/dto/CartProductDto;", "", "quantity", "", "variantID", "", "(ILjava/lang/String;)V", "getQuantity", "()I", "getVariantID", "()Ljava/lang/String;", "app_debug"})
public final class CartProductDto {
    @com.google.gson.annotations.SerializedName(value = "quantity")
    private final int quantity = 0;
    @com.google.gson.annotations.SerializedName(value = "graph_variant_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String variantID = null;
    
    public CartProductDto(int quantity, @org.jetbrains.annotations.NotNull
    java.lang.String variantID) {
        super();
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVariantID() {
        return null;
    }
}