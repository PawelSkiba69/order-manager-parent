package pl.com.infratex.ordermanager.integration.enadawca.mapper;

import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationStatusType;
import pl.com.infratex.ordermanager.integration.enadawca.converter.ENadawcaXMLDateConverter;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.coverter.CarrierCodeConverter;
import pl.poczta_polska.e_nadawca.PrzesylkaShortType;
import pl.poczta_polska.e_nadawca.StatusType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ShipmentConfirmationMerger {

    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationMerger.class.getName());

    public List<ShipmentConfirmationModel> merge(List<PrzesylkaShortType> przesylkaShortTypes, List<OrderModel> orders) {

        LOGGER.info("merge()");
        LOGGER.info("przesylkaShortTypes: " + przesylkaShortTypes);
        LOGGER.info("orders: " + orders);

        List<ShipmentConfirmationModel> shipmentConfirmationModels = new ArrayList<>();

        przesylkaShortTypes.forEach(przesylkaShortType -> {
            orders.forEach(orderModel -> {
                ShipmentConfirmationModel shipmentConfirmationModel = merge(przesylkaShortType, orderModel);
                if (shipmentConfirmationModel != null) {
                    shipmentConfirmationModels.add(shipmentConfirmationModel);
                }
            });
        });

        LOGGER.info("merge(...) = " + shipmentConfirmationModels);
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

            CarrierCodeConverter carrierCodeConverter = new CarrierCodeConverter();
            shipmentConfirmationModel.setOrderId(orderModel.getOrderId());
            shipmentConfirmationModel.setOId(orderModel.getOId());

            ClientModel client = orderModel.getClient();
            if (client != null) {
                String shipCountry = client.getShipCountry();
                shipmentConfirmationModel.setCarrierCode(carrierCodeConverter.convert(shipCountry));
            }

            return shipmentConfirmationModel;
        }
        return null;
    }
}
