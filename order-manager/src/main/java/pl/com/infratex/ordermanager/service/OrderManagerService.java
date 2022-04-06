package pl.com.infratex.ordermanager.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.api.exception.order.AmazonCsvOrderProcessorException;
import pl.com.infratex.ordermanager.api.exception.order.OrderManagerException;
import pl.com.infratex.ordermanager.api.exception.order.OrderMultiChannelFulfillmentCsvProcessorException;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.dao.entity.ClientEntity;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.dao.entity.OrderLoadedEntity;
import pl.com.infratex.ordermanager.dao.entity.ProductEntity;
import pl.com.infratex.ordermanager.dao.repository.ClientRepository;
import pl.com.infratex.ordermanager.dao.repository.OrderLoadedRepository;
import pl.com.infratex.ordermanager.dao.repository.OrderRepository;
import pl.com.infratex.ordermanager.dao.repository.ProductRepository;
import pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator;
import pl.com.infratex.ordermanager.integration.amazon.order.report.AmazonOrderReportResult;
import pl.com.infratex.ordermanager.integration.amazon.order.report.AmazonOrderReportService;
import pl.com.infratex.ordermanager.service.csv.order.OrderMultiChannelFulfillmentCsvProcessor;
import pl.com.infratex.ordermanager.service.csv.processor.AmazonCsvOrdersMergeProcessor;
import pl.com.infratex.ordermanager.service.mapper.OrderModelMapper;
import pl.com.infratex.ordermanager.service.mapper.SellerOrderReportMapper;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;
import pl.com.infratex.ordermanager.service.model.ProductMappingCondition;
import pl.com.infratex.ordermanager.web.model.GenerateAddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductMappingModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator.ORDER_BATCH_ID_SEQ;

@Service
public class OrderManagerService {

    private static final Logger LOGGER = Logger.getLogger(OrderManagerService.class.getName());

    private final OrderService orderService;
    private final OrderVerifierService orderVerifierService;
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final ClientRepository clientRepository;
    private final SellerOrderReportMapper sellerOrderReportMapper;
    private final OrderModelMapper orderModelMapper;
    private final ProductMappingService productMappingService;
    private final SequenceIdGenerator sequenceIdGenerator;
    private final OrderLoadedRepository orderLoadedRepository;
    private final AmazonOrderReportService amazonOrderReportService;
    private final OrderMultiChannelFulfillmentCsvProcessor orderMultiChannelFulfillmentCsvProcessor;

    public OrderManagerService(OrderService orderService, OrderVerifierService orderVerifierService, OrderRepository orderRepository,
                               ProductRepository productRepository, ClientRepository clientRepository,
                               SellerOrderReportMapper sellerOrderReportMapper, OrderModelMapper orderModelMapper,
                               ProductMappingService productMappingService, SequenceIdGenerator sequenceIdGenerator,
                               OrderLoadedRepository orderLoadedRepository, AmazonOrderReportService amazonOrderReportService, OrderMultiChannelFulfillmentCsvProcessor orderMultiChannelFulfillmentCsvProcessor) {
        this.orderService = orderService;
        this.orderVerifierService = orderVerifierService;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.clientRepository = clientRepository;
        this.sellerOrderReportMapper = sellerOrderReportMapper;
        this.orderModelMapper = orderModelMapper;
        this.productMappingService = productMappingService;
        this.sequenceIdGenerator = sequenceIdGenerator;
        this.orderLoadedRepository = orderLoadedRepository;
        this.amazonOrderReportService = amazonOrderReportService;
        this.orderMultiChannelFulfillmentCsvProcessor = orderMultiChannelFulfillmentCsvProcessor;
    }

    public List<OrderModel> uploadAndUpdateUnshippedOrders(InputStream inputStreamUnshippedOrders, InputStream inputStreamNewOrders)
            throws IOException, OrderNotFoundException,AmazonCsvOrderProcessorException {
        LOGGER.info("uploadUnshippedOrders()");
        SellerOrderReportModel sellerOrderReportModel = createSellerOrderReport(inputStreamUnshippedOrders, inputStreamNewOrders);
        List<OrderModel> orders = sellerOrderReportModel.getOrders();
        orderVerifierService.markOrderStatusUnknown(orders);
        deleteOrdersByStatusShippedAmazonOrUnknownOlderThanThreeDays();
        return orders;
    }

    public List<OrderModel> filterByLatestBatchId() {
        return orderService.filterByLatestBatchId();
    }

    public List<OrderModel> sortByCustomsDeclarationRequired(List<OrderModel> orders, boolean extraSortInternalIdPurchaseDate) {
        LOGGER.info("sortByCustomsDeclarationRequired()");
        return orderService.sortByCustomsDeclarationRequired(orders, extraSortInternalIdPurchaseDate);
    }

