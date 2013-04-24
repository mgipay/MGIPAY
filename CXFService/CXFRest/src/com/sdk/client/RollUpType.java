
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RollUpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RollUpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mailingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="audienceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="linkId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ispKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dimensionKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="levelCounts" type="{uri:ereport.ws.sdk.edialog.com}RollupCountsType"/>
 *         &lt;element name="rollups" type="{uri:ereport.ws.sdk.edialog.com}RollUpType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RollUpType", namespace = "uri:ereport.ws.sdk.edialog.com", propOrder = {
    "reportType",
    "name",
    "mailingId",
    "cellId",
    "audienceId",
    "linkId",
    "ispKey",
    "format",
    "dimensionKey",
    "levelCounts",
    "rollups"
})
public class RollUpType {

    @XmlElement(required = true)
    protected String reportType;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected int mailingId;
    protected int cellId;
    protected int audienceId;
    protected int linkId;
    protected int ispKey;
    @XmlElement(required = true)
    protected String format;
    @XmlElement(required = true)
    protected String dimensionKey;
    @XmlElement(required = true)
    protected RollupCountsType levelCounts;
    protected List<RollUpType> rollups;

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
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
     * Gets the value of the mailingId property.
     * 
     */
    public int getMailingId() {
        return mailingId;
    }

    /**
     * Sets the value of the mailingId property.
     * 
     */
    public void setMailingId(int value) {
        this.mailingId = value;
    }

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
     * Gets the value of the audienceId property.
     * 
     */
    public int getAudienceId() {
        return audienceId;
    }

    /**
     * Sets the value of the audienceId property.
     * 
     */
    public void setAudienceId(int value) {
        this.audienceId = value;
    }

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
     * Gets the value of the ispKey property.
     * 
     */
    public int getIspKey() {
        return ispKey;
    }

    /**
     * Sets the value of the ispKey property.
     * 
     */
    public void setIspKey(int value) {
        this.ispKey = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the dimensionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionKey() {
        return dimensionKey;
    }

    /**
     * Sets the value of the dimensionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionKey(String value) {
        this.dimensionKey = value;
    }

    /**
     * Gets the value of the levelCounts property.
     * 
     * @return
     *     possible object is
     *     {@link RollupCountsType }
     *     
     */
    public RollupCountsType getLevelCounts() {
        return levelCounts;
    }

    /**
     * Sets the value of the levelCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RollupCountsType }
     *     
     */
    public void setLevelCounts(RollupCountsType value) {
        this.levelCounts = value;
    }

    /**
     * Gets the value of the rollups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rollups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRollups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RollUpType }
     * 
     * 
     */
    public List<RollUpType> getRollups() {
        if (rollups == null) {
            rollups = new ArrayList<RollUpType>();
        }
        return this.rollups;
    }

}
