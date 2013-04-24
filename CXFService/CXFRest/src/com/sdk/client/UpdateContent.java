
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="contentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="textData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="htmlData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="udf" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
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
    "contentId",
    "name",
    "textData",
    "htmlData",
    "udf"
})
@XmlRootElement(name = "updateContent", namespace = "uri:content.ws.sdk.edialog.com")
public class UpdateContent {

    @XmlElement(namespace = "uri:content.ws.sdk.edialog.com")
    protected int contentId;
    @XmlElement(namespace = "uri:content.ws.sdk.edialog.com", required = true, nillable = true)
    protected String name;
    @XmlElement(namespace = "uri:content.ws.sdk.edialog.com", required = true, nillable = true)
    protected String textData;
    @XmlElement(namespace = "uri:content.ws.sdk.edialog.com", required = true, nillable = true)
    protected String htmlData;
    @XmlElement(namespace = "uri:content.ws.sdk.edialog.com")
    protected List<String> udf;

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
     * Gets the value of the textData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextData() {
        return textData;
    }

    /**
     * Sets the value of the textData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextData(String value) {
        this.textData = value;
    }

    /**
     * Gets the value of the htmlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlData() {
        return htmlData;
    }

    /**
     * Sets the value of the htmlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlData(String value) {
        this.htmlData = value;
    }

    /**
     * Gets the value of the udf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUdf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUdf() {
        if (udf == null) {
            udf = new ArrayList<String>();
        }
        return this.udf;
    }

}
