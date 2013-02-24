
package com.ac1211.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RewardsFieldInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RewardsFieldInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlTag" type="{http://www.moneygram.com/AgentConnect1211}stringMax80"/>
 *         &lt;element name="fieldLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fieldOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.moneygram.com/AgentConnect1211}dataTypeCode" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="display" type="{http://www.moneygram.com/AgentConnect1211}RewardsFieldInfoDisplay"/>
 *         &lt;element name="enumeratedValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enumeratedRewardsValueInfo" type="{http://www.moneygram.com/AgentConnect1211}EnumeratedRewardsValueInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RewardsFieldInfo", propOrder = {
    "xmlTag",
    "fieldLabel",
    "fieldValue",
    "fieldMax",
    "fieldOrder",
    "dataType",
    "required",
    "enabled",
    "display",
    "enumeratedValues"
})
public class RewardsFieldInfo {

    @XmlElement(required = true)
    protected String xmlTag;
    @XmlElement(required = true)
    protected String fieldLabel;
    protected String fieldValue;
    protected Long fieldMax;
    protected Integer fieldOrder;
    protected DataTypeCode dataType;
    protected boolean required;
    protected boolean enabled;
    @XmlElement(required = true)
    protected RewardsFieldInfoDisplay display;
    @XmlElementRef(name = "enumeratedValues", namespace = "http://www.moneygram.com/AgentConnect1211", type = JAXBElement.class)
    protected JAXBElement<RewardsFieldInfo.EnumeratedValues> enumeratedValues;

    /**
     * Gets the value of the xmlTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlTag() {
        return xmlTag;
    }

    /**
     * Sets the value of the xmlTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlTag(String value) {
        this.xmlTag = value;
    }

    /**
     * Gets the value of the fieldLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldLabel() {
        return fieldLabel;
    }

    /**
     * Sets the value of the fieldLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldLabel(String value) {
        this.fieldLabel = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    /**
     * Gets the value of the fieldMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFieldMax() {
        return fieldMax;
    }

    /**
     * Sets the value of the fieldMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFieldMax(Long value) {
        this.fieldMax = value;
    }

    /**
     * Gets the value of the fieldOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldOrder() {
        return fieldOrder;
    }

    /**
     * Sets the value of the fieldOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldOrder(Integer value) {
        this.fieldOrder = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeCode }
     *     
     */
    public DataTypeCode getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeCode }
     *     
     */
    public void setDataType(DataTypeCode value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link RewardsFieldInfoDisplay }
     *     
     */
    public RewardsFieldInfoDisplay getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link RewardsFieldInfoDisplay }
     *     
     */
    public void setDisplay(RewardsFieldInfoDisplay value) {
        this.display = value;
    }

    /**
     * Gets the value of the enumeratedValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RewardsFieldInfo.EnumeratedValues }{@code >}
     *     
     */
    public JAXBElement<RewardsFieldInfo.EnumeratedValues> getEnumeratedValues() {
        return enumeratedValues;
    }

    /**
     * Sets the value of the enumeratedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RewardsFieldInfo.EnumeratedValues }{@code >}
     *     
     */
    public void setEnumeratedValues(JAXBElement<RewardsFieldInfo.EnumeratedValues> value) {
        this.enumeratedValues = value;
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
     *         &lt;element name="enumeratedRewardsValueInfo" type="{http://www.moneygram.com/AgentConnect1211}EnumeratedRewardsValueInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "enumeratedRewardsValueInfo"
    })
    public static class EnumeratedValues {

        protected List<EnumeratedRewardsValueInfo> enumeratedRewardsValueInfo;

        /**
         * Gets the value of the enumeratedRewardsValueInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enumeratedRewardsValueInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnumeratedRewardsValueInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EnumeratedRewardsValueInfo }
         * 
         * 
         */
        public List<EnumeratedRewardsValueInfo> getEnumeratedRewardsValueInfo() {
            if (enumeratedRewardsValueInfo == null) {
                enumeratedRewardsValueInfo = new ArrayList<EnumeratedRewardsValueInfo>();
            }
            return this.enumeratedRewardsValueInfo;
        }

    }

}
