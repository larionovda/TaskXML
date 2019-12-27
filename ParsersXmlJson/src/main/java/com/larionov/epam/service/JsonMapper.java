package com.larionov.epam.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.larionov.epam.entity.ProductsType;

import java.io.IOException;

public interface JsonMapper {
    void serializableToJson(ProductsType productsType, String path);

    ProductsType serializableToJava(String json) ;
}
