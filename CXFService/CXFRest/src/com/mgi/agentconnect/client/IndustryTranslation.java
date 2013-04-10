
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryTranslation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryTranslation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="industryId" type="{http://www.moneygram.com/AgentConnect1211}industryID"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryTranslation", propOrder = {
    "industryId",
    "displayName",
    "languageCode",
    "longLanguageCode"
})
public class IndustryTranslation {

    @XmlElement(required = true)
    protected String industryId;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected String languageCode;
    @XmlElement(required = true)
    protected String longLanguageCode;

    /**
     * Gets the value of the industryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryId() {
        return industryId;
    }

    /**
     * Sets the value of the industryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryId(String value) {
        this.industryId = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the longLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongLanguageCode() {
        return longLanguageCode;
    }

    /**
     * Sets the value of the longLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongLanguageCode(String value) {
        this.longLanguageCode = value;
    }

}
