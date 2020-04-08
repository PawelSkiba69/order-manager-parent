package pl.com.infratex.ordermanager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.com.infratex.ordermanager.api.exception.order.OrderManagerException;
import pl.com.infratex.ordermanager.service.OrderManagerService;
import pl.com.infratex.ordermanager.web.model.GenerateAddressModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.IOException;
import java.util.logging.Logger;

import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.ORDER_MANAGER_VIEW;
import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.SHIPMENT_MANAGER_URL;

@Controller
@RequestMapping(value = "order-management")
public class OrderManagerController {

    private static final Logger LOGGER = Logger.getLogger(OrderManagerController.class.getName());

    private OrderManagerService orderManagerService;

    public OrderManagerController(OrderManagerService orderManagerService) {
        this.orderManagerService = orderManagerService;
    }

    @GetMapping
    public String orders(Model model) throws IOException {
//        List<OrderModel> orders = orderManagerService.list();
//        model.addAttribute("orders", orders);

        return ORDER_MANAGER_VIEW;
    }

    @PostMapping(value = "/upload")
    public String send(@RequestParam("file-unshipped-orders") MultipartFile fileUnshippedOrders,
                       @RequestParam("file-new-orders") MultipartFile fileNewOrders, Model model) throws IOException {
        SellerOrderReportModel sellerOrderReportModel = orderManagerService.createSellerOrderReport(
                fileUnshippedOrders.getInputStream(), fileNewOrders.getInputStream());
        model.addAttribute("orders", sellerOrderReportModel.getOrders());
        return ORDER_MANAGER_VIEW;
    }

    @PostMapping(value = "/generate")
    public String generate(@ModelAttribute(name = "generateAddress") GenerateAddressModel generateAddressModel)
            throws OrderManagerException {
        LOGGER.info("generating: " + generateAddressModel);
        orderManagerService.generate(generateAddressModel);
        return "redirect:/" + SHIPMENT_MANAGER_URL;
    }
}
