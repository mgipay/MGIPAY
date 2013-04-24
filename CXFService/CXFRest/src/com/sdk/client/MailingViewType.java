
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
 * Complex type that contains eReports information
 * 				about a mailing.
 * 
 * <p>Java class for MailingViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailingViewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mailingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mailingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cell" type="{uri:ereport.ws.sdk.edialog.com}eReportsCellOverviewType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateMailed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="refreshDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="mime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalCells" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalAudiences" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalLinks" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="levelCounts" type="{uri:ereport.ws.sdk.edialog.com}RollupCountsType"/>
 *         &lt;element name="customDefExt" type="{uri:ereport.ws.sdk.edialog.com}CustomDefExtentsionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MailingViewType", namespace = "uri:ereport.ws.sdk.edialog.com", propOrder = {
    "mailingId",
    "mailingName",
    "cell",
    "dateMailed",
    "refreshDate",
    "mime",
    "mimeType",
    "totalCells",
    "totalAudiences",
    "totalLinks",
    "levelCounts",
    "customDefExt",
    "rollups"
})
public class MailingViewType {

    protected int mailingId;
    @XmlElement(required = true, nillable = true)
    protected String mailingName;
    protected List<EReportsCellOverviewType> cell;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateMailed;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refreshDate;
    @XmlElement(required = true)
    protected String mime;
    protected int mimeType;
    protected long totalCells;
    protected long totalAudiences;
    protected long totalLinks;
    @XmlElement(required = true)
    protected RollupCountsType levelCounts;
    protected List<CustomDefExtentsionType> customDefExt;
    protected List<RollUpType> rollups;

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
     * Gets the value of the mailingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingName() {
        return mailingName;
    }

    /**
     * Sets the value of the mailingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingName(String value) {
        this.mailingName = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EReportsCellOverviewType }
     * 
     * 
     */
    public List<EReportsCellOverviewType> getCell() {
        if (cell == null) {
            cell = new ArrayList<EReportsCellOverviewType>();
        }
        return this.cell;
    }

    /**
     * Gets the value of the dateMailed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateMailed() {
        return dateMailed;
    }

    /**
     * Sets the value of the dateMailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateMailed(XMLGregorianCalendar value) {
        this.dateMailed = value;
    }

    /**
     * Gets the value of the refreshDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefreshDate() {
        return refreshDate;
    }

    /**
     * Sets the value of the refreshDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefreshDate(XMLGregorianCalendar value) {
        this.refreshDate = value;
    }

    /**
     * Gets the value of the mime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMime() {
        return mime;
    }

    /**
     * Sets the value of the mime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMime(String value) {
        this.mime = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     */
    public int getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     */
    public void setMimeType(int value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the totalCells property.
     * 
     */
    public long getTotalCells() {
        return totalCells;
    }

    /**
     * Sets the value of the totalCells property.
     * 
     */
    public void setTotalCells(long value) {
        this.totalCells = value;
    }

    /**
     * Gets the value of the totalAudiences property.
     * 
     */
    public long getTotalAudiences() {
        return totalAudiences;
    }

    /**
     * Sets the value of the totalAudiences property.
     * 
     */
    public void setTotalAudiences(long value) {
        this.totalAudiences = value;
    }

    /**
     * Gets the value of the totalLinks property.
     * 
     */
    public long getTotalLinks() {
        return totalLinks;
    }

    /**
     * Sets the value of the totalLinks property.
     * 
     */
    public void setTotalLinks(long value) {
        this.totalLinks = value;
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
     * Gets the value of the customDefExt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customDefExt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomDefExt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomDefExtentsionType }
     * 
     * 
     */
    public List<CustomDefExtentsionType> getCustomDefExt() {
        if (customDefExt == null) {
            customDefExt = new ArrayList<CustomDefExtentsionType>();
        }
        return this.customDefExt;
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
