
package com.sdk.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="unsubTemplate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unsubAudience" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "unsubTemplate",
    "unsubAudience"
})
@XmlRootElement(name = "setCellUnsubRules")
public class SetCellUnsubRules {

    protected int cellId;
    protected int unsubTemplate;
    @XmlElementRef(name = "unsubAudience", namespace = "uri:cell.ws.sdk.edialog.com", type = JAXBElement.class)
    protected JAXBElement<Integer> unsubAudience;

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
     * Gets the value of the unsubTemplate property.
     * 
     */
    public int getUnsubTemplate() {
        return unsubTemplate;
    }

    /**
     * Sets the value of the unsubTemplate property.
     * 
     */
    public void setUnsubTemplate(int value) {
        this.unsubTemplate = value;
    }

    /**
     * Gets the value of the unsubAudience property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUnsubAudience() {
        return unsubAudience;
    }

    /**
     * Sets the value of the unsubAudience property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUnsubAudience(JAXBElement<Integer> value) {
        this.unsubAudience = value;
    }

}
