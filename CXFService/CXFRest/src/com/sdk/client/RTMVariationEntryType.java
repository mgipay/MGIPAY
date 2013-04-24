
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTMVariationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTMVariationEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testCellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTMVariationEntryType", namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", propOrder = {
    "variationKey",
    "testCellId"
})
@XmlSeeAlso({
    RTMVariationType.class
})
public class RTMVariationEntryType {

    @XmlElement(required = true)
    protected String variationKey;
    protected Integer testCellId;

    /**
     * Gets the value of the variationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationKey() {
        return variationKey;
    }

    /**
     * Sets the value of the variationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationKey(String value) {
        this.variationKey = value;
    }

    /**
     * Gets the value of the testCellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTestCellId() {
        return testCellId;
    }

    /**
     * Sets the value of the testCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTestCellId(Integer value) {
        this.testCellId = value;
    }

}
