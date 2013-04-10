
package com.mgi.agentconnect.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="mgiTransactionSessionID" type="{http://www.moneygram.com/AgentConnect1211}mgiTransactionSessionID"/>
 *         &lt;element name="productType" type="{http://www.moneygram.com/AgentConnect1211}productType"/>
 *         &lt;element name="fieldValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="keyValuePair" type="{http://www.moneygram.com/AgentConnect1211}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stateRegulatorVersion" type="{http://www.moneygram.com/AgentConnect1211}stateRegulatorVersion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitTransactionRequest", propOrder = {
    "mgiTransactionSessionID",
    "productType",
    "fieldValues",
    "stateRegulatorVersion"
})
public class CommitTransactionRequest
    extends Request
{

    @XmlElement(required = true)
    protected String mgiTransactionSessionID;
    @XmlElement(required = true)
    protected ProductType productType;
    protected CommitTransactionRequest.FieldValues fieldValues;
    protected String stateRegulatorVersion;

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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the fieldValues property.
     * 
     * @return
     *     possible object is
     *     {@link CommitTransactionRequest.FieldValues }
     *     
     */
    public CommitTransactionRequest.FieldValues getFieldValues() {
        return fieldValues;
    }

    /**
     * Sets the value of the fieldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitTransactionRequest.FieldValues }
     *     
     */
    public void setFieldValues(CommitTransactionRequest.FieldValues value) {
        this.fieldValues = value;
    }

    /**
     * Gets the value of the stateRegulatorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegulatorVersion() {
        return stateRegulatorVersion;
    }

    /**
     * Sets the value of the stateRegulatorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegulatorVersion(String value) {
        this.stateRegulatorVersion = value;
    }


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
     *         &lt;element name="keyValuePair" type="{http://www.moneygram.com/AgentConnect1211}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
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
        "keyValuePair"
    })
    public static class FieldValues {

        protected List<KeyValuePair> keyValuePair;

        /**
         * Gets the value of the keyValuePair property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyValuePair property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyValuePair().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KeyValuePair }
         * 
         * 
         */
        public List<KeyValuePair> getKeyValuePair() {
            if (keyValuePair == null) {
                keyValuePair = new ArrayList<KeyValuePair>();
            }
            return this.keyValuePair;
        }

    }

}
