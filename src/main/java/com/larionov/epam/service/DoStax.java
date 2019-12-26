package com.larionov.epam.service;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public interface DoStax {
    void parseXMLFile(String fileName) throws FileNotFoundException, XMLStreamException;
}
