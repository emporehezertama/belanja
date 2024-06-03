package belanja.id.feature_product.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\fH\u00c6\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lbelanja/id/feature_product/data/remote/dto/ProductDto;", "", "id", "", "title", "", "body", "tags", "variants", "", "Lbelanja/id/feature_product/data/remote/dto/ProductVariantDto;", "image", "Lbelanja/id/feature_product/data/remote/dto/ProducImageDto;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbelanja/id/feature_product/data/remote/dto/ProducImageDto;)V", "getBody", "()Ljava/lang/String;", "getId", "()I", "getImage", "()Lbelanja/id/feature_product/data/remote/dto/ProducImageDto;", "getTags", "getTitle", "getVariants", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ProductDto {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "title")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @com.google.gson.annotations.SerializedName(value = "body_html")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String body = null;
    @com.google.gson.annotations.SerializedName(value = "tags")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tags = null;
    @com.google.gson.annotations.SerializedName(value = "variants")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<belanja.id.feature_product.data.remote.dto.ProductVariantDto> variants = null;
    @com.google.gson.annotations.SerializedName(value = "image")
    @org.jetbrains.annotations.NotNull
    private final belanja.id.feature_product.data.remote.dto.ProducImageDto image = null;
    
    public ProductDto(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    java.lang.String tags, @org.jetbrains.annotations.NotNull
    java.util.List<belanja.id.feature_product.data.remote.dto.ProductVariantDto> variants, @org.jetbrains.annotations.NotNull
    belanja.id.feature_product.data.remote.dto.ProducImageDto image) {
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
    public final java.lang.String getBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<belanja.id.feature_product.data.remote.dto.ProductVariantDto> getVariants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.data.remote.dto.ProducImageDto getImage() {
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
    public final java.util.List<belanja.id.feature_product.data.remote.dto.ProductVariantDto> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.data.remote.dto.ProducImageDto component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final belanja.id.feature_product.data.remote.dto.ProductDto copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    java.lang.String tags, @org.jetbrains.annotations.NotNull
    java.util.List<belanja.id.feature_product.data.remote.dto.ProductVariantDto> variants, @org.jetbrains.annotations.NotNull
    belanja.id.feature_product.data.remote.dto.ProducImageDto image) {
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