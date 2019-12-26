package com.larionov.epam.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.larionov.epam.entity.ProductsType;
import com.larionov.epam.service.JsonMapper;
import java.io.File;
import java.io.IOException;

public class JsonMapperImpl implements JsonMapper {
    @Override
    public void serializableToJson(ProductsType productsType, String path) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String result = objectMapper.writeValueAsString(productsType);
            objectMapper.writeValue(new File("xml/products.json"), productsType);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ProductsType serializableToJava(String path) {
        ProductsType productsType = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            productsType =  objectMapper.readValue(new File(path), ProductsType.class);
        } catch (JsonProcessingException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return productsType;
    }
}
