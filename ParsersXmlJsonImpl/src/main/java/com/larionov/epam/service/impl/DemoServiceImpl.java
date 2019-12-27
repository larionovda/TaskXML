package com.larionov.epam.service.impl;

import com.larionov.epam.entity.ProductsType;
import com.larionov.epam.service.DemoService;
import com.larionov.epam.service.DoJAXB;
import com.larionov.epam.service.JsonMapper;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class DemoServiceImpl implements DemoService {
    DoJAXB doJAXB = new DoJAXBImpl();
    JsonMapper jsonMapper = new JsonMapperImpl();
    DoStaxImpl doStax = new DoStaxImpl();
    private static final String PATH_TO_XML = "xml/products.xml";
    private static final String PATH_TO_JSON = "xml/products.json";

    @Override
    public void start()  {
        ProductsType productsType = doJAXB.unmarshal(PATH_TO_XML);
        jsonMapper.serializableToJson(productsType, PATH_TO_JSON);
        System.out.println(jsonMapper.serializableToJava(PATH_TO_JSON));
        doStax.parseXMLFile(PATH_TO_XML);
    }
}
