package pl.com.infratex.ordermanager.service;

import net.sf.jasperreports.engine.JRException;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.integration.enadawca.ENadawcaManager;
import pl.com.infratex.ordermanager.service.enadawca.ENadawcaService;
import pl.com.infratex.ordermanager.service.generator.report.PackingSlipAddressPdfReportGenerator;
import pl.com.infratex.ordermanager.service.mapper.AddressModelMapper;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;

@Service
public class ShipmentManagerService {

    private static final Logger LOGGER = Logger.getLogger(ShipmentManagerService.class.getName());

    private OrderService orderService;
    private AddressService addressService;
    private AddressModelMapper addressModelMapper;
    private PackingSlipAddressPdfReportGenerator packingSlipAddressPdfReportGenerator;
    private ENadawcaService eNadawcaService;

    public ShipmentManagerService(OrderService orderService, AddressService addressService,
                                  AddressModelMapper addressModelMapper,
                                  PackingSlipAddressPdfReportGenerator packingSlipAddressPdfReportGenerator,
                                  ENadawcaService eNadawcaService) {
        this.orderService = orderService;
        this.addressService = addressService;
        this.addressModelMapper = addressModelMapper;
        this.packingSlipAddressPdfReportGenerator = packingSlipAddressPdfReportGenerator;
        this.eNadawcaService = eNadawcaService;
    }

    public List<OrderModel> list() {
        return orderService.ordersWithStatus(OrderStatusType.GENERATED);
    }

    public byte[] generatePackingSlips() {
        List<OrderModel> orders = orderService.ordersWithStatus(OrderStatusType.SENT_ENADAWCA);
        orders = orderService.sortByCustomsDeclarationRequired(orders,false);
        try {
            OutputStream outputStream = packingSlipAddressPdfReportGenerator.generatePdf(orders, "template.jrxml");
            orderService.updateOrderStatus(orders,OrderStatusType.LABELED);
            return ((ByteArrayOutputStream) outputStream).toByteArray();
        } catch (JRException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CompletableFuture<Boolean> send(SellerOrderReportModel sellerOrderReport){
        LOGGER.info("send(...)");
        generateCorrectedAddresses(sellerOrderReport);
        CompletableFuture<Boolean> sent = sendToENadawca(sellerOrderReport.getSendDate());
        removeCorrectedAddresses(sellerOrderReport);
        return sent;
    }

    private CompletableFuture<Boolean> sendToENadawca(LocalDate sendDate) {
        LOGGER.info("sendToENadawca("+sendDate+")");
        List<AddressModel> addresses = addressService.list();

        ENadawcaManager eNadawcaManager = new ENadawcaManager();
        List<String> guids = eNadawcaManager.generateGuids(addresses.size());

        List<AddressModel> addressesWithGuids = addressService.assignGuids(guids, addresses);
        List<OrderModel> orders = orderService.ordersWithStatus(OrderStatusType.GENERATED);
//        LOGGER.info("Orders before sent "+orders);
        orderService.updateOrdersWithGuids(addressesWithGuids, orders);
//        try {
        CompletableFuture<Boolean> sent = eNadawcaService.send(addressesWithGuids, sendDate, orders);
        return sent;

//        } catch (OrderNotFoundException e) {
//            e.printStackTrace();
//        }

    }

    void generateCorrectedAddresses(SellerOrderReportModel sellerOrderReportModel) {
        List<OrderModel> orders = sellerOrderReportModel.getOrders();
        List<AddressModel> addressModels = addressModelMapper.fromOrderModels(orders);
        addressService.saveAll(addressModels);
    }

    void removeCorrectedAddresses(SellerOrderReportModel sellerOrderReportModel) {
        List<OrderModel> orders = sellerOrderReportModel.getOrders();
        List<AddressModel> addressModels = addressModelMapper.fromOrderModels(orders);

        addressService.deleteAll(addressModels);
    }
}
