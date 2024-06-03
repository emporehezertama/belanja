package belanja.id.feature_product.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\fH\u00c6\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lbelanja/id/feature_product/domain/model/Product;", "Landroid/os/Parcelable;", "id", "", "title", "", "bodyHtml", "tags", "variants", "", "Lbelanja/id/feature_product/domain/model/Variant;", "image", "Lbelanja/id/feature_product/domain/model/Image;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbelanja/id/feature_product/domain/model/Image;)V", "getBodyHtml", "()Ljava/lang/String;", "getId", "()I", "getImage", "()Lbelanja/id/feature_product/domain/model/Image;", "getTags", "getTitle", "getVariants", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize
public final class Product implements android.os.Parcelable {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String bodyHtml = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tags = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<belanja.id.feature_product.domain.model.Variant> variants = null;
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_product.domain.model.Image image = null;
    
    public Product(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String bodyHtml, @org.jetbrains.annotations.NotNull
    java.lang.String tags, @org.jetbrains.annotations.NotNull
    java.util.List<belanja.id.feature_product.domain.model.Variant> variants, @org.jetbrains.annotations.NotNull
    belanja.id.feature_product.domain.model.Image image) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBodyHtml() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<belanja.id.feature_product.domain.model.Variant> getVariants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.domain.model.Image getImage() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<belanja.id.feature_product.domain.model.Variant> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.domain.model.Image component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.domain.model.Product copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String bodyHtml, @org.jetbrains.annotations.NotNull
    java.lang.String tags, @org.jetbrains.annotations.NotNull
    java.util.List<belanja.id.feature_product.domain.model.Variant> variants, @org.jetbrains.annotations.NotNull
    belanja.id.feature_product.domain.model.Image image) {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
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
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
}