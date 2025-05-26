package com.afreen.firstrestapi.product.support;
import com.afreen.firstrestapi.product.support.exception.ProductNotFoundException;
import java.util.function.Supplier;

public class ProductExceptionSupplier {
    public static Supplier<ProductNotFoundException> productNotFound(Long id) {
        return () -> new ProductNotFoundException(id);
    }
}
