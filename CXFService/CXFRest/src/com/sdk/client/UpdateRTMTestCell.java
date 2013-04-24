
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
 *         &lt;element name="messageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="variationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "messageName",
    "cellId",
    "variationKey"
})
@XmlRootElement(name = "updateRTMTestCell", namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
public class UpdateRTMTestCell {

    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", required = true)
    protected String messageName;
    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected int cellId;
    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected String variationKey;

    /**
     * Gets the value of the messageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageName() {
        return messageName;
    }

    /**
     * Sets the value of the messageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageName(String value) {
        this.messageName = value;
    }

    /**
     * Gets the value of the cellId property.
     * 
     */
    public int getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     */
    public void setCellId(int value) {
        this.cellId = value;
    }

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

}
