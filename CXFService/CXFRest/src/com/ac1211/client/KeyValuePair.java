
package com.ac1211.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyValuePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlTag" type="{http://www.moneygram.com/AgentConnect1211}stringMax80"/>
 *         &lt;element name="fieldValue" type="{http://www.moneygram.com/AgentConnect1211}stringMax255" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePair", propOrder = {
    "xmlTag",
    "fieldValue"
})
public class KeyValuePair {

    @XmlElement(required = true)
    protected String xmlTag;
    @XmlElementRef(name = "fieldValue", namespace = "http://www.moneygram.com/AgentConnect1211", type = JAXBElement.class)
    protected JAXBElement<String> fieldValue;

    /**
     * Gets the value of the xmlTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlTag() {
        return xmlTag;
    }

    /**
     * Sets the value of the xmlTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlTag(String value) {
        this.xmlTag = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldValue(JAXBElement<String> value) {
        this.fieldValue = value;
    }

}
