
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="industryID" type="{http://www.moneygram.com/AgentConnect1211}industryID"/>
 *         &lt;element name="industryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryInfo", propOrder = {
    "industryID",
    "industryName"
})
public class IndustryInfo {

    @XmlElement(required = true)
    protected String industryID;
    @XmlElement(required = true)
    protected String industryName;

    /**
     * Gets the value of the industryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryID() {
        return industryID;
    }

    /**
     * Sets the value of the industryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryID(String value) {
        this.industryID = value;
    }

    /**
     * Gets the value of the industryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryName() {
        return industryName;
    }

    /**
     * Sets the value of the industryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryName(String value) {
        this.industryName = value;
    }

}
