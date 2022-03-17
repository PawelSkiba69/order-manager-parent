package pl.com.infratex.ordermanager.service.mapper;

import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.web.model.AddressContentsModel;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.poczta_polska.e_nadawca.AdresType;
import pl.poczta_polska.e_nadawca.DeklaracaCelnaRodzajEnum;
import pl.poczta_polska.e_nadawca.DeklaracjaCelna2Type;
import pl.poczta_polska.e_nadawca.PrzesylkaPoleconaZagranicznaType;
import pl.poczta_polska.e_nadawca.PrzesylkaType;
import pl.poczta_polska.e_nadawca.SzczegolyZawartosciPrzesylkiZagranicznejType;
import pl.poczta_polska.e_nadawca.ZawartoscPrzesylkiZagranicznejEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component
public class ENadawcaMapper {

    public static final int ENADAWCA_MASA_200_GRAM = 200;
    public static final String HS_TARIFF_NUMBER = "854370";
    private static final Logger LOGGER = Logger.getLogger(ENadawcaMapper.class.getName());
    public static final int CURRENCY_MULTIPLY_VALUE_FACTOR = 100;

    public PrzesylkaPoleconaZagranicznaType fromAddressModelToPrzesylkaPoleconaZagraniczna(AddressModel addressModel) {

        //   LOGGER.info("addressModel: "+addressModel);
        PrzesylkaPoleconaZagranicznaType przesylkaPoleconaZagranicznaType = new PrzesylkaPoleconaZagranicznaType();
        przesylkaPoleconaZagranicznaType.setMasa(ENADAWCA_MASA_200_GRAM);

        AdresType adresType = new AdresType();
        adresType.setKraj(addressModel.getShipCountry());
        adresType.setMiejscowosc(addressModel.getShipCity());
        adresType.setKodPocztowy(addressModel.getShipPostalCode());
        adresType.setNazwa(addressModel.getRecipientName());
        adresType.setNazwa2(addressModel.getShipAddress1());
        adresType.setUlica(addressModel.getShipAddress2());

        DeklaracaCelnaRodzajEnum deklaracaCelnaRodzaj = addressModel.getDeklaracaCelnaRodzaj();
        LOGGER.info("deklaracaCelnaRodzaj: " + deklaracaCelnaRodzaj);
        if (deklaracaCelnaRodzaj != null) {
            DeklaracjaCelna2Type deklaracjaCelna2Type = new DeklaracjaCelna2Type();
//        deklaracjaCelna2Type.setNumerReferencyjnyCelny();
//        deklaracjaCelna2Type.setNumerReferencyjnyImportera();
//        deklaracjaCelna2Type.setNumerTelefonuImportera();
//        deklaracjaCelna2Type.setOplatyPocztowe();
//        deklaracjaCelna2Type.setUwagi();
//        deklaracjaCelna2Type.setWyjasnienie();
            deklaracjaCelna2Type.setRodzaj(deklaracaCelnaRodzaj);
            deklaracjaCelna2Type.setWalutaKodISO(addressModel.getCurrency());
            deklaracjaCelna2Type.setZawartoscPrzesylki(ZawartoscPrzesylkiZagranicznejEnum.SPRZEDAZ_TOWARU);

            for (AddressContentsModel addressContent : addressModel.getAddressContents()) {
                SzczegolyZawartosciPrzesylkiZagranicznejType szczegolyZawartosciPrzesylkiZagranicznejType =
                        new SzczegolyZawartosciPrzesylkiZagranicznejType();
                szczegolyZawartosciPrzesylkiZagranicznejType.setIlosc(addressContent.getQuantity());
                szczegolyZawartosciPrzesylkiZagranicznejType.setKrajPochodzeniaKodAlfa2(addressContent.getOriginCountryCode());
                szczegolyZawartosciPrzesylkiZagranicznejType.setMasaNetto(addressContent.getWeight());
                szczegolyZawartosciPrzesylkiZagranicznejType.setNumerTaryfyHs(HS_TARIFF_NUMBER);
                szczegolyZawartosciPrzesylkiZagranicznejType.setOkreslenieZawartosci(addressContent.getDescription());
                //NOTE ENadawca dzieli wartość przez 100
                if (addressContent.getValue() != null) {
                    szczegolyZawartosciPrzesylkiZagranicznejType.setWartosc((addressContent.getValue().floatValue()) * CURRENCY_MULTIPLY_VALUE_FACTOR);
                }
                deklaracjaCelna2Type.getSzczegolyZawartosciPrzesylki().add(szczegolyZawartosciPrzesylkiZagranicznejType);
            }

            LOGGER.info("deklaracaCelnaRodzaj: " + deklaracaCelnaRodzaj);
            przesylkaPoleconaZagranicznaType.setDeklaracjaCelna2(deklaracjaCelna2Type);
        }

        przesylkaPoleconaZagranicznaType.setAdres(adresType);
        przesylkaPoleconaZagranicznaType.setGuid(addressModel.getGuid());

        LOGGER.info("przesylkaPoleconaZagranicznaType: " + przesylkaPoleconaZagranicznaType);
        return przesylkaPoleconaZagranicznaType;
    }

    public List<PrzesylkaType> shipmentsSet(List<AddressModel> addresses) {
        List<PrzesylkaType> shipments = new ArrayList<>();

        for (AddressModel address : addresses) {
            shipments.add(fromAddressModelToPrzesylkaPoleconaZagraniczna(address));
        }
        return shipments;
    }


}
