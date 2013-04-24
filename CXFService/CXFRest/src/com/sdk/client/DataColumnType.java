
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type that represents a row in the data dictionary. Each row describes a column in the database.
 * 
 * <p>Java class for dataColumnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataColumnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dictionaryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="columnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTypeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataColumnType", namespace = "uri:dataupload.ws.sdk.edialog.com", propOrder = {
    "dictionaryId",
    "tableName",
    "columnName",
    "columnType",
    "maxLength",
    "dateTypeFormat"
})
public class DataColumnType {

    protected int dictionaryId;
    @XmlElement(required = true)
    protected String tableName;
    @XmlElement(required = true)
    protected String columnName;
    @XmlElement(required = true)
    protected String columnType;
    protected String maxLength;
    protected String dateTypeFormat;

    /**
     * Gets the value of the dictionaryId property.
     * 
     */
    public int getDictionaryId() {
        return dictionaryId;
    }

    /**
     * Sets the value of the dictionaryId property.
     * 
     */
    public void setDictionaryId(int value) {
        this.dictionaryId = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the columnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * Sets the value of the columnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnType(String value) {
        this.columnType = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLength(String value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the dateTypeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTypeFormat() {
        return dateTypeFormat;
    }

    /**
     * Sets the value of the dateTypeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTypeFormat(String value) {
        this.dateTypeFormat = value;
    }

}
