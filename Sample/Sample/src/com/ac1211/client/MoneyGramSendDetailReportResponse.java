
package com.ac1211.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyGramSendDetailReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyGramSendDetailReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="reportInfo" type="{http://www.moneygram.com/AgentConnect1211}MoneyGramSendDetailInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyGramSendDetailReportResponse", propOrder = {
    "reportInfo"
})
public class MoneyGramSendDetailReportResponse
    extends Response
{

    protected List<MoneyGramSendDetailInfo> reportInfo;

    /**
     * Gets the value of the reportInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneyGramSendDetailInfo }
     * 
     * 
     */
    public List<MoneyGramSendDetailInfo> getReportInfo() {
        if (reportInfo == null) {
            reportInfo = new ArrayList<MoneyGramSendDetailInfo>();
        }
        return this.reportInfo;
    }

}
