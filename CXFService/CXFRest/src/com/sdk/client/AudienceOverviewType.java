
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Complex type that describes an audience list.
 * 
 * <p>Java class for audienceOverviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audienceOverviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audienceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="audienceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audienceClassId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="singleUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="udf" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="5"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="alternateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estimatedMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audienceOverviewType", namespace = "uri:audience.ws.sdk.edialog.com", propOrder = {
    "audienceId",
    "audienceType",
    "audienceClassId",
    "singleUse",
    "name",
    "udf",
    "createDate",
    "updateDate",
    "alternateKey",
    "estimatedMemberCount"
})
public class AudienceOverviewType {

    protected int audienceId;
    @XmlElement(required = true)
    protected String audienceType;
    protected int audienceClassId;
    protected boolean singleUse;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected List<String> udf;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(required = true, nillable = true)
    protected String alternateKey;
    protected int estimatedMemberCount;

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
     * Gets the value of the audienceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudienceType() {
        return audienceType;
    }

    /**
     * Sets the value of the audienceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceType(String value) {
        this.audienceType = value;
    }

    /**
     * Gets the value of the audienceClassId property.
     * 
     */
    public int getAudienceClassId() {
        return audienceClassId;
    }

    /**
     * Sets the value of the audienceClassId property.
     * 
     */
    public void setAudienceClassId(int value) {
        this.audienceClassId = value;
    }

    /**
     * Gets the value of the singleUse property.
     * 
     */
    public boolean isSingleUse() {
        return singleUse;
    }

    /**
     * Sets the value of the singleUse property.
     * 
     */
    public void setSingleUse(boolean value) {
        this.singleUse = value;
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
     * Gets the value of the udf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUdf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUdf() {
        if (udf == null) {
            udf = new ArrayList<String>();
        }
        return this.udf;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the alternateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateKey() {
        return alternateKey;
    }

    /**
     * Sets the value of the alternateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateKey(String value) {
        this.alternateKey = value;
    }

    /**
     * Gets the value of the estimatedMemberCount property.
     * 
     */
    public int getEstimatedMemberCount() {
        return estimatedMemberCount;
    }

    /**
     * Sets the value of the estimatedMemberCount property.
     * 
     */
    public void setEstimatedMemberCount(int value) {
        this.estimatedMemberCount = value;
    }

}
