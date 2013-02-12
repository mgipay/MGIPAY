/**
 * AgentConnect_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public interface AgentConnect_PortType extends java.rmi.Remote {
    public com.mgipaypal.ac1211.client.CommitTransactionResponse commitTransaction(com.mgipaypal.ac1211.client.CommitTransactionRequest commitTransactionRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.AmendTransactionResponse amendTransaction(com.mgipaypal.ac1211.client.AmendTransactionRequest amendTransactionRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.MoneyGramConsumerLookupResponse moneyGramConsumerLookup(com.mgipaypal.ac1211.client.MoneyGramConsumerLookupRequest moneyGramConsumerLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.BillPaymentConsumerLookupResponse billPaymentConsumerLookup(com.mgipaypal.ac1211.client.BillPaymentConsumerLookupRequest billPaymentConsumerLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.CheckInResponse checkIn(com.mgipaypal.ac1211.client.CheckInRequest checkInRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.CityListResponse cityList(com.mgipaypal.ac1211.client.CityListRequest cityListRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.CodeTableResponse codeTable(com.mgipaypal.ac1211.client.CodeTableRequest codeTableRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.StateProvinceInfoResponse stateProvinceInfo(com.mgipaypal.ac1211.client.StateProvinceInfoRequest stateProvinceInfoRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.CountryInfoResponse countryInfo(com.mgipaypal.ac1211.client.CountryInfoRequest countryInfoRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.CurrencyInfoResponse currencyInfo(com.mgipaypal.ac1211.client.CurrencyInfoRequest currencyInfoRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.ConfirmTokenResponse confirmToken(com.mgipaypal.ac1211.client.ConfirmTokenRequest confirmTokenRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.DetailLookupResponse detailLookup(com.mgipaypal.ac1211.client.DetailLookupRequest detailLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsResponse directedSendRegistrationFields(com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsRequest directedSendRegistrationFieldsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixResponse directoryOfAgentsByAreaCodePrefix(com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixRequest directoryOfAgentsByAreaCodePrefixRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityResponse directoryOfAgentsByCity(com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityRequest directoryOfAgentsByCityRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipResponse directoryOfAgentsByZip(com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipRequest directoryOfAgentsByZipRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.BillerSearchResponse billerSearch(com.mgipaypal.ac1211.client.BillerSearchRequest billerSearchRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.BillPaymentDetailReportResponse billPaymentDetailReport(com.mgipaypal.ac1211.client.BillPaymentDetailReportRequest billPaymentDetailReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.BillPaymentSummaryReportResponse billPaymentSummaryReport(com.mgipaypal.ac1211.client.BillPaymentSummaryReportRequest billPaymentSummaryReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.BpValidationResponse bpValidation(com.mgipaypal.ac1211.client.BpValidationRequest bpValidationRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.FeeLookupResponse feeLookup(com.mgipaypal.ac1211.client.FeeLookupRequest feeLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoResponse doddFrankStateRegulatorInfo(com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoRequest doddFrankStateRegulatorInfoRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.FormFreeBPLookupResponse formFreeBPLookup(com.mgipaypal.ac1211.client.FormFreeBPLookupRequest formFreeBPLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.FormFreeReceiveLookupResponse formFreeReceiveLookup(com.mgipaypal.ac1211.client.FormFreeReceiveLookupRequest formFreeReceiveLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.FormFreeSendLookupResponse formFreeSendLookup(com.mgipaypal.ac1211.client.FormFreeSendLookupRequest formFreeSendLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.FormFreeTranLookupResponse formFreeTranLookup(com.mgipaypal.ac1211.client.FormFreeTranLookupRequest formFreeTranLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.FormFreeTypeLookupResponse formFreeTypeLookup(com.mgipaypal.ac1211.client.FormFreeTypeLookupRequest formFreeTypeLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.GetFieldsForProductResponse getFieldsForProduct(com.mgipaypal.ac1211.client.GetFieldsForProductRequest getFieldsForProductRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.GetFieldsForRewardsResponse getFieldsForRewards(com.mgipaypal.ac1211.client.GetFieldsForRewardsRequest getFieldsForRewardsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.SaveRewardsResponse saveRewards(com.mgipaypal.ac1211.client.SaveRewardsRequest saveRewardsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.FQDOsForCountryResponse getFQDOsForCountry(com.mgipaypal.ac1211.client.FQDOsForCountryRequest FQDOsForCountryRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberResponse getFQDOByCustomerReceiveNumber(com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberRequest getFQDOByCustomerReceiveNumberRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.IndustryResponse industries(com.mgipaypal.ac1211.client.IndustryRequest industryRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.InitialSetupResponse initialSetup(com.mgipaypal.ac1211.client.InitialSetupRequest initialSetupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportResponse moneyGramReceiveDetailReport(com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportRequest moneyGramReceiveDetailReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.ReceiveValidationResponse receiveValidation(com.mgipaypal.ac1211.client.ReceiveValidationRequest receiveValidationRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportResponse moneyGramReceiveSummaryReport(com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportRequest moneyGramReceiveSummaryReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.SendValidationResponse sendValidation(com.mgipaypal.ac1211.client.SendValidationRequest sendValidationRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.MoneyGramSendDetailReportResponse moneyGramSendDetailReport(com.mgipaypal.ac1211.client.MoneyGramSendDetailReportRequest moneyGramSendDetailReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportResponse moneyGramSendSummaryReport(com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportRequest moneyGramSendSummaryReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.ProfileResponse profile(com.mgipaypal.ac1211.client.ProfileRequest profileRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.QueryRegistrationByNamesResponse queryRegistrationByNames(com.mgipaypal.ac1211.client.QueryRegistrationByNamesRequest queryRegistrationByNamesRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.ReceiveCountryRequirementsResponse receiveCountryRequirements(com.mgipaypal.ac1211.client.ReceiveCountryRequirementsRequest receiveCountryRequirementsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.GetRelatedProfilesResponse getRelatedProfiles(com.mgipaypal.ac1211.client.GetRelatedProfilesRequest getRelatedProfilesRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.ReceiveReversalResponse receiveReversal(com.mgipaypal.ac1211.client.ReceiveReversalRequest receiveReversalRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.ReferenceNumberNameResponse referenceNumberName(com.mgipaypal.ac1211.client.ReferenceNumberNameRequest referenceNumberNameRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.ReferenceNumberPhoneResponse referenceNumberPhone(com.mgipaypal.ac1211.client.ReferenceNumberPhoneRequest referenceNumberPhoneRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.ReferenceNumberResponse referenceNumber(com.mgipaypal.ac1211.client.ReferenceNumberRequest referenceNumberRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.SaveRegistrationResponse saveRegistration(com.mgipaypal.ac1211.client.SaveRegistrationRequest saveRegistrationRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.SendReversalResponse sendReversal(com.mgipaypal.ac1211.client.SendReversalRequest sendReversalRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.BillPaymentCancelResponse billPaymentCancel(com.mgipaypal.ac1211.client.BillPaymentCancelRequest billPaymentCancelRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
    public com.mgipaypal.ac1211.client.TranslationsResponse translations(com.mgipaypal.ac1211.client.TranslationsRequest translationsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error;
}
