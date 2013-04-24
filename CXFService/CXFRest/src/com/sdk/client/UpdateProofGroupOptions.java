
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
 *         &lt;element name="groupNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="includeInProofs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeFinalEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendMultipartText" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "groupNumber",
    "includeInProofs",
    "includeFinalEmail",
    "sendMultipartText",
    "emailAddress"
})
@XmlRootElement(name = "updateProofGroupOptions", namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
public class UpdateProofGroupOptions {

    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
    protected int cellId;
    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
    protected int groupNumber;
    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com", required = true, type = Boolean.class, nillable = true)
    protected Boolean includeInProofs;
    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com", required = true, type = Boolean.class, nillable = true)
    protected Boolean includeFinalEmail;
    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com", required = true, type = Boolean.class, nillable = true)
    protected Boolean sendMultipartText;
    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com", nillable = true)
    protected List<String> emailAddress;

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
     * Gets the value of the groupNumber property.
     * 
     */
    public int getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     */
    public void setGroupNumber(int value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the includeInProofs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeInProofs() {
        return includeInProofs;
    }

    /**
     * Sets the value of the includeInProofs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeInProofs(Boolean value) {
        this.includeInProofs = value;
    }

    /**
     * Gets the value of the includeFinalEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFinalEmail() {
        return includeFinalEmail;
    }

    /**
     * Sets the value of the includeFinalEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFinalEmail(Boolean value) {
        this.includeFinalEmail = value;
    }

    /**
     * Gets the value of the sendMultipartText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendMultipartText() {
        return sendMultipartText;
    }

    /**
     * Sets the value of the sendMultipartText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendMultipartText(Boolean value) {
        this.sendMultipartText = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAddress() {
        if (emailAddress == null) {
            emailAddress = new ArrayList<String>();
        }
        return this.emailAddress;
    }

}
