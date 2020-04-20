package pl.com.infratex.ordermanager.web.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.com.infratex.ordermanager.api.exception.order.OrderManagerException;
import pl.com.infratex.ordermanager.service.OrderManagerService;
import pl.com.infratex.ordermanager.service.ShipmentManagerService;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;
import pl.com.infratex.ordermanager.web.model.coverter.OrderModelConverter;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.SHIPMENT_MANAGER_STATUS_VIEW;
import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.SHIPMENT_MANAGER_VIEW;


@Controller
@RequestMapping(value = "/shipment-management")
public class ShipmentManagerController {

    private static final Logger LOGGER = Logger.getLogger(ShipmentManagerController.class.getName());

    private ShipmentManagerService shipmentManagerService;
    private OrderManagerService orderManagerService;

    public ShipmentManagerController(ShipmentManagerService shipmentManagerService,
                                     OrderManagerService orderManagerService) {
        this.shipmentManagerService = shipmentManagerService;
        this.orderManagerService = orderManagerService;
    }

    @GetMapping
    public String orders(Model model) throws IOException {
        List<OrderModel> orders = shipmentManagerService.list();
        LOGGER.info("Orders: " + orders);
        SellerOrderReportModel sellerOrderReportModel = new SellerOrderReportModel();
        sellerOrderReportModel.setOrders(OrderModelConverter.convert(orders));

        model.addAttribute("sellerOrderReport", sellerOrderReportModel);
        return SHIPMENT_MANAGER_VIEW;
    }

    @PostMapping(value = "/send")//)
    public String send(@ModelAttribute(name = "sellerOrderReport") SellerOrderReportModel sellerOrderReport,
                       @RequestParam("sendDate") @DateTimeFormat(pattern = "MM/dd/yyyy") Date sendDate) {

        LOGGER.info("Sending ...");
        LOGGER.info("SellerOrderReportModel: " + sellerOrderReport);
        LOGGER.info("Data wysylania:  " + sendDate);
        shipmentManagerService.generateCorrectedAddresses(sellerOrderReport);
        shipmentManagerService.send(sendDate);

        return SHIPMENT_MANAGER_STATUS_VIEW;
    }

    @GetMapping(value = "/generate", produces = MediaType.APPLICATION_PDF_VALUE)
    @ResponseBody
    public byte[] generate() throws OrderManagerException {
        return shipmentManagerService.generatePackingSlips();
    }
}
