package com.afreen.firstrestapi.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super(String.format ("Product with %d not found  ",id));
    }
}
