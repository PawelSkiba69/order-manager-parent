package pl.com.infratex.ordermanager.integration.enadawca.mapper;

import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationStatusType;
import pl.com.infratex.ordermanager.integration.enadawca.converter.ENadawcaXMLDateConverter;
import pl.poczta_polska.e_nadawca.PrzesylkaShortType;
import pl.poczta_polska.e_nadawca.StatusType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class ShipmentConfirmationMapper {
    public List<ShipmentConfirmationModel> map(List<PrzesylkaShortType> przesylkaShortTypes) {
        return przesylkaShortTypes.stream()
                .map(this::map)
                .collect(Collectors.toList());
    }

    public ShipmentConfirmationModel map(PrzesylkaShortType przesylkaShortType) {

        ShipmentConfirmationModel shipmentConfirmationModel = new ShipmentConfirmationModel();
        shipmentConfirmationModel.setNumerNadania(przesylkaShortType.getNumerNadania());
        shipmentConfirmationModel.setGuid(przesylkaShortType.getGuid());

        XMLGregorianCalendar xmlGregorianCalendarDataNadania = przesylkaShortType.getDataNadania();
        LocalDateTime localDateTimeDataNadania = ENadawcaXMLDateConverter.from(xmlGregorianCalendarDataNadania);
        shipmentConfirmationModel.setDataNadania(localDateTimeDataNadania);

        StatusType statusType = przesylkaShortType.getStatus();
        if (statusType != null) {
            shipmentConfirmationModel.setStatus(ShipmentConfirmationStatusType.fromValue(statusType.value()));
        }

        return shipmentConfirmationModel;
    }
}
