
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A list (one page) of contentItemType structures.
 * 
 * <p>Java class for contentItemAltType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contentItemAltType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alternateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="textDataSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="htmlDataSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="landPageDataSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="udf" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="5"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentItemAltType", namespace = "uri:content.ws.sdk.edialog.com", propOrder = {
    "hidden",
    "contentId",
    "name",
    "fsName",
    "alternateKey",
    "textDataSize",
    "htmlDataSize",
    "landPageDataSize",
    "udf",
    "createDate",
    "updateDate"
})
public class ContentItemAltType {

    protected boolean hidden;
    protected int contentId;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String fsName;
    @XmlElement(required = true, nillable = true)
    protected String alternateKey;
    protected int textDataSize;
    protected int htmlDataSize;
    protected int landPageDataSize;
    @XmlElement(required = true, nillable = true)
    protected List<String> udf;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
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
     * Gets the value of the fsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsName() {
        return fsName;
    }

    /**
     * Sets the value of the fsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsName(String value) {
        this.fsName = value;
    }

    /**
     * Gets the value of the alternateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateKey() {
        return alternateKey;
    }

    /**
     * Sets the value of the alternateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateKey(String value) {
        this.alternateKey = value;
    }

    /**
     * Gets the value of the textDataSize property.
     * 
     */
    public int getTextDataSize() {
        return textDataSize;
    }

    /**
     * Sets the value of the textDataSize property.
     * 
     */
    public void setTextDataSize(int value) {
        this.textDataSize = value;
    }

    /**
     * Gets the value of the htmlDataSize property.
     * 
     */
    public int getHtmlDataSize() {
        return htmlDataSize;
    }

    /**
     * Sets the value of the htmlDataSize property.
     * 
     */
    public void setHtmlDataSize(int value) {
        this.htmlDataSize = value;
    }

    /**
     * Gets the value of the landPageDataSize property.
     * 
     */
    public int getLandPageDataSize() {
        return landPageDataSize;
    }

    /**
     * Sets the value of the landPageDataSize property.
     * 
     */
    public void setLandPageDataSize(int value) {
        this.landPageDataSize = value;
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

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

}