    public SellerOrderReportModel createSellerOrderReport(InputStream inputStreamUnshippedOrders, InputStream inputStreamNewOrders)
            throws IOException,AmazonCsvOrderProcessorException {

        List<AmazonCsvOrder> amazonCsvOrders = parseCsv(inputStreamUnshippedOrders, inputStreamNewOrders);
        SellerOrderReportModel sellerOrderReportModel = sellerOrderReportMapper.fromAmazonCsvOrders(amazonCsvOrders);

        saveOrders(sellerOrderReportModel);

        List<OrderEntity> foundOrderEntities = orderRepository.
                findByOrderItemIdInOrderByProduct_InternalIdDescPurchaseDateAsc(getUnshippedOrderItemIds(sellerOrderReportModel));

        return new SellerOrderReportModel(orderModelMapper.fromEntities(foundOrderEntities), null);
    }

    public SellerOrderReportModel createSellerOrderReportFromAmazon() throws IOException,AmazonCsvOrderProcessorException {
        LOGGER.info("createSellerOrderReportFromAmazon(...)");
        AmazonOrderReportResult amazonOrderReportResult = amazonOrderReportService.orderReport();
        ByteArrayOutputStream unshippedOrdersOutputStream =
                (ByteArrayOutputStream) amazonOrderReportResult.getUnshippedOrdersOutputStream();
        ByteArrayOutputStream newOrdersOutputStream =
                (ByteArrayOutputStream) amazonOrderReportResult.getNewOrdersOutputStream();

        InputStream inputStreamUnshippedOrders = new ByteArrayInputStream(
                unshippedOrdersOutputStream.toByteArray());
        InputStream inputStreamNewOrders = new ByteArrayInputStream(
                newOrdersOutputStream.toByteArray());

        List<AmazonCsvOrder> amazonCsvOrders = parseCsv(inputStreamUnshippedOrders, inputStreamNewOrders);

        SellerOrderReportModel sellerOrderReportModel = sellerOrderReportMapper.fromAmazonCsvOrders(amazonCsvOrders);

        saveOrders(sellerOrderReportModel);

        List<OrderEntity> foundOrderEntities = orderRepository.
                findByOrderItemIdInOrderByProduct_InternalIdDescPurchaseDateAsc(getUnshippedOrderItemIds(sellerOrderReportModel));

        return new SellerOrderReportModel(orderModelMapper.fromEntities(foundOrderEntities), null);

    }

    public void generate(GenerateAddressModel preparedAddressModel) throws OrderManagerException {
//        LOGGER.info("Preparing... " + preparedAddressModel);
        try {
            orderService.prepareAddresses(preparedAddressModel);
        } catch (OrderNotFoundException e) {
            throw new OrderManagerException(e.getMessage(), e);
        }
    }

    public boolean generateCheck() {
        LOGGER.info("generateCheck()");
        List<OrderModel> orders = orderService.ordersWithStatus(OrderStatusType.SENT_ENADAWCA);
        return orders != null && orders.size() > 0;
    }

    private List<AmazonCsvOrder> parseCsv(InputStream inputStreamUnshippedOrders, InputStream inputStreamNewOrders)
            throws IOException, AmazonCsvOrderProcessorException {
        Reader readerUnshippedOrders = new InputStreamReader(inputStreamUnshippedOrders);
        Reader readerNewOrders = new InputStreamReader(inputStreamNewOrders);
        AmazonCsvOrdersMergeProcessor amazonCsvOrdersMergeProcessor = new AmazonCsvOrdersMergeProcessor();

        return amazonCsvOrdersMergeProcessor.mergeOrders(readerUnshippedOrders, readerNewOrders);
    }

    void saveOrders(SellerOrderReportModel sellerOrderReportModel) {
//        SellerOrderReportModel sellerOrderReportModelAddProductInfo =
        productMappingService.assignAdditionalProductInfo(sellerOrderReportModel);

        List<OrderModel> orders = sellerOrderReportModel.getOrders();
        List<OrderEntity> orderEntities = orderModelMapper.fromModels(orders);

        saveOrUpdateOrders(orderEntities, false);
    }

    public void updateOrders(SellerOrderReportModel sellerOrderReportModel) {
        LOGGER.info("updateOrders(" + sellerOrderReportModel + ")");
        List<OrderModel> orders = sellerOrderReportModel.getOrders();

        SellerOrderReportModel changedProductsSellerOrderReportModel = new SellerOrderReportModel();
        List<OrderModel> changedProductOrders = new ArrayList<>();

        for (OrderModel order : orders) {
            ProductModel product = order.getProduct();
            if (product != null) {
                LOGGER.info("product: " + product);
                if (product.isChangedInternalId()
                        && !StringUtils.isBlank(product.getInternalId())) {
                    LOGGER.info("#### product ready for ProductMapping!");
                    ProductMappingModel productMappingModel = ProductMappingModel.builder()
                            .asin(product.getAsin())
                            .sku(product.getSku())
                            .internalProductName(product.getInternalId())
                            .condition(ProductMappingCondition.NEW.getKey())
                            .build();
                    productMappingService.addOrUpdateProductMapping(productMappingModel);
                    changedProductOrders.add(order);
                }
            }
        }

        changedProductsSellerOrderReportModel.setOrders(changedProductOrders);

        productMappingService.assignAdditionalProductInfo(changedProductsSellerOrderReportModel);

        List<OrderEntity> orderEntities = orderModelMapper.fromModels(changedProductOrders);

        saveOrUpdateOrders(orderEntities, true);
    }

