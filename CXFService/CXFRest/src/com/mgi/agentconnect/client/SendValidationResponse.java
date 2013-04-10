
package com.mgi.agentconnect.client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendValidationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendValidationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="mgiTransactionSessionID" type="{http://www.moneygram.com/AgentConnect1211}mgiTransactionSessionID"/>
 *         &lt;element name="customerReceiveNumber" type="{http://www.moneygram.com/AgentConnect1211}customerReceiveNumber" minOccurs="0"/>
 *         &lt;element name="accountNumberLastFour" type="{http://www.moneygram.com/AgentConnect1211}stringMax4" minOccurs="0"/>
 *         &lt;element name="customerServiceMessage" type="{http://www.moneygram.com/AgentConnect1211}stringMax255" minOccurs="0"/>
 *         &lt;element name="accountNickname" type="{http://www.moneygram.com/AgentConnect1211}accountNickname" minOccurs="0"/>
 *         &lt;element name="promotionInfo" type="{http://www.moneygram.com/AgentConnect1211}PromotionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="promotionalMessage" type="{http://www.moneygram.com/AgentConnect1211}TextTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="readyForCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disclosureText" type="{http://www.moneygram.com/AgentConnect1211}TextTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receiveAgentName" type="{http://www.moneygram.com/AgentConnect1211}stringMax40" minOccurs="0"/>
 *         &lt;element name="receiveAgentAddress" type="{http://www.moneygram.com/AgentConnect1211}AgentAddress" minOccurs="0"/>
 *         &lt;element name="additionalFieldsToCollect" type="{http://www.moneygram.com/AgentConnect1211}ProductFieldInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sendAmounts" type="{http://www.moneygram.com/AgentConnect1211}SendAmountInfo" minOccurs="0"/>
 *         &lt;element name="receiveAmounts" type="{http://www.moneygram.com/AgentConnect1211}ReceiveAmountInfo" minOccurs="0"/>
 *         &lt;element name="exchangeRateApplied" type="{http://www.moneygram.com/AgentConnect1211}decimal14" minOccurs="0"/>
 *         &lt;element name="receiveFeeDisclosureText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receiveTaxDisclosureText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="confirmationNumber" type="{http://www.moneygram.com/AgentConnect1211}confirmationNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendValidationResponse", propOrder = {
    "mgiTransactionSessionID",
    "customerReceiveNumber",
    "accountNumberLastFour",
    "customerServiceMessage",
    "accountNickname",
    "promotionInfo",
    "promotionalMessage",
    "readyForCommit",
    "disclosureText",
    "receiveAgentName",
    "receiveAgentAddress",
    "additionalFieldsToCollect",
    "sendAmounts",
    "receiveAmounts",
    "exchangeRateApplied",
    "receiveFeeDisclosureText",
    "receiveTaxDisclosureText",
    "confirmationNumber"
})
public class SendValidationResponse
    extends Response
{

    @XmlElement(required = true)
    protected String mgiTransactionSessionID;
    protected String customerReceiveNumber;
    protected String accountNumberLastFour;
    protected String customerServiceMessage;
    protected String accountNickname;
    protected List<PromotionInfo> promotionInfo;
    protected List<TextTranslation> promotionalMessage;
    protected Boolean readyForCommit;
    protected List<TextTranslation> disclosureText;
    protected String receiveAgentName;
    protected AgentAddress receiveAgentAddress;
    protected List<ProductFieldInfo> additionalFieldsToCollect;
    protected SendAmountInfo sendAmounts;
    protected ReceiveAmountInfo receiveAmounts;
    protected BigDecimal exchangeRateApplied;
    protected Boolean receiveFeeDisclosureText;
    protected Boolean receiveTaxDisclosureText;
    protected String confirmationNumber;

    /**
     * Gets the value of the mgiTransactionSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }

    /**
     * Sets the value of the mgiTransactionSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgiTransactionSessionID(String value) {
        this.mgiTransactionSessionID = value;
    }

    /**
     * Gets the value of the customerReceiveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReceiveNumber() {
        return customerReceiveNumber;
    }

    /**
     * Sets the value of the customerReceiveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReceiveNumber(String value) {
        this.customerReceiveNumber = value;
    }

    /**
     * Gets the value of the accountNumberLastFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberLastFour() {
        return accountNumberLastFour;
    }

    /**
     * Sets the value of the accountNumberLastFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberLastFour(String value) {
        this.accountNumberLastFour = value;
    }

    /**
     * Gets the value of the customerServiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceMessage() {
        return customerServiceMessage;
    }

    /**
     * Sets the value of the customerServiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceMessage(String value) {
        this.customerServiceMessage = value;
    }

    /**
     * Gets the value of the accountNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNickname() {
        return accountNickname;
    }

    /**
     * Sets the value of the accountNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNickname(String value) {
        this.accountNickname = value;
    }

    /**
     * Gets the value of the promotionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionInfo }
     * 
     * 
     */
    public List<PromotionInfo> getPromotionInfo() {
        if (promotionInfo == null) {
            promotionInfo = new ArrayList<PromotionInfo>();
        }
        return this.promotionInfo;
    }

    /**
     * Gets the value of the promotionalMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextTranslation }
     * 
     * 
     */
    public List<TextTranslation> getPromotionalMessage() {
        if (promotionalMessage == null) {
            promotionalMessage = new ArrayList<TextTranslation>();
        }
        return this.promotionalMessage;
    }

    /**
     * Gets the value of the readyForCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadyForCommit() {
        return readyForCommit;
    }

    /**
     * Sets the value of the readyForCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadyForCommit(Boolean value) {
        this.readyForCommit = value;
    }

    /**
     * Gets the value of the disclosureText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosureText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextTranslation }
     * 
     * 
     */
    public List<TextTranslation> getDisclosureText() {
        if (disclosureText == null) {
            disclosureText = new ArrayList<TextTranslation>();
        }
        return this.disclosureText;
    }

    /**
     * Gets the value of the receiveAgentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAgentName() {
        return receiveAgentName;
    }

    /**
     * Sets the value of the receiveAgentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAgentName(String value) {
        this.receiveAgentName = value;
    }

    /**
     * Gets the value of the receiveAgentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAddress }
     *     
     */
    public AgentAddress getReceiveAgentAddress() {
        return receiveAgentAddress;
    }

    /**
     * Sets the value of the receiveAgentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAddress }
     *     
     */
    public void setReceiveAgentAddress(AgentAddress value) {
        this.receiveAgentAddress = value;
    }

    /**
     * Gets the value of the additionalFieldsToCollect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFieldsToCollect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalFieldsToCollect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFieldInfo }
     * 
     * 
     */
    public List<ProductFieldInfo> getAdditionalFieldsToCollect() {
        if (additionalFieldsToCollect == null) {
            additionalFieldsToCollect = new ArrayList<ProductFieldInfo>();
        }
        return this.additionalFieldsToCollect;
    }

    /**
     * Gets the value of the sendAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link SendAmountInfo }
     *     
     */
    public SendAmountInfo getSendAmounts() {
        return sendAmounts;
    }

    /**
     * Sets the value of the sendAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendAmountInfo }
     *     
     */
    public void setSendAmounts(SendAmountInfo value) {
        this.sendAmounts = value;
    }

    /**
     * Gets the value of the receiveAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveAmountInfo }
     *     
     */
    public ReceiveAmountInfo getReceiveAmounts() {
        return receiveAmounts;
    }

    /**
     * Sets the value of the receiveAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveAmountInfo }
     *     
     */
    public void setReceiveAmounts(ReceiveAmountInfo value) {
        this.receiveAmounts = value;
    }

    /**
     * Gets the value of the exchangeRateApplied property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRateApplied() {
        return exchangeRateApplied;
    }

    /**
     * Sets the value of the exchangeRateApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRateApplied(BigDecimal value) {
        this.exchangeRateApplied = value;
    }

    /**
     * Gets the value of the receiveFeeDisclosureText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveFeeDisclosureText() {
        return receiveFeeDisclosureText;
    }

    /**
     * Sets the value of the receiveFeeDisclosureText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveFeeDisclosureText(Boolean value) {
        this.receiveFeeDisclosureText = value;
    }

    /**
     * Gets the value of the receiveTaxDisclosureText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveTaxDisclosureText() {
        return receiveTaxDisclosureText;
    }

    /**
     * Sets the value of the receiveTaxDisclosureText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveTaxDisclosureText(Boolean value) {
        this.receiveTaxDisclosureText = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

}
