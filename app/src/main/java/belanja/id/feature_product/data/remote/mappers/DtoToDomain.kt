package belanja.id.feature_product.data.remote.mappers

import belanja.id.feature_product.data.remote.dto.ProducImageDto
import belanja.id.feature_product.data.remote.dto.ProductDto
import belanja.id.feature_product.data.remote.dto.ProductVariantDto
import belanja.id.feature_product.domain.model.Image
import belanja.id.feature_product.domain.model.Product
import belanja.id.feature_product.domain.model.Variant


internal fun ProductDto.toDomain(): Product {
    return Product(
        id = id,
        title = title,
        bodyHtml = body,
        tags = tags,
        variants = variants.toDomainList(),
        image = image.toDomain(),
    )
}

internal fun ProducImageDto.toDomain(): Image {
    return Image(
        src = src
    )
}

internal fun ProductVariantDto.toDomain(): Variant {
    return Variant(price = this.price)
}

internal fun List<ProductVariantDto>.toDomainList(): List<Variant> {
    return this.map { dto -> dto.toDomain() }
}

