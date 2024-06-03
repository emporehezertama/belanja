package belanja.id.feature_cart.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lbelanja/id/feature_cart/domain/model/CartProduct;", "", "title", "", "quantity", "", "variants", "", "Lbelanja/id/feature_product/domain/model/Variant;", "image", "Lbelanja/id/feature_product/domain/model/Image;", "(Ljava/lang/String;ILjava/util/List;Lbelanja/id/feature_product/domain/model/Image;)V", "getImage", "()Lbelanja/id/feature_product/domain/model/Image;", "getQuantity", "()I", "getTitle", "()Ljava/lang/String;", "getVariants", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CartProduct {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    private final int quantity = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<belanja.id.feature_product.domain.model.Variant> variants = null;
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_product.domain.model.Image image = null;
    
    public CartProduct(@org.jetbrains.annotations.NotNull
    java.lang.String title, int quantity, @org.jetbrains.annotations.NotNull
    java.util.List<belanja.id.feature_product.domain.model.Variant> variants, @org.jetbrains.annotations.NotNull
    belanja.id.feature_product.domain.model.Image image) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<belanja.id.feature_product.domain.model.Variant> getVariants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.domain.model.Image getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<belanja.id.feature_product.domain.model.Variant> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.domain.model.Image component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_cart.domain.model.CartProduct copy(@org.jetbrains.annotations.NotNull
    java.lang.String title, int quantity, @org.jetbrains.annotations.NotNull
    java.util.List<belanja.id.feature_product.domain.model.Variant> variants, @org.jetbrains.annotations.NotNull
    belanja.id.feature_product.domain.model.Image image) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}