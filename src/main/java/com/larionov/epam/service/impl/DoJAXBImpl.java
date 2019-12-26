package com.larionov.epam.service.impl;

import com.larionov.epam.entity.ProductsType;
import com.larionov.epam.service.DoJAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DoJAXBImpl implements DoJAXB {
    @Override
    public ProductsType unmarshal(String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(ProductsType.class);
            return (ProductsType) context.createUnmarshaller()
                    .unmarshal(new FileReader(path));
        } catch (FileNotFoundException e) {
            System.out.println("Path " + path + " not found");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
