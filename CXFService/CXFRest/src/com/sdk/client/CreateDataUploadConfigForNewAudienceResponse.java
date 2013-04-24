
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="config" type="{uri:dataupload.ws.sdk.edialog.com}dataUploadConfigType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "config"
})
@XmlRootElement(name = "createDataUploadConfigForNewAudienceResponse", namespace = "uri:dataupload.ws.sdk.edialog.com")
public class CreateDataUploadConfigForNewAudienceResponse {

    @XmlElement(namespace = "uri:dataupload.ws.sdk.edialog.com", required = true)
    protected DataUploadConfigType config;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link DataUploadConfigType }
     *     
     */
    public DataUploadConfigType getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataUploadConfigType }
     *     
     */
    public void setConfig(DataUploadConfigType value) {
        this.config = value;
    }

}
