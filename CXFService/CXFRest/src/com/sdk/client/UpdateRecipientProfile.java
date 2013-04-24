
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
 *         &lt;element name="masterProperty" type="{uri:realtimemessaging.ws.sdk.edialog.com}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audienceMembership" type="{uri:realtimemessaging.ws.sdk.edialog.com}AudienceMembershipType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audienceRemoval" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "masterProperty",
    "audienceMembership",
    "audienceRemoval"
})
@XmlRootElement(name = "updateRecipientProfile", namespace = "uri:realtimemessaging.ws.sdk.edialog.com")
public class UpdateRecipientProfile {

    @XmlElement(namespace = "uri:realtimemessaging.ws.sdk.edialog.com")
    protected List<PropertyType> masterProperty;
    @XmlElement(namespace = "uri:realtimemessaging.ws.sdk.edialog.com")
    protected List<AudienceMembershipType> audienceMembership;
    @XmlElement(namespace = "uri:realtimemessaging.ws.sdk.edialog.com")
    protected List<String> audienceRemoval;

    /**
     * Gets the value of the masterProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getMasterProperty() {
        if (masterProperty == null) {
            masterProperty = new ArrayList<PropertyType>();
        }
        return this.masterProperty;
    }

    /**
     * Gets the value of the audienceMembership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceMembership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceMembership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudienceMembershipType }
     * 
     * 
     */
    public List<AudienceMembershipType> getAudienceMembership() {
        if (audienceMembership == null) {
            audienceMembership = new ArrayList<AudienceMembershipType>();
        }
        return this.audienceMembership;
    }

    /**
     * Gets the value of the audienceRemoval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceRemoval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceRemoval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudienceRemoval() {
        if (audienceRemoval == null) {
            audienceRemoval = new ArrayList<String>();
        }
        return this.audienceRemoval;
    }

}
