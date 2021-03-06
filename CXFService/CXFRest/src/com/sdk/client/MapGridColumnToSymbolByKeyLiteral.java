
package com.sdk.client;

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
 *         &lt;element name="gridId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="symbolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keySymbolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "gridId",
    "columnName",
    "symbolName",
    "keySymbolName"
})
@XmlRootElement(name = "mapGridColumnToSymbolByKeyLiteral", namespace = "uri:cp.ws.sdk.edialog.com")
public class MapGridColumnToSymbolByKeyLiteral {

    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com")
    protected int cellId;
    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com")
    protected int gridId;
    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com", required = true)
    protected String columnName;
    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com")
    protected String symbolName;
    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com", required = true)
    protected String keySymbolName;

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
     * Gets the value of the gridId property.
     * 
     */
    public int getGridId() {
        return gridId;
    }

    /**
     * Sets the value of the gridId property.
     * 
     */
    public void setGridId(int value) {
        this.gridId = value;
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
     * Gets the value of the symbolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolName() {
        return symbolName;
    }

    /**
     * Sets the value of the symbolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolName(String value) {
        this.symbolName = value;
    }

    /**
     * Gets the value of the keySymbolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySymbolName() {
        return keySymbolName;
    }

    /**
     * Sets the value of the keySymbolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySymbolName(String value) {
        this.keySymbolName = value;
    }

}
