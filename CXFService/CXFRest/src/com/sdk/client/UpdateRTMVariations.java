
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="selectVariationExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variation" type="{uri:realtimemessagingconfiguration.ws.sdk.edialog.com}RTMVariationEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
    "selectVariationExpression",
    "variation"
})
@XmlRootElement(name = "updateRTMVariations", namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
public class UpdateRTMVariations {

    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", required = true)
    protected String messageName;
    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected String selectVariationExpression;
    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected List<RTMVariationEntryType> variation;

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
     * Gets the value of the selectVariationExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectVariationExpression() {
        return selectVariationExpression;
    }

    /**
     * Sets the value of the selectVariationExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectVariationExpression(String value) {
        this.selectVariationExpression = value;
    }

    /**
     * Gets the value of the variation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTMVariationEntryType }
     * 
     * 
     */
    public List<RTMVariationEntryType> getVariation() {
        if (variation == null) {
            variation = new ArrayList<RTMVariationEntryType>();
        }
        return this.variation;
    }

}
