
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
 * 
 *         Complex type. Recipient profile properties.
 *             
 * 
 * <p>Java class for LookupRecipientProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookupRecipientProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unsubFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unsubFlagDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="undelFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="undelFlagDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="mobileOpinFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobileOpinFlagDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="perferedMime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="masterProperties" type="{uri:customerStatus.ws.sdk.edialog.com}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupRecipientProfileType", namespace = "uri:customerStatus.ws.sdk.edialog.com", propOrder = {
    "cid",
    "unsubFlag",
    "unsubFlagDate",
    "undelFlag",
    "undelFlagDate",
    "mobileOpinFlag",
    "mobileOpinFlagDate",
    "perferedMime",
    "createDate",
    "updateDate",
    "masterProperties"
})
public class LookupRecipientProfileType {

    protected int cid;
    @XmlElement(required = true, nillable = true)
    protected String unsubFlag;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unsubFlagDate;
    @XmlElement(required = true, nillable = true)
    protected String undelFlag;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar undelFlagDate;
    @XmlElement(required = true, nillable = true)
    protected String mobileOpinFlag;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mobileOpinFlagDate;
    @XmlElement(required = true, nillable = true)
    protected String perferedMime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    protected List<SimplePropertyType> masterProperties;

    /**
     * Gets the value of the cid property.
     * 
     */
    public int getCid() {
        return cid;
    }

    /**
     * Sets the value of the cid property.
     * 
     */
    public void setCid(int value) {
        this.cid = value;
    }

    /**
     * Gets the value of the unsubFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsubFlag() {
        return unsubFlag;
    }

    /**
     * Sets the value of the unsubFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsubFlag(String value) {
        this.unsubFlag = value;
    }

    /**
     * Gets the value of the unsubFlagDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnsubFlagDate() {
        return unsubFlagDate;
    }

    /**
     * Sets the value of the unsubFlagDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnsubFlagDate(XMLGregorianCalendar value) {
        this.unsubFlagDate = value;
    }

    /**
     * Gets the value of the undelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndelFlag() {
        return undelFlag;
    }

    /**
     * Sets the value of the undelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndelFlag(String value) {
        this.undelFlag = value;
    }

    /**
     * Gets the value of the undelFlagDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUndelFlagDate() {
        return undelFlagDate;
    }

    /**
     * Sets the value of the undelFlagDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUndelFlagDate(XMLGregorianCalendar value) {
        this.undelFlagDate = value;
    }

    /**
     * Gets the value of the mobileOpinFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileOpinFlag() {
        return mobileOpinFlag;
    }

    /**
     * Sets the value of the mobileOpinFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileOpinFlag(String value) {
        this.mobileOpinFlag = value;
    }

    /**
     * Gets the value of the mobileOpinFlagDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMobileOpinFlagDate() {
        return mobileOpinFlagDate;
    }

    /**
     * Sets the value of the mobileOpinFlagDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMobileOpinFlagDate(XMLGregorianCalendar value) {
        this.mobileOpinFlagDate = value;
    }

    /**
     * Gets the value of the perferedMime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerferedMime() {
        return perferedMime;
    }

    /**
     * Sets the value of the perferedMime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerferedMime(String value) {
        this.perferedMime = value;
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
     * Gets the value of the masterProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyType }
     * 
     * 
     */
    public List<SimplePropertyType> getMasterProperties() {
        if (masterProperties == null) {
            masterProperties = new ArrayList<SimplePropertyType>();
        }
        return this.masterProperties;
    }

}
