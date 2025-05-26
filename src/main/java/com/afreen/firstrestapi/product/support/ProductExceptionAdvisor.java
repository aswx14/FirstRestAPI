package com.afreen.firstrestapi.product.support;

import com.afreen.firstrestapi.product.support.exception.ProductNotFoundException;
import com.afreen.firstrestapi.shared.api.response.ErrorMessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductExceptionAdvisor {
    private static final Logger LOG = LoggerFactory.getLogger(ProductExceptionAdvisor.class);
    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse productNotFound(Exception e ){
        LOG.error(e.getMessage(),e);
        return new ErrorMessageResponse(e.getLocalizedMessage());
    }
}