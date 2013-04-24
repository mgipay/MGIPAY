
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Complex type that describes event properties.
 * 
 * <p>Java class for eventOverviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventOverviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mailingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mailingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cellName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audienceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="audienceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventOverviewType", namespace = "uri:customerStatus.ws.sdk.edialog.com", propOrder = {
    "campaignId",
    "campaignName",
    "mailingId",
    "mailingName",
    "cellId",
    "cellName",
    "audienceId",
    "audienceName",
    "eventDate"
})
public class EventOverviewType {

    protected int campaignId;
    @XmlElement(required = true, nillable = true)
    protected String campaignName;
    protected int mailingId;
    @XmlElement(required = true, nillable = true)
    protected String mailingName;
    protected int cellId;
    @XmlElement(required = true, nillable = true)
    protected String cellName;
    protected int audienceId;
    @XmlElement(required = true, nillable = true)
    protected String audienceName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;

    /**
     * Gets the value of the campaignId property.
     * 
     */
    public int getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     */
    public void setCampaignId(int value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the mailingId property.
     * 
     */
    public int getMailingId() {
        return mailingId;
    }

    /**
     * Sets the value of the mailingId property.
     * 
     */
    public void setMailingId(int value) {
        this.mailingId = value;
    }

    /**
     * Gets the value of the mailingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingName() {
        return mailingName;
    }

    /**
     * Sets the value of the mailingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingName(String value) {
        this.mailingName = value;
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
     * Gets the value of the cellName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellName() {
        return cellName;
    }

    /**
     * Sets the value of the cellName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellName(String value) {
        this.cellName = value;
    }

    /**
     * Gets the value of the audienceId property.
     * 
     */
    public int getAudienceId() {
        return audienceId;
    }

    /**
     * Sets the value of the audienceId property.
     * 
     */
    public void setAudienceId(int value) {
        this.audienceId = value;
    }

    /**
     * Gets the value of the audienceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudienceName() {
        return audienceName;
    }

    /**
     * Sets the value of the audienceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceName(String value) {
        this.audienceName = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

}
