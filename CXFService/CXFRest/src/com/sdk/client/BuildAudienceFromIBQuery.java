
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="queryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceAudienceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetAudienceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notificationAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scheduleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "queryId",
    "sourceAudienceId",
    "targetAudienceId",
    "notificationAddresses",
    "scheduleDate"
})
@XmlRootElement(name = "buildAudienceFromIBQuery", namespace = "uri:insightbuilder.ws.sdk.edialog.com")
public class BuildAudienceFromIBQuery {

    @XmlElement(namespace = "uri:insightbuilder.ws.sdk.edialog.com")
    protected int queryId;
    @XmlElement(namespace = "uri:insightbuilder.ws.sdk.edialog.com", required = true, type = Integer.class, nillable = true)
    protected Integer sourceAudienceId;
    @XmlElement(namespace = "uri:insightbuilder.ws.sdk.edialog.com")
    protected int targetAudienceId;
    @XmlElement(namespace = "uri:insightbuilder.ws.sdk.edialog.com", nillable = true)
    protected List<String> notificationAddresses;
    @XmlElement(namespace = "uri:insightbuilder.ws.sdk.edialog.com", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleDate;

    /**
     * Gets the value of the queryId property.
     * 
     */
    public int getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     * 
     */
    public void setQueryId(int value) {
        this.queryId = value;
    }

    /**
     * Gets the value of the sourceAudienceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceAudienceId() {
        return sourceAudienceId;
    }

    /**
     * Sets the value of the sourceAudienceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceAudienceId(Integer value) {
        this.sourceAudienceId = value;
    }

    /**
     * Gets the value of the targetAudienceId property.
     * 
     */
    public int getTargetAudienceId() {
        return targetAudienceId;
    }

    /**
     * Sets the value of the targetAudienceId property.
     * 
     */
    public void setTargetAudienceId(int value) {
        this.targetAudienceId = value;
    }

    /**
     * Gets the value of the notificationAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotificationAddresses() {
        if (notificationAddresses == null) {
            notificationAddresses = new ArrayList<String>();
        }
        return this.notificationAddresses;
    }

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

}
