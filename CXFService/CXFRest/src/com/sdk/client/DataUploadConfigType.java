
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type that describes a data upload configuration.
 * 
 * <p>Java class for dataUploadConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataUploadConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filenamePatternPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filenamePatternSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataUploadConfigType", namespace = "uri:dataupload.ws.sdk.edialog.com", propOrder = {
    "configId",
    "filenamePatternPrefix",
    "filenamePatternSuffix"
})
public class DataUploadConfigType {

    protected int configId;
    @XmlElement(required = true)
    protected String filenamePatternPrefix;
    @XmlElement(required = true)
    protected String filenamePatternSuffix;

    /**
     * Gets the value of the configId property.
     * 
     */
    public int getConfigId() {
        return configId;
    }

    /**
     * Sets the value of the configId property.
     * 
     */
    public void setConfigId(int value) {
        this.configId = value;
    }

    /**
     * Gets the value of the filenamePatternPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilenamePatternPrefix() {
        return filenamePatternPrefix;
    }

    /**
     * Sets the value of the filenamePatternPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilenamePatternPrefix(String value) {
        this.filenamePatternPrefix = value;
    }

    /**
     * Gets the value of the filenamePatternSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilenamePatternSuffix() {
        return filenamePatternSuffix;
    }

    /**
     * Sets the value of the filenamePatternSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilenamePatternSuffix(String value) {
        this.filenamePatternSuffix = value;
    }

}
