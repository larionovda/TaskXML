package com.larionov.epam.service;

import com.larionov.epam.entity.ProductsType;

public interface DoJAXB {
    ProductsType unmarshal(String path);
}
