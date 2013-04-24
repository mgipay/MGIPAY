
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tabSeparatedData" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "name",
    "description",
    "tabSeparatedData"
})
@XmlRootElement(name = "createTabSeparatedGrid", namespace = "uri:grid.ws.sdk.edialog.com")
public class CreateTabSeparatedGrid {

    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com", required = true)
    protected String name;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com")
    protected String description;
    @XmlElement(namespace = "uri:grid.ws.sdk.edialog.com", required = true)
    protected String tabSeparatedData;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the tabSeparatedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabSeparatedData() {
        return tabSeparatedData;
    }

    /**
     * Sets the value of the tabSeparatedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabSeparatedData(String value) {
        this.tabSeparatedData = value;
    }

}
