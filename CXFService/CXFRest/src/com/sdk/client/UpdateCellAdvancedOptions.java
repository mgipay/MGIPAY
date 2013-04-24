
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
 *         &lt;element name="cellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contentFormatText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentFormatHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentFormatNoPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unsubDNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redirectDNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redirectExpirationDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="forwardToFriendTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorNotificationEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventNotificationEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "cellId",
    "contentFormatText",
    "contentFormatHTML",
    "contentFormatNoPreference",
    "unsubDNS",
    "redirectDNS",
    "redirectExpirationDays",
    "forwardToFriendTemplateName",
    "errorNotificationEmailAddress",
    "eventNotificationEmailAddress"
})
@XmlRootElement(name = "updateCellAdvancedOptions")
public class UpdateCellAdvancedOptions {

    protected int cellId;
    protected String contentFormatText;
    protected String contentFormatHTML;
    protected String contentFormatNoPreference;
    protected String unsubDNS;
    protected String redirectDNS;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer redirectExpirationDays;
    protected String forwardToFriendTemplateName;
    protected List<String> errorNotificationEmailAddress;
    protected List<String> eventNotificationEmailAddress;

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
     * Gets the value of the contentFormatText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentFormatText() {
        return contentFormatText;
    }

    /**
     * Sets the value of the contentFormatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentFormatText(String value) {
        this.contentFormatText = value;
    }

    /**
     * Gets the value of the contentFormatHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentFormatHTML() {
        return contentFormatHTML;
    }

    /**
     * Sets the value of the contentFormatHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentFormatHTML(String value) {
        this.contentFormatHTML = value;
    }

    /**
     * Gets the value of the contentFormatNoPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentFormatNoPreference() {
        return contentFormatNoPreference;
    }

    /**
     * Sets the value of the contentFormatNoPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentFormatNoPreference(String value) {
        this.contentFormatNoPreference = value;
    }

    /**
     * Gets the value of the unsubDNS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsubDNS() {
        return unsubDNS;
    }

    /**
     * Sets the value of the unsubDNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsubDNS(String value) {
        this.unsubDNS = value;
    }

    /**
     * Gets the value of the redirectDNS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectDNS() {
        return redirectDNS;
    }

    /**
     * Sets the value of the redirectDNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectDNS(String value) {
        this.redirectDNS = value;
    }

    /**
     * Gets the value of the redirectExpirationDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRedirectExpirationDays() {
        return redirectExpirationDays;
    }

    /**
     * Sets the value of the redirectExpirationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRedirectExpirationDays(Integer value) {
        this.redirectExpirationDays = value;
    }

    /**
     * Gets the value of the forwardToFriendTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardToFriendTemplateName() {
        return forwardToFriendTemplateName;
    }

    /**
     * Sets the value of the forwardToFriendTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardToFriendTemplateName(String value) {
        this.forwardToFriendTemplateName = value;
    }

    /**
     * Gets the value of the errorNotificationEmailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorNotificationEmailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorNotificationEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorNotificationEmailAddress() {
        if (errorNotificationEmailAddress == null) {
            errorNotificationEmailAddress = new ArrayList<String>();
        }
        return this.errorNotificationEmailAddress;
    }

    /**
     * Gets the value of the eventNotificationEmailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventNotificationEmailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventNotificationEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEventNotificationEmailAddress() {
        if (eventNotificationEmailAddress == null) {
            eventNotificationEmailAddress = new ArrayList<String>();
        }
        return this.eventNotificationEmailAddress;
    }

}
