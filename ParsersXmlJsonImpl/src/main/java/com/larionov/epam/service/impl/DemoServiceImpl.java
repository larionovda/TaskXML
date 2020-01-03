package com.larionov.epam.service.impl;

import com.larionov.epam.entity.ProductsType;
import com.larionov.epam.service.DemoService;
import com.larionov.epam.service.DoJAXB;
import com.larionov.epam.service.JsonMapper;
import com.larionov.epam.service.PathToXML;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoServiceImpl implements DemoService {
    DoJAXB doJAXB = new DoJAXBImpl();
    JsonMapper jsonMapper = new JsonMapperImpl();
    DoStaxImpl doStax = new DoStaxImpl();
    PathToXML pathToXML = new PathToXMLImpl();
    private static final String PATH_TO_XML = "C:\\Users\\Dmitrii_Larionov\\IdeaProjects\\NewXML\\ParsersXmlJsonImpl\\files\\products.xml";
    private static final String PATH_TO_JSON = "C:\\Users\\Dmitrii_Larionov\\IdeaProjects\\NewXML\\ParsersXmlJsonImpl\\files\\products.json";
    private static final String PATH_TO_PROPERTIES = "C:\\Users\\Dmitrii_Larionov\\IdeaProjects\\NewXML\\ParsersXmlJsonImpl\\src\\main\\resources\\my.properties";
    private static final String KEY_OF_PROPERTIES = "xmlFirst";


    @Override
    public void start() throws IOException {
        pathToXML.getPathToXML(PATH_TO_PROPERTIES, KEY_OF_PROPERTIES);
        ProductsType productsType = doJAXB.unmarshal(PATH_TO_XML);
        jsonMapper.serializableToJson(productsType, PATH_TO_JSON);
        System.out.println(jsonMapper.serializableToJava(PATH_TO_JSON));
        doStax.parseXMLFile(PATH_TO_XML);
    }

}
