
package com.ac1211.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommitTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="referenceNumber" type="{http://www.moneygram.com/AgentConnect1211}referenceNumber"/>
 *         &lt;element name="partnerConfirmationNumber" type="{http://www.moneygram.com/AgentConnect1211}bancomerConfirmationNumber" minOccurs="0"/>
 *         &lt;element name="partnerName" type="{http://www.moneygram.com/AgentConnect1211}partnerName" minOccurs="0"/>
 *         &lt;element name="freePhoneCallPIN" type="{http://www.moneygram.com/AgentConnect1211}stringMax14" minOccurs="0"/>
 *         &lt;element name="tollFreePhoneNumber" type="{http://www.moneygram.com/AgentConnect1211}stringMax14" minOccurs="0"/>
 *         &lt;element name="expectedDateOfDelivery" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="transactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="receiptTextInfo" type="{http://www.moneygram.com/AgentConnect1211}TextTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitTransactionResponse", propOrder = {
    "referenceNumber",
    "partnerConfirmationNumber",
    "partnerName",
    "freePhoneCallPIN",
    "tollFreePhoneNumber",
    "expectedDateOfDelivery",
    "transactionDateTime",
    "receiptTextInfo"
})
public class CommitTransactionResponse
    extends Response
{

    @XmlElement(required = true)
    protected String referenceNumber;
    protected String partnerConfirmationNumber;
    protected String partnerName;
    protected String freePhoneCallPIN;
    protected String tollFreePhoneNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedDateOfDelivery;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDateTime;
    protected List<TextTranslation> receiptTextInfo;

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the partnerConfirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerConfirmationNumber() {
        return partnerConfirmationNumber;
    }

    /**
     * Sets the value of the partnerConfirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerConfirmationNumber(String value) {
        this.partnerConfirmationNumber = value;
    }

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
    }

    /**
     * Gets the value of the freePhoneCallPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreePhoneCallPIN() {
        return freePhoneCallPIN;
    }

    /**
     * Sets the value of the freePhoneCallPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreePhoneCallPIN(String value) {
        this.freePhoneCallPIN = value;
    }

    /**
     * Gets the value of the tollFreePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreePhoneNumber() {
        return tollFreePhoneNumber;
    }

    /**
     * Sets the value of the tollFreePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreePhoneNumber(String value) {
        this.tollFreePhoneNumber = value;
    }

    /**
     * Gets the value of the expectedDateOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDateOfDelivery() {
        return expectedDateOfDelivery;
    }

    /**
     * Sets the value of the expectedDateOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDateOfDelivery(XMLGregorianCalendar value) {
        this.expectedDateOfDelivery = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDateTime(XMLGregorianCalendar value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the receiptTextInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptTextInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptTextInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextTranslation }
     * 
     * 
     */
    public List<TextTranslation> getReceiptTextInfo() {
        if (receiptTextInfo == null) {
            receiptTextInfo = new ArrayList<TextTranslation>();
        }
        return this.receiptTextInfo;
    }

}
