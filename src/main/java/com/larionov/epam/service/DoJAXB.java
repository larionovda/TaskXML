package com.larionov.epam.service;

import com.larionov.epam.entity.ProductsType;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public interface DoJAXB {
    ProductsType unmarshal(String path) throws FileNotFoundException, JAXBException;
}
