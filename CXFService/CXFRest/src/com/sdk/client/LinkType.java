
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
 *  The reportable link.
 *             
 * 
 * <p>Java class for LinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalTargetURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="udf" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkType", namespace = "uri:urlmanagement.ws.sdk.edialog.com", propOrder = {
    "linkId",
    "contentId",
    "targetURL",
    "originalTargetURL",
    "enabled",
    "udf",
    "reportName",
    "expirationDate"
})
public class LinkType {

    protected int linkId;
    protected int contentId;
    @XmlElement(required = true)
    protected String targetURL;
    @XmlElement(required = true)
    protected String originalTargetURL;
    protected boolean enabled;
    @XmlElement(nillable = true)
    protected List<String> udf;
    protected String reportName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;

    /**
     * Gets the value of the linkId property.
     * 
     */
    public int getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     */
    public void setLinkId(int value) {
        this.linkId = value;
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
     * Gets the value of the targetURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetURL() {
        return targetURL;
    }

    /**
     * Sets the value of the targetURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetURL(String value) {
        this.targetURL = value;
    }

    /**
     * Gets the value of the originalTargetURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTargetURL() {
        return originalTargetURL;
    }

    /**
     * Sets the value of the originalTargetURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTargetURL(String value) {
        this.originalTargetURL = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
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
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

}
