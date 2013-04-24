
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type that describes proof group options.
 * 
 * <p>Java class for ProofGroupOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProofGroupOptionsType">
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
@XmlType(name = "ProofGroupOptionsType", namespace = "uri:mailingcontrol.ws.sdk.edialog.com", propOrder = {
    "cellId",
    "groupNumber",
    "includeInProofs",
    "includeFinalEmail",
    "sendMultipartText",
    "emailAddress"
})
public class ProofGroupOptionsType {

    protected int cellId;
    protected int groupNumber;
    protected boolean includeInProofs;
    protected boolean includeFinalEmail;
    protected boolean sendMultipartText;
    @XmlElement(nillable = true)
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
     */
    public boolean isIncludeInProofs() {
        return includeInProofs;
    }

    /**
     * Sets the value of the includeInProofs property.
     * 
     */
    public void setIncludeInProofs(boolean value) {
        this.includeInProofs = value;
    }

    /**
     * Gets the value of the includeFinalEmail property.
     * 
     */
    public boolean isIncludeFinalEmail() {
        return includeFinalEmail;
    }

    /**
     * Sets the value of the includeFinalEmail property.
     * 
     */
    public void setIncludeFinalEmail(boolean value) {
        this.includeFinalEmail = value;
    }

    /**
     * Gets the value of the sendMultipartText property.
     * 
     */
    public boolean isSendMultipartText() {
        return sendMultipartText;
    }

    /**
     * Sets the value of the sendMultipartText property.
     * 
     */
    public void setSendMultipartText(boolean value) {
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
