
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
 *         &lt;element name="symbolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "symbolName",
    "contentId"
})
@XmlRootElement(name = "mapSymbolToContent", namespace = "uri:cp.ws.sdk.edialog.com")
public class MapSymbolToContent {

    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com")
    protected int cellId;
    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com", required = true)
    protected String symbolName;
    @XmlElement(namespace = "uri:cp.ws.sdk.edialog.com")
    protected int contentId;

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
     * Gets the value of the contentId property.
     * 
     */
    public int getContentId() {
        return contentId;
    }

    /**
     * Sets the value of the contentId property.
     * 
     */
    public void setContentId(int value) {
        this.contentId = value;
    }

}
