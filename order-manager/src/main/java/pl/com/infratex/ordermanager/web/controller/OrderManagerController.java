package pl.com.infratex.ordermanager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.com.infratex.ordermanager.api.exception.order.OrderManagerException;
import pl.com.infratex.ordermanager.service.OrderManagerService;
import pl.com.infratex.ordermanager.web.model.GenerateAddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.GENERATE_ADDRESS_MODEL_ATTRIBUTE;
import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.ORDERS_MODEL_ATTRIBUTE;
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
    public String ordersView(ModelMap model) throws IOException {
        orders(model);

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
    public String generate(@ModelAttribute(name = "generateAddress") GenerateAddressModel generateAddressModel, ModelMap model)
            throws OrderManagerException {
        LOGGER.info("generating: " + generateAddressModel);
//        if (generateAddressModel != null) {
        if (generateAddressModel.getSaveAll()) {
            orders(model);
            return ORDER_MANAGER_VIEW;
        } else {
            orderManagerService.generate(generateAddressModel);
            return "redirect:/" + SHIPMENT_MANAGER_URL;
        }
//        }
//        return ORDER_MANAGER_VIEW;
    }

    private void orders(ModelMap model) {
        List<OrderModel> orders = (List<OrderModel>) model.get(ORDERS_MODEL_ATTRIBUTE);
        if (orders == null) {
            orders = orderManagerService.filterByLatestBatchId();
        }

        GenerateAddressModel generateAddressModel = (GenerateAddressModel) model.get(GENERATE_ADDRESS_MODEL_ATTRIBUTE);
        if (generateAddressModel == null) {
            generateAddressModel = new GenerateAddressModel();
        }
        generateAddressModel.setOrders(orders);

        model.addAttribute(GENERATE_ADDRESS_MODEL_ATTRIBUTE, generateAddressModel);
        model.addAttribute(ORDERS_MODEL_ATTRIBUTE, orders);
    }

}
