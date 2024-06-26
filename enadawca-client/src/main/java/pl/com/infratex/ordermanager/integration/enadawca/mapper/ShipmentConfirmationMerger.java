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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ShipmentConfirmationMerger {

    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationMerger.class.getName());
    public static final String CARRIER_CODE_OTHER = "other";
    public static final String SHIP_METHOD_POCZTA_POLSKA = "Poczta Polska";

    public List<ShipmentConfirmationModel> merge(List<PrzesylkaShortType> przesylkaShortTypes, List<OrderModel> orders) {

        LOGGER.info("merge()");
        //LOGGER.info("przesylkaShortTypes: " + przesylkaShortTypes);
        //LOGGER.info("orders: " + orders);

        List<ShipmentConfirmationModel> shipmentConfirmationModels = new ArrayList<>();

        przesylkaShortTypes.forEach(przesylkaShortType -> {
            orders.forEach(orderModel -> {
                ShipmentConfirmationModel shipmentConfirmationModel = merge(przesylkaShortType, orderModel);
                if (shipmentConfirmationModel != null) {
                    shipmentConfirmationModels.add(shipmentConfirmationModel);
                    LOGGER.info("ShipmentConfirmationModel: "+shipmentConfirmationModel);
                }
            });
        });

//        LOGGER.info("merge(...) = " + shipmentConfirmationModels);
        return shipmentConfirmationModels;
    }

    public ShipmentConfirmationModel merge(PrzesylkaShortType przesylkaShortType, OrderModel orderModel) {

        String guid = przesylkaShortType.getGuid();

        if (guid.equalsIgnoreCase(orderModel.getGuid())) {
            ShipmentConfirmationModel shipmentConfirmationModel = new ShipmentConfirmationModel();
            shipmentConfirmationModel.setNumerNadania(przesylkaShortType.getNumerNadania());
            shipmentConfirmationModel.setGuid(guid);

            XMLGregorianCalendar xmlGregorianCalendarDataNadania = przesylkaShortType.getDataNadania();
            LocalDate localDateDataNadania = ENadawcaXMLDateConverter.from(xmlGregorianCalendarDataNadania);
            shipmentConfirmationModel.setDataNadania(localDateDataNadania);

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
                shipmentConfirmationModel.setCarrierName(carrierCodeConverter.convert(shipCountry));
                shipmentConfirmationModel.setCarrierCode(CARRIER_CODE_OTHER);
                shipmentConfirmationModel.setShipMethod(SHIP_METHOD_POCZTA_POLSKA);
            }
            return shipmentConfirmationModel;
        }
        return null;
    }
}
