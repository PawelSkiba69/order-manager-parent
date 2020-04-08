package pl.com.infratex.ordermanager.service.mapper;

import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.poczta_polska.e_nadawca.AdresType;
import pl.poczta_polska.e_nadawca.PrzesylkaPoleconaZagranicznaType;
import pl.poczta_polska.e_nadawca.PrzesylkaType;

import java.util.ArrayList;
import java.util.List;

@Component
public class ENadawcaMapper {

    public static final int ENADAWCA_MASA_200_GRAM = 200;

    public PrzesylkaPoleconaZagranicznaType fromAddressModelToPrzesylkaPoleconaZagraniczna(AddressModel addressModel) {
        PrzesylkaPoleconaZagranicznaType przesylkaPoleconaZagranicznaType = new PrzesylkaPoleconaZagranicznaType();
        przesylkaPoleconaZagranicznaType.setMasa(ENADAWCA_MASA_200_GRAM);

        AdresType adresType = new AdresType();
        adresType.setKraj(addressModel.getShipCountry());
        adresType.setMiejscowosc(addressModel.getShipCity());
        adresType.setKodPocztowy(addressModel.getShipPostalCode());
        adresType.setNazwa(addressModel.getRecipientName());
        adresType.setNazwa2(addressModel.getShipAddress1());
        adresType.setUlica(addressModel.getShipAddress2());

        przesylkaPoleconaZagranicznaType.setAdres(adresType);
        przesylkaPoleconaZagranicznaType.setGuid(addressModel.getGuid());

        return przesylkaPoleconaZagranicznaType;
    }

    public List<PrzesylkaType> shipmentsSet(List<AddressModel>addresses){
        List<PrzesylkaType> shipments=new ArrayList<>();

        for (AddressModel address : addresses) {
            shipments.add(fromAddressModelToPrzesylkaPoleconaZagraniczna(address));
        }


        return shipments;
    }



}
