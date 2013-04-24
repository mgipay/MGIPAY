
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type that includes information about a
 * 				custom column.
 * 
 * <p>Java class for CustomDefExtentsionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomDefExtentsionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbColumnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="showTotal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showZero" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomDefExtentsionType", namespace = "uri:ereport.ws.sdk.edialog.com", propOrder = {
    "columnName",
    "dbColumnName",
    "showTotal",
    "showZero"
})
public class CustomDefExtentsionType {

    @XmlElement(required = true)
    protected String columnName;
    @XmlElement(required = true, nillable = true)
    protected String dbColumnName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean showTotal;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean showZero;

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
     * Gets the value of the dbColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbColumnName() {
        return dbColumnName;
    }

    /**
     * Sets the value of the dbColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbColumnName(String value) {
        this.dbColumnName = value;
    }

    /**
     * Gets the value of the showTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTotal() {
        return showTotal;
    }

    /**
     * Sets the value of the showTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTotal(Boolean value) {
        this.showTotal = value;
    }

    /**
     * Gets the value of the showZero property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowZero() {
        return showZero;
    }

    /**
     * Sets the value of the showZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowZero(Boolean value) {
        this.showZero = value;
    }

}
