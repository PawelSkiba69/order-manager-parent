
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.poczta_polska.e_nadawca package. 
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

    private final static QName _SendEnvelopeResponse_QNAME = new QName("http://e-nadawca.poczta-polska.pl", "sendEnvelopeResponse");
    private final static QName _UploadIWDContentResponse_QNAME = new QName("http://e-nadawca.poczta-polska.pl", "uploadIWDContentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.poczta_polska.e_nadawca
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddShipment }
     * 
     */
    public AddShipment createAddShipment() {
        return new AddShipment();
    }

    /**
     * Create an instance of {@link AddShipmentResponse }
     * 
     */
    public AddShipmentResponse createAddShipmentResponse() {
        return new AddShipmentResponse();
    }

    /**
     * Create an instance of {@link AddShipmentResponseItemType }
     * 
     */
    public AddShipmentResponseItemType createAddShipmentResponseItemType() {
        return new AddShipmentResponseItemType();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link SendEnvelope }
     * 
     */
    public SendEnvelope createSendEnvelope() {
        return new SendEnvelope();
    }

    /**
     * Create an instance of {@link PakietType }
     * 
     */
    public PakietType createPakietType() {
        return new PakietType();
    }

    /**
     * Create an instance of {@link ProfilType }
     * 
     */
    public ProfilType createProfilType() {
        return new ProfilType();
    }

    /**
     * Create an instance of {@link SendEnvelopeResponseType }
     * 
     */
    public SendEnvelopeResponseType createSendEnvelopeResponseType() {
        return new SendEnvelopeResponseType();
    }

    /**
     * Create an instance of {@link GetUrzedyNadania }
     * 
     */
    public GetUrzedyNadania createGetUrzedyNadania() {
        return new GetUrzedyNadania();
    }

    /**
     * Create an instance of {@link GetUrzedyNadaniaResponse }
     * 
     */
    public GetUrzedyNadaniaResponse createGetUrzedyNadaniaResponse() {
        return new GetUrzedyNadaniaResponse();
    }

    /**
     * Create an instance of {@link UrzadNadaniaFullType }
     * 
     */
    public UrzadNadaniaFullType createUrzadNadaniaFullType() {
        return new UrzadNadaniaFullType();
    }

    /**
     * Create an instance of {@link ClearEnvelope }
     * 
     */
    public ClearEnvelope createClearEnvelope() {
        return new ClearEnvelope();
    }

    /**
     * Create an instance of {@link ClearEnvelopeResponse }
     * 
     */
    public ClearEnvelopeResponse createClearEnvelopeResponse() {
        return new ClearEnvelopeResponse();
    }

    /**
     * Create an instance of {@link GetUrzedyWydajaceEPrzesylki }
     * 
     */
    public GetUrzedyWydajaceEPrzesylki createGetUrzedyWydajaceEPrzesylki() {
        return new GetUrzedyWydajaceEPrzesylki();
    }

    /**
     * Create an instance of {@link GetUrzedyWydajaceEPrzesylkiResponse }
     * 
     */
    public GetUrzedyWydajaceEPrzesylkiResponse createGetUrzedyWydajaceEPrzesylkiResponse() {
        return new GetUrzedyWydajaceEPrzesylkiResponse();
    }

    /**
     * Create an instance of {@link UrzadWydaniaEPrzesylkiType }
     * 
     */
    public UrzadWydaniaEPrzesylkiType createUrzadWydaniaEPrzesylkiType() {
        return new UrzadWydaniaEPrzesylkiType();
    }

    /**
     * Create an instance of {@link UploadIWDContent }
     * 
     */
    public UploadIWDContent createUploadIWDContent() {
        return new UploadIWDContent();
    }

    /**
     * Create an instance of {@link GetEnvelopeStatus }
     * 
     */
    public GetEnvelopeStatus createGetEnvelopeStatus() {
        return new GetEnvelopeStatus();
    }

    /**
     * Create an instance of {@link GetEnvelopeStatusResponse }
     * 
     */
    public GetEnvelopeStatusResponse createGetEnvelopeStatusResponse() {
        return new GetEnvelopeStatusResponse();
    }

    /**
     * Create an instance of {@link DownloadIWDContent }
     * 
     */
    public DownloadIWDContent createDownloadIWDContent() {
        return new DownloadIWDContent();
    }

    /**
     * Create an instance of {@link DownloadIWDContentResponse }
     * 
     */
    public DownloadIWDContentResponse createDownloadIWDContentResponse() {
        return new DownloadIWDContentResponse();
    }

    /**
     * Create an instance of {@link GetKarty }
     * 
     */
    public GetKarty createGetKarty() {
        return new GetKarty();
    }

    /**
     * Create an instance of {@link GetKartyResponse }
     * 
     */
    public GetKartyResponse createGetKartyResponse() {
        return new GetKartyResponse();
    }

    /**
     * Create an instance of {@link KartaType }
     * 
     */
    public KartaType createKartaType() {
        return new KartaType();
    }

    /**
     * Create an instance of {@link GetPasswordExpiredDate }
     * 
     */
    public GetPasswordExpiredDate createGetPasswordExpiredDate() {
        return new GetPasswordExpiredDate();
    }

    /**
     * Create an instance of {@link GetPasswordExpiredDateResponse }
     * 
     */
    public GetPasswordExpiredDateResponse createGetPasswordExpiredDateResponse() {
        return new GetPasswordExpiredDateResponse();
    }

    /**
     * Create an instance of {@link SetAktywnaKarta }
     * 
     */
    public SetAktywnaKarta createSetAktywnaKarta() {
        return new SetAktywnaKarta();
    }

    /**
     * Create an instance of {@link SetAktywnaKartaResponse }
     * 
     */
    public SetAktywnaKartaResponse createSetAktywnaKartaResponse() {
        return new SetAktywnaKartaResponse();
    }

    /**
     * Create an instance of {@link GetEnvelopeContentFull }
     * 
     */
    public GetEnvelopeContentFull createGetEnvelopeContentFull() {
        return new GetEnvelopeContentFull();
    }

    /**
     * Create an instance of {@link GetEnvelopeContentFullResponse }
     * 
     */
    public GetEnvelopeContentFullResponse createGetEnvelopeContentFullResponse() {
        return new GetEnvelopeContentFullResponse();
    }

    /**
     * Create an instance of {@link PrzesylkaFullType }
     * 
     */
    public PrzesylkaFullType createPrzesylkaFullType() {
        return new PrzesylkaFullType();
    }

    /**
     * Create an instance of {@link GetEnvelopeContentShort }
     * 
     */
    public GetEnvelopeContentShort createGetEnvelopeContentShort() {
        return new GetEnvelopeContentShort();
    }

    /**
     * Create an instance of {@link GetEnvelopeContentShortResponse }
     * 
     */
    public GetEnvelopeContentShortResponse createGetEnvelopeContentShortResponse() {
        return new GetEnvelopeContentShortResponse();
    }

    /**
     * Create an instance of {@link PrzesylkaShortType }
     * 
     */
    public PrzesylkaShortType createPrzesylkaShortType() {
        return new PrzesylkaShortType();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetAddressLabel }
     * 
     */
    public GetAddressLabel createGetAddressLabel() {
        return new GetAddressLabel();
    }

    /**
     * Create an instance of {@link GetAddressLabelResponse }
     * 
     */
    public GetAddressLabelResponse createGetAddressLabelResponse() {
        return new GetAddressLabelResponse();
    }

    /**
     * Create an instance of {@link AddressLabelContent }
     * 
     */
    public AddressLabelContent createAddressLabelContent() {
        return new AddressLabelContent();
    }

    /**
     * Create an instance of {@link GetOutboxBook }
     * 
     */
    public GetOutboxBook createGetOutboxBook() {
        return new GetOutboxBook();
    }

    /**
     * Create an instance of {@link GetOutboxBookResponse }
     * 
     */
    public GetOutboxBookResponse createGetOutboxBookResponse() {
        return new GetOutboxBookResponse();
    }

    /**
     * Create an instance of {@link GetFirmowaPocztaBook }
     * 
     */
    public GetFirmowaPocztaBook createGetFirmowaPocztaBook() {
        return new GetFirmowaPocztaBook();
    }

    /**
     * Create an instance of {@link GetFirmowaPocztaBookResponse }
     * 
     */
    public GetFirmowaPocztaBookResponse createGetFirmowaPocztaBookResponse() {
        return new GetFirmowaPocztaBookResponse();
    }

    /**
     * Create an instance of {@link GetEnvelopeList }
     * 
     */
    public GetEnvelopeList createGetEnvelopeList() {
        return new GetEnvelopeList();
    }

    /**
     * Create an instance of {@link GetEnvelopeListResponse }
     * 
     */
    public GetEnvelopeListResponse createGetEnvelopeListResponse() {
        return new GetEnvelopeListResponse();
    }

    /**
     * Create an instance of {@link EnvelopeInfoType }
     * 
     */
    public EnvelopeInfoType createEnvelopeInfoType() {
        return new EnvelopeInfoType();
    }

    /**
     * Create an instance of {@link GetAddresLabelByGuid }
     * 
     */
    public GetAddresLabelByGuid createGetAddresLabelByGuid() {
        return new GetAddresLabelByGuid();
    }

    /**
     * Create an instance of {@link GetAddresLabelByGuidResponse }
     * 
     */
    public GetAddresLabelByGuidResponse createGetAddresLabelByGuidResponse() {
        return new GetAddresLabelByGuidResponse();
    }

    /**
     * Create an instance of {@link GetPlacowkiPocztowe }
     * 
     */
    public GetPlacowkiPocztowe createGetPlacowkiPocztowe() {
        return new GetPlacowkiPocztowe();
    }

    /**
     * Create an instance of {@link GetPlacowkiPocztoweResponse }
     * 
     */
    public GetPlacowkiPocztoweResponse createGetPlacowkiPocztoweResponse() {
        return new GetPlacowkiPocztoweResponse();
    }

    /**
     * Create an instance of {@link PlacowkaPocztowaType }
     * 
     */
    public PlacowkaPocztowaType createPlacowkaPocztowaType() {
        return new PlacowkaPocztowaType();
    }

    /**
     * Create an instance of {@link GetGuid }
     * 
     */
    public GetGuid createGetGuid() {
        return new GetGuid();
    }

    /**
     * Create an instance of {@link GetGuidResponse }
     * 
     */
    public GetGuidResponse createGetGuidResponse() {
        return new GetGuidResponse();
    }

    /**
     * Create an instance of {@link GetKierunki }
     * 
     */
    public GetKierunki createGetKierunki() {
        return new GetKierunki();
    }

    /**
     * Create an instance of {@link GetKierunkiResponse }
     * 
     */
    public GetKierunkiResponse createGetKierunkiResponse() {
        return new GetKierunkiResponse();
    }

    /**
     * Create an instance of {@link KierunekType }
     * 
     */
    public KierunekType createKierunekType() {
        return new KierunekType();
    }

    /**
     * Create an instance of {@link GetKierunkiInfo }
     * 
     */
    public GetKierunkiInfo createGetKierunkiInfo() {
        return new GetKierunkiInfo();
    }

    /**
     * Create an instance of {@link GetKierunkiInfoResponse }
     * 
     */
    public GetKierunkiInfoResponse createGetKierunkiInfoResponse() {
        return new GetKierunkiInfoResponse();
    }

    /**
     * Create an instance of {@link UslugiType }
     * 
     */
    public UslugiType createUslugiType() {
        return new UslugiType();
    }

    /**
     * Create an instance of {@link GetEnvelopeBufor }
     * 
     */
    public GetEnvelopeBufor createGetEnvelopeBufor() {
        return new GetEnvelopeBufor();
    }

    /**
     * Create an instance of {@link GetEnvelopeBuforResponse }
     * 
     */
    public GetEnvelopeBuforResponse createGetEnvelopeBuforResponse() {
        return new GetEnvelopeBuforResponse();
    }

    /**
     * Create an instance of {@link ClearEnvelopeByGuids }
     * 
     */
    public ClearEnvelopeByGuids createClearEnvelopeByGuids() {
        return new ClearEnvelopeByGuids();
    }

    /**
     * Create an instance of {@link ClearEnvelopeByGuidsResponse }
     * 
     */
    public ClearEnvelopeByGuidsResponse createClearEnvelopeByGuidsResponse() {
        return new ClearEnvelopeByGuidsResponse();
    }

    /**
     * Create an instance of {@link SetEnvelopeBuforDataNadania }
     * 
     */
    public SetEnvelopeBuforDataNadania createSetEnvelopeBuforDataNadania() {
        return new SetEnvelopeBuforDataNadania();
    }

    /**
     * Create an instance of {@link SetEnvelopeBuforDataNadaniaResponse }
     * 
     */
    public SetEnvelopeBuforDataNadaniaResponse createSetEnvelopeBuforDataNadaniaResponse() {
        return new SetEnvelopeBuforDataNadaniaResponse();
    }

    /**
     * Create an instance of {@link GetEPOStatus }
     * 
     */
    public GetEPOStatus createGetEPOStatus() {
        return new GetEPOStatus();
    }

    /**
     * Create an instance of {@link GetEPOStatusResponse }
     * 
     */
    public GetEPOStatusResponse createGetEPOStatusResponse() {
        return new GetEPOStatusResponse();
    }

    /**
     * Create an instance of {@link PrzesylkaEPOType }
     * 
     */
    public PrzesylkaEPOType createPrzesylkaEPOType() {
        return new PrzesylkaEPOType();
    }

    /**
     * Create an instance of {@link GetAddresLabelCompact }
     * 
     */
    public GetAddresLabelCompact createGetAddresLabelCompact() {
        return new GetAddresLabelCompact();
    }

    /**
     * Create an instance of {@link GetAddresLabelCompactResponse }
     * 
     */
    public GetAddresLabelCompactResponse createGetAddresLabelCompactResponse() {
        return new GetAddresLabelCompactResponse();
    }

    /**
     * Create an instance of {@link GetAddresLabelByGuidCompact }
     * 
     */
    public GetAddresLabelByGuidCompact createGetAddresLabelByGuidCompact() {
        return new GetAddresLabelByGuidCompact();
    }

    /**
     * Create an instance of {@link GetAddresLabelByGuidCompactResponse }
     * 
     */
    public GetAddresLabelByGuidCompactResponse createGetAddresLabelByGuidCompactResponse() {
        return new GetAddresLabelByGuidCompactResponse();
    }

    /**
     * Create an instance of {@link GetEnvelopeBuforList }
     * 
     */
    public GetEnvelopeBuforList createGetEnvelopeBuforList() {
        return new GetEnvelopeBuforList();
    }

    /**
     * Create an instance of {@link GetEnvelopeBuforListResponse }
     * 
     */
    public GetEnvelopeBuforListResponse createGetEnvelopeBuforListResponse() {
        return new GetEnvelopeBuforListResponse();
    }

    /**
     * Create an instance of {@link BuforType }
     * 
     */
    public BuforType createBuforType() {
        return new BuforType();
    }

    /**
     * Create an instance of {@link CreateEnvelopeBufor }
     * 
     */
    public CreateEnvelopeBufor createCreateEnvelopeBufor() {
        return new CreateEnvelopeBufor();
    }

    /**
     * Create an instance of {@link CreateEnvelopeBuforResponse }
     * 
     */
    public CreateEnvelopeBuforResponse createCreateEnvelopeBuforResponse() {
        return new CreateEnvelopeBuforResponse();
    }

    /**
     * Create an instance of {@link MoveShipments }
     * 
     */
    public MoveShipments createMoveShipments() {
        return new MoveShipments();
    }

    /**
     * Create an instance of {@link MoveShipmentsResponse }
     * 
     */
    public MoveShipmentsResponse createMoveShipmentsResponse() {
        return new MoveShipmentsResponse();
    }

    /**
     * Create an instance of {@link UpdateEnvelopeBufor }
     * 
     */
    public UpdateEnvelopeBufor createUpdateEnvelopeBufor() {
        return new UpdateEnvelopeBufor();
    }

    /**
     * Create an instance of {@link UpdateEnvelopeBuforResponse }
     * 
     */
    public UpdateEnvelopeBuforResponse createUpdateEnvelopeBuforResponse() {
        return new UpdateEnvelopeBuforResponse();
    }

    /**
     * Create an instance of {@link GetUbezpieczeniaInfo }
     * 
     */
    public GetUbezpieczeniaInfo createGetUbezpieczeniaInfo() {
        return new GetUbezpieczeniaInfo();
    }

    /**
     * Create an instance of {@link GetUbezpieczeniaInfoResponse }
     * 
     */
    public GetUbezpieczeniaInfoResponse createGetUbezpieczeniaInfoResponse() {
        return new GetUbezpieczeniaInfoResponse();
    }

    /**
     * Create an instance of {@link UbezpieczeniaInfoType }
     * 
     */
    public UbezpieczeniaInfoType createUbezpieczeniaInfoType() {
        return new UbezpieczeniaInfoType();
    }

    /**
     * Create an instance of {@link IsMiejscowa }
     * 
     */
    public IsMiejscowa createIsMiejscowa() {
        return new IsMiejscowa();
    }

    /**
     * Create an instance of {@link TrasaRequestType }
     * 
     */
    public TrasaRequestType createTrasaRequestType() {
        return new TrasaRequestType();
    }

    /**
     * Create an instance of {@link IsMiejscowaResponse }
     * 
     */
    public IsMiejscowaResponse createIsMiejscowaResponse() {
        return new IsMiejscowaResponse();
    }

    /**
     * Create an instance of {@link TrasaResponseType }
     * 
     */
    public TrasaResponseType createTrasaResponseType() {
        return new TrasaResponseType();
    }

    /**
     * Create an instance of {@link GetBlankietPobraniaByGuids }
     * 
     */
    public GetBlankietPobraniaByGuids createGetBlankietPobraniaByGuids() {
        return new GetBlankietPobraniaByGuids();
    }

    /**
     * Create an instance of {@link GetBlankietPobraniaByGuidsResponse }
     * 
     */
    public GetBlankietPobraniaByGuidsResponse createGetBlankietPobraniaByGuidsResponse() {
        return new GetBlankietPobraniaByGuidsResponse();
    }

    /**
     * Create an instance of {@link UpdateAccount }
     * 
     */
    public UpdateAccount createUpdateAccount() {
        return new UpdateAccount();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link UpdateAccountResponse }
     * 
     */
    public UpdateAccountResponse createUpdateAccountResponse() {
        return new UpdateAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccountList }
     * 
     */
    public GetAccountList createGetAccountList() {
        return new GetAccountList();
    }

    /**
     * Create an instance of {@link GetAccountListResponse }
     * 
     */
    public GetAccountListResponse createGetAccountListResponse() {
        return new GetAccountListResponse();
    }

    /**
     * Create an instance of {@link GetProfilList }
     * 
     */
    public GetProfilList createGetProfilList() {
        return new GetProfilList();
    }

    /**
     * Create an instance of {@link GetProfilListResponse }
     * 
     */
    public GetProfilListResponse createGetProfilListResponse() {
        return new GetProfilListResponse();
    }

    /**
     * Create an instance of {@link UpdateProfil }
     * 
     */
    public UpdateProfil createUpdateProfil() {
        return new UpdateProfil();
    }

    /**
     * Create an instance of {@link UpdateProfilResponse }
     * 
     */
    public UpdateProfilResponse createUpdateProfilResponse() {
        return new UpdateProfilResponse();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link CreateProfil }
     * 
     */
    public CreateProfil createCreateProfil() {
        return new CreateProfil();
    }

    /**
     * Create an instance of {@link CreateProfilResponse }
     * 
     */
    public CreateProfilResponse createCreateProfilResponse() {
        return new CreateProfilResponse();
    }

    /**
     * Create an instance of {@link AddReklamacje }
     * 
     */
    public AddReklamacje createAddReklamacje() {
        return new AddReklamacje();
    }

    /**
     * Create an instance of {@link ReklamowanaPrzesylkaType }
     * 
     */
    public ReklamowanaPrzesylkaType createReklamowanaPrzesylkaType() {
        return new ReklamowanaPrzesylkaType();
    }

    /**
     * Create an instance of {@link AddReklamacjeResponse }
     * 
     */
    public AddReklamacjeResponse createAddReklamacjeResponse() {
        return new AddReklamacjeResponse();
    }

    /**
     * Create an instance of {@link ReklamacjaInfoType }
     * 
     */
    public ReklamacjaInfoType createReklamacjaInfoType() {
        return new ReklamacjaInfoType();
    }

    /**
     * Create an instance of {@link GetReklamacje }
     * 
     */
    public GetReklamacje createGetReklamacje() {
        return new GetReklamacje();
    }

    /**
     * Create an instance of {@link GetReklamacjeResponse }
     * 
     */
    public GetReklamacjeResponse createGetReklamacjeResponse() {
        return new GetReklamacjeResponse();
    }

    /**
     * Create an instance of {@link ReklamacjaRozpatrzonaType }
     * 
     */
    public ReklamacjaRozpatrzonaType createReklamacjaRozpatrzonaType() {
        return new ReklamacjaRozpatrzonaType();
    }

    /**
     * Create an instance of {@link GetZapowiedziFaktur }
     * 
     */
    public GetZapowiedziFaktur createGetZapowiedziFaktur() {
        return new GetZapowiedziFaktur();
    }

    /**
     * Create an instance of {@link GetZapowiedziFakturResponse }
     * 
     */
    public GetZapowiedziFakturResponse createGetZapowiedziFakturResponse() {
        return new GetZapowiedziFakturResponse();
    }

    /**
     * Create an instance of {@link AddOdwolanieDoReklamacji }
     * 
     */
    public AddOdwolanieDoReklamacji createAddOdwolanieDoReklamacji() {
        return new AddOdwolanieDoReklamacji();
    }

    /**
     * Create an instance of {@link AddOdwolanieDoReklamacjiResponse }
     * 
     */
    public AddOdwolanieDoReklamacjiResponse createAddOdwolanieDoReklamacjiResponse() {
        return new AddOdwolanieDoReklamacjiResponse();
    }

    /**
     * Create an instance of {@link AddRozbieznoscDoZapowiedziFaktur }
     * 
     */
    public AddRozbieznoscDoZapowiedziFaktur createAddRozbieznoscDoZapowiedziFaktur() {
        return new AddRozbieznoscDoZapowiedziFaktur();
    }

    /**
     * Create an instance of {@link AddRozbieznoscDoZapowiedziFakturResponse }
     * 
     */
    public AddRozbieznoscDoZapowiedziFakturResponse createAddRozbieznoscDoZapowiedziFakturResponse() {
        return new AddRozbieznoscDoZapowiedziFakturResponse();
    }

    /**
     * Create an instance of {@link GetListaPowodowReklamacji }
     * 
     */
    public GetListaPowodowReklamacji createGetListaPowodowReklamacji() {
        return new GetListaPowodowReklamacji();
    }

    /**
     * Create an instance of {@link GetListaPowodowReklamacjiResponse }
     * 
     */
    public GetListaPowodowReklamacjiResponse createGetListaPowodowReklamacjiResponse() {
        return new GetListaPowodowReklamacjiResponse();
    }

    /**
     * Create an instance of {@link KategoriePowodowReklamacjiType }
     * 
     */
    public KategoriePowodowReklamacjiType createKategoriePowodowReklamacjiType() {
        return new KategoriePowodowReklamacjiType();
    }

    /**
     * Create an instance of {@link ZamowKuriera }
     * 
     */
    public ZamowKuriera createZamowKuriera() {
        return new ZamowKuriera();
    }

    /**
     * Create an instance of {@link AdresType }
     * 
     */
    public AdresType createAdresType() {
        return new AdresType();
    }

    /**
     * Create an instance of {@link ZamowKurieraResponse }
     * 
     */
    public ZamowKurieraResponse createZamowKurieraResponse() {
        return new ZamowKurieraResponse();
    }

    /**
     * Create an instance of {@link GetEZDOList }
     * 
     */
    public GetEZDOList createGetEZDOList() {
        return new GetEZDOList();
    }

    /**
     * Create an instance of {@link GetEZDOListResponse }
     * 
     */
    public GetEZDOListResponse createGetEZDOListResponse() {
        return new GetEZDOListResponse();
    }

    /**
     * Create an instance of {@link EZDOPakietType }
     * 
     */
    public EZDOPakietType createEZDOPakietType() {
        return new EZDOPakietType();
    }

    /**
     * Create an instance of {@link GetEZDO }
     * 
     */
    public GetEZDO createGetEZDO() {
        return new GetEZDO();
    }

    /**
     * Create an instance of {@link GetEZDOResponse }
     * 
     */
    public GetEZDOResponse createGetEZDOResponse() {
        return new GetEZDOResponse();
    }

    /**
     * Create an instance of {@link EZDOPrzesylkaType }
     * 
     */
    public EZDOPrzesylkaType createEZDOPrzesylkaType() {
        return new EZDOPrzesylkaType();
    }

    /**
     * Create an instance of {@link GetWplatyCKP }
     * 
     */
    public GetWplatyCKP createGetWplatyCKP() {
        return new GetWplatyCKP();
    }

    /**
     * Create an instance of {@link GetWplatyCKPResponse }
     * 
     */
    public GetWplatyCKPResponse createGetWplatyCKPResponse() {
        return new GetWplatyCKPResponse();
    }

    /**
     * Create an instance of {@link WplataCKPType }
     * 
     */
    public WplataCKPType createWplataCKPType() {
        return new WplataCKPType();
    }

    /**
     * Create an instance of {@link CancelReklamacja }
     * 
     */
    public CancelReklamacja createCancelReklamacja() {
        return new CancelReklamacja();
    }

    /**
     * Create an instance of {@link CancelReklamacjaResponse }
     * 
     */
    public CancelReklamacjaResponse createCancelReklamacjaResponse() {
        return new CancelReklamacjaResponse();
    }

    /**
     * Create an instance of {@link AddZalacznikDoReklamacji }
     * 
     */
    public AddZalacznikDoReklamacji createAddZalacznikDoReklamacji() {
        return new AddZalacznikDoReklamacji();
    }

    /**
     * Create an instance of {@link ZalacznikDoReklamacjiType }
     * 
     */
    public ZalacznikDoReklamacjiType createZalacznikDoReklamacjiType() {
        return new ZalacznikDoReklamacjiType();
    }

    /**
     * Create an instance of {@link AddZalacznikDoReklamacjiResponse }
     * 
     */
    public AddZalacznikDoReklamacjiResponse createAddZalacznikDoReklamacjiResponse() {
        return new AddZalacznikDoReklamacjiResponse();
    }

    /**
     * Create an instance of {@link UpdateShopEZwroty }
     * 
     */
    public UpdateShopEZwroty createUpdateShopEZwroty() {
        return new UpdateShopEZwroty();
    }

    /**
     * Create an instance of {@link ShopEZwrotyType }
     * 
     */
    public ShopEZwrotyType createShopEZwrotyType() {
        return new ShopEZwrotyType();
    }

    /**
     * Create an instance of {@link UpdateShopEZwrotyResponse }
     * 
     */
    public UpdateShopEZwrotyResponse createUpdateShopEZwrotyResponse() {
        return new UpdateShopEZwrotyResponse();
    }

    /**
     * Create an instance of {@link GetListaZgodEZwrotow }
     * 
     */
    public GetListaZgodEZwrotow createGetListaZgodEZwrotow() {
        return new GetListaZgodEZwrotow();
    }

    /**
     * Create an instance of {@link GetListaZgodEZwrotowResponse }
     * 
     */
    public GetListaZgodEZwrotowResponse createGetListaZgodEZwrotowResponse() {
        return new GetListaZgodEZwrotowResponse();
    }

    /**
     * Create an instance of {@link OczekujeNaZgodeEZwrotType }
     * 
     */
    public OczekujeNaZgodeEZwrotType createOczekujeNaZgodeEZwrotType() {
        return new OczekujeNaZgodeEZwrotType();
    }

    /**
     * Create an instance of {@link SetStatusZgodyNaEZwrot }
     * 
     */
    public SetStatusZgodyNaEZwrot createSetStatusZgodyNaEZwrot() {
        return new SetStatusZgodyNaEZwrot();
    }

    /**
     * Create an instance of {@link StatusZgodyEZwrotType }
     * 
     */
    public StatusZgodyEZwrotType createStatusZgodyEZwrotType() {
        return new StatusZgodyEZwrotType();
    }

    /**
     * Create an instance of {@link SetStatusZgodyNaEZwrotResponse }
     * 
     */
    public SetStatusZgodyNaEZwrotResponse createSetStatusZgodyNaEZwrotResponse() {
        return new SetStatusZgodyNaEZwrotResponse();
    }

    /**
     * Create an instance of {@link WyslijLinkaOStatusieEZwrotu }
     * 
     */
    public WyslijLinkaOStatusieEZwrotu createWyslijLinkaOStatusieEZwrotu() {
        return new WyslijLinkaOStatusieEZwrotu();
    }

    /**
     * Create an instance of {@link WyslijLinkaOStatusieEZwrotuResponse }
     * 
     */
    public WyslijLinkaOStatusieEZwrotuResponse createWyslijLinkaOStatusieEZwrotuResponse() {
        return new WyslijLinkaOStatusieEZwrotuResponse();
    }

    /**
     * Create an instance of {@link IsObszarMiasto }
     * 
     */
    public IsObszarMiasto createIsObszarMiasto() {
        return new IsObszarMiasto();
    }

    /**
     * Create an instance of {@link ObszarAdresowyType }
     * 
     */
    public ObszarAdresowyType createObszarAdresowyType() {
        return new ObszarAdresowyType();
    }

    /**
     * Create an instance of {@link IsObszarMiastoResponse }
     * 
     */
    public IsObszarMiastoResponse createIsObszarMiastoResponse() {
        return new IsObszarMiastoResponse();
    }

    /**
     * Create an instance of {@link ObszarAdresowyResponseType }
     * 
     */
    public ObszarAdresowyResponseType createObszarAdresowyResponseType() {
        return new ObszarAdresowyResponseType();
    }

    /**
     * Create an instance of {@link GetPaczkaKorzysciInfo }
     * 
     */
    public GetPaczkaKorzysciInfo createGetPaczkaKorzysciInfo() {
        return new GetPaczkaKorzysciInfo();
    }

    /**
     * Create an instance of {@link GetPaczkaKorzysciInfoResponse }
     * 
     */
    public GetPaczkaKorzysciInfoResponse createGetPaczkaKorzysciInfoResponse() {
        return new GetPaczkaKorzysciInfoResponse();
    }

    /**
     * Create an instance of {@link InfoPaczkaKorzysciType }
     * 
     */
    public InfoPaczkaKorzysciType createInfoPaczkaKorzysciType() {
        return new InfoPaczkaKorzysciType();
    }

    /**
     * Create an instance of {@link SetJednostkaOrganizacyjna }
     * 
     */
    public SetJednostkaOrganizacyjna createSetJednostkaOrganizacyjna() {
        return new SetJednostkaOrganizacyjna();
    }

    /**
     * Create an instance of {@link JednostkaOrganizacyjnaType }
     * 
     */
    public JednostkaOrganizacyjnaType createJednostkaOrganizacyjnaType() {
        return new JednostkaOrganizacyjnaType();
    }

    /**
     * Create an instance of {@link SetJednostkaOrganizacyjnaResponse }
     * 
     */
    public SetJednostkaOrganizacyjnaResponse createSetJednostkaOrganizacyjnaResponse() {
        return new SetJednostkaOrganizacyjnaResponse();
    }

    /**
     * Create an instance of {@link GetJednostkaOrganizacyjna }
     * 
     */
    public GetJednostkaOrganizacyjna createGetJednostkaOrganizacyjna() {
        return new GetJednostkaOrganizacyjna();
    }

    /**
     * Create an instance of {@link GetJednostkaOrganizacyjnaResponse }
     * 
     */
    public GetJednostkaOrganizacyjnaResponse createGetJednostkaOrganizacyjnaResponse() {
        return new GetJednostkaOrganizacyjnaResponse();
    }

    /**
     * Create an instance of {@link GetPrintForParcel }
     * 
     */
    public GetPrintForParcel createGetPrintForParcel() {
        return new GetPrintForParcel();
    }

    /**
     * Create an instance of {@link PrintType }
     * 
     */
    public PrintType createPrintType() {
        return new PrintType();
    }

    /**
     * Create an instance of {@link GetPrintForParcelResponse }
     * 
     */
    public GetPrintForParcelResponse createGetPrintForParcelResponse() {
        return new GetPrintForParcelResponse();
    }

    /**
     * Create an instance of {@link PrintResultType }
     * 
     */
    public PrintResultType createPrintResultType() {
        return new PrintResultType();
    }

    /**
     * Create an instance of {@link PocztexKrajowyType }
     * 
     */
    public PocztexKrajowyType createPocztexKrajowyType() {
        return new PocztexKrajowyType();
    }

    /**
     * Create an instance of {@link PaczkaPocztowaType }
     * 
     */
    public PaczkaPocztowaType createPaczkaPocztowaType() {
        return new PaczkaPocztowaType();
    }

    /**
     * Create an instance of {@link PaczkaPocztowaPLUSType }
     * 
     */
    public PaczkaPocztowaPLUSType createPaczkaPocztowaPLUSType() {
        return new PaczkaPocztowaPLUSType();
    }

    /**
     * Create an instance of {@link PrzesylkaPobraniowaType }
     * 
     */
    public PrzesylkaPobraniowaType createPrzesylkaPobraniowaType() {
        return new PrzesylkaPobraniowaType();
    }

    /**
     * Create an instance of {@link PrzesylkaNaWarunkachSzczegolnychType }
     * 
     */
    public PrzesylkaNaWarunkachSzczegolnychType createPrzesylkaNaWarunkachSzczegolnychType() {
        return new PrzesylkaNaWarunkachSzczegolnychType();
    }

    /**
     * Create an instance of {@link PrzesylkaPoleconaKrajowaType }
     * 
     */
    public PrzesylkaPoleconaKrajowaType createPrzesylkaPoleconaKrajowaType() {
        return new PrzesylkaPoleconaKrajowaType();
    }

    /**
     * Create an instance of {@link PrzesylkaHandlowaType }
     * 
     */
    public PrzesylkaHandlowaType createPrzesylkaHandlowaType() {
        return new PrzesylkaHandlowaType();
    }

    /**
     * Create an instance of {@link PrzesylkaListowaZadeklarowanaWartoscType }
     * 
     */
    public PrzesylkaListowaZadeklarowanaWartoscType createPrzesylkaListowaZadeklarowanaWartoscType() {
        return new PrzesylkaListowaZadeklarowanaWartoscType();
    }

    /**
     * Create an instance of {@link EPrzesylkaType }
     * 
     */
    public EPrzesylkaType createEPrzesylkaType() {
        return new EPrzesylkaType();
    }

    /**
     * Create an instance of {@link PobranieType }
     * 
     */
    public PobranieType createPobranieType() {
        return new PobranieType();
    }

    /**
     * Create an instance of {@link PrzesylkaPoleconaZagranicznaType }
     * 
     */
    public PrzesylkaPoleconaZagranicznaType createPrzesylkaPoleconaZagranicznaType() {
        return new PrzesylkaPoleconaZagranicznaType();
    }

    /**
     * Create an instance of {@link PrzesylkaZadeklarowanaWartoscZagranicznaType }
     * 
     */
    public PrzesylkaZadeklarowanaWartoscZagranicznaType createPrzesylkaZadeklarowanaWartoscZagranicznaType() {
        return new PrzesylkaZadeklarowanaWartoscZagranicznaType();
    }

    /**
     * Create an instance of {@link PrzesylkaZagranicznaType }
     * 
     */
    public PrzesylkaZagranicznaType createPrzesylkaZagranicznaType() {
        return new PrzesylkaZagranicznaType();
    }

    /**
     * Create an instance of {@link PrzesylkaBiznesowaType }
     * 
     */
    public PrzesylkaBiznesowaType createPrzesylkaBiznesowaType() {
        return new PrzesylkaBiznesowaType();
    }

    /**
     * Create an instance of {@link SubPrzesylkaBiznesowaType }
     * 
     */
    public SubPrzesylkaBiznesowaType createSubPrzesylkaBiznesowaType() {
        return new SubPrzesylkaBiznesowaType();
    }

    /**
     * Create an instance of {@link SubPrzesylkaBiznesowaPlusType }
     * 
     */
    public SubPrzesylkaBiznesowaPlusType createSubPrzesylkaBiznesowaPlusType() {
        return new SubPrzesylkaBiznesowaPlusType();
    }

    /**
     * Create an instance of {@link PrzesylkaBiznesowaPlusType }
     * 
     */
    public PrzesylkaBiznesowaPlusType createPrzesylkaBiznesowaPlusType() {
        return new PrzesylkaBiznesowaPlusType();
    }

    /**
     * Create an instance of {@link OpakowanieType }
     * 
     */
    public OpakowanieType createOpakowanieType() {
        return new OpakowanieType();
    }

    /**
     * Create an instance of {@link PunktWydaniaPrzesylkiBiznesowejPlus }
     * 
     */
    public PunktWydaniaPrzesylkiBiznesowejPlus createPunktWydaniaPrzesylkiBiznesowejPlus() {
        return new PunktWydaniaPrzesylkiBiznesowejPlus();
    }

    /**
     * Create an instance of {@link ZwrotDokumentowType }
     * 
     */
    public ZwrotDokumentowType createZwrotDokumentowType() {
        return new ZwrotDokumentowType();
    }

    /**
     * Create an instance of {@link OdbiorPrzesylkiOdNadawcyType }
     * 
     */
    public OdbiorPrzesylkiOdNadawcyType createOdbiorPrzesylkiOdNadawcyType() {
        return new OdbiorPrzesylkiOdNadawcyType();
    }

    /**
     * Create an instance of {@link PotwierdzenieDoreczeniaType }
     * 
     */
    public PotwierdzenieDoreczeniaType createPotwierdzenieDoreczeniaType() {
        return new PotwierdzenieDoreczeniaType();
    }

    /**
     * Create an instance of {@link RodzajListType }
     * 
     */
    public RodzajListType createRodzajListType() {
        return new RodzajListType();
    }

    /**
     * Create an instance of {@link PotwierdzenieOdbioruType }
     * 
     */
    public PotwierdzenieOdbioruType createPotwierdzenieOdbioruType() {
        return new PotwierdzenieOdbioruType();
    }

    /**
     * Create an instance of {@link DoreczenieType }
     * 
     */
    public DoreczenieType createDoreczenieType() {
        return new DoreczenieType();
    }

    /**
     * Create an instance of {@link DoreczenieUslugaPocztowaType }
     * 
     */
    public DoreczenieUslugaPocztowaType createDoreczenieUslugaPocztowaType() {
        return new DoreczenieUslugaPocztowaType();
    }

    /**
     * Create an instance of {@link DoreczenieUslugaKurierskaType }
     * 
     */
    public DoreczenieUslugaKurierskaType createDoreczenieUslugaKurierskaType() {
        return new DoreczenieUslugaKurierskaType();
    }

    /**
     * Create an instance of {@link PaczkaZagranicznaType }
     * 
     */
    public PaczkaZagranicznaType createPaczkaZagranicznaType() {
        return new PaczkaZagranicznaType();
    }

    /**
     * Create an instance of {@link LokalizacjaGeograficznaType }
     * 
     */
    public LokalizacjaGeograficznaType createLokalizacjaGeograficznaType() {
        return new LokalizacjaGeograficznaType();
    }

    /**
     * Create an instance of {@link WspolrzednaGeograficznaType }
     * 
     */
    public WspolrzednaGeograficznaType createWspolrzednaGeograficznaType() {
        return new WspolrzednaGeograficznaType();
    }

    /**
     * Create an instance of {@link ZwrotType }
     * 
     */
    public ZwrotType createZwrotType() {
        return new ZwrotType();
    }

    /**
     * Create an instance of {@link ListZwyklyType }
     * 
     */
    public ListZwyklyType createListZwyklyType() {
        return new ListZwyklyType();
    }

    /**
     * Create an instance of {@link ListZwyklyFirmowyType }
     * 
     */
    public ListZwyklyFirmowyType createListZwyklyFirmowyType() {
        return new ListZwyklyFirmowyType();
    }

    /**
     * Create an instance of {@link ReklamowaType }
     * 
     */
    public ReklamowaType createReklamowaType() {
        return new ReklamowaType();
    }

    /**
     * Create an instance of {@link EPOSimpleType }
     * 
     */
    public EPOSimpleType createEPOSimpleType() {
        return new EPOSimpleType();
    }

    /**
     * Create an instance of {@link EPOExtendedType }
     * 
     */
    public EPOExtendedType createEPOExtendedType() {
        return new EPOExtendedType();
    }

    /**
     * Create an instance of {@link PrzesylkaFirmowaPoleconaType }
     * 
     */
    public PrzesylkaFirmowaPoleconaType createPrzesylkaFirmowaPoleconaType() {
        return new PrzesylkaFirmowaPoleconaType();
    }

    /**
     * Create an instance of {@link EPOInfoType }
     * 
     */
    public EPOInfoType createEPOInfoType() {
        return new EPOInfoType();
    }

    /**
     * Create an instance of {@link AwizoPrzesylkiType }
     * 
     */
    public AwizoPrzesylkiType createAwizoPrzesylkiType() {
        return new AwizoPrzesylkiType();
    }

    /**
     * Create an instance of {@link DoreczeniePrzesylkiType }
     * 
     */
    public DoreczeniePrzesylkiType createDoreczeniePrzesylkiType() {
        return new DoreczeniePrzesylkiType();
    }

    /**
     * Create an instance of {@link ZwrotPrzesylkiType }
     * 
     */
    public ZwrotPrzesylkiType createZwrotPrzesylkiType() {
        return new ZwrotPrzesylkiType();
    }

    /**
     * Create an instance of {@link UbezpieczenieType }
     * 
     */
    public UbezpieczenieType createUbezpieczenieType() {
        return new UbezpieczenieType();
    }

    /**
     * Create an instance of {@link EMSType }
     * 
     */
    public EMSType createEMSType() {
        return new EMSType();
    }

    /**
     * Create an instance of {@link DeklaracjaCelnaType }
     * 
     */
    public DeklaracjaCelnaType createDeklaracjaCelnaType() {
        return new DeklaracjaCelnaType();
    }

    /**
     * Create an instance of {@link SzczegolyDeklaracjiCelnejType }
     * 
     */
    public SzczegolyDeklaracjiCelnejType createSzczegolyDeklaracjiCelnejType() {
        return new SzczegolyDeklaracjiCelnejType();
    }

    /**
     * Create an instance of {@link PrzesylkaPaletowaType }
     * 
     */
    public PrzesylkaPaletowaType createPrzesylkaPaletowaType() {
        return new PrzesylkaPaletowaType();
    }

    /**
     * Create an instance of {@link PaletaType }
     * 
     */
    public PaletaType createPaletaType() {
        return new PaletaType();
    }

    /**
     * Create an instance of {@link PlatnikType }
     * 
     */
    public PlatnikType createPlatnikType() {
        return new PlatnikType();
    }

    /**
     * Create an instance of {@link SubPrzesylkaPaletowaType }
     * 
     */
    public SubPrzesylkaPaletowaType createSubPrzesylkaPaletowaType() {
        return new SubPrzesylkaPaletowaType();
    }

    /**
     * Create an instance of {@link UslugaPaczkowaType }
     * 
     */
    public UslugaPaczkowaType createUslugaPaczkowaType() {
        return new UslugaPaczkowaType();
    }

    /**
     * Create an instance of {@link SubUslugaPaczkowaType }
     * 
     */
    public SubUslugaPaczkowaType createSubUslugaPaczkowaType() {
        return new SubUslugaPaczkowaType();
    }

    /**
     * Create an instance of {@link UslugaKurierskaType }
     * 
     */
    public UslugaKurierskaType createUslugaKurierskaType() {
        return new UslugaKurierskaType();
    }

    /**
     * Create an instance of {@link SubUslugaKurierskaType }
     * 
     */
    public SubUslugaKurierskaType createSubUslugaKurierskaType() {
        return new SubUslugaKurierskaType();
    }

    /**
     * Create an instance of {@link PotwierdzenieOdbioruPaczkowaType }
     * 
     */
    public PotwierdzenieOdbioruPaczkowaType createPotwierdzenieOdbioruPaczkowaType() {
        return new PotwierdzenieOdbioruPaczkowaType();
    }

    /**
     * Create an instance of {@link ZwrotDokumentowKurierskaType }
     * 
     */
    public ZwrotDokumentowKurierskaType createZwrotDokumentowKurierskaType() {
        return new ZwrotDokumentowKurierskaType();
    }

    /**
     * Create an instance of {@link PotwierdzenieOdbioruKurierskaType }
     * 
     */
    public PotwierdzenieOdbioruKurierskaType createPotwierdzenieOdbioruKurierskaType() {
        return new PotwierdzenieOdbioruKurierskaType();
    }

    /**
     * Create an instance of {@link PowodReklamacjiType }
     * 
     */
    public PowodReklamacjiType createPowodReklamacjiType() {
        return new PowodReklamacjiType();
    }

    /**
     * Create an instance of {@link PowodSzczegolowyType }
     * 
     */
    public PowodSzczegolowyType createPowodSzczegolowyType() {
        return new PowodSzczegolowyType();
    }

    /**
     * Create an instance of {@link ListBiznesowyType }
     * 
     */
    public ListBiznesowyType createListBiznesowyType() {
        return new ListBiznesowyType();
    }

    /**
     * Create an instance of {@link GlobalExpresType }
     * 
     */
    public GlobalExpresType createGlobalExpresType() {
        return new GlobalExpresType();
    }

    /**
     * Create an instance of {@link PrzesylkaEZwrotPocztexType }
     * 
     */
    public PrzesylkaEZwrotPocztexType createPrzesylkaEZwrotPocztexType() {
        return new PrzesylkaEZwrotPocztexType();
    }

    /**
     * Create an instance of {@link PrzesylkaEZwrotPaczkaType }
     * 
     */
    public PrzesylkaEZwrotPaczkaType createPrzesylkaEZwrotPaczkaType() {
        return new PrzesylkaEZwrotPaczkaType();
    }

    /**
     * Create an instance of {@link DaneSentType }
     * 
     */
    public DaneSentType createDaneSentType() {
        return new DaneSentType();
    }

    /**
     * Create an instance of {@link AwizacjaType }
     * 
     */
    public AwizacjaType createAwizacjaType() {
        return new AwizacjaType();
    }

    /**
     * Create an instance of {@link PrzesylkaNierejestrowanaKrajowaType }
     * 
     */
    public PrzesylkaNierejestrowanaKrajowaType createPrzesylkaNierejestrowanaKrajowaType() {
        return new PrzesylkaNierejestrowanaKrajowaType();
    }

    /**
     * Create an instance of {@link ListWartosciowyKrajowyType }
     * 
     */
    public ListWartosciowyKrajowyType createListWartosciowyKrajowyType() {
        return new ListWartosciowyKrajowyType();
    }

    /**
     * Create an instance of {@link RelatedToAllegroType }
     * 
     */
    public RelatedToAllegroType createRelatedToAllegroType() {
        return new RelatedToAllegroType();
    }

    /**
     * Create an instance of {@link DeklaracjaCelna2Type }
     * 
     */
    public DeklaracjaCelna2Type createDeklaracjaCelna2Type() {
        return new DeklaracjaCelna2Type();
    }

    /**
     * Create an instance of {@link DokumentyTowarzyszaceType }
     * 
     */
    public DokumentyTowarzyszaceType createDokumentyTowarzyszaceType() {
        return new DokumentyTowarzyszaceType();
    }

    /**
     * Create an instance of {@link SzczegolyZawartosciPrzesylkiZagranicznejType }
     * 
     */
    public SzczegolyZawartosciPrzesylkiZagranicznejType createSzczegolyZawartosciPrzesylkiZagranicznejType() {
        return new SzczegolyZawartosciPrzesylkiZagranicznejType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEnvelopeResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendEnvelopeResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://e-nadawca.poczta-polska.pl", name = "sendEnvelopeResponse")
    public JAXBElement<SendEnvelopeResponseType> createSendEnvelopeResponse(SendEnvelopeResponseType value) {
        return new JAXBElement<SendEnvelopeResponseType>(_SendEnvelopeResponse_QNAME, SendEnvelopeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEnvelopeResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendEnvelopeResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://e-nadawca.poczta-polska.pl", name = "uploadIWDContentResponse")
    public JAXBElement<SendEnvelopeResponseType> createUploadIWDContentResponse(SendEnvelopeResponseType value) {
        return new JAXBElement<SendEnvelopeResponseType>(_UploadIWDContentResponse_QNAME, SendEnvelopeResponseType.class, null, value);
    }

}
