package org.travelforge.product.service;

public interface ProductRequest {

    Context getContext();

    RequestOptions getOptions();

    ProductRequestAttributes getParameters();
}
