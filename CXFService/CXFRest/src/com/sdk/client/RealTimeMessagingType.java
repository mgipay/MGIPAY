
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type. Describes realtime messaging configurations.
 * 
 * <p>Java class for RealTimeMessagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealTimeMessagingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listClassId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealTimeMessagingType", namespace = "uri:realtimemessaging.ws.sdk.edialog.com", propOrder = {
    "listClassId",
    "name",
    "notificationAddress"
})
public class RealTimeMessagingType {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long listClassId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String notificationAddress;

    /**
     * Gets the value of the listClassId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getListClassId() {
        return listClassId;
    }

    /**
     * Sets the value of the listClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setListClassId(Long value) {
        this.listClassId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notificationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationAddress() {
        return notificationAddress;
    }

    /**
     * Sets the value of the notificationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationAddress(String value) {
        this.notificationAddress = value;
    }

}
