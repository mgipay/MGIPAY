
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
 * <p>Java class for ProductFieldInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFieldInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlTag" type="{http://www.moneygram.com/AgentConnect1211}stringMax80"/>
 *         &lt;element name="visibility" type="{http://www.moneygram.com/AgentConnect1211}ProductFieldInfoVisibility"/>
 *         &lt;element name="fieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fieldCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dynamic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fieldMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fieldMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dataType" type="{http://www.moneygram.com/AgentConnect1211}dataTypeCode"/>
 *         &lt;element name="enumerated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.moneygram.com/AgentConnect1211}stringMax255" minOccurs="0"/>
 *         &lt;element name="validationRegEx" type="{http://www.moneygram.com/AgentConnect1211}stringMax255" minOccurs="0"/>
 *         &lt;element name="arrayName" type="{http://www.moneygram.com/AgentConnect1211}stringMax255" minOccurs="0"/>
 *         &lt;element name="arrayLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ProductFieldInfo", propOrder = {
    "xmlTag",
    "visibility",
    "fieldLabel",
    "displayOrder",
    "fieldCategory",
    "dynamic",
    "fieldMax",
    "fieldMin",
    "dataType",
    "enumerated",
    "defaultValue",
    "validationRegEx",
    "arrayName",
    "arrayLength",
    "exampleFormat",
    "enumeratedValues"
})
public class ProductFieldInfo {

    @XmlElement(required = true)
    protected String xmlTag;
    @XmlElement(required = true)
    protected ProductFieldInfoVisibility visibility;
    protected String fieldLabel;
    protected Integer displayOrder;
    protected String fieldCategory;
    protected Boolean dynamic;
    protected long fieldMax;
    protected long fieldMin;
    @XmlElement(required = true)
    protected DataTypeCode dataType;
    protected Boolean enumerated;
    protected String defaultValue;
    protected String validationRegEx;
    protected String arrayName;
    protected Integer arrayLength;
    protected String exampleFormat;
    @XmlElementRef(name = "enumeratedValues", namespace = "http://www.moneygram.com/AgentConnect1211", type = JAXBElement.class)
    protected JAXBElement<ProductFieldInfo.EnumeratedValues> enumeratedValues;

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
     * Gets the value of the fieldCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldCategory() {
        return fieldCategory;
    }

    /**
     * Sets the value of the fieldCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldCategory(String value) {
        this.fieldCategory = value;
    }

    /**
     * Gets the value of the dynamic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamic() {
        return dynamic;
    }

    /**
     * Sets the value of the dynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamic(Boolean value) {
        this.dynamic = value;
    }

    /**
     * Gets the value of the fieldMax property.
     * 
     */
    public long getFieldMax() {
        return fieldMax;
    }

    /**
     * Sets the value of the fieldMax property.
     * 
     */
    public void setFieldMax(long value) {
        this.fieldMax = value;
    }

    /**
     * Gets the value of the fieldMin property.
     * 
     */
    public long getFieldMin() {
        return fieldMin;
    }

    /**
     * Sets the value of the fieldMin property.
     * 
     */
    public void setFieldMin(long value) {
        this.fieldMin = value;
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
     * Gets the value of the enumerated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnumerated() {
        return enumerated;
    }

    /**
     * Sets the value of the enumerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnumerated(Boolean value) {
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
     * Gets the value of the arrayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrayName() {
        return arrayName;
    }

    /**
     * Sets the value of the arrayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrayName(String value) {
        this.arrayName = value;
    }

    /**
     * Gets the value of the arrayLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrayLength() {
        return arrayLength;
    }

    /**
     * Sets the value of the arrayLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrayLength(Integer value) {
        this.arrayLength = value;
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
     *     {@link JAXBElement }{@code <}{@link ProductFieldInfo.EnumeratedValues }{@code >}
     *     
     */
    public JAXBElement<ProductFieldInfo.EnumeratedValues> getEnumeratedValues() {
        return enumeratedValues;
    }

    /**
     * Sets the value of the enumeratedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductFieldInfo.EnumeratedValues }{@code >}
     *     
     */
    public void setEnumeratedValues(JAXBElement<ProductFieldInfo.EnumeratedValues> value) {
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
