
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
 *         &lt;element name="queueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clonePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="audienceRollupPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "queueName",
    "notificationAddress",
    "clonePeriod",
    "timeZone",
    "audienceRollupPeriod"
})
@XmlRootElement(name = "updateRTMConfiguration", namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
public class UpdateRTMConfiguration {

    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", required = true)
    protected String messageName;
    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected String queueName;
    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected List<String> notificationAddress;
    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected String clonePeriod;
    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected String timeZone;
    @XmlElement(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected String audienceRollupPeriod;

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
     * Gets the value of the queueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * Sets the value of the queueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueName(String value) {
        this.queueName = value;
    }

    /**
     * Gets the value of the notificationAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotificationAddress() {
        if (notificationAddress == null) {
            notificationAddress = new ArrayList<String>();
        }
        return this.notificationAddress;
    }

    /**
     * Gets the value of the clonePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClonePeriod() {
        return clonePeriod;
    }

    /**
     * Sets the value of the clonePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClonePeriod(String value) {
        this.clonePeriod = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the audienceRollupPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudienceRollupPeriod() {
        return audienceRollupPeriod;
    }

    /**
     * Sets the value of the audienceRollupPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceRollupPeriod(String value) {
        this.audienceRollupPeriod = value;
    }

}