    public List<OrderModel> findOrdersByStatusNotShippedAmazon() {
        LOGGER.info("findOrdersByStatusNotShippedAmazon()");
        return orderService.findOrdersByStatusNotShippedAmazon();
    }

    public void deleteOrdersByStatusShippedAmazonOrUnknownOlderThanThreeDays() {
        LOGGER.info("deleteOrdersByStatusShippedAmazonOrUnknownOlderThanThreeDays()");
        orderService.deleteOrdersByStatusShippedAmazonOrUnknownOlderThanThreeDays();
    }

    public InputStream generateMultiChannelFulfillmentReport(List<OrderModel> orders) {
        LOGGER.info("generateMultiChannelFulfillmentReport(" + orders + ")");
        try {
            return orderMultiChannelFulfillmentCsvProcessor.createCsv(orders);
        } catch (OrderMultiChannelFulfillmentCsvProcessorException e) {
            LOGGER.info("Błąd podczas generowania raportu zamówień MCF " + e.getMessage());
        }
        return null;
    }

    public List<OrderModel> orderModelsByoIds(List<Long> oIds) {
        LOGGER.info("orderModelsByoIds(" + oIds + ")");
        return orderService.orderModelsByoIds(oIds);
    }

    private void saveOrUpdateOrders(List<OrderEntity> orderEntities, boolean update) {
        LOGGER.info("saveOrUpdateOrders()");
//        LOGGER.info("orderEntities: " + orderEntities);
        LOGGER.info("update: " + update);

        Integer generateId = sequenceIdGenerator.generateId(ORDER_BATCH_ID_SEQ);

        for (OrderEntity orderEntity : orderEntities) {
            String orderId = orderEntity.getOrderId();
            String orderItemId = orderEntity.getOrderItemId();
            OrderLoadedEntity foundOrderLoadedEntity = orderLoadedRepository.findByOrderIdAndOrderItemId(orderId, orderItemId);

            ProductEntity productEntity = orderEntity.getProduct();
            ClientEntity clientEntity = orderEntity.getClient();

//            LOGGER.info("foundOrderLoadedEntity: " + foundOrderLoadedEntity);
            if (foundOrderLoadedEntity != null) {
                if (productEntity != null) productEntity.setId(foundOrderLoadedEntity.getProductId());
                if (clientEntity != null) clientEntity.setId(foundOrderLoadedEntity.getClientId());
            }

            ProductEntity savedProductEntity = productRepository.save(productEntity);
            ClientEntity savedClientEntity = clientRepository.save(clientEntity);

            orderEntity.setProduct(savedProductEntity);
            orderEntity.setClient(savedClientEntity);
            if (!update) {
                orderEntity.setBatchId(generateId);
            }
            orderEntity.setLoadDate(LocalDateTime.now());
            if (foundOrderLoadedEntity != null) {
                orderEntity.setoId(foundOrderLoadedEntity.getoId());
            }
            OrderEntity savedOrderEntity = orderRepository.save(orderEntity);

            if (foundOrderLoadedEntity == null) {
                OrderLoadedEntity orderLoadedEntity = new OrderLoadedEntity();
                orderLoadedEntity.setoId(savedOrderEntity.getoId());
                orderLoadedEntity.setOrderId(savedOrderEntity.getOrderId());
                orderLoadedEntity.setOrderItemId(savedOrderEntity.getOrderItemId());

                ClientEntity savedOrderEntityClient = savedOrderEntity.getClient();
                if (savedOrderEntityClient != null) orderLoadedEntity.setClientId(savedOrderEntityClient.getId());
                ProductEntity savedOrderEntityProduct = savedOrderEntity.getProduct();
                if (savedOrderEntityProduct != null) orderLoadedEntity.setProductId(savedOrderEntityProduct.getId());
                orderLoadedRepository.save(orderLoadedEntity);
            }
        }
    }

    private boolean orderNotExist(OrderEntity orderEntity) {
        return orderRepository.findByOrderIdAndOrderItemId(
                orderEntity.getOrderId(), orderEntity.getOrderItemId()).isEmpty();
    }

    private List<String> getUnshippedOrderItemIds(SellerOrderReportModel sellerOrderReportModel) {
        return sellerOrderReportModel.getOrders().stream()
                .map(OrderModel::getOrderItemId)
                .collect(Collectors.toList());
    }

}

