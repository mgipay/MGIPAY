
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
 * Complex type. Includes RTM configuration information. The RTM configuration is not deleted, just its variations.
 *             
 * 
 * <p>Java class for RTMConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTMConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audienceClassId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clonePeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cloningTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audienceAlternateKeySelectionExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="audienceNamingExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="audienceUDFExpression" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="lastClonedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="productionCellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="testCellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="variationConfiguration" type="{uri:realtimemessagingconfiguration.ws.sdk.edialog.com}RTMVariationsSettingsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTMConfigurationType", namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", propOrder = {
    "messageName",
    "queueName",
    "notificationAddress",
    "audienceClassId",
    "clonePeriod",
    "cloningTimeZone",
    "audienceAlternateKeySelectionExpression",
    "audienceNamingExpression",
    "audienceUDFExpression",
    "lastClonedDate",
    "productionCellId",
    "testCellId",
    "variationConfiguration"
})
public class RTMConfigurationType {

    @XmlElement(required = true)
    protected String messageName;
    @XmlElement(required = true)
    protected String queueName;
    protected List<String> notificationAddress;
    protected Integer audienceClassId;
    @XmlElement(required = true)
    protected String clonePeriod;
    @XmlElement(required = true)
    protected String cloningTimeZone;
    protected String audienceAlternateKeySelectionExpression;
    protected String audienceNamingExpression;
    @XmlElement(nillable = true)
    protected List<String> audienceUDFExpression;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastClonedDate;
    protected Integer productionCellId;
    protected Integer testCellId;
    protected RTMVariationsSettingsType variationConfiguration;

    /**
     * Gets the value of the messageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageName() {
        return messageName;
    }

    /**
     * Sets the value of the messageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageName(String value) {
        this.messageName = value;
    }

    /**
     * Gets the value of the queueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * Sets the value of the queueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueName(String value) {
        this.queueName = value;
    }

    /**
     * Gets the value of the notificationAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotificationAddress() {
        if (notificationAddress == null) {
            notificationAddress = new ArrayList<String>();
        }
        return this.notificationAddress;
    }

    /**
     * Gets the value of the audienceClassId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAudienceClassId() {
        return audienceClassId;
    }

    /**
     * Sets the value of the audienceClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAudienceClassId(Integer value) {
        this.audienceClassId = value;
    }

    /**
     * Gets the value of the clonePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClonePeriod() {
        return clonePeriod;
    }

    /**
     * Sets the value of the clonePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClonePeriod(String value) {
        this.clonePeriod = value;
    }

    /**
     * Gets the value of the cloningTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloningTimeZone() {
        return cloningTimeZone;
    }

    /**
     * Sets the value of the cloningTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloningTimeZone(String value) {
        this.cloningTimeZone = value;
    }

    /**
     * Gets the value of the audienceAlternateKeySelectionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudienceAlternateKeySelectionExpression() {
        return audienceAlternateKeySelectionExpression;
    }

    /**
     * Sets the value of the audienceAlternateKeySelectionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceAlternateKeySelectionExpression(String value) {
        this.audienceAlternateKeySelectionExpression = value;
    }

    /**
     * Gets the value of the audienceNamingExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudienceNamingExpression() {
        return audienceNamingExpression;
    }

    /**
     * Sets the value of the audienceNamingExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceNamingExpression(String value) {
        this.audienceNamingExpression = value;
    }

    /**
     * Gets the value of the audienceUDFExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceUDFExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceUDFExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudienceUDFExpression() {
        if (audienceUDFExpression == null) {
            audienceUDFExpression = new ArrayList<String>();
        }
        return this.audienceUDFExpression;
    }

    /**
     * Gets the value of the lastClonedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastClonedDate() {
        return lastClonedDate;
    }

    /**
     * Sets the value of the lastClonedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastClonedDate(XMLGregorianCalendar value) {
        this.lastClonedDate = value;
    }

    /**
     * Gets the value of the productionCellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductionCellId() {
        return productionCellId;
    }

    /**
     * Sets the value of the productionCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductionCellId(Integer value) {
        this.productionCellId = value;
    }

    /**
     * Gets the value of the testCellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTestCellId() {
        return testCellId;
    }

    /**
     * Sets the value of the testCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTestCellId(Integer value) {
        this.testCellId = value;
    }

    /**
     * Gets the value of the variationConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link RTMVariationsSettingsType }
     *     
     */
    public RTMVariationsSettingsType getVariationConfiguration() {
        return variationConfiguration;
    }

    /**
     * Sets the value of the variationConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTMVariationsSettingsType }
     *     
     */
    public void setVariationConfiguration(RTMVariationsSettingsType value) {
        this.variationConfiguration = value;
    }

}
