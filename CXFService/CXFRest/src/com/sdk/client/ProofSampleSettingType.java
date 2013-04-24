
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type that describes the proof sample properties.
 * 
 * <p>Java class for ProofSampleSettingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProofSampleSettingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sampleSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProofSampleSettingType", namespace = "uri:mailingcontrol.ws.sdk.edialog.com", propOrder = {
    "sampleSize",
    "columnName"
})
public class ProofSampleSettingType {

    protected int sampleSize;
    @XmlElement(nillable = true)
    protected List<String> columnName;

    /**
     * Gets the value of the sampleSize property.
     * 
     */
    public int getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the value of the sampleSize property.
     * 
     */
    public void setSampleSize(int value) {
        this.sampleSize = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColumnName() {
        if (columnName == null) {
            columnName = new ArrayList<String>();
        }
        return this.columnName;
    }

}
