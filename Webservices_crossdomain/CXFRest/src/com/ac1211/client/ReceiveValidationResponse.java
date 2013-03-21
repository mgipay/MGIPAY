
package com.ac1211.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiveValidationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiveValidationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="mgiTransactionSessionID" type="{http://www.moneygram.com/AgentConnect1211}mgiTransactionSessionID"/>
 *         &lt;element name="readyForCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disclosureText" type="{http://www.moneygram.com/AgentConnect1211}TextTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalFieldsToCollect" type="{http://www.moneygram.com/AgentConnect1211}ProductFieldInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveValidationResponse", propOrder = {
    "mgiTransactionSessionID",
    "readyForCommit",
    "disclosureText",
    "additionalFieldsToCollect"
})
public class ReceiveValidationResponse
    extends Response
{

    @XmlElement(required = true)
    protected String mgiTransactionSessionID;
    protected Boolean readyForCommit;
    protected List<TextTranslation> disclosureText;
    protected List<ProductFieldInfo> additionalFieldsToCollect;

    /**
     * Gets the value of the mgiTransactionSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }

    /**
     * Sets the value of the mgiTransactionSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgiTransactionSessionID(String value) {
        this.mgiTransactionSessionID = value;
    }

    /**
     * Gets the value of the readyForCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadyForCommit() {
        return readyForCommit;
    }

    /**
     * Sets the value of the readyForCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadyForCommit(Boolean value) {
        this.readyForCommit = value;
    }

    /**
     * Gets the value of the disclosureText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosureText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextTranslation }
     * 
     * 
     */
    public List<TextTranslation> getDisclosureText() {
        if (disclosureText == null) {
            disclosureText = new ArrayList<TextTranslation>();
        }
        return this.disclosureText;
    }

    /**
     * Gets the value of the additionalFieldsToCollect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFieldsToCollect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalFieldsToCollect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFieldInfo }
     * 
     * 
     */
    public List<ProductFieldInfo> getAdditionalFieldsToCollect() {
        if (additionalFieldsToCollect == null) {
            additionalFieldsToCollect = new ArrayList<ProductFieldInfo>();
        }
        return this.additionalFieldsToCollect;
    }

}
