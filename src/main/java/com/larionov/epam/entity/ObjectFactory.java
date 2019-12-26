//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.26 at 06:11:56 AM VET 
//


package com.larionov.epam.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.larionov.epam.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Products_QNAME = new QName("", "products");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.larionov.epam.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubjectType }
     * 
     */
    public SubjectType createSubjectType() {
        return new SubjectType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link ProductsType }
     * 
     */
    public ProductsType createProductsType() {
        return new ProductsType();
    }

    /**
     * Create an instance of {@link SubCategoryType }
     * 
     */
    public SubCategoryType createSubCategoryType() {
        return new SubCategoryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "products")
    public JAXBElement<ProductsType> createProducts(ProductsType value) {
        return new JAXBElement<ProductsType>(_Products_QNAME, ProductsType.class, null, value);
    }



}
