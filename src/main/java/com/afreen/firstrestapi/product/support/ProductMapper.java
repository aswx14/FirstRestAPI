package com.afreen.firstrestapi.product.support;
import com.afreen.firstrestapi.product.api.request.UpdateProductRequest;
import org.springframework.stereotype.Component;
import com.afreen.firstrestapi.product.api.request.ProductRequest;
import com.afreen.firstrestapi.product.api.response.ProductResponse;
import com.afreen.firstrestapi.product.domain.Product;

@Component
public class ProductMapper {
    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }
    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }
    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse (product.getId(), product.getName());
    }
}
