package pl.com.infratex.ordermanager.web.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import pl.com.infratex.ordermanager.api.exception.order.OrderManagerException;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.service.OrderManagerService;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.GenerateAddressModel;
import pl.com.infratex.ordermanager.web.model.NoCustomsDeclarationShipCountry;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.CURRENT_PAGE_SESSION;
import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.GENERATE_ADDRESS_MODEL_ATTRIBUTE;
import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.ORDERS_MODEL_ATTRIBUTE;
import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.ORDER_MANAGEMENT_URI;
import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.ORDER_MANAGER_VIEW;
import static pl.com.infratex.ordermanager.web.controller.ControllerConstants.SHIPMENT_MANAGER_URL;

@Controller
@RequestMapping(value = ORDER_MANAGEMENT_URI)
@SessionAttributes(names = {ORDERS_MODEL_ATTRIBUTE, GENERATE_ADDRESS_MODEL_ATTRIBUTE, CURRENT_PAGE_SESSION})
public class OrderManagerController {
    private static final Logger LOGGER = Logger.getLogger(OrderManagerController.class.getName());

    private final OrderManagerService orderManagerService;

    public OrderManagerController(OrderManagerService orderManagerService) {
        this.orderManagerService = orderManagerService;
    }

    @GetMapping
    public String ordersView(ModelMap model) throws IOException {
        LOGGER.info("ordersView(...)");
        model.addAttribute(CURRENT_PAGE_SESSION,"order-management");
        orders(model);

        return ORDER_MANAGER_VIEW;
    }

    @PostMapping(value = "/upload")
    public String send(@RequestParam("file-unshipped-orders") MultipartFile fileUnshippedOrders,
                       @RequestParam("file-new-orders") MultipartFile fileNewOrders, Model model) throws IOException, OrderNotFoundException {
        List<OrderModel> orders = orderManagerService.uploadAndUpdateUnshippedOrders(fileUnshippedOrders.getInputStream(), fileNewOrders.getInputStream());
        model.addAttribute("orders", orders);
        return "redirect:" + ORDER_MANAGEMENT_URI;
    }

    @GetMapping(value = "/upload")
    public String uploadFromAmazon(Model model) throws IOException {
        LOGGER.info("uploadFromAmazon()");
        SellerOrderReportModel sellerOrderReportModel = orderManagerService.createSellerOrderReportFromAmazon();
        model.addAttribute("orders", sellerOrderReportModel.getOrders());
//        return ORDER_MANAGER_VIEW;
        return "redirect:"+ORDER_MANAGEMENT_URI;
    }

    @PostMapping(value = "/generate")
    public String generate(@ModelAttribute(name = "generateAddress") GenerateAddressModel generateAddressModel, ModelMap model)
            throws OrderManagerException {
//        LOGGER.info("generating: " + generateAddressModel);
        if (generateAddressModel.getSaveAll()) {
            LOGGER.info("SaveAll TRUE!");
            List<OrderModel> orders = orders(model);
            orderManagerService.updateOrders(SellerOrderReportModel.builder().orders(orders).build());
            generateAddressModel.setSaveAll(false);
            return "redirect:" + ORDER_MANAGEMENT_URI;
        } else {
            LOGGER.info("SaveAll FALSE!");
            orderManagerService.generate(generateAddressModel);
            return "redirect:" + SHIPMENT_MANAGER_URL;
        }
    }

    @PostMapping(value = "/generate-mcf-rest")
    public ResponseEntity<Resource> generateMcfRest(@RequestParam(value = "s[]") List<Long> oIds) {
        LOGGER.info("generateMcfRest(" + oIds + ")");
        List<OrderModel> orderModels = orderManagerService.orderModelsByoIds(oIds);

        InputStream inputStream = orderManagerService.generateMultiChannelFulfillmentReport(orderModels);

        Resource file = new InputStreamResource(inputStream);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + "report-mcf.csv" + "\"").body(file);

        //return "redirect:" + ORDER_MANAGEMENT_URI;
    }

    @GetMapping(value = "/generate-mcf")
    @ResponseBody
    //public byte[] generateMcf() throws OrderManagerException, IOException {
    public ResponseEntity<Resource> generateMcf() {
        LOGGER.info("generateMcf()");
        ProductModel productModel = ProductModel.builder()
                .productName("Remote control Grandin")
                .sku("23AWAEG")
                .build();

        ClientModel clientModel = new ClientModel();
        clientModel.setRecipientName("Janusz");
        clientModel.setShipAddress1("Brzozowa 10");
        clientModel.setShipAddress2("lokal 3");
        clientModel.setShipCity("Warszawa");
        clientModel.setShipPostalCode("34-233");
        clientModel.setShipCountry("GB");
        clientModel.setBuyerEmail("w16ckfncfrjtgkb@marketplace.amazon.co.uk");

        InputStream inputStream = orderManagerService.generateMultiChannelFulfillmentReport(
                Arrays.asList(
                        OrderModel.builder()
                                .orderId("9849-442-4-224-24")
                                .orderItemId("235-252-244-2")
                                .currency("EUR")
                                .itemPrice(BigDecimal.valueOf(10L))
                                .product(productModel)
                                .client(clientModel)
                                .build()
                )
        );

        //ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        //IOUtils.copy(inputStream,outputStream);
        //byte[] bytes = outputStream.toByteArray();

        Resource file = new InputStreamResource(inputStream);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + "report-mcf.csv" + "\"").body(file);

        //return bytes;
    }

    private List<OrderModel> orders(ModelMap model) {
        List<OrderModel> orders = (List<OrderModel>) model.get(ORDERS_MODEL_ATTRIBUTE);
        if (orders == null) {
//            orders = orderManagerService.filterByLatestBatchId();
            orders = orderManagerService.findOrdersByStatusNotShippedAmazon();
        }

        Comparator<OrderModel> comparator = Comparator.comparing(orderModel -> orderModel.getProduct().getInternalId(),
                Comparator.nullsLast(Comparator.reverseOrder()));
        comparator = comparator.thenComparing(orderModel -> orderModel.getPurchaseDate());

        orders = orders.stream()
                .filter(order -> {
                    if (order.getClient() != null) {
                        ClientModel client = order.getClient();
                        String shipCountry = client.getShipCountry();
                        for (NoCustomsDeclarationShipCountry country : NoCustomsDeclarationShipCountry.values()) {
                            if (country.name().equalsIgnoreCase(shipCountry)) {
                                return true;
                            }
                        }
                    }
                    return false;
                })
                .sorted(comparator)
                .collect(Collectors.toList());

        GenerateAddressModel generateAddressModel = (GenerateAddressModel) model.get(GENERATE_ADDRESS_MODEL_ATTRIBUTE);
        if (generateAddressModel == null) {
            generateAddressModel = new GenerateAddressModel();
        }
        generateAddressModel.setOrders(orders);

        model.addAttribute(GENERATE_ADDRESS_MODEL_ATTRIBUTE, generateAddressModel);
        model.addAttribute(ORDERS_MODEL_ATTRIBUTE, orders);

        return orders;
    }

}
