package pl.com.infratex.ordermanager.service.enadawca;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.integration.enadawca.ENadawcaManager;
import pl.com.infratex.ordermanager.integration.enadawca.exception.ENadawcaException;
import pl.com.infratex.ordermanager.service.OrderService;
import pl.com.infratex.ordermanager.service.mapper.ENadawcaMapper;
import pl.com.infratex.ordermanager.utils.OrderManagerDateUtils;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.poczta_polska.e_nadawca.PrzesylkaType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

import static pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator.ENADAWCA_BUFOR_ID_SEQ;

@Service
public class ENadawcaService {

    private static final Logger LOGGER = Logger.getLogger(ENadawcaService.class.getName());

    private ENadawcaMapper eNadawcaMapper;
    private SequenceIdGenerator sequenceIdGenerator;
    private OrderService orderService;
    private ENadawcaManager eNadawcaManager;

    public ENadawcaService(ENadawcaMapper eNadawcaMapper, SequenceIdGenerator sequenceIdGenerator, OrderService orderService) {
        this.eNadawcaMapper = eNadawcaMapper;
        this.sequenceIdGenerator = sequenceIdGenerator;
        this.orderService = orderService;

        eNadawcaManager = new ENadawcaManager();
    }

    public void send(List<AddressModel> addresses, LocalDate sendDate) {
        GregorianCalendar dataNadania = OrderManagerDateUtils.createGregorianCalendar(sendDate);
//        GregorianCalendar dataNadania = new GregorianCalendar();
//        dataNadania.setTime(Date.from(sendDate.atStartOfDay()
//                .atZone(ZoneId.systemDefault())
//                .toInstant()));
        //FIXME rzucić wyjątek biznesowy
        try {
            Integer generateId = sequenceIdGenerator.generateId(ENADAWCA_BUFOR_ID_SEQ);
            eNadawcaManager.elektronicznyNadawcaProperties(dataNadania, generateId,
                    "Amazon" + dataNadania.toZonedDateTime().format(DateTimeFormatter.BASIC_ISO_DATE));
            List<PrzesylkaType> przesylkaTypes = eNadawcaMapper.shipmentsSet(addresses);
            eNadawcaManager.addShipment(przesylkaTypes, generateId);
            LOGGER.info("####GeneratedID= " + generateId);
            LOGGER.info("####BuforName= " + "Amazon_" + dataNadania.toZonedDateTime().format(DateTimeFormatter.BASIC_ISO_DATE));
        } catch (ENadawcaException e) {
            e.printStackTrace();
        }

    }

    public List<ShipmentConfirmationModel> checkStatus(LocalDateTime newestLoadDate) throws OrderNotFoundException {
        LOGGER.info("checkStatus(" + newestLoadDate + ")");
        OrderModel orderModel = orderService.oldestUnshippedLabeledOrder();
        LocalDateTime oldestLoadDate = orderModel.getLoadDate();

        List<OrderModel> ordersByStatusLabeled = orderService.findOrdersByStatusLabeled();
        List<String> guids = orderService.extractNotNullGuids(ordersByStatusLabeled);

        List<ShipmentConfirmationModel> shipmentConfirmationModels =
                eNadawcaManager.checkStatus(ordersByStatusLabeled, guids, oldestLoadDate, newestLoadDate);

        LOGGER.info("checkStatus() = " + shipmentConfirmationModels);
        return shipmentConfirmationModels;
    }


}
