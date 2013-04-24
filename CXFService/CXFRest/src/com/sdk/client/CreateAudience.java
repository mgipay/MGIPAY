
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
 *         &lt;element name="audienceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="classId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="singleUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="udf" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="alternateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "audienceType",
    "classId",
    "singleUse",
    "name",
    "description",
    "udf",
    "alternateKey"
})
@XmlRootElement(name = "createAudience", namespace = "uri:audience.ws.sdk.edialog.com")
public class CreateAudience {

    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true)
    protected String audienceType;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com")
    protected int classId;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com")
    protected boolean singleUse;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true)
    protected String name;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true, nillable = true)
    protected String description;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", nillable = true)
    protected List<String> udf;
    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com", required = true, nillable = true)
    protected String alternateKey;

    /**
     * Gets the value of the audienceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudienceType() {
        return audienceType;
    }

    /**
     * Sets the value of the audienceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceType(String value) {
        this.audienceType = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     */
    public int getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     */
    public void setClassId(int value) {
        this.classId = value;
    }

    /**
     * Gets the value of the singleUse property.
     * 
     */
    public boolean isSingleUse() {
        return singleUse;
    }

    /**
     * Sets the value of the singleUse property.
     * 
     */
    public void setSingleUse(boolean value) {
        this.singleUse = value;
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

}
