package com.ac1211.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-02-18T19:16:49.005+05:30
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://www.moneygram.com/AgentConnect1211", name = "AgentConnect")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AgentConnect {

    @WebResult(name = "referenceNumberNameResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "referenceNumberNameResponse")
    @WebMethod(action = "urn:AgentConnect1211#referenceNumberName")
    public ReferenceNumberNameResponse referenceNumberName(
        @WebParam(partName = "referenceNumberNameRequest", name = "referenceNumberNameRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        ReferenceNumberNameRequest referenceNumberNameRequest
    ) throws Error_Exception;

    @WebResult(name = "currencyInfoResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "currencyInfoResponse")
    @WebMethod(action = "urn:AgentConnect1211#currencyInfo")
    public CurrencyInfoResponse currencyInfo(
        @WebParam(partName = "currencyInfoRequest", name = "currencyInfoRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        CurrencyInfoRequest currencyInfoRequest
    ) throws Error_Exception;

    @WebResult(name = "receiveValidationResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "receiveValidationResponse")
    @WebMethod(action = "urn:AgentConnect1211#receiveValidation")
    public ReceiveValidationResponse receiveValidation(
        @WebParam(partName = "receiveValidationRequest", name = "receiveValidationRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        ReceiveValidationRequest receiveValidationRequest
    ) throws Error_Exception;

    @WebResult(name = "getFQDOByCustomerReceiveNumberResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "getFQDOByCustomerReceiveNumberResponse")
    @WebMethod(action = "urn:AgentConnect1211#getFQDOByCustomerReceiveNumber")
    public GetFQDOByCustomerReceiveNumberResponse getFQDOByCustomerReceiveNumber(
        @WebParam(partName = "getFQDOByCustomerReceiveNumberRequest", name = "getFQDOByCustomerReceiveNumberRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        GetFQDOByCustomerReceiveNumberRequest getFQDOByCustomerReceiveNumberRequest
    ) throws Error_Exception;

    @WebResult(name = "directedSendRegistrationFieldsResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "directedSendRegistrationFieldsResponse")
    @WebMethod(action = "urn:AgentConnect1211#directedSendRegistrationFields")
    public DirectedSendRegistrationFieldsResponse directedSendRegistrationFields(
        @WebParam(partName = "directedSendRegistrationFieldsRequest", name = "directedSendRegistrationFieldsRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        DirectedSendRegistrationFieldsRequest directedSendRegistrationFieldsRequest
    ) throws Error_Exception;

    @WebResult(name = "amendTransactionResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "amendTransactionResponse")
    @WebMethod(action = "urn:AgentConnect1211#amendTransaction")
    public AmendTransactionResponse amendTransaction(
        @WebParam(partName = "amendTransactionRequest", name = "amendTransactionRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        AmendTransactionRequest amendTransactionRequest
    ) throws Error_Exception;

    @WebResult(name = "getFieldsForRewardsResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "getFieldsForRewardsResponse")
    @WebMethod(action = "urn:AgentConnect1211#getFieldsForRewards")
    public GetFieldsForRewardsResponse getFieldsForRewards(
        @WebParam(partName = "getFieldsForRewardsRequest", name = "getFieldsForRewardsRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        GetFieldsForRewardsRequest getFieldsForRewardsRequest
    ) throws Error_Exception;

    @WebResult(name = "formFreeReceiveLookupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "formFreeReceiveLookupResponse")
    @WebMethod(action = "urn:AgentConnect1211#formFreeReceiveLookup")
    public FormFreeReceiveLookupResponse formFreeReceiveLookup(
        @WebParam(partName = "formFreeReceiveLookupRequest", name = "formFreeReceiveLookupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        FormFreeReceiveLookupRequest formFreeReceiveLookupRequest
    ) throws Error_Exception;

    @WebResult(name = "receiveReversalResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "receiveReversalResponse")
    @WebMethod(action = "urn:AgentConnect1211#receiveReversal")
    public ReceiveReversalResponse receiveReversal(
        @WebParam(partName = "receiveReversalRequest", name = "receiveReversalRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        ReceiveReversalRequest receiveReversalRequest
    ) throws Error_Exception;

    @WebResult(name = "translationsResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "translationsResponse")
    @WebMethod(action = "urn:AgentConnect1211#translations")
    public TranslationsResponse translations(
        @WebParam(partName = "translationsRequest", name = "translationsRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        TranslationsRequest translationsRequest
    ) throws Error_Exception;

    @WebResult(name = "countryInfoResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "countryInfoResponse")
    @WebMethod(action = "urn:AgentConnect1211#countryInfo")
    public CountryInfoResponse countryInfo(
        @WebParam(partName = "countryInfoRequest", name = "countryInfoRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        CountryInfoRequest countryInfoRequest
    ) throws Error_Exception;

    @WebResult(name = "getRelatedProfilesResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "getRelatedProfilesResponse")
    @WebMethod(action = "urn:AgentConnect1211#getRelatedProfiles")
    public GetRelatedProfilesResponse getRelatedProfiles(
        @WebParam(partName = "getRelatedProfilesRequest", name = "getRelatedProfilesRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        GetRelatedProfilesRequest getRelatedProfilesRequest
    ) throws Error_Exception;

    @WebResult(name = "directoryOfAgentsByCityResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "directoryOfAgentsByCityResponse")
    @WebMethod(action = "urn:AgentConnect1211#directoryOfAgentsByCity")
    public DirectoryOfAgentsByCityResponse directoryOfAgentsByCity(
        @WebParam(partName = "directoryOfAgentsByCityRequest", name = "directoryOfAgentsByCityRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        DirectoryOfAgentsByCityRequest directoryOfAgentsByCityRequest
    ) throws Error_Exception;

    @WebResult(name = "initialSetupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "initialSetupResponse")
    @WebMethod(action = "urn:AgentConnect1211#initialSetup")
    public InitialSetupResponse initialSetup(
        @WebParam(partName = "initialSetupRequest", name = "initialSetupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        InitialSetupRequest initialSetupRequest
    ) throws Error_Exception;

    @WebResult(name = "sendValidationResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "sendValidationResponse")
    @WebMethod(action = "urn:AgentConnect1211#sendValidation")
    public SendValidationResponse sendValidation(
        @WebParam(partName = "sendValidationRequest", name = "sendValidationRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        SendValidationRequest sendValidationRequest
    ) throws Error_Exception;

    @WebResult(name = "getFieldsForProductResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "getFieldsForProductResponse")
    @WebMethod(action = "urn:AgentConnect1211#getFieldsForProduct")
    public GetFieldsForProductResponse getFieldsForProduct(
        @WebParam(partName = "getFieldsForProductRequest", name = "getFieldsForProductRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        GetFieldsForProductRequest getFieldsForProductRequest
    ) throws Error_Exception;

    @WebResult(name = "moneyGramSendDetailReportResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "moneyGramSendDetailReportResponse")
    @WebMethod(action = "urn:AgentConnect1211#moneyGramSendDetailReport")
    public MoneyGramSendDetailReportResponse moneyGramSendDetailReport(
        @WebParam(partName = "moneyGramSendDetailReportRequest", name = "moneyGramSendDetailReportRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        MoneyGramSendDetailReportRequest moneyGramSendDetailReportRequest
    ) throws Error_Exception;

    @WebResult(name = "billPaymentCancelResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "billPaymentCancelResponse")
    @WebMethod(action = "urn:AgentConnect1211#billPaymentCancel")
    public BillPaymentCancelResponse billPaymentCancel(
        @WebParam(partName = "billPaymentCancelRequest", name = "billPaymentCancelRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        BillPaymentCancelRequest billPaymentCancelRequest
    ) throws Error_Exception;

    @WebResult(name = "saveRewardsResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "saveRewardsResponse")
    @WebMethod(action = "urn:AgentConnect1211#saveRewards")
    public SaveRewardsResponse saveRewards(
        @WebParam(partName = "saveRewardsRequest", name = "saveRewardsRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        SaveRewardsRequest saveRewardsRequest
    ) throws Error_Exception;

    @WebResult(name = "directoryOfAgentsByAreaCodePrefixResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "directoryOfAgentsByAreaCodePrefixResponse")
    @WebMethod(action = "urn:AgentConnect1211#directoryOfAgentsByAreaCodePrefix")
    public DirectoryOfAgentsByAreaCodePrefixResponse directoryOfAgentsByAreaCodePrefix(
        @WebParam(partName = "directoryOfAgentsByAreaCodePrefixRequest", name = "directoryOfAgentsByAreaCodePrefixRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        DirectoryOfAgentsByAreaCodePrefixRequest directoryOfAgentsByAreaCodePrefixRequest
    ) throws Error_Exception;

    @WebResult(name = "receiveCountryRequirementsResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "receiveCountryRequirementsResponse")
    @WebMethod(action = "urn:AgentConnect1211#receiveCountryRequirements")
    public ReceiveCountryRequirementsResponse receiveCountryRequirements(
        @WebParam(partName = "receiveCountryRequirementsRequest", name = "receiveCountryRequirementsRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        ReceiveCountryRequirementsRequest receiveCountryRequirementsRequest
    ) throws Error_Exception;

    @WebResult(name = "formFreeTypeLookupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "formFreeTypeLookupResponse")
    @WebMethod(action = "urn:AgentConnect1211#formFreeTypeLookup")
    public FormFreeTypeLookupResponse formFreeTypeLookup(
        @WebParam(partName = "formFreeTypeLookupRequest", name = "formFreeTypeLookupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        FormFreeTypeLookupRequest formFreeTypeLookupRequest
    ) throws Error_Exception;

    @WebResult(name = "moneyGramReceiveSummaryReportResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "moneyGramReceiveSummaryReportResponse")
    @WebMethod(action = "urn:AgentConnect1211#moneyGramReceiveSummaryReport")
    public MoneyGramReceiveSummaryReportResponse moneyGramReceiveSummaryReport(
        @WebParam(partName = "moneyGramReceiveSummaryReportRequest", name = "moneyGramReceiveSummaryReportRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        MoneyGramReceiveSummaryReportRequest moneyGramReceiveSummaryReportRequest
    ) throws Error_Exception;

    @WebResult(name = "profileResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "profileResponse")
    @WebMethod(action = "urn:AgentConnect1211#profile")
    public ProfileResponse profile(
        @WebParam(partName = "profileRequest", name = "profileRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        ProfileRequest profileRequest
    ) throws Error_Exception;

    @WebResult(name = "codeTableResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "codeTableResponse")
    @WebMethod(action = "urn:AgentConnect1211#codeTable")
    public CodeTableResponse codeTable(
        @WebParam(partName = "codeTableRequest", name = "codeTableRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        CodeTableRequest codeTableRequest
    ) throws Error_Exception;

    @WebResult(name = "doddFrankStateRegulatorInfoResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "doddFrankStateRegulatorInfoResponse")
    @WebMethod(action = "urn:AgentConnect1211#doddFrankStateRegulatorInfo")
    public DoddFrankStateRegulatorInfoResponse doddFrankStateRegulatorInfo(
        @WebParam(partName = "doddFrankStateRegulatorInfoRequest", name = "doddFrankStateRegulatorInfoRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        DoddFrankStateRegulatorInfoRequest doddFrankStateRegulatorInfoRequest
    ) throws Error_Exception;

    @WebResult(name = "referenceNumberResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "referenceNumberResponse")
    @WebMethod(action = "urn:AgentConnect1211#referenceNumber")
    public ReferenceNumberResponse referenceNumber(
        @WebParam(partName = "referenceNumberRequest", name = "referenceNumberRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        ReferenceNumberRequest referenceNumberRequest
    ) throws Error_Exception;

    @WebResult(name = "formFreeBPLookupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "formFreeBPLookupResponse")
    @WebMethod(action = "urn:AgentConnect1211#formFreeBPLookup")
    public FormFreeBPLookupResponse formFreeBPLookup(
        @WebParam(partName = "formFreeBPLookupRequest", name = "formFreeBPLookupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        FormFreeBPLookupRequest formFreeBPLookupRequest
    ) throws Error_Exception;

    @WebResult(name = "industryResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "industryResponse")
    @WebMethod(action = "urn:AgentConnect1211#industries")
    public IndustryResponse industries(
        @WebParam(partName = "industryRequest", name = "industryRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        IndustryRequest industryRequest
    ) throws Error_Exception;

    @WebResult(name = "fQDOsForCountryResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "FQDOsForCountryResponse")
    @WebMethod(action = "urn:AgentConnect1211#getFQDOsForCountry")
    public FQDOsForCountryResponse getFQDOsForCountry(
        @WebParam(partName = "FQDOsForCountryRequest", name = "fQDOsForCountryRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        FQDOsForCountryRequest fqdOsForCountryRequest
    ) throws Error_Exception;

    @WebResult(name = "formFreeTranLookupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "formFreeTranLookupResponse")
    @WebMethod(action = "urn:AgentConnect1211#formFreeTranLookup")
    public FormFreeTranLookupResponse formFreeTranLookup(
        @WebParam(partName = "formFreeTranLookupRequest", name = "formFreeTranLookupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        FormFreeTranLookupRequest formFreeTranLookupRequest
    ) throws Error_Exception;

    @WebResult(name = "detailLookupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "detailLookupResponse")
    @WebMethod(action = "urn:AgentConnect1211#detailLookup")
    public DetailLookupResponse detailLookup(
        @WebParam(partName = "detailLookupRequest", name = "detailLookupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        DetailLookupRequest detailLookupRequest
    ) throws Error_Exception;

    @WebResult(name = "checkInResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "checkInResponse")
    @WebMethod(action = "urn:AgentConnect1211#checkIn")
    public CheckInResponse checkIn(
        @WebParam(partName = "checkInRequest", name = "checkInRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        CheckInRequest checkInRequest
    ) throws Error_Exception;

    @WebResult(name = "billerSearchResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "billerSearchResponse")
    @WebMethod(action = "urn:AgentConnect1211#billerSearch")
    public BillerSearchResponse billerSearch(
        @WebParam(partName = "billerSearchRequest", name = "billerSearchRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        BillerSearchRequest billerSearchRequest
    ) throws Error_Exception;

    @WebResult(name = "cityListResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "cityListResponse")
    @WebMethod(action = "urn:AgentConnect1211#cityList")
    public CityListResponse cityList(
        @WebParam(partName = "cityListRequest", name = "cityListRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        CityListRequest cityListRequest
    ) throws Error_Exception;

    @WebResult(name = "sendReversalResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "sendReversalResponse")
    @WebMethod(action = "urn:AgentConnect1211#sendReversal")
    public SendReversalResponse sendReversal(
        @WebParam(partName = "sendReversalRequest", name = "sendReversalRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        SendReversalRequest sendReversalRequest
    ) throws Error_Exception;

    @WebResult(name = "saveRegistrationResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "saveRegistrationResponse")
    @WebMethod(action = "urn:AgentConnect1211#saveRegistration")
    public SaveRegistrationResponse saveRegistration(
        @WebParam(partName = "saveRegistrationRequest", name = "saveRegistrationRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        SaveRegistrationRequest saveRegistrationRequest
    ) throws Error_Exception;

    @WebResult(name = "bpValidationResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "bpValidationResponse")
    @WebMethod(action = "urn:AgentConnect1211#bpValidation")
    public BpValidationResponse bpValidation(
        @WebParam(partName = "bpValidationRequest", name = "bpValidationRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        BpValidationRequest bpValidationRequest
    ) throws Error_Exception;

    @WebResult(name = "commitTransactionResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "commitTransactionResponse")
    @WebMethod(action = "urn:AgentConnect1211#commitTransaction")
    public CommitTransactionResponse commitTransaction(
        @WebParam(partName = "commitTransactionRequest", name = "commitTransactionRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        CommitTransactionRequest commitTransactionRequest
    ) throws Error_Exception;

    @WebResult(name = "confirmTokenResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "confirmTokenResponse")
    @WebMethod(action = "urn:AgentConnect1211#confirmToken")
    public ConfirmTokenResponse confirmToken(
        @WebParam(partName = "confirmTokenRequest", name = "confirmTokenRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        ConfirmTokenRequest confirmTokenRequest
    ) throws Error_Exception;

    @WebResult(name = "directoryOfAgentsByZipResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "directoryOfAgentsByZipResponse")
    @WebMethod(action = "urn:AgentConnect1211#directoryOfAgentsByZip")
    public DirectoryOfAgentsByZipResponse directoryOfAgentsByZip(
        @WebParam(partName = "directoryOfAgentsByZipRequest", name = "directoryOfAgentsByZipRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        DirectoryOfAgentsByZipRequest directoryOfAgentsByZipRequest
    ) throws Error_Exception;

    @WebResult(name = "billPaymentConsumerLookupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "billPaymentConsumerLookupResponse")
    @WebMethod(action = "urn:AgentConnect1211#billPaymentConsumerLookup")
    public BillPaymentConsumerLookupResponse billPaymentConsumerLookup(
        @WebParam(partName = "billPaymentConsumerLookupRequest", name = "billPaymentConsumerLookupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        BillPaymentConsumerLookupRequest billPaymentConsumerLookupRequest
    ) throws Error_Exception;

    @WebResult(name = "moneyGramReceiveDetailReportResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "moneyGramReceiveDetailReportResponse")
    @WebMethod(action = "urn:AgentConnect1211#moneyGramReceiveDetailReport")
    public MoneyGramReceiveDetailReportResponse moneyGramReceiveDetailReport(
        @WebParam(partName = "moneyGramReceiveDetailReportRequest", name = "moneyGramReceiveDetailReportRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        MoneyGramReceiveDetailReportRequest moneyGramReceiveDetailReportRequest
    ) throws Error_Exception;

    @WebResult(name = "formFreeSendLookupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "formFreeSendLookupResponse")
    @WebMethod(action = "urn:AgentConnect1211#formFreeSendLookup")
    public FormFreeSendLookupResponse formFreeSendLookup(
        @WebParam(partName = "formFreeSendLookupRequest", name = "formFreeSendLookupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        FormFreeSendLookupRequest formFreeSendLookupRequest
    ) throws Error_Exception;

    @WebResult(name = "referenceNumberPhoneResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "referenceNumberPhoneResponse")
    @WebMethod(action = "urn:AgentConnect1211#referenceNumberPhone")
    public ReferenceNumberPhoneResponse referenceNumberPhone(
        @WebParam(partName = "referenceNumberPhoneRequest", name = "referenceNumberPhoneRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        ReferenceNumberPhoneRequest referenceNumberPhoneRequest
    ) throws Error_Exception;

    @WebResult(name = "billPaymentSummaryReportResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "billPaymentSummaryReportResponse")
    @WebMethod(action = "urn:AgentConnect1211#billPaymentSummaryReport")
    public BillPaymentSummaryReportResponse billPaymentSummaryReport(
        @WebParam(partName = "billPaymentSummaryReportRequest", name = "billPaymentSummaryReportRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        BillPaymentSummaryReportRequest billPaymentSummaryReportRequest
    ) throws Error_Exception;

    @WebResult(name = "billPaymentDetailReportResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "billPaymentDetailReportResponse")
    @WebMethod(action = "urn:AgentConnect1211#billPaymentDetailReport")
    public BillPaymentDetailReportResponse billPaymentDetailReport(
        @WebParam(partName = "billPaymentDetailReportRequest", name = "billPaymentDetailReportRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        BillPaymentDetailReportRequest billPaymentDetailReportRequest
    ) throws Error_Exception;

    @WebResult(name = "stateProvinceInfoResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "stateProvinceInfoResponse")
    @WebMethod(action = "urn:AgentConnect1211#stateProvinceInfo")
    public StateProvinceInfoResponse stateProvinceInfo(
        @WebParam(partName = "stateProvinceInfoRequest", name = "stateProvinceInfoRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        StateProvinceInfoRequest stateProvinceInfoRequest
    ) throws Error_Exception;

    @WebResult(name = "moneyGramSendSummaryReportResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "moneyGramSendSummaryReportResponse")
    @WebMethod(action = "urn:AgentConnect1211#moneyGramSendSummaryReport")
    public MoneyGramSendSummaryReportResponse moneyGramSendSummaryReport(
        @WebParam(partName = "moneyGramSendSummaryReportRequest", name = "moneyGramSendSummaryReportRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        MoneyGramSendSummaryReportRequest moneyGramSendSummaryReportRequest
    ) throws Error_Exception;

    @WebResult(name = "feeLookupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "feeLookupResponse")
    @WebMethod(action = "urn:AgentConnect1211#feeLookup")
    public FeeLookupResponse feeLookup(
        @WebParam(partName = "feeLookupRequest", name = "feeLookupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        FeeLookupRequest feeLookupRequest
    ) throws Error_Exception;

    @WebResult(name = "queryRegistrationByNamesResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "queryRegistrationByNamesResponse")
    @WebMethod(action = "urn:AgentConnect1211#queryRegistrationByNames")
    public QueryRegistrationByNamesResponse queryRegistrationByNames(
        @WebParam(partName = "queryRegistrationByNamesRequest", name = "queryRegistrationByNamesRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        QueryRegistrationByNamesRequest queryRegistrationByNamesRequest
    ) throws Error_Exception;

    @WebResult(name = "moneyGramConsumerLookupResponse", targetNamespace = "http://www.moneygram.com/AgentConnect1211", partName = "moneyGramConsumerLookupResponse")
    @WebMethod(action = "urn:AgentConnect1211#moneyGramConsumerLookup")
    public MoneyGramConsumerLookupResponse moneyGramConsumerLookup(
        @WebParam(partName = "moneyGramConsumerLookupRequest", name = "moneyGramConsumerLookupRequest", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
        MoneyGramConsumerLookupRequest moneyGramConsumerLookupRequest
    ) throws Error_Exception;
}