
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Complex type that includes basic cell configuration information.
 * 
 * <p>Java class for cellDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cellDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mailingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="udf" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="10" minOccurs="10"/>
 *         &lt;element name="contentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="firstMailedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recipientAudience" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suppressionAudience" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unsubTemplate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unsubAudience" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="proofAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="redirectDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="redirectExpiration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alternateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cellDetailType", propOrder = {
    "campaignId",
    "mailingId",
    "cellId",
    "name",
    "description",
    "fromName",
    "fromAddress",
    "subject",
    "udf",
    "contentId",
    "createDate",
    "updateDate",
    "firstMailedDate",
    "status",
    "recipientAudience",
    "suppressionAudience",
    "unsubTemplate",
    "unsubAudience",
    "proofAddress",
    "redirectDomain",
    "redirectExpiration",
    "alternateKey"
})
@XmlSeeAlso({
    CellAdvancedDetailType.class
})
public class CellDetailType {

    protected int campaignId;
    protected int mailingId;
    protected int cellId;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String fromName;
    @XmlElement(required = true, nillable = true)
    protected String fromAddress;
    @XmlElement(required = true, nillable = true)
    protected String subject;
    @XmlElement(required = true, nillable = true)
    protected List<String> udf;
    protected int contentId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstMailedDate;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(type = Integer.class)
    protected List<Integer> recipientAudience;
    @XmlElement(type = Integer.class)
    protected List<Integer> suppressionAudience;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer unsubTemplate;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer unsubAudience;
    protected List<String> proofAddress;
    @XmlElement(required = true, nillable = true)
    protected String redirectDomain;
    protected int redirectExpiration;
    @XmlElement(required = true, nillable = true)
    protected String alternateKey;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddress(String value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
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
     * Gets the value of the contentId property.
     * 
     */
    public int getContentId() {
        return contentId;
    }

    /**
     * Sets the value of the contentId property.
     * 
     */
    public void setContentId(int value) {
        this.contentId = value;
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
     * Gets the value of the firstMailedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstMailedDate() {
        return firstMailedDate;
    }

    /**
     * Sets the value of the firstMailedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstMailedDate(XMLGregorianCalendar value) {
        this.firstMailedDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the recipientAudience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientAudience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientAudience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getRecipientAudience() {
        if (recipientAudience == null) {
            recipientAudience = new ArrayList<Integer>();
        }
        return this.recipientAudience;
    }

    /**
     * Gets the value of the suppressionAudience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suppressionAudience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuppressionAudience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSuppressionAudience() {
        if (suppressionAudience == null) {
            suppressionAudience = new ArrayList<Integer>();
        }
        return this.suppressionAudience;
    }

    /**
     * Gets the value of the unsubTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnsubTemplate() {
        return unsubTemplate;
    }

    /**
     * Sets the value of the unsubTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnsubTemplate(Integer value) {
        this.unsubTemplate = value;
    }

    /**
     * Gets the value of the unsubAudience property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnsubAudience() {
        return unsubAudience;
    }

    /**
     * Sets the value of the unsubAudience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnsubAudience(Integer value) {
        this.unsubAudience = value;
    }

    /**
     * Gets the value of the proofAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proofAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProofAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProofAddress() {
        if (proofAddress == null) {
            proofAddress = new ArrayList<String>();
        }
        return this.proofAddress;
    }

    /**
     * Gets the value of the redirectDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectDomain() {
        return redirectDomain;
    }

    /**
     * Sets the value of the redirectDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectDomain(String value) {
        this.redirectDomain = value;
    }

    /**
     * Gets the value of the redirectExpiration property.
     * 
     */
    public int getRedirectExpiration() {
        return redirectExpiration;
    }

    /**
     * Sets the value of the redirectExpiration property.
     * 
     */
    public void setRedirectExpiration(int value) {
        this.redirectExpiration = value;
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

}
