package com.larionov.epam.service.impl;

import com.larionov.epam.service.PathToXML;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PathToXMLImpl implements PathToXML {
    @Override
    public void getPathToXML(String pathToProperties, String keyOfProperties)  {
        try {
            Properties property = new Properties();
            FileInputStream fis = new FileInputStream(pathToProperties);
            property.load(fis);
            String path = property.getProperty(keyOfProperties);
            System.out.println(path);
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
}
