
package com.mgi.agentconnect.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicFieldInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicFieldInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlTag" type="{http://www.moneygram.com/AgentConnect1211}stringMax80"/>
 *         &lt;element name="visibility" type="{http://www.moneygram.com/AgentConnect1211}ProductFieldInfoVisibility" minOccurs="0"/>
 *         &lt;element name="fieldMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fieldMin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.moneygram.com/AgentConnect1211}dataTypeCode"/>
 *         &lt;element name="fieldLabel" type="{http://www.moneygram.com/AgentConnect1211}stringMax80" minOccurs="0"/>
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enumerated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="defaultValue" type="{http://www.moneygram.com/AgentConnect1211}stringMax255" minOccurs="0"/>
 *         &lt;element name="validationRegEx" type="{http://www.moneygram.com/AgentConnect1211}stringMax255" minOccurs="0"/>
 *         &lt;element name="exampleFormat" type="{http://www.moneygram.com/AgentConnect1211}stringMax255" minOccurs="0"/>
 *         &lt;element name="enumeratedValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enumeratedValueInfo" type="{http://www.moneygram.com/AgentConnect1211}EnumeratedValueInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DynamicFieldInfo", propOrder = {
    "xmlTag",
    "visibility",
    "fieldMax",
    "fieldMin",
    "scale",
    "dataType",
    "fieldLabel",
    "displayOrder",
    "enumerated",
    "defaultValue",
    "validationRegEx",
    "exampleFormat",
    "enumeratedValues"
})
public class DynamicFieldInfo {

    @XmlElement(required = true)
    protected String xmlTag;
    protected ProductFieldInfoVisibility visibility;
    protected Long fieldMax;
    protected Long fieldMin;
    protected Integer scale;
    @XmlElement(required = true)
    protected DataTypeCode dataType;
    protected String fieldLabel;
    protected Integer displayOrder;
    protected boolean enumerated;
    protected String defaultValue;
    protected String validationRegEx;
    protected String exampleFormat;
    @XmlElementRef(name = "enumeratedValues", namespace = "http://www.moneygram.com/AgentConnect1211", type = JAXBElement.class)
    protected JAXBElement<DynamicFieldInfo.EnumeratedValues> enumeratedValues;

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
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFieldInfoVisibility }
     *     
     */
    public ProductFieldInfoVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFieldInfoVisibility }
     *     
     */
    public void setVisibility(ProductFieldInfoVisibility value) {
        this.visibility = value;
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
     * Gets the value of the fieldMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFieldMin() {
        return fieldMin;
    }

    /**
     * Sets the value of the fieldMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFieldMin(Long value) {
        this.fieldMin = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
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
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the enumerated property.
     * 
     */
    public boolean isEnumerated() {
        return enumerated;
    }

    /**
     * Sets the value of the enumerated property.
     * 
     */
    public void setEnumerated(boolean value) {
        this.enumerated = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the validationRegEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationRegEx() {
        return validationRegEx;
    }

    /**
     * Sets the value of the validationRegEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationRegEx(String value) {
        this.validationRegEx = value;
    }

    /**
     * Gets the value of the exampleFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExampleFormat() {
        return exampleFormat;
    }

    /**
     * Sets the value of the exampleFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExampleFormat(String value) {
        this.exampleFormat = value;
    }

    /**
     * Gets the value of the enumeratedValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicFieldInfo.EnumeratedValues }{@code >}
     *     
     */
    public JAXBElement<DynamicFieldInfo.EnumeratedValues> getEnumeratedValues() {
        return enumeratedValues;
    }

    /**
     * Sets the value of the enumeratedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicFieldInfo.EnumeratedValues }{@code >}
     *     
     */
    public void setEnumeratedValues(JAXBElement<DynamicFieldInfo.EnumeratedValues> value) {
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
     *         &lt;element name="enumeratedValueInfo" type="{http://www.moneygram.com/AgentConnect1211}EnumeratedValueInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "enumeratedValueInfo"
    })
    public static class EnumeratedValues {

        protected List<EnumeratedValueInfo> enumeratedValueInfo;

        /**
         * Gets the value of the enumeratedValueInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enumeratedValueInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnumeratedValueInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EnumeratedValueInfo }
         * 
         * 
         */
        public List<EnumeratedValueInfo> getEnumeratedValueInfo() {
            if (enumeratedValueInfo == null) {
                enumeratedValueInfo = new ArrayList<EnumeratedValueInfo>();
            }
            return this.enumeratedValueInfo;
        }

    }

}
