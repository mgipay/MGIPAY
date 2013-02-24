
package com.ac1211.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FQDOsForCountryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQDOsForCountryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="fqdoInfo" type="{http://www.moneygram.com/AgentConnect1211}FQDOInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FQDOsForCountryResponse", propOrder = {
    "fqdoInfo"
})
public class FQDOsForCountryResponse
    extends Response
{

    protected List<FQDOInfo> fqdoInfo;

    /**
     * Gets the value of the fqdoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fqdoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFqdoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FQDOInfo }
     * 
     * 
     */
    public List<FQDOInfo> getFqdoInfo() {
        if (fqdoInfo == null) {
            fqdoInfo = new ArrayList<FQDOInfo>();
        }
        return this.fqdoInfo;
    }

}
