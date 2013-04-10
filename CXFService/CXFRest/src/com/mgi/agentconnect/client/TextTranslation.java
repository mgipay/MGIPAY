
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextTranslation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextTranslation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="longLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="textTranslation" type="{http://www.moneygram.com/AgentConnect1211}translationText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextTranslation", propOrder = {
    "longLanguageCode",
    "textTranslation"
})
public class TextTranslation {

    @XmlElement(required = true)
    protected String longLanguageCode;
    @XmlElement(required = true)
    protected String textTranslation;

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

    /**
     * Gets the value of the textTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextTranslation() {
        return textTranslation;
    }

    /**
     * Sets the value of the textTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextTranslation(String value) {
        this.textTranslation = value;
    }

}
