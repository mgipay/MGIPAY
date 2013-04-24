
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Complex type. Audience membership data consists of an alternate key that identifies the audience list and a property type that identifies a recipient.
 *             
 * 
 * <p>Java class for AudienceMembershipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceMembershipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audienceAlternateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audienceProperty" type="{uri:realtimemessaging.ws.sdk.edialog.com}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceMembershipType", namespace = "uri:realtimemessaging.ws.sdk.edialog.com", propOrder = {
    "audienceAlternateKey",
    "audienceProperty"
})
public class AudienceMembershipType {

    @XmlElement(required = true)
    protected String audienceAlternateKey;
    protected List<PropertyType> audienceProperty;

    /**
     * Gets the value of the audienceAlternateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudienceAlternateKey() {
        return audienceAlternateKey;
    }

    /**
     * Sets the value of the audienceAlternateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceAlternateKey(String value) {
        this.audienceAlternateKey = value;
    }

    /**
     * Gets the value of the audienceProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getAudienceProperty() {
        if (audienceProperty == null) {
            audienceProperty = new ArrayList<PropertyType>();
        }
        return this.audienceProperty;
    }

}
