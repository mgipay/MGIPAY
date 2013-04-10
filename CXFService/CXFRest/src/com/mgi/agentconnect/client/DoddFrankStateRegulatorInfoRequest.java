
package com.mgi.agentconnect.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoddFrankStateRegulatorInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoddFrankStateRegulatorInfoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Request">
 *       &lt;sequence>
 *         &lt;element name="dfJurisdiction" type="{http://www.moneygram.com/AgentConnect1211}stringMax3" minOccurs="0"/>
 *         &lt;element name="languages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="longLanguageCode" type="{http://www.moneygram.com/AgentConnect1211}LongLanguageCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoddFrankStateRegulatorInfoRequest", propOrder = {
    "dfJurisdiction",
    "languages"
})
public class DoddFrankStateRegulatorInfoRequest
    extends Request
{

    protected String dfJurisdiction;
    @XmlElement(required = true)
    protected DoddFrankStateRegulatorInfoRequest.Languages languages;

    /**
     * Gets the value of the dfJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfJurisdiction() {
        return dfJurisdiction;
    }

    /**
     * Sets the value of the dfJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfJurisdiction(String value) {
        this.dfJurisdiction = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link DoddFrankStateRegulatorInfoRequest.Languages }
     *     
     */
    public DoddFrankStateRegulatorInfoRequest.Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoddFrankStateRegulatorInfoRequest.Languages }
     *     
     */
    public void setLanguages(DoddFrankStateRegulatorInfoRequest.Languages value) {
        this.languages = value;
    }


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
     *         &lt;element name="longLanguageCode" type="{http://www.moneygram.com/AgentConnect1211}LongLanguageCode" maxOccurs="unbounded"/>
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
        "longLanguageCode"
    })
    public static class Languages {

        @XmlElement(required = true)
        protected List<String> longLanguageCode;

        /**
         * Gets the value of the longLanguageCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the longLanguageCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLongLanguageCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLongLanguageCode() {
            if (longLanguageCode == null) {
                longLanguageCode = new ArrayList<String>();
            }
            return this.longLanguageCode;
        }

    }

}
