package pl.com.infratex.ordermanager.integration.enadawca.mapper;

import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationStatusType;
import pl.com.infratex.ordermanager.integration.enadawca.converter.ENadawcaXMLDateConverter;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.poczta_polska.e_nadawca.PrzesylkaShortType;
import pl.poczta_polska.e_nadawca.StatusType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShipmentConfirmationMerger {
    public List<ShipmentConfirmationModel> merge(List<PrzesylkaShortType> przesylkaShortTypes, List<OrderModel> orders) {

        List<ShipmentConfirmationModel> shipmentConfirmationModels = new ArrayList<>();

        przesylkaShortTypes.forEach(przesylkaShortType -> {
            orders.forEach(orderModel -> {
                ShipmentConfirmationModel shipmentConfirmationModel = merge(przesylkaShortType, orderModel);
                if (shipmentConfirmationModel != null) {
                    shipmentConfirmationModels.add(shipmentConfirmationModel);
                }
            });
        });

        return shipmentConfirmationModels;
    }

    public ShipmentConfirmationModel merge(PrzesylkaShortType przesylkaShortType, OrderModel orderModel) {

        String guid = przesylkaShortType.getGuid();

        if (guid.equalsIgnoreCase(orderModel.getGuid())) {
            ShipmentConfirmationModel shipmentConfirmationModel = new ShipmentConfirmationModel();
            shipmentConfirmationModel.setNumerNadania(przesylkaShortType.getNumerNadania());
            shipmentConfirmationModel.setGuid(guid);

            XMLGregorianCalendar xmlGregorianCalendarDataNadania = przesylkaShortType.getDataNadania();
            LocalDateTime localDateTimeDataNadania = ENadawcaXMLDateConverter.from(xmlGregorianCalendarDataNadania);
            shipmentConfirmationModel.setDataNadania(localDateTimeDataNadania);

            StatusType statusType = przesylkaShortType.getStatus();
            if (statusType != null) {
                shipmentConfirmationModel.setStatus(ShipmentConfirmationStatusType.fromValue(statusType.value()));
            }

            shipmentConfirmationModel.setOrderId(orderModel.getOrderId());
            shipmentConfirmationModel.setCarrierCode(orderModel.getClient().getShipCountry());//Fixme nullPointerException i dodać konwerter

            return shipmentConfirmationModel;
        }
        return null;
    }
}
