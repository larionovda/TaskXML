package com.larionov.epam.service;

import com.larionov.epam.entity.ProductsType;

public interface JsonMapper {
    void serializableToJson(ProductsType productsType, String path);

    ProductsType serializableToJava(String json) ;
}
