
package com.sdk.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sdk.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LookupXmlGridResponse_QNAME = new QName("uri:grid.ws.sdk.edialog.com", "lookupXmlGridResponse");
    private final static QName _LookupLinkByEncodedURLResponse_QNAME = new QName("uri:urlmanagement.ws.sdk.edialog.com", "lookupLinkByEncodedURLResponse");
    private final static QName _LookupLinkByIdResponse_QNAME = new QName("uri:urlmanagement.ws.sdk.edialog.com", "lookupLinkByIdResponse");
    private final static QName _GetExportJobStatusResponse_QNAME = new QName("uri:exporter.ws.sdk.edialog.com", "getExportJobStatusResponse");
    private final static QName _LookupTabSeparatedGridResponse_QNAME = new QName("uri:grid.ws.sdk.edialog.com", "lookupTabSeparatedGridResponse");
    private final static QName _LookupIBQueryByIdResponse_QNAME = new QName("uri:insightbuilder.ws.sdk.edialog.com", "lookupIBQueryByIdResponse");
    private final static QName _DeleteAllRTMVariationsResponse_QNAME = new QName("uri:realtimemessagingconfiguration.ws.sdk.edialog.com", "deleteAllRTMVariationsResponse");
    private final static QName _UpdateRTMVariationsResponse_QNAME = new QName("uri:realtimemessagingconfiguration.ws.sdk.edialog.com", "updateRTMVariationsResponse");
    private final static QName _LookupGridResponse_QNAME = new QName("uri:grid.ws.sdk.edialog.com", "lookupGridResponse");
    private final static QName _LookupRTMConfigurationResponse_QNAME = new QName("uri:realtimemessagingconfiguration.ws.sdk.edialog.com", "lookupRTMConfigurationResponse");
    private final static QName _SetCellUnsubRulesUnsubAudience_QNAME = new QName("uri:cell.ws.sdk.edialog.com", "unsubAudience");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sdk.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LookupAudienceByIdResponse }
     * 
     */
    public LookupAudienceByIdResponse createLookupAudienceByIdResponse() {
        return new LookupAudienceByIdResponse();
    }

    /**
     * Create an instance of {@link AudienceDetailType }
     * 
     */
    public AudienceDetailType createAudienceDetailType() {
        return new AudienceDetailType();
    }

    /**
     * Create an instance of {@link LookupAudienceByIds }
     * 
     */
    public LookupAudienceByIds createLookupAudienceByIds() {
        return new LookupAudienceByIds();
    }

    /**
     * Create an instance of {@link LookupAudienceByAlternateKeyResponse }
     * 
     */
    public LookupAudienceByAlternateKeyResponse createLookupAudienceByAlternateKeyResponse() {
        return new LookupAudienceByAlternateKeyResponse();
    }

    /**
     * Create an instance of {@link LookupAudienceByAlternateKey }
     * 
     */
    public LookupAudienceByAlternateKey createLookupAudienceByAlternateKey() {
        return new LookupAudienceByAlternateKey();
    }

    /**
     * Create an instance of {@link ListAudiencesByFilterResponse }
     * 
     */
    public ListAudiencesByFilterResponse createListAudiencesByFilterResponse() {
        return new ListAudiencesByFilterResponse();
    }

    /**
     * Create an instance of {@link AudienceListWithStatusType }
     * 
     */
    public AudienceListWithStatusType createAudienceListWithStatusType() {
        return new AudienceListWithStatusType();
    }

    /**
     * Create an instance of {@link UpdateAudience }
     * 
     */
    public UpdateAudience createUpdateAudience() {
        return new UpdateAudience();
    }

    /**
     * Create an instance of {@link GetMemberCountResponse }
     * 
     */
    public GetMemberCountResponse createGetMemberCountResponse() {
        return new GetMemberCountResponse();
    }

    /**
     * Create an instance of {@link GetMemberCount }
     * 
     */
    public GetMemberCount createGetMemberCount() {
        return new GetMemberCount();
    }

    /**
     * Create an instance of {@link DeleteAudienceResponse }
     * 
     */
    public DeleteAudienceResponse createDeleteAudienceResponse() {
        return new DeleteAudienceResponse();
    }

    /**
     * Create an instance of {@link UpdateAudienceResponse }
     * 
     */
    public UpdateAudienceResponse createUpdateAudienceResponse() {
        return new UpdateAudienceResponse();
    }

    /**
     * Create an instance of {@link ListAudiences }
     * 
     */
    public ListAudiences createListAudiences() {
        return new ListAudiences();
    }

    /**
     * Create an instance of {@link ListAudienceClasses }
     * 
     */
    public ListAudienceClasses createListAudienceClasses() {
        return new ListAudienceClasses();
    }

    /**
     * Create an instance of {@link CloneAudience }
     * 
     */
    public CloneAudience createCloneAudience() {
        return new CloneAudience();
    }

    /**
     * Create an instance of {@link ListAudiencesResponse }
     * 
     */
    public ListAudiencesResponse createListAudiencesResponse() {
        return new ListAudiencesResponse();
    }

    /**
     * Create an instance of {@link AudienceListType }
     * 
     */
    public AudienceListType createAudienceListType() {
        return new AudienceListType();
    }

    /**
     * Create an instance of {@link DeleteAudience }
     * 
     */
    public DeleteAudience createDeleteAudience() {
        return new DeleteAudience();
    }

    /**
     * Create an instance of {@link CloneAudienceResponse }
     * 
     */
    public CloneAudienceResponse createCloneAudienceResponse() {
        return new CloneAudienceResponse();
    }

    /**
     * Create an instance of {@link CreateAudience }
     * 
     */
    public CreateAudience createCreateAudience() {
        return new CreateAudience();
    }

    /**
     * Create an instance of {@link ListAudienceClassesResponse }
     * 
     */
    public ListAudienceClassesResponse createListAudienceClassesResponse() {
        return new ListAudienceClassesResponse();
    }

    /**
     * Create an instance of {@link AudienceClassType }
     * 
     */
    public AudienceClassType createAudienceClassType() {
        return new AudienceClassType();
    }

    /**
     * Create an instance of {@link LookupAudienceById }
     * 
     */
    public LookupAudienceById createLookupAudienceById() {
        return new LookupAudienceById();
    }

    /**
     * Create an instance of {@link LookupAudienceByIdsResponse }
     * 
     */
    public LookupAudienceByIdsResponse createLookupAudienceByIdsResponse() {
        return new LookupAudienceByIdsResponse();
    }

    /**
     * Create an instance of {@link CreateAudienceResponse }
     * 
     */
    public CreateAudienceResponse createCreateAudienceResponse() {
        return new CreateAudienceResponse();
    }

    /**
     * Create an instance of {@link ListAudiencesByFilter }
     * 
     */
    public ListAudiencesByFilter createListAudiencesByFilter() {
        return new ListAudiencesByFilter();
    }

    /**
     * Create an instance of {@link AudienceOverviewWithStatusType }
     * 
     */
    public AudienceOverviewWithStatusType createAudienceOverviewWithStatusType() {
        return new AudienceOverviewWithStatusType();
    }

    /**
     * Create an instance of {@link AudienceOverviewType }
     * 
     */
    public AudienceOverviewType createAudienceOverviewType() {
        return new AudienceOverviewType();
    }

    /**
     * Create an instance of {@link DateRangeReportResponseType }
     * 
     */
    public DateRangeReportResponseType createDateRangeReportResponseType() {
        return new DateRangeReportResponseType();
    }

    /**
     * Create an instance of {@link RecordType }
     * 
     */
    public RecordType createRecordType() {
        return new RecordType();
    }

    /**
     * Create an instance of {@link UDFFilterType }
     * 
     */
    public UDFFilterType createUDFFilterType() {
        return new UDFFilterType();
    }

    /**
     * Create an instance of {@link DimensionType }
     * 
     */
    public DimensionType createDimensionType() {
        return new DimensionType();
    }

    /**
     * Create an instance of {@link DateRangeReportRequestType }
     * 
     */
    public DateRangeReportRequestType createDateRangeReportRequestType() {
        return new DateRangeReportRequestType();
    }

    /**
     * Create an instance of {@link CreateCampaignResponse }
     * 
     */
    public CreateCampaignResponse createCreateCampaignResponse() {
        return new CreateCampaignResponse();
    }

    /**
     * Create an instance of {@link UpdateCampaign }
     * 
     */
    public UpdateCampaign createUpdateCampaign() {
        return new UpdateCampaign();
    }

    /**
     * Create an instance of {@link UpdateCampaignResponse }
     * 
     */
    public UpdateCampaignResponse createUpdateCampaignResponse() {
        return new UpdateCampaignResponse();
    }

    /**
     * Create an instance of {@link ListCampaigns }
     * 
     */
    public ListCampaigns createListCampaigns() {
        return new ListCampaigns();
    }

    /**
     * Create an instance of {@link DeleteCampaignResponse }
     * 
     */
    public DeleteCampaignResponse createDeleteCampaignResponse() {
        return new DeleteCampaignResponse();
    }

    /**
     * Create an instance of {@link ListCampaignsResponse }
     * 
     */
    public ListCampaignsResponse createListCampaignsResponse() {
        return new ListCampaignsResponse();
    }

    /**
     * Create an instance of {@link CampaignListType }
     * 
     */
    public CampaignListType createCampaignListType() {
        return new CampaignListType();
    }

    /**
     * Create an instance of {@link DeleteCampaign }
     * 
     */
    public DeleteCampaign createDeleteCampaign() {
        return new DeleteCampaign();
    }

    /**
     * Create an instance of {@link CreateCampaign }
     * 
     */
    public CreateCampaign createCreateCampaign() {
        return new CreateCampaign();
    }

    /**
     * Create an instance of {@link LookupCampaignByIdResponse }
     * 
     */
    public LookupCampaignByIdResponse createLookupCampaignByIdResponse() {
        return new LookupCampaignByIdResponse();
    }

    /**
     * Create an instance of {@link CampaignDetailType }
     * 
     */
    public CampaignDetailType createCampaignDetailType() {
        return new CampaignDetailType();
    }

    /**
     * Create an instance of {@link LookupCampaignById }
     * 
     */
    public LookupCampaignById createLookupCampaignById() {
        return new LookupCampaignById();
    }

    /**
     * Create an instance of {@link CampaignOverviewType }
     * 
     */
    public CampaignOverviewType createCampaignOverviewType() {
        return new CampaignOverviewType();
    }

    /**
     * Create an instance of {@link DownloadAudience }
     * 
     */
    public DownloadAudience createDownloadAudience() {
        return new DownloadAudience();
    }

    /**
     * Create an instance of {@link OptionType }
     * 
     */
    public OptionType createOptionType() {
        return new OptionType();
    }

    /**
     * Create an instance of {@link DownloadAudienceResponse }
     * 
     */
    public DownloadAudienceResponse createDownloadAudienceResponse() {
        return new DownloadAudienceResponse();
    }

    /**
     * Create an instance of {@link ListSymbolsInContentResponse }
     * 
     */
    public ListSymbolsInContentResponse createListSymbolsInContentResponse() {
        return new ListSymbolsInContentResponse();
    }

    /**
     * Create an instance of {@link ListContentResponse }
     * 
     */
    public ListContentResponse createListContentResponse() {
        return new ListContentResponse();
    }

    /**
     * Create an instance of {@link ContentListType }
     * 
     */
    public ContentListType createContentListType() {
        return new ContentListType();
    }

    /**
     * Create an instance of {@link ListContentAlt }
     * 
     */
    public ListContentAlt createListContentAlt() {
        return new ListContentAlt();
    }

    /**
     * Create an instance of {@link ListSymbolsInContent }
     * 
     */
    public ListSymbolsInContent createListSymbolsInContent() {
        return new ListSymbolsInContent();
    }

    /**
     * Create an instance of {@link HideContentResponse }
     * 
     */
    public HideContentResponse createHideContentResponse() {
        return new HideContentResponse();
    }

    /**
     * Create an instance of {@link WrapUrlsInTextResponse }
     * 
     */
    public WrapUrlsInTextResponse createWrapUrlsInTextResponse() {
        return new WrapUrlsInTextResponse();
    }

    /**
     * Create an instance of {@link UpdateContentDeliveryPartResponse }
     * 
     */
    public UpdateContentDeliveryPartResponse createUpdateContentDeliveryPartResponse() {
        return new UpdateContentDeliveryPartResponse();
    }

    /**
     * Create an instance of {@link LookupContentByAlternateKeyResponse }
     * 
     */
    public LookupContentByAlternateKeyResponse createLookupContentByAlternateKeyResponse() {
        return new LookupContentByAlternateKeyResponse();
    }

    /**
     * Create an instance of {@link ContentItemType }
     * 
     */
    public ContentItemType createContentItemType() {
        return new ContentItemType();
    }

    /**
     * Create an instance of {@link HideContent }
     * 
     */
    public HideContent createHideContent() {
        return new HideContent();
    }

    /**
     * Create an instance of {@link CreateContentResponse }
     * 
     */
    public CreateContentResponse createCreateContentResponse() {
        return new CreateContentResponse();
    }

    /**
     * Create an instance of {@link DeleteContent }
     * 
     */
    public DeleteContent createDeleteContent() {
        return new DeleteContent();
    }

    /**
     * Create an instance of {@link UpdateContent }
     * 
     */
    public UpdateContent createUpdateContent() {
        return new UpdateContent();
    }

    /**
     * Create an instance of {@link LookupContentDeliveryPart }
     * 
     */
    public LookupContentDeliveryPart createLookupContentDeliveryPart() {
        return new LookupContentDeliveryPart();
    }

    /**
     * Create an instance of {@link ListContentAltResponse }
     * 
     */
    public ListContentAltResponse createListContentAltResponse() {
        return new ListContentAltResponse();
    }

    /**
     * Create an instance of {@link ContentListItemAltType }
     * 
     */
    public ContentListItemAltType createContentListItemAltType() {
        return new ContentListItemAltType();
    }

    /**
     * Create an instance of {@link UpdateContentDeliveryPart }
     * 
     */
    public UpdateContentDeliveryPart createUpdateContentDeliveryPart() {
        return new UpdateContentDeliveryPart();
    }

    /**
     * Create an instance of {@link ListSymbolsInTextResponse }
     * 
     */
    public ListSymbolsInTextResponse createListSymbolsInTextResponse() {
        return new ListSymbolsInTextResponse();
    }

    /**
     * Create an instance of {@link UnhideContentResponse }
     * 
     */
    public UnhideContentResponse createUnhideContentResponse() {
        return new UnhideContentResponse();
    }

    /**
     * Create an instance of {@link UpdateContentResponse }
     * 
     */
    public UpdateContentResponse createUpdateContentResponse() {
        return new UpdateContentResponse();
    }

    /**
     * Create an instance of {@link CreateContent }
     * 
     */
    public CreateContent createCreateContent() {
        return new CreateContent();
    }

    /**
     * Create an instance of {@link LookupContentByIdResponse }
     * 
     */
    public LookupContentByIdResponse createLookupContentByIdResponse() {
        return new LookupContentByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteContentResponse }
     * 
     */
    public DeleteContentResponse createDeleteContentResponse() {
        return new DeleteContentResponse();
    }

    /**
     * Create an instance of {@link ListSymbolsInText }
     * 
     */
    public ListSymbolsInText createListSymbolsInText() {
        return new ListSymbolsInText();
    }

    /**
     * Create an instance of {@link LookupContentDeliveryPartResponse }
     * 
     */
    public LookupContentDeliveryPartResponse createLookupContentDeliveryPartResponse() {
        return new LookupContentDeliveryPartResponse();
    }

    /**
     * Create an instance of {@link LookupContentByAlternateKey }
     * 
     */
    public LookupContentByAlternateKey createLookupContentByAlternateKey() {
        return new LookupContentByAlternateKey();
    }

    /**
     * Create an instance of {@link WrapUrlsInText }
     * 
     */
    public WrapUrlsInText createWrapUrlsInText() {
        return new WrapUrlsInText();
    }

    /**
     * Create an instance of {@link LookupContentById }
     * 
     */
    public LookupContentById createLookupContentById() {
        return new LookupContentById();
    }

    /**
     * Create an instance of {@link UnhideContent }
     * 
     */
    public UnhideContent createUnhideContent() {
        return new UnhideContent();
    }

    /**
     * Create an instance of {@link ListContent }
     * 
     */
    public ListContent createListContent() {
        return new ListContent();
    }

    /**
     * Create an instance of {@link ContentItemAltType }
     * 
     */
    public ContentItemAltType createContentItemAltType() {
        return new ContentItemAltType();
    }

    /**
     * Create an instance of {@link SetCellProofAddressesResponse }
     * 
     */
    public SetCellProofAddressesResponse createSetCellProofAddressesResponse() {
        return new SetCellProofAddressesResponse();
    }

    /**
     * Create an instance of {@link UpdateCellWebAnalytics }
     * 
     */
    public UpdateCellWebAnalytics createUpdateCellWebAnalytics() {
        return new UpdateCellWebAnalytics();
    }

    /**
     * Create an instance of {@link ListCellsByFilter }
     * 
     */
    public ListCellsByFilter createListCellsByFilter() {
        return new ListCellsByFilter();
    }

    /**
     * Create an instance of {@link ListFeederQueues }
     * 
     */
    public ListFeederQueues createListFeederQueues() {
        return new ListFeederQueues();
    }

    /**
     * Create an instance of {@link UpdateCellMetering }
     * 
     */
    public UpdateCellMetering createUpdateCellMetering() {
        return new UpdateCellMetering();
    }

    /**
     * Create an instance of {@link LookupCellByAlternateKeyResponse }
     * 
     */
    public LookupCellByAlternateKeyResponse createLookupCellByAlternateKeyResponse() {
        return new LookupCellByAlternateKeyResponse();
    }

    /**
     * Create an instance of {@link CellDetailType }
     * 
     */
    public CellDetailType createCellDetailType() {
        return new CellDetailType();
    }

    /**
     * Create an instance of {@link UpdateCellFeederQueueResponse }
     * 
     */
    public UpdateCellFeederQueueResponse createUpdateCellFeederQueueResponse() {
        return new UpdateCellFeederQueueResponse();
    }

    /**
     * Create an instance of {@link CloneCell }
     * 
     */
    public CloneCell createCloneCell() {
        return new CloneCell();
    }

    /**
     * Create an instance of {@link UpdateCellDropDateResponse }
     * 
     */
    public UpdateCellDropDateResponse createUpdateCellDropDateResponse() {
        return new UpdateCellDropDateResponse();
    }

    /**
     * Create an instance of {@link LookupCellAdvancedOptionsByIdResponse }
     * 
     */
    public LookupCellAdvancedOptionsByIdResponse createLookupCellAdvancedOptionsByIdResponse() {
        return new LookupCellAdvancedOptionsByIdResponse();
    }

    /**
     * Create an instance of {@link CellAdvancedDetailType }
     * 
     */
    public CellAdvancedDetailType createCellAdvancedDetailType() {
        return new CellAdvancedDetailType();
    }

    /**
     * Create an instance of {@link GetGoodMailHeaderResponse }
     * 
     */
    public GetGoodMailHeaderResponse createGetGoodMailHeaderResponse() {
        return new GetGoodMailHeaderResponse();
    }

    /**
     * Create an instance of {@link ListUnsubTemplatesResponse }
     * 
     */
    public ListUnsubTemplatesResponse createListUnsubTemplatesResponse() {
        return new ListUnsubTemplatesResponse();
    }

    /**
     * Create an instance of {@link UnsubTemplateType }
     * 
     */
    public UnsubTemplateType createUnsubTemplateType() {
        return new UnsubTemplateType();
    }

    /**
     * Create an instance of {@link LookupCellAdvancedOptionsById }
     * 
     */
    public LookupCellAdvancedOptionsById createLookupCellAdvancedOptionsById() {
        return new LookupCellAdvancedOptionsById();
    }

    /**
     * Create an instance of {@link ListCellsResponse }
     * 
     */
    public ListCellsResponse createListCellsResponse() {
        return new ListCellsResponse();
    }

    /**
     * Create an instance of {@link CellListType }
     * 
     */
    public CellListType createCellListType() {
        return new CellListType();
    }

    /**
     * Create an instance of {@link UpdateCellAdvancedOptions }
     * 
     */
    public UpdateCellAdvancedOptions createUpdateCellAdvancedOptions() {
        return new UpdateCellAdvancedOptions();
    }

    /**
     * Create an instance of {@link SetCellUnsubRules }
     * 
     */
    public SetCellUnsubRules createSetCellUnsubRules() {
        return new SetCellUnsubRules();
    }

    /**
     * Create an instance of {@link SetCellProofAddresses }
     * 
     */
    public SetCellProofAddresses createSetCellProofAddresses() {
        return new SetCellProofAddresses();
    }

    /**
     * Create an instance of {@link LookupCellByAlternateKey }
     * 
     */
    public LookupCellByAlternateKey createLookupCellByAlternateKey() {
        return new LookupCellByAlternateKey();
    }

    /**
     * Create an instance of {@link DeleteCell }
     * 
     */
    public DeleteCell createDeleteCell() {
        return new DeleteCell();
    }

    /**
     * Create an instance of {@link ListAvailableMetersResponse }
     * 
     */
    public ListAvailableMetersResponse createListAvailableMetersResponse() {
        return new ListAvailableMetersResponse();
    }

    /**
     * Create an instance of {@link CloneCellResponse }
     * 
     */
    public CloneCellResponse createCloneCellResponse() {
        return new CloneCellResponse();
    }

    /**
     * Create an instance of {@link UpdateCellHeadersResponse }
     * 
     */
    public UpdateCellHeadersResponse createUpdateCellHeadersResponse() {
        return new UpdateCellHeadersResponse();
    }

    /**
     * Create an instance of {@link UpdateCellHeaders }
     * 
     */
    public UpdateCellHeaders createUpdateCellHeaders() {
        return new UpdateCellHeaders();
    }

    /**
     * Create an instance of {@link ListDomainsResponse }
     * 
     */
    public ListDomainsResponse createListDomainsResponse() {
        return new ListDomainsResponse();
    }

    /**
     * Create an instance of {@link UpdateCellResponse }
     * 
     */
    public UpdateCellResponse createUpdateCellResponse() {
        return new UpdateCellResponse();
    }

    /**
     * Create an instance of {@link ListCells }
     * 
     */
    public ListCells createListCells() {
        return new ListCells();
    }

    /**
     * Create an instance of {@link UpdateCell }
     * 
     */
    public UpdateCell createUpdateCell() {
        return new UpdateCell();
    }

    /**
     * Create an instance of {@link GetGoodMailHeader }
     * 
     */
    public GetGoodMailHeader createGetGoodMailHeader() {
        return new GetGoodMailHeader();
    }

    /**
     * Create an instance of {@link ListWebAnalyticsTokens }
     * 
     */
    public ListWebAnalyticsTokens createListWebAnalyticsTokens() {
        return new ListWebAnalyticsTokens();
    }

    /**
     * Create an instance of {@link UpdateCellConversionTrackingResponse }
     * 
     */
    public UpdateCellConversionTrackingResponse createUpdateCellConversionTrackingResponse() {
        return new UpdateCellConversionTrackingResponse();
    }

    /**
     * Create an instance of {@link SetCellUnsubRulesResponse }
     * 
     */
    public SetCellUnsubRulesResponse createSetCellUnsubRulesResponse() {
        return new SetCellUnsubRulesResponse();
    }

    /**
     * Create an instance of {@link CreateCellResponse }
     * 
     */
    public CreateCellResponse createCreateCellResponse() {
        return new CreateCellResponse();
    }

    /**
     * Create an instance of {@link LookupCellByIdResponse }
     * 
     */
    public LookupCellByIdResponse createLookupCellByIdResponse() {
        return new LookupCellByIdResponse();
    }

    /**
     * Create an instance of {@link CreateCell }
     * 
     */
    public CreateCell createCreateCell() {
        return new CreateCell();
    }

    /**
     * Create an instance of {@link LookupCellById }
     * 
     */
    public LookupCellById createLookupCellById() {
        return new LookupCellById();
    }

    /**
     * Create an instance of {@link ListUnsubTemplates }
     * 
     */
    public ListUnsubTemplates createListUnsubTemplates() {
        return new ListUnsubTemplates();
    }

    /**
     * Create an instance of {@link ListAvailableMeters }
     * 
     */
    public ListAvailableMeters createListAvailableMeters() {
        return new ListAvailableMeters();
    }

    /**
     * Create an instance of {@link ListForwardToFriendTemplates }
     * 
     */
    public ListForwardToFriendTemplates createListForwardToFriendTemplates() {
        return new ListForwardToFriendTemplates();
    }

    /**
     * Create an instance of {@link ListForwardToFriendTemplatesResponse }
     * 
     */
    public ListForwardToFriendTemplatesResponse createListForwardToFriendTemplatesResponse() {
        return new ListForwardToFriendTemplatesResponse();
    }

    /**
     * Create an instance of {@link UpdateCellWebAnalyticsResponse }
     * 
     */
    public UpdateCellWebAnalyticsResponse createUpdateCellWebAnalyticsResponse() {
        return new UpdateCellWebAnalyticsResponse();
    }

    /**
     * Create an instance of {@link ListDomains }
     * 
     */
    public ListDomains createListDomains() {
        return new ListDomains();
    }

    /**
     * Create an instance of {@link UpdateCellDropDate }
     * 
     */
    public UpdateCellDropDate createUpdateCellDropDate() {
        return new UpdateCellDropDate();
    }

    /**
     * Create an instance of {@link ListCellsByFilterResponse }
     * 
     */
    public ListCellsByFilterResponse createListCellsByFilterResponse() {
        return new ListCellsByFilterResponse();
    }

    /**
     * Create an instance of {@link CellOverviewType }
     * 
     */
    public CellOverviewType createCellOverviewType() {
        return new CellOverviewType();
    }

    /**
     * Create an instance of {@link UpdateCellMeteringResponse }
     * 
     */
    public UpdateCellMeteringResponse createUpdateCellMeteringResponse() {
        return new UpdateCellMeteringResponse();
    }

    /**
     * Create an instance of {@link SetCellAudiencesResponse }
     * 
     */
    public SetCellAudiencesResponse createSetCellAudiencesResponse() {
        return new SetCellAudiencesResponse();
    }

    /**
     * Create an instance of {@link ListFeederQueuesResponse }
     * 
     */
    public ListFeederQueuesResponse createListFeederQueuesResponse() {
        return new ListFeederQueuesResponse();
    }

    /**
     * Create an instance of {@link UpdateCellConversionTracking }
     * 
     */
    public UpdateCellConversionTracking createUpdateCellConversionTracking() {
        return new UpdateCellConversionTracking();
    }

    /**
     * Create an instance of {@link DeleteCellResponse }
     * 
     */
    public DeleteCellResponse createDeleteCellResponse() {
        return new DeleteCellResponse();
    }

    /**
     * Create an instance of {@link ListWebAnalyticsTokensResponse }
     * 
     */
    public ListWebAnalyticsTokensResponse createListWebAnalyticsTokensResponse() {
        return new ListWebAnalyticsTokensResponse();
    }

    /**
     * Create an instance of {@link WebAnalyticsTokenType }
     * 
     */
    public WebAnalyticsTokenType createWebAnalyticsTokenType() {
        return new WebAnalyticsTokenType();
    }

    /**
     * Create an instance of {@link SetCellAudiences }
     * 
     */
    public SetCellAudiences createSetCellAudiences() {
        return new SetCellAudiences();
    }

    /**
     * Create an instance of {@link GetCellContentId }
     * 
     */
    public GetCellContentId createGetCellContentId() {
        return new GetCellContentId();
    }

    /**
     * Create an instance of {@link UpdateCellFeederQueue }
     * 
     */
    public UpdateCellFeederQueue createUpdateCellFeederQueue() {
        return new UpdateCellFeederQueue();
    }

    /**
     * Create an instance of {@link GetCellContentIdResponse }
     * 
     */
    public GetCellContentIdResponse createGetCellContentIdResponse() {
        return new GetCellContentIdResponse();
    }

    /**
     * Create an instance of {@link UpdateCellAdvancedOptionsResponse }
     * 
     */
    public UpdateCellAdvancedOptionsResponse createUpdateCellAdvancedOptionsResponse() {
        return new UpdateCellAdvancedOptionsResponse();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link UpdateRecipientProfileResponse }
     * 
     */
    public UpdateRecipientProfileResponse createUpdateRecipientProfileResponse() {
        return new UpdateRecipientProfileResponse();
    }

    /**
     * Create an instance of {@link SendProofMessageResponse }
     * 
     */
    public SendProofMessageResponse createSendProofMessageResponse() {
        return new SendProofMessageResponse();
    }

    /**
     * Create an instance of {@link UpdateRecipientProfile }
     * 
     */
    public UpdateRecipientProfile createUpdateRecipientProfile() {
        return new UpdateRecipientProfile();
    }

    /**
     * Create an instance of {@link AudienceMembershipType }
     * 
     */
    public AudienceMembershipType createAudienceMembershipType() {
        return new AudienceMembershipType();
    }

    /**
     * Create an instance of {@link ListRealTimeMessageConfigurations }
     * 
     */
    public ListRealTimeMessageConfigurations createListRealTimeMessageConfigurations() {
        return new ListRealTimeMessageConfigurations();
    }

    /**
     * Create an instance of {@link SendProofMessage }
     * 
     */
    public SendProofMessage createSendProofMessage() {
        return new SendProofMessage();
    }

    /**
     * Create an instance of {@link ListRealTimeMessageConfigurationsResponse }
     * 
     */
    public ListRealTimeMessageConfigurationsResponse createListRealTimeMessageConfigurationsResponse() {
        return new ListRealTimeMessageConfigurationsResponse();
    }

    /**
     * Create an instance of {@link RtmListType }
     * 
     */
    public RtmListType createRtmListType() {
        return new RtmListType();
    }

    /**
     * Create an instance of {@link RowType }
     * 
     */
    public RowType createRowType() {
        return new RowType();
    }

    /**
     * Create an instance of {@link RealTimeMessagingType }
     * 
     */
    public RealTimeMessagingType createRealTimeMessagingType() {
        return new RealTimeMessagingType();
    }

    /**
     * Create an instance of {@link ListRTMConfigurations }
     * 
     */
    public ListRTMConfigurations createListRTMConfigurations() {
        return new ListRTMConfigurations();
    }

    /**
     * Create an instance of {@link DeleteRTMConfigurationResponse }
     * 
     */
    public DeleteRTMConfigurationResponse createDeleteRTMConfigurationResponse() {
        return new DeleteRTMConfigurationResponse();
    }

    /**
     * Create an instance of {@link RTMConfigurationType }
     * 
     */
    public RTMConfigurationType createRTMConfigurationType() {
        return new RTMConfigurationType();
    }

    /**
     * Create an instance of {@link DeleteAllRTMVariations }
     * 
     */
    public DeleteAllRTMVariations createDeleteAllRTMVariations() {
        return new DeleteAllRTMVariations();
    }

    /**
     * Create an instance of {@link LookupRTMConfiguration }
     * 
     */
    public LookupRTMConfiguration createLookupRTMConfiguration() {
        return new LookupRTMConfiguration();
    }

    /**
     * Create an instance of {@link ListRTMQueuesResponse }
     * 
     */
    public ListRTMQueuesResponse createListRTMQueuesResponse() {
        return new ListRTMQueuesResponse();
    }

    /**
     * Create an instance of {@link PromoteRTMTestCell }
     * 
     */
    public PromoteRTMTestCell createPromoteRTMTestCell() {
        return new PromoteRTMTestCell();
    }

    /**
     * Create an instance of {@link UpdateRTMConfigurationResponse }
     * 
     */
    public UpdateRTMConfigurationResponse createUpdateRTMConfigurationResponse() {
        return new UpdateRTMConfigurationResponse();
    }

    /**
     * Create an instance of {@link DeleteRTMConfiguration }
     * 
     */
    public DeleteRTMConfiguration createDeleteRTMConfiguration() {
        return new DeleteRTMConfiguration();
    }

    /**
     * Create an instance of {@link UpdateRTMTestCellResponse }
     * 
     */
    public UpdateRTMTestCellResponse createUpdateRTMTestCellResponse() {
        return new UpdateRTMTestCellResponse();
    }

    /**
     * Create an instance of {@link PromoteRTMTestCellResponse }
     * 
     */
    public PromoteRTMTestCellResponse createPromoteRTMTestCellResponse() {
        return new PromoteRTMTestCellResponse();
    }

    /**
     * Create an instance of {@link UpdateRTMVariations }
     * 
     */
    public UpdateRTMVariations createUpdateRTMVariations() {
        return new UpdateRTMVariations();
    }

    /**
     * Create an instance of {@link RTMVariationEntryType }
     * 
     */
    public RTMVariationEntryType createRTMVariationEntryType() {
        return new RTMVariationEntryType();
    }

    /**
     * Create an instance of {@link CreateRTMConfiguration }
     * 
     */
    public CreateRTMConfiguration createCreateRTMConfiguration() {
        return new CreateRTMConfiguration();
    }

    /**
     * Create an instance of {@link UpdateRTMConfiguration }
     * 
     */
    public UpdateRTMConfiguration createUpdateRTMConfiguration() {
        return new UpdateRTMConfiguration();
    }

    /**
     * Create an instance of {@link UpdateRTMTestCell }
     * 
     */
    public UpdateRTMTestCell createUpdateRTMTestCell() {
        return new UpdateRTMTestCell();
    }

    /**
     * Create an instance of {@link ListRTMQueues }
     * 
     */
    public ListRTMQueues createListRTMQueues() {
        return new ListRTMQueues();
    }

    /**
     * Create an instance of {@link CreateRTMConfigurationResponse }
     * 
     */
    public CreateRTMConfigurationResponse createCreateRTMConfigurationResponse() {
        return new CreateRTMConfigurationResponse();
    }

    /**
     * Create an instance of {@link ListRTMConfigurationsResponse }
     * 
     */
    public ListRTMConfigurationsResponse createListRTMConfigurationsResponse() {
        return new ListRTMConfigurationsResponse();
    }

    /**
     * Create an instance of {@link RTMVariationsSettingsType }
     * 
     */
    public RTMVariationsSettingsType createRTMVariationsSettingsType() {
        return new RTMVariationsSettingsType();
    }

    /**
     * Create an instance of {@link RTMVariationType }
     * 
     */
    public RTMVariationType createRTMVariationType() {
        return new RTMVariationType();
    }

    /**
     * Create an instance of {@link ListProofGroupSampleCIDs }
     * 
     */
    public ListProofGroupSampleCIDs createListProofGroupSampleCIDs() {
        return new ListProofGroupSampleCIDs();
    }

    /**
     * Create an instance of {@link BuildPermutationProofSample }
     * 
     */
    public BuildPermutationProofSample createBuildPermutationProofSample() {
        return new BuildPermutationProofSample();
    }

    /**
     * Create an instance of {@link GetProofSampleSetting }
     * 
     */
    public GetProofSampleSetting createGetProofSampleSetting() {
        return new GetProofSampleSetting();
    }

    /**
     * Create an instance of {@link BuildPermutationProofSampleResponse }
     * 
     */
    public BuildPermutationProofSampleResponse createBuildPermutationProofSampleResponse() {
        return new BuildPermutationProofSampleResponse();
    }

    /**
     * Create an instance of {@link ScheduleCellResponse }
     * 
     */
    public ScheduleCellResponse createScheduleCellResponse() {
        return new ScheduleCellResponse();
    }

    /**
     * Create an instance of {@link SendCellAsScheduled }
     * 
     */
    public SendCellAsScheduled createSendCellAsScheduled() {
        return new SendCellAsScheduled();
    }

    /**
     * Create an instance of {@link BuildRandomProofSampleResponse }
     * 
     */
    public BuildRandomProofSampleResponse createBuildRandomProofSampleResponse() {
        return new BuildRandomProofSampleResponse();
    }

    /**
     * Create an instance of {@link SendMailingNowResponse }
     * 
     */
    public SendMailingNowResponse createSendMailingNowResponse() {
        return new SendMailingNowResponse();
    }

    /**
     * Create an instance of {@link ListProofAudienceEmailsResponse }
     * 
     */
    public ListProofAudienceEmailsResponse createListProofAudienceEmailsResponse() {
        return new ListProofAudienceEmailsResponse();
    }

    /**
     * Create an instance of {@link LookupCellStatus }
     * 
     */
    public LookupCellStatus createLookupCellStatus() {
        return new LookupCellStatus();
    }

    /**
     * Create an instance of {@link SendCellNowResponse }
     * 
     */
    public SendCellNowResponse createSendCellNowResponse() {
        return new SendCellNowResponse();
    }

    /**
     * Create an instance of {@link GetProofSampleStatusResponse }
     * 
     */
    public GetProofSampleStatusResponse createGetProofSampleStatusResponse() {
        return new GetProofSampleStatusResponse();
    }

    /**
     * Create an instance of {@link ProofSampleStatusType }
     * 
     */
    public ProofSampleStatusType createProofSampleStatusType() {
        return new ProofSampleStatusType();
    }

    /**
     * Create an instance of {@link SendCellAsScheduledResponse }
     * 
     */
    public SendCellAsScheduledResponse createSendCellAsScheduledResponse() {
        return new SendCellAsScheduledResponse();
    }

    /**
     * Create an instance of {@link ScheduleCell }
     * 
     */
    public ScheduleCell createScheduleCell() {
        return new ScheduleCell();
    }

    /**
     * Create an instance of {@link ScheduleMailingResponse }
     * 
     */
    public ScheduleMailingResponse createScheduleMailingResponse() {
        return new ScheduleMailingResponse();
    }

    /**
     * Create an instance of {@link SendProofsNow }
     * 
     */
    public SendProofsNow createSendProofsNow() {
        return new SendProofsNow();
    }

    /**
     * Create an instance of {@link ResumeCell }
     * 
     */
    public ResumeCell createResumeCell() {
        return new ResumeCell();
    }

    /**
     * Create an instance of {@link SendCellLaterResponse }
     * 
     */
    public SendCellLaterResponse createSendCellLaterResponse() {
        return new SendCellLaterResponse();
    }

    /**
     * Create an instance of {@link LookupCellStatusResponse }
     * 
     */
    public LookupCellStatusResponse createLookupCellStatusResponse() {
        return new LookupCellStatusResponse();
    }

    /**
     * Create an instance of {@link SendMailingLaterResponse }
     * 
     */
    public SendMailingLaterResponse createSendMailingLaterResponse() {
        return new SendMailingLaterResponse();
    }

    /**
     * Create an instance of {@link GetProofGroupOptions }
     * 
     */
    public GetProofGroupOptions createGetProofGroupOptions() {
        return new GetProofGroupOptions();
    }

    /**
     * Create an instance of {@link SendMailingLater }
     * 
     */
    public SendMailingLater createSendMailingLater() {
        return new SendMailingLater();
    }

    /**
     * Create an instance of {@link ResumeCellResponse }
     * 
     */
    public ResumeCellResponse createResumeCellResponse() {
        return new ResumeCellResponse();
    }

    /**
     * Create an instance of {@link CancelCell }
     * 
     */
    public CancelCell createCancelCell() {
        return new CancelCell();
    }

    /**
     * Create an instance of {@link SendMailingAsScheduledResponse }
     * 
     */
    public SendMailingAsScheduledResponse createSendMailingAsScheduledResponse() {
        return new SendMailingAsScheduledResponse();
    }

    /**
     * Create an instance of {@link UpdateProofGroupSampleCIDs }
     * 
     */
    public UpdateProofGroupSampleCIDs createUpdateProofGroupSampleCIDs() {
        return new UpdateProofGroupSampleCIDs();
    }

    /**
     * Create an instance of {@link PauseCell }
     * 
     */
    public PauseCell createPauseCell() {
        return new PauseCell();
    }

    /**
     * Create an instance of {@link ScheduleMailing }
     * 
     */
    public ScheduleMailing createScheduleMailing() {
        return new ScheduleMailing();
    }

    /**
     * Create an instance of {@link SendMailingNow }
     * 
     */
    public SendMailingNow createSendMailingNow() {
        return new SendMailingNow();
    }

    /**
     * Create an instance of {@link UpdateProofGroupSampleCIDsResponse }
     * 
     */
    public UpdateProofGroupSampleCIDsResponse createUpdateProofGroupSampleCIDsResponse() {
        return new UpdateProofGroupSampleCIDsResponse();
    }

    /**
     * Create an instance of {@link ListProofSampleCIDs }
     * 
     */
    public ListProofSampleCIDs createListProofSampleCIDs() {
        return new ListProofSampleCIDs();
    }

    /**
     * Create an instance of {@link GetProofGroupOptionsResponse }
     * 
     */
    public GetProofGroupOptionsResponse createGetProofGroupOptionsResponse() {
        return new GetProofGroupOptionsResponse();
    }

    /**
     * Create an instance of {@link ProofGroupOptionsType }
     * 
     */
    public ProofGroupOptionsType createProofGroupOptionsType() {
        return new ProofGroupOptionsType();
    }

    /**
     * Create an instance of {@link UpdateProofGroupOptionsResponse }
     * 
     */
    public UpdateProofGroupOptionsResponse createUpdateProofGroupOptionsResponse() {
        return new UpdateProofGroupOptionsResponse();
    }

    /**
     * Create an instance of {@link GetProofSampleStatus }
     * 
     */
    public GetProofSampleStatus createGetProofSampleStatus() {
        return new GetProofSampleStatus();
    }

    /**
     * Create an instance of {@link GetProofSampleSettingResponse }
     * 
     */
    public GetProofSampleSettingResponse createGetProofSampleSettingResponse() {
        return new GetProofSampleSettingResponse();
    }

    /**
     * Create an instance of {@link ProofSampleSettingType }
     * 
     */
    public ProofSampleSettingType createProofSampleSettingType() {
        return new ProofSampleSettingType();
    }

    /**
     * Create an instance of {@link CancelCellResponse }
     * 
     */
    public CancelCellResponse createCancelCellResponse() {
        return new CancelCellResponse();
    }

    /**
     * Create an instance of {@link PauseCellResponse }
     * 
     */
    public PauseCellResponse createPauseCellResponse() {
        return new PauseCellResponse();
    }

    /**
     * Create an instance of {@link SendCellNow }
     * 
     */
    public SendCellNow createSendCellNow() {
        return new SendCellNow();
    }

    /**
     * Create an instance of {@link ListProofGroupSampleCIDsResponse }
     * 
     */
    public ListProofGroupSampleCIDsResponse createListProofGroupSampleCIDsResponse() {
        return new ListProofGroupSampleCIDsResponse();
    }

    /**
     * Create an instance of {@link ListProofSampleCIDsResponse }
     * 
     */
    public ListProofSampleCIDsResponse createListProofSampleCIDsResponse() {
        return new ListProofSampleCIDsResponse();
    }

    /**
     * Create an instance of {@link UpdateProofGroupOptions }
     * 
     */
    public UpdateProofGroupOptions createUpdateProofGroupOptions() {
        return new UpdateProofGroupOptions();
    }

    /**
     * Create an instance of {@link BuildRandomProofSample }
     * 
     */
    public BuildRandomProofSample createBuildRandomProofSample() {
        return new BuildRandomProofSample();
    }

    /**
     * Create an instance of {@link SendMailingAsScheduled }
     * 
     */
    public SendMailingAsScheduled createSendMailingAsScheduled() {
        return new SendMailingAsScheduled();
    }

    /**
     * Create an instance of {@link SendProofsNowResponse }
     * 
     */
    public SendProofsNowResponse createSendProofsNowResponse() {
        return new SendProofsNowResponse();
    }

    /**
     * Create an instance of {@link ListProofAudienceEmails }
     * 
     */
    public ListProofAudienceEmails createListProofAudienceEmails() {
        return new ListProofAudienceEmails();
    }

    /**
     * Create an instance of {@link SendCellLater }
     * 
     */
    public SendCellLater createSendCellLater() {
        return new SendCellLater();
    }

    /**
     * Create an instance of {@link UpdateMailingResponse }
     * 
     */
    public UpdateMailingResponse createUpdateMailingResponse() {
        return new UpdateMailingResponse();
    }

    /**
     * Create an instance of {@link LookupMailingByAlternateKey }
     * 
     */
    public LookupMailingByAlternateKey createLookupMailingByAlternateKey() {
        return new LookupMailingByAlternateKey();
    }

    /**
     * Create an instance of {@link ListMailingsByFilterAndMailingType }
     * 
     */
    public ListMailingsByFilterAndMailingType createListMailingsByFilterAndMailingType() {
        return new ListMailingsByFilterAndMailingType();
    }

    /**
     * Create an instance of {@link UpdateMailing }
     * 
     */
    public UpdateMailing createUpdateMailing() {
        return new UpdateMailing();
    }

    /**
     * Create an instance of {@link CloneMailingResponse }
     * 
     */
    public CloneMailingResponse createCloneMailingResponse() {
        return new CloneMailingResponse();
    }

    /**
     * Create an instance of {@link ListMailingsByFilterAndMailingTypeResponse }
     * 
     */
    public ListMailingsByFilterAndMailingTypeResponse createListMailingsByFilterAndMailingTypeResponse() {
        return new ListMailingsByFilterAndMailingTypeResponse();
    }

    /**
     * Create an instance of {@link MailingOverviewType }
     * 
     */
    public MailingOverviewType createMailingOverviewType() {
        return new MailingOverviewType();
    }

    /**
     * Create an instance of {@link CloneMailing }
     * 
     */
    public CloneMailing createCloneMailing() {
        return new CloneMailing();
    }

    /**
     * Create an instance of {@link ListMailingsByFilter }
     * 
     */
    public ListMailingsByFilter createListMailingsByFilter() {
        return new ListMailingsByFilter();
    }

    /**
     * Create an instance of {@link DeleteMailing }
     * 
     */
    public DeleteMailing createDeleteMailing() {
        return new DeleteMailing();
    }

    /**
     * Create an instance of {@link ListMailings }
     * 
     */
    public ListMailings createListMailings() {
        return new ListMailings();
    }

    /**
     * Create an instance of {@link ListMailingsResponse }
     * 
     */
    public ListMailingsResponse createListMailingsResponse() {
        return new ListMailingsResponse();
    }

    /**
     * Create an instance of {@link MailingListType }
     * 
     */
    public MailingListType createMailingListType() {
        return new MailingListType();
    }

    /**
     * Create an instance of {@link LookupMailingByIdResponse }
     * 
     */
    public LookupMailingByIdResponse createLookupMailingByIdResponse() {
        return new LookupMailingByIdResponse();
    }

    /**
     * Create an instance of {@link MailingDetailType }
     * 
     */
    public MailingDetailType createMailingDetailType() {
        return new MailingDetailType();
    }

    /**
     * Create an instance of {@link LookupMailingById }
     * 
     */
    public LookupMailingById createLookupMailingById() {
        return new LookupMailingById();
    }

    /**
     * Create an instance of {@link DeleteMailingResponse }
     * 
     */
    public DeleteMailingResponse createDeleteMailingResponse() {
        return new DeleteMailingResponse();
    }

    /**
     * Create an instance of {@link LookupMailingByAlternateKeyResponse }
     * 
     */
    public LookupMailingByAlternateKeyResponse createLookupMailingByAlternateKeyResponse() {
        return new LookupMailingByAlternateKeyResponse();
    }

    /**
     * Create an instance of {@link CreateMailing }
     * 
     */
    public CreateMailing createCreateMailing() {
        return new CreateMailing();
    }

    /**
     * Create an instance of {@link CreateMailingResponse }
     * 
     */
    public CreateMailingResponse createCreateMailingResponse() {
        return new CreateMailingResponse();
    }

    /**
     * Create an instance of {@link ListMailingsByFilterResponse }
     * 
     */
    public ListMailingsByFilterResponse createListMailingsByFilterResponse() {
        return new ListMailingsByFilterResponse();
    }

    /**
     * Create an instance of {@link ListIBQueriesResponse }
     * 
     */
    public ListIBQueriesResponse createListIBQueriesResponse() {
        return new ListIBQueriesResponse();
    }

    /**
     * Create an instance of {@link IBQueryType }
     * 
     */
    public IBQueryType createIBQueryType() {
        return new IBQueryType();
    }

    /**
     * Create an instance of {@link GetIBJobStatusResponse }
     * 
     */
    public GetIBJobStatusResponse createGetIBJobStatusResponse() {
        return new GetIBJobStatusResponse();
    }

    /**
     * Create an instance of {@link GetIBJobStatus }
     * 
     */
    public GetIBJobStatus createGetIBJobStatus() {
        return new GetIBJobStatus();
    }

    /**
     * Create an instance of {@link ListIBQueries }
     * 
     */
    public ListIBQueries createListIBQueries() {
        return new ListIBQueries();
    }

    /**
     * Create an instance of {@link BuildAudienceFromIBQueryResponse }
     * 
     */
    public BuildAudienceFromIBQueryResponse createBuildAudienceFromIBQueryResponse() {
        return new BuildAudienceFromIBQueryResponse();
    }

    /**
     * Create an instance of {@link BuildAudienceFromIBQuery }
     * 
     */
    public BuildAudienceFromIBQuery createBuildAudienceFromIBQuery() {
        return new BuildAudienceFromIBQuery();
    }

    /**
     * Create an instance of {@link LookupIBQueryById }
     * 
     */
    public LookupIBQueryById createLookupIBQueryById() {
        return new LookupIBQueryById();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link UpdateLinkResponse }
     * 
     */
    public UpdateLinkResponse createUpdateLinkResponse() {
        return new UpdateLinkResponse();
    }

    /**
     * Create an instance of {@link ListLinksResponse }
     * 
     */
    public ListLinksResponse createListLinksResponse() {
        return new ListLinksResponse();
    }

    /**
     * Create an instance of {@link LookupLinkByEncodedURL }
     * 
     */
    public LookupLinkByEncodedURL createLookupLinkByEncodedURL() {
        return new LookupLinkByEncodedURL();
    }

    /**
     * Create an instance of {@link LookupLinkById }
     * 
     */
    public LookupLinkById createLookupLinkById() {
        return new LookupLinkById();
    }

    /**
     * Create an instance of {@link UpdateLink }
     * 
     */
    public UpdateLink createUpdateLink() {
        return new UpdateLink();
    }

    /**
     * Create an instance of {@link ListLinks }
     * 
     */
    public ListLinks createListLinks() {
        return new ListLinks();
    }

    /**
     * Create an instance of {@link ListExportedDataColumnsResponse }
     * 
     */
    public ListExportedDataColumnsResponse createListExportedDataColumnsResponse() {
        return new ListExportedDataColumnsResponse();
    }

    /**
     * Create an instance of {@link CancelExportJob }
     * 
     */
    public CancelExportJob createCancelExportJob() {
        return new CancelExportJob();
    }

    /**
     * Create an instance of {@link StartExportJobResponse }
     * 
     */
    public StartExportJobResponse createStartExportJobResponse() {
        return new StartExportJobResponse();
    }

    /**
     * Create an instance of {@link ExportJobStatusType }
     * 
     */
    public ExportJobStatusType createExportJobStatusType() {
        return new ExportJobStatusType();
    }

    /**
     * Create an instance of {@link StartExportJob }
     * 
     */
    public StartExportJob createStartExportJob() {
        return new StartExportJob();
    }

    /**
     * Create an instance of {@link ListExportedDataColumns }
     * 
     */
    public ListExportedDataColumns createListExportedDataColumns() {
        return new ListExportedDataColumns();
    }

    /**
     * Create an instance of {@link GetExportJobStatus }
     * 
     */
    public GetExportJobStatus createGetExportJobStatus() {
        return new GetExportJobStatus();
    }

    /**
     * Create an instance of {@link CancelExportJobResponse }
     * 
     */
    public CancelExportJobResponse createCancelExportJobResponse() {
        return new CancelExportJobResponse();
    }

    /**
     * Create an instance of {@link ListGridColumnsResponse }
     * 
     */
    public ListGridColumnsResponse createListGridColumnsResponse() {
        return new ListGridColumnsResponse();
    }

    /**
     * Create an instance of {@link DeleteGridResponse }
     * 
     */
    public DeleteGridResponse createDeleteGridResponse() {
        return new DeleteGridResponse();
    }

    /**
     * Create an instance of {@link CreateGridResponse }
     * 
     */
    public CreateGridResponse createCreateGridResponse() {
        return new CreateGridResponse();
    }

    /**
     * Create an instance of {@link UpdateGrid }
     * 
     */
    public UpdateGrid createUpdateGrid() {
        return new UpdateGrid();
    }

    /**
     * Create an instance of {@link GridRowType }
     * 
     */
    public GridRowType createGridRowType() {
        return new GridRowType();
    }

    /**
     * Create an instance of {@link GridXmlType }
     * 
     */
    public GridXmlType createGridXmlType() {
        return new GridXmlType();
    }

    /**
     * Create an instance of {@link UpdateGridResponse }
     * 
     */
    public UpdateGridResponse createUpdateGridResponse() {
        return new UpdateGridResponse();
    }

    /**
     * Create an instance of {@link CreateTabSeparatedGrid }
     * 
     */
    public CreateTabSeparatedGrid createCreateTabSeparatedGrid() {
        return new CreateTabSeparatedGrid();
    }

    /**
     * Create an instance of {@link ListGridKeyValuesResponse }
     * 
     */
    public ListGridKeyValuesResponse createListGridKeyValuesResponse() {
        return new ListGridKeyValuesResponse();
    }

    /**
     * Create an instance of {@link UpdateXmlGridResponse }
     * 
     */
    public UpdateXmlGridResponse createUpdateXmlGridResponse() {
        return new UpdateXmlGridResponse();
    }

    /**
     * Create an instance of {@link LookupGrid }
     * 
     */
    public LookupGrid createLookupGrid() {
        return new LookupGrid();
    }

    /**
     * Create an instance of {@link ListGridKeyValues }
     * 
     */
    public ListGridKeyValues createListGridKeyValues() {
        return new ListGridKeyValues();
    }

    /**
     * Create an instance of {@link DeleteGrid }
     * 
     */
    public DeleteGrid createDeleteGrid() {
        return new DeleteGrid();
    }

    /**
     * Create an instance of {@link CreateGrid }
     * 
     */
    public CreateGrid createCreateGrid() {
        return new CreateGrid();
    }

    /**
     * Create an instance of {@link LookupTabSeparatedGrid }
     * 
     */
    public LookupTabSeparatedGrid createLookupTabSeparatedGrid() {
        return new LookupTabSeparatedGrid();
    }

    /**
     * Create an instance of {@link CreateXmlGrid }
     * 
     */
    public CreateXmlGrid createCreateXmlGrid() {
        return new CreateXmlGrid();
    }

    /**
     * Create an instance of {@link GridTabSeparatedType }
     * 
     */
    public GridTabSeparatedType createGridTabSeparatedType() {
        return new GridTabSeparatedType();
    }

    /**
     * Create an instance of {@link CreateTabSeparatedGridResponse }
     * 
     */
    public CreateTabSeparatedGridResponse createCreateTabSeparatedGridResponse() {
        return new CreateTabSeparatedGridResponse();
    }

    /**
     * Create an instance of {@link UpdateXmlGrid }
     * 
     */
    public UpdateXmlGrid createUpdateXmlGrid() {
        return new UpdateXmlGrid();
    }

    /**
     * Create an instance of {@link ListGrids }
     * 
     */
    public ListGrids createListGrids() {
        return new ListGrids();
    }

    /**
     * Create an instance of {@link ListGridsResponse }
     * 
     */
    public ListGridsResponse createListGridsResponse() {
        return new ListGridsResponse();
    }

    /**
     * Create an instance of {@link GridEntryType }
     * 
     */
    public GridEntryType createGridEntryType() {
        return new GridEntryType();
    }

    /**
     * Create an instance of {@link UpdateTabSeparatedGrid }
     * 
     */
    public UpdateTabSeparatedGrid createUpdateTabSeparatedGrid() {
        return new UpdateTabSeparatedGrid();
    }

    /**
     * Create an instance of {@link ListGridColumns }
     * 
     */
    public ListGridColumns createListGridColumns() {
        return new ListGridColumns();
    }

    /**
     * Create an instance of {@link UpdateTabSeparatedGridResponse }
     * 
     */
    public UpdateTabSeparatedGridResponse createUpdateTabSeparatedGridResponse() {
        return new UpdateTabSeparatedGridResponse();
    }

    /**
     * Create an instance of {@link LookupXmlGrid }
     * 
     */
    public LookupXmlGrid createLookupXmlGrid() {
        return new LookupXmlGrid();
    }

    /**
     * Create an instance of {@link GridType }
     * 
     */
    public GridType createGridType() {
        return new GridType();
    }

    /**
     * Create an instance of {@link CreateXmlGridResponse }
     * 
     */
    public CreateXmlGridResponse createCreateXmlGridResponse() {
        return new CreateXmlGridResponse();
    }

    /**
     * Create an instance of {@link GridColumnType }
     * 
     */
    public GridColumnType createGridColumnType() {
        return new GridColumnType();
    }

    /**
     * Create an instance of {@link GridListAfterFilterType }
     * 
     */
    public GridListAfterFilterType createGridListAfterFilterType() {
        return new GridListAfterFilterType();
    }

    /**
     * Create an instance of {@link MapSymbolToCustomFunction }
     * 
     */
    public MapSymbolToCustomFunction createMapSymbolToCustomFunction() {
        return new MapSymbolToCustomFunction();
    }

    /**
     * Create an instance of {@link ClearSymbolMapResponse }
     * 
     */
    public ClearSymbolMapResponse createClearSymbolMapResponse() {
        return new ClearSymbolMapResponse();
    }

    /**
     * Create an instance of {@link MapSymbolToContentResponse }
     * 
     */
    public MapSymbolToContentResponse createMapSymbolToContentResponse() {
        return new MapSymbolToContentResponse();
    }

    /**
     * Create an instance of {@link ListDataColumnsForCell }
     * 
     */
    public ListDataColumnsForCell createListDataColumnsForCell() {
        return new ListDataColumnsForCell();
    }

    /**
     * Create an instance of {@link ListDataColumnsForCellResponse }
     * 
     */
    public ListDataColumnsForCellResponse createListDataColumnsForCellResponse() {
        return new ListDataColumnsForCellResponse();
    }

    /**
     * Create an instance of {@link MapSymbolToLiteralValueResponse }
     * 
     */
    public MapSymbolToLiteralValueResponse createMapSymbolToLiteralValueResponse() {
        return new MapSymbolToLiteralValueResponse();
    }

    /**
     * Create an instance of {@link ListMappingFunctionsForCellResponse }
     * 
     */
    public ListMappingFunctionsForCellResponse createListMappingFunctionsForCellResponse() {
        return new ListMappingFunctionsForCellResponse();
    }

    /**
     * Create an instance of {@link MapGridColumnToSymbolResponse }
     * 
     */
    public MapGridColumnToSymbolResponse createMapGridColumnToSymbolResponse() {
        return new MapGridColumnToSymbolResponse();
    }

    /**
     * Create an instance of {@link MapSymbolToContent }
     * 
     */
    public MapSymbolToContent createMapSymbolToContent() {
        return new MapSymbolToContent();
    }

    /**
     * Create an instance of {@link SetSymbolMapResponse }
     * 
     */
    public SetSymbolMapResponse createSetSymbolMapResponse() {
        return new SetSymbolMapResponse();
    }

    /**
     * Create an instance of {@link MapGridColumnToSymbol }
     * 
     */
    public MapGridColumnToSymbol createMapGridColumnToSymbol() {
        return new MapGridColumnToSymbol();
    }

    /**
     * Create an instance of {@link MapGridColumnToSymbolByKeyLiteralResponse }
     * 
     */
    public MapGridColumnToSymbolByKeyLiteralResponse createMapGridColumnToSymbolByKeyLiteralResponse() {
        return new MapGridColumnToSymbolByKeyLiteralResponse();
    }

    /**
     * Create an instance of {@link MapSymbolToDataColumnResponse }
     * 
     */
    public MapSymbolToDataColumnResponse createMapSymbolToDataColumnResponse() {
        return new MapSymbolToDataColumnResponse();
    }

    /**
     * Create an instance of {@link ResetSymbolMap }
     * 
     */
    public ResetSymbolMap createResetSymbolMap() {
        return new ResetSymbolMap();
    }

    /**
     * Create an instance of {@link ListMappingFunctionsForCell }
     * 
     */
    public ListMappingFunctionsForCell createListMappingFunctionsForCell() {
        return new ListMappingFunctionsForCell();
    }

    /**
     * Create an instance of {@link MapSymbolToDataColumn }
     * 
     */
    public MapSymbolToDataColumn createMapSymbolToDataColumn() {
        return new MapSymbolToDataColumn();
    }

    /**
     * Create an instance of {@link MapAllGridColumnsToSymbolsResponse }
     * 
     */
    public MapAllGridColumnsToSymbolsResponse createMapAllGridColumnsToSymbolsResponse() {
        return new MapAllGridColumnsToSymbolsResponse();
    }

    /**
     * Create an instance of {@link ListSymbolsInCell }
     * 
     */
    public ListSymbolsInCell createListSymbolsInCell() {
        return new ListSymbolsInCell();
    }

    /**
     * Create an instance of {@link MapGridColumnToSymbolByKeyLiteral }
     * 
     */
    public MapGridColumnToSymbolByKeyLiteral createMapGridColumnToSymbolByKeyLiteral() {
        return new MapGridColumnToSymbolByKeyLiteral();
    }

    /**
     * Create an instance of {@link LookupSymbolMap }
     * 
     */
    public LookupSymbolMap createLookupSymbolMap() {
        return new LookupSymbolMap();
    }

    /**
     * Create an instance of {@link ListSymbolsInCellResponse }
     * 
     */
    public ListSymbolsInCellResponse createListSymbolsInCellResponse() {
        return new ListSymbolsInCellResponse();
    }

    /**
     * Create an instance of {@link SetSymbolMap }
     * 
     */
    public SetSymbolMap createSetSymbolMap() {
        return new SetSymbolMap();
    }

    /**
     * Create an instance of {@link MapAllGridColumnsToSymbolsByKeyLiteralResponse }
     * 
     */
    public MapAllGridColumnsToSymbolsByKeyLiteralResponse createMapAllGridColumnsToSymbolsByKeyLiteralResponse() {
        return new MapAllGridColumnsToSymbolsByKeyLiteralResponse();
    }

    /**
     * Create an instance of {@link MapAllGridColumnsToSymbols }
     * 
     */
    public MapAllGridColumnsToSymbols createMapAllGridColumnsToSymbols() {
        return new MapAllGridColumnsToSymbols();
    }

    /**
     * Create an instance of {@link MapSymbolToCustomFunctionResponse }
     * 
     */
    public MapSymbolToCustomFunctionResponse createMapSymbolToCustomFunctionResponse() {
        return new MapSymbolToCustomFunctionResponse();
    }

    /**
     * Create an instance of {@link ClearSymbolMap }
     * 
     */
    public ClearSymbolMap createClearSymbolMap() {
        return new ClearSymbolMap();
    }

    /**
     * Create an instance of {@link LookupSymbolMapResponse }
     * 
     */
    public LookupSymbolMapResponse createLookupSymbolMapResponse() {
        return new LookupSymbolMapResponse();
    }

    /**
     * Create an instance of {@link MapAllGridColumnsToSymbolsByKeyLiteral }
     * 
     */
    public MapAllGridColumnsToSymbolsByKeyLiteral createMapAllGridColumnsToSymbolsByKeyLiteral() {
        return new MapAllGridColumnsToSymbolsByKeyLiteral();
    }

    /**
     * Create an instance of {@link MapSymbolToLiteralValue }
     * 
     */
    public MapSymbolToLiteralValue createMapSymbolToLiteralValue() {
        return new MapSymbolToLiteralValue();
    }

    /**
     * Create an instance of {@link ResetSymbolMapResponse }
     * 
     */
    public ResetSymbolMapResponse createResetSymbolMapResponse() {
        return new ResetSymbolMapResponse();
    }

    /**
     * Create an instance of {@link GetMailingVolumeReportResponse }
     * 
     */
    public GetMailingVolumeReportResponse createGetMailingVolumeReportResponse() {
        return new GetMailingVolumeReportResponse();
    }

    /**
     * Create an instance of {@link GetMailingVolumeReport }
     * 
     */
    public GetMailingVolumeReport createGetMailingVolumeReport() {
        return new GetMailingVolumeReport();
    }

    /**
     * Create an instance of {@link GetDeliverabilityReportResponse }
     * 
     */
    public GetDeliverabilityReportResponse createGetDeliverabilityReportResponse() {
        return new GetDeliverabilityReportResponse();
    }

    /**
     * Create an instance of {@link GetDeliverabilityReport }
     * 
     */
    public GetDeliverabilityReport createGetDeliverabilityReport() {
        return new GetDeliverabilityReport();
    }

    /**
     * Create an instance of {@link ListUdfCategoryNamesAndValues }
     * 
     */
    public ListUdfCategoryNamesAndValues createListUdfCategoryNamesAndValues() {
        return new ListUdfCategoryNamesAndValues();
    }

    /**
     * Create an instance of {@link ListCellUdfsResponse }
     * 
     */
    public ListCellUdfsResponse createListCellUdfsResponse() {
        return new ListCellUdfsResponse();
    }

    /**
     * Create an instance of {@link UdfValueListType }
     * 
     */
    public UdfValueListType createUdfValueListType() {
        return new UdfValueListType();
    }

    /**
     * Create an instance of {@link ListContentUdfs }
     * 
     */
    public ListContentUdfs createListContentUdfs() {
        return new ListContentUdfs();
    }

    /**
     * Create an instance of {@link ListAudienceUdfsResponse }
     * 
     */
    public ListAudienceUdfsResponse createListAudienceUdfsResponse() {
        return new ListAudienceUdfsResponse();
    }

    /**
     * Create an instance of {@link ListCellUdfCategoryNamesResponse }
     * 
     */
    public ListCellUdfCategoryNamesResponse createListCellUdfCategoryNamesResponse() {
        return new ListCellUdfCategoryNamesResponse();
    }

    /**
     * Create an instance of {@link ListCampaignUdfs }
     * 
     */
    public ListCampaignUdfs createListCampaignUdfs() {
        return new ListCampaignUdfs();
    }

    /**
     * Create an instance of {@link ListCellUdfCategoryNames }
     * 
     */
    public ListCellUdfCategoryNames createListCellUdfCategoryNames() {
        return new ListCellUdfCategoryNames();
    }

    /**
     * Create an instance of {@link ListUdfCategoryNamesAndValuesResponse }
     * 
     */
    public ListUdfCategoryNamesAndValuesResponse createListUdfCategoryNamesAndValuesResponse() {
        return new ListUdfCategoryNamesAndValuesResponse();
    }

    /**
     * Create an instance of {@link UDFCategoryType }
     * 
     */
    public UDFCategoryType createUDFCategoryType() {
        return new UDFCategoryType();
    }

    /**
     * Create an instance of {@link ListContentUdfsResponse }
     * 
     */
    public ListContentUdfsResponse createListContentUdfsResponse() {
        return new ListContentUdfsResponse();
    }

    /**
     * Create an instance of {@link ListMailingUdfs }
     * 
     */
    public ListMailingUdfs createListMailingUdfs() {
        return new ListMailingUdfs();
    }

    /**
     * Create an instance of {@link ListCellUdfs }
     * 
     */
    public ListCellUdfs createListCellUdfs() {
        return new ListCellUdfs();
    }

    /**
     * Create an instance of {@link ListMailingUdfsResponse }
     * 
     */
    public ListMailingUdfsResponse createListMailingUdfsResponse() {
        return new ListMailingUdfsResponse();
    }

    /**
     * Create an instance of {@link ListCampaignUdfsResponse }
     * 
     */
    public ListCampaignUdfsResponse createListCampaignUdfsResponse() {
        return new ListCampaignUdfsResponse();
    }

    /**
     * Create an instance of {@link ListAudienceUdfs }
     * 
     */
    public ListAudienceUdfs createListAudienceUdfs() {
        return new ListAudienceUdfs();
    }

    /**
     * Create an instance of {@link LookupRecipientProfile }
     * 
     */
    public LookupRecipientProfile createLookupRecipientProfile() {
        return new LookupRecipientProfile();
    }

    /**
     * Create an instance of {@link SimplePropertyType }
     * 
     */
    public SimplePropertyType createSimplePropertyType() {
        return new SimplePropertyType();
    }

    /**
     * Create an instance of {@link ListRecipientCellEventsResponse }
     * 
     */
    public ListRecipientCellEventsResponse createListRecipientCellEventsResponse() {
        return new ListRecipientCellEventsResponse();
    }

    /**
     * Create an instance of {@link RecipientActionType }
     * 
     */
    public RecipientActionType createRecipientActionType() {
        return new RecipientActionType();
    }

    /**
     * Create an instance of {@link ListRecipientHistory }
     * 
     */
    public ListRecipientHistory createListRecipientHistory() {
        return new ListRecipientHistory();
    }

    /**
     * Create an instance of {@link LookupRecipientAudienceProfile }
     * 
     */
    public LookupRecipientAudienceProfile createLookupRecipientAudienceProfile() {
        return new LookupRecipientAudienceProfile();
    }

    /**
     * Create an instance of {@link ListRecipientHistoryResponse }
     * 
     */
    public ListRecipientHistoryResponse createListRecipientHistoryResponse() {
        return new ListRecipientHistoryResponse();
    }

    /**
     * Create an instance of {@link EventListType }
     * 
     */
    public EventListType createEventListType() {
        return new EventListType();
    }

    /**
     * Create an instance of {@link LookupRecipientAudienceProfileResponse }
     * 
     */
    public LookupRecipientAudienceProfileResponse createLookupRecipientAudienceProfileResponse() {
        return new LookupRecipientAudienceProfileResponse();
    }

    /**
     * Create an instance of {@link LookupAudiencePropertiesType }
     * 
     */
    public LookupAudiencePropertiesType createLookupAudiencePropertiesType() {
        return new LookupAudiencePropertiesType();
    }

    /**
     * Create an instance of {@link LookupRecipientProfileResponse }
     * 
     */
    public LookupRecipientProfileResponse createLookupRecipientProfileResponse() {
        return new LookupRecipientProfileResponse();
    }

    /**
     * Create an instance of {@link LookupRecipientProfileType }
     * 
     */
    public LookupRecipientProfileType createLookupRecipientProfileType() {
        return new LookupRecipientProfileType();
    }

    /**
     * Create an instance of {@link ListRecipientCellEvents }
     * 
     */
    public ListRecipientCellEvents createListRecipientCellEvents() {
        return new ListRecipientCellEvents();
    }

    /**
     * Create an instance of {@link EventGroupType }
     * 
     */
    public EventGroupType createEventGroupType() {
        return new EventGroupType();
    }

    /**
     * Create an instance of {@link EventInfoType }
     * 
     */
    public EventInfoType createEventInfoType() {
        return new EventInfoType();
    }

    /**
     * Create an instance of {@link ActionOverviewType }
     * 
     */
    public ActionOverviewType createActionOverviewType() {
        return new ActionOverviewType();
    }

    /**
     * Create an instance of {@link EventOverviewType }
     * 
     */
    public EventOverviewType createEventOverviewType() {
        return new EventOverviewType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link GetEReportsRefreshStatus }
     * 
     */
    public GetEReportsRefreshStatus createGetEReportsRefreshStatus() {
        return new GetEReportsRefreshStatus();
    }

    /**
     * Create an instance of {@link RetrievePulseReportResponse }
     * 
     */
    public RetrievePulseReportResponse createRetrievePulseReportResponse() {
        return new RetrievePulseReportResponse();
    }

    /**
     * Create an instance of {@link EventSummaryType }
     * 
     */
    public EventSummaryType createEventSummaryType() {
        return new EventSummaryType();
    }

    /**
     * Create an instance of {@link RetrieveCellViewEReports }
     * 
     */
    public RetrieveCellViewEReports createRetrieveCellViewEReports() {
        return new RetrieveCellViewEReports();
    }

    /**
     * Create an instance of {@link RetrieveCellViewEReportsResponse }
     * 
     */
    public RetrieveCellViewEReportsResponse createRetrieveCellViewEReportsResponse() {
        return new RetrieveCellViewEReportsResponse();
    }

    /**
     * Create an instance of {@link MailingViewType }
     * 
     */
    public MailingViewType createMailingViewType() {
        return new MailingViewType();
    }

    /**
     * Create an instance of {@link RefreshEReports }
     * 
     */
    public RefreshEReports createRefreshEReports() {
        return new RefreshEReports();
    }

    /**
     * Create an instance of {@link RetrieveMailingViewEReportsUdfsResponse }
     * 
     */
    public RetrieveMailingViewEReportsUdfsResponse createRetrieveMailingViewEReportsUdfsResponse() {
        return new RetrieveMailingViewEReportsUdfsResponse();
    }

    /**
     * Create an instance of {@link MailingViewEReportsWithUdfType }
     * 
     */
    public MailingViewEReportsWithUdfType createMailingViewEReportsWithUdfType() {
        return new MailingViewEReportsWithUdfType();
    }

    /**
     * Create an instance of {@link GetEReportsRefreshStatusResponse }
     * 
     */
    public GetEReportsRefreshStatusResponse createGetEReportsRefreshStatusResponse() {
        return new GetEReportsRefreshStatusResponse();
    }

    /**
     * Create an instance of {@link RetrieveEReportsResponse }
     * 
     */
    public RetrieveEReportsResponse createRetrieveEReportsResponse() {
        return new RetrieveEReportsResponse();
    }

    /**
     * Create an instance of {@link RetrievePulseReport }
     * 
     */
    public RetrievePulseReport createRetrievePulseReport() {
        return new RetrievePulseReport();
    }

    /**
     * Create an instance of {@link ListEReportTypesResponse }
     * 
     */
    public ListEReportTypesResponse createListEReportTypesResponse() {
        return new ListEReportTypesResponse();
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link RetrieveEReports }
     * 
     */
    public RetrieveEReports createRetrieveEReports() {
        return new RetrieveEReports();
    }

    /**
     * Create an instance of {@link RetrieveMailingViewEReports }
     * 
     */
    public RetrieveMailingViewEReports createRetrieveMailingViewEReports() {
        return new RetrieveMailingViewEReports();
    }

    /**
     * Create an instance of {@link RefreshEReportsResponse }
     * 
     */
    public RefreshEReportsResponse createRefreshEReportsResponse() {
        return new RefreshEReportsResponse();
    }

    /**
     * Create an instance of {@link RetrieveMailingViewEReportsResponse }
     * 
     */
    public RetrieveMailingViewEReportsResponse createRetrieveMailingViewEReportsResponse() {
        return new RetrieveMailingViewEReportsResponse();
    }

    /**
     * Create an instance of {@link MailingViewEReports }
     * 
     */
    public MailingViewEReports createMailingViewEReports() {
        return new MailingViewEReports();
    }

    /**
     * Create an instance of {@link RetrieveMailingViewEReportsUdfs }
     * 
     */
    public RetrieveMailingViewEReportsUdfs createRetrieveMailingViewEReportsUdfs() {
        return new RetrieveMailingViewEReportsUdfs();
    }

    /**
     * Create an instance of {@link ListEReportTypes }
     * 
     */
    public ListEReportTypes createListEReportTypes() {
        return new ListEReportTypes();
    }

    /**
     * Create an instance of {@link EReportsCellOverviewType }
     * 
     */
    public EReportsCellOverviewType createEReportsCellOverviewType() {
        return new EReportsCellOverviewType();
    }

    /**
     * Create an instance of {@link CustomExtType }
     * 
     */
    public CustomExtType createCustomExtType() {
        return new CustomExtType();
    }

    /**
     * Create an instance of {@link RollupCountsType }
     * 
     */
    public RollupCountsType createRollupCountsType() {
        return new RollupCountsType();
    }

    /**
     * Create an instance of {@link RollUpType }
     * 
     */
    public RollUpType createRollUpType() {
        return new RollUpType();
    }

    /**
     * Create an instance of {@link EReportsCellOverviewWithUdfType }
     * 
     */
    public EReportsCellOverviewWithUdfType createEReportsCellOverviewWithUdfType() {
        return new EReportsCellOverviewWithUdfType();
    }

    /**
     * Create an instance of {@link HourlyCountType }
     * 
     */
    public HourlyCountType createHourlyCountType() {
        return new HourlyCountType();
    }

    /**
     * Create an instance of {@link MailingViewWithUdfType }
     * 
     */
    public MailingViewWithUdfType createMailingViewWithUdfType() {
        return new MailingViewWithUdfType();
    }

    /**
     * Create an instance of {@link EReportsMailingOverviewType }
     * 
     */
    public EReportsMailingOverviewType createEReportsMailingOverviewType() {
        return new EReportsMailingOverviewType();
    }

    /**
     * Create an instance of {@link EReportsMailingOverviewWithUdfType }
     * 
     */
    public EReportsMailingOverviewWithUdfType createEReportsMailingOverviewWithUdfType() {
        return new EReportsMailingOverviewWithUdfType();
    }

    /**
     * Create an instance of {@link CustomDefExtentsionType }
     * 
     */
    public CustomDefExtentsionType createCustomDefExtentsionType() {
        return new CustomDefExtentsionType();
    }

    /**
     * Create an instance of {@link CanAccessClient }
     * 
     */
    public CanAccessClient createCanAccessClient() {
        return new CanAccessClient();
    }

    /**
     * Create an instance of {@link CanAccessClientResponse }
     * 
     */
    public CanAccessClientResponse createCanAccessClientResponse() {
        return new CanAccessClientResponse();
    }

    /**
     * Create an instance of {@link ListClientsResponse }
     * 
     */
    public ListClientsResponse createListClientsResponse() {
        return new ListClientsResponse();
    }

    /**
     * Create an instance of {@link ClientListType }
     * 
     */
    public ClientListType createClientListType() {
        return new ClientListType();
    }

    /**
     * Create an instance of {@link ListClients }
     * 
     */
    public ListClients createListClients() {
        return new ListClients();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForNewAudienceResponse }
     * 
     */
    public CreateDataUploadConfigForNewAudienceResponse createCreateDataUploadConfigForNewAudienceResponse() {
        return new CreateDataUploadConfigForNewAudienceResponse();
    }

    /**
     * Create an instance of {@link DataUploadConfigType }
     * 
     */
    public DataUploadConfigType createDataUploadConfigType() {
        return new DataUploadConfigType();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForNewAudience }
     * 
     */
    public CreateDataUploadConfigForNewAudience createCreateDataUploadConfigForNewAudience() {
        return new CreateDataUploadConfigForNewAudience();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForNewSuppression }
     * 
     */
    public CreateDataUploadConfigForNewSuppression createCreateDataUploadConfigForNewSuppression() {
        return new CreateDataUploadConfigForNewSuppression();
    }

    /**
     * Create an instance of {@link CreateAudienceClassResponse }
     * 
     */
    public CreateAudienceClassResponse createCreateAudienceClassResponse() {
        return new CreateAudienceClassResponse();
    }

    /**
     * Create an instance of {@link ListDataColumnsForAudienceResponse }
     * 
     */
    public ListDataColumnsForAudienceResponse createListDataColumnsForAudienceResponse() {
        return new ListDataColumnsForAudienceResponse();
    }

    /**
     * Create an instance of {@link DataColumnType }
     * 
     */
    public DataColumnType createDataColumnType() {
        return new DataColumnType();
    }

    /**
     * Create an instance of {@link ListMasterUniqueKeyColumnsResponse }
     * 
     */
    public ListMasterUniqueKeyColumnsResponse createListMasterUniqueKeyColumnsResponse() {
        return new ListMasterUniqueKeyColumnsResponse();
    }

    /**
     * Create an instance of {@link LookupDataUploadStatus }
     * 
     */
    public LookupDataUploadStatus createLookupDataUploadStatus() {
        return new LookupDataUploadStatus();
    }

    /**
     * Create an instance of {@link LookupDataUploadStatusResponse }
     * 
     */
    public LookupDataUploadStatusResponse createLookupDataUploadStatusResponse() {
        return new LookupDataUploadStatusResponse();
    }

    /**
     * Create an instance of {@link UploadStatusType }
     * 
     */
    public UploadStatusType createUploadStatusType() {
        return new UploadStatusType();
    }

    /**
     * Create an instance of {@link ListAllDataColumns }
     * 
     */
    public ListAllDataColumns createListAllDataColumns() {
        return new ListAllDataColumns();
    }

    /**
     * Create an instance of {@link CreateAudienceClass }
     * 
     */
    public CreateAudienceClass createCreateAudienceClass() {
        return new CreateAudienceClass();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForExistingAudience }
     * 
     */
    public CreateDataUploadConfigForExistingAudience createCreateDataUploadConfigForExistingAudience() {
        return new CreateDataUploadConfigForExistingAudience();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForExistingSuppression }
     * 
     */
    public CreateDataUploadConfigForExistingSuppression createCreateDataUploadConfigForExistingSuppression() {
        return new CreateDataUploadConfigForExistingSuppression();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForExistingSuppressionResponse }
     * 
     */
    public CreateDataUploadConfigForExistingSuppressionResponse createCreateDataUploadConfigForExistingSuppressionResponse() {
        return new CreateDataUploadConfigForExistingSuppressionResponse();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForNewSuppressionResponse }
     * 
     */
    public CreateDataUploadConfigForNewSuppressionResponse createCreateDataUploadConfigForNewSuppressionResponse() {
        return new CreateDataUploadConfigForNewSuppressionResponse();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForExistingAudienceResponse }
     * 
     */
    public CreateDataUploadConfigForExistingAudienceResponse createCreateDataUploadConfigForExistingAudienceResponse() {
        return new CreateDataUploadConfigForExistingAudienceResponse();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForGlobalUnsubResponse }
     * 
     */
    public CreateDataUploadConfigForGlobalUnsubResponse createCreateDataUploadConfigForGlobalUnsubResponse() {
        return new CreateDataUploadConfigForGlobalUnsubResponse();
    }

    /**
     * Create an instance of {@link ListAllDataColumnsResponse }
     * 
     */
    public ListAllDataColumnsResponse createListAllDataColumnsResponse() {
        return new ListAllDataColumnsResponse();
    }

    /**
     * Create an instance of {@link CreateDataUploadConfigForGlobalUnsub }
     * 
     */
    public CreateDataUploadConfigForGlobalUnsub createCreateDataUploadConfigForGlobalUnsub() {
        return new CreateDataUploadConfigForGlobalUnsub();
    }

    /**
     * Create an instance of {@link ListMasterUniqueKeyColumns }
     * 
     */
    public ListMasterUniqueKeyColumns createListMasterUniqueKeyColumns() {
        return new ListMasterUniqueKeyColumns();
    }

    /**
     * Create an instance of {@link ListDataColumnsForAudience }
     * 
     */
    public ListDataColumnsForAudience createListDataColumnsForAudience() {
        return new ListDataColumnsForAudience();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GridXmlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:grid.ws.sdk.edialog.com", name = "lookupXmlGridResponse")
    public JAXBElement<GridXmlType> createLookupXmlGridResponse(GridXmlType value) {
        return new JAXBElement<GridXmlType>(_LookupXmlGridResponse_QNAME, GridXmlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:urlmanagement.ws.sdk.edialog.com", name = "lookupLinkByEncodedURLResponse")
    public JAXBElement<LinkType> createLookupLinkByEncodedURLResponse(LinkType value) {
        return new JAXBElement<LinkType>(_LookupLinkByEncodedURLResponse_QNAME, LinkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:urlmanagement.ws.sdk.edialog.com", name = "lookupLinkByIdResponse")
    public JAXBElement<LinkType> createLookupLinkByIdResponse(LinkType value) {
        return new JAXBElement<LinkType>(_LookupLinkByIdResponse_QNAME, LinkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportJobStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:exporter.ws.sdk.edialog.com", name = "getExportJobStatusResponse")
    public JAXBElement<ExportJobStatusType> createGetExportJobStatusResponse(ExportJobStatusType value) {
        return new JAXBElement<ExportJobStatusType>(_GetExportJobStatusResponse_QNAME, ExportJobStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GridTabSeparatedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:grid.ws.sdk.edialog.com", name = "lookupTabSeparatedGridResponse")
    public JAXBElement<GridTabSeparatedType> createLookupTabSeparatedGridResponse(GridTabSeparatedType value) {
        return new JAXBElement<GridTabSeparatedType>(_LookupTabSeparatedGridResponse_QNAME, GridTabSeparatedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:insightbuilder.ws.sdk.edialog.com", name = "lookupIBQueryByIdResponse")
    public JAXBElement<IBQueryType> createLookupIBQueryByIdResponse(IBQueryType value) {
        return new JAXBElement<IBQueryType>(_LookupIBQueryByIdResponse_QNAME, IBQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RTMConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", name = "deleteAllRTMVariationsResponse")
    public JAXBElement<RTMConfigurationType> createDeleteAllRTMVariationsResponse(RTMConfigurationType value) {
        return new JAXBElement<RTMConfigurationType>(_DeleteAllRTMVariationsResponse_QNAME, RTMConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RTMConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", name = "updateRTMVariationsResponse")
    public JAXBElement<RTMConfigurationType> createUpdateRTMVariationsResponse(RTMConfigurationType value) {
        return new JAXBElement<RTMConfigurationType>(_UpdateRTMVariationsResponse_QNAME, RTMConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GridType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:grid.ws.sdk.edialog.com", name = "lookupGridResponse")
    public JAXBElement<GridType> createLookupGridResponse(GridType value) {
        return new JAXBElement<GridType>(_LookupGridResponse_QNAME, GridType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RTMConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com", name = "lookupRTMConfigurationResponse")
    public JAXBElement<RTMConfigurationType> createLookupRTMConfigurationResponse(RTMConfigurationType value) {
        return new JAXBElement<RTMConfigurationType>(_LookupRTMConfigurationResponse_QNAME, RTMConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:cell.ws.sdk.edialog.com", name = "unsubAudience", scope = SetCellUnsubRules.class)
    public JAXBElement<Integer> createSetCellUnsubRulesUnsubAudience(Integer value) {
        return new JAXBElement<Integer>(_SetCellUnsubRulesUnsubAudience_QNAME, Integer.class, SetCellUnsubRules.class, value);
    }

}
