
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTMVariationsSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTMVariationsSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variationSelectionExpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variation" type="{uri:realtimemessagingconfiguration.ws.sdk.edialog.com}RTMVariationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTMVariationsSettingsType", namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", propOrder = {
    "variationSelectionExpression",
    "variation"
})
public class RTMVariationsSettingsType {

    @XmlElement(required = true)
    protected String variationSelectionExpression;
    @XmlElement(required = true)
    protected List<RTMVariationType> variation;

    /**
     * Gets the value of the variationSelectionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationSelectionExpression() {
        return variationSelectionExpression;
    }

    /**
     * Sets the value of the variationSelectionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationSelectionExpression(String value) {
        this.variationSelectionExpression = value;
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
     * {@link RTMVariationType }
     * 
     * 
     */
    public List<RTMVariationType> getVariation() {
        if (variation == null) {
            variation = new ArrayList<RTMVariationType>();
        }
        return this.variation;
    }

}
