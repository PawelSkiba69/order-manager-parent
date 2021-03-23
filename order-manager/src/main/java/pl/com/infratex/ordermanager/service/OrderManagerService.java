package pl.com.infratex.ordermanager.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.exception.order.OrderManagerException;
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

    private OrderService orderService;
    private OrderRepository orderRepository;
    private ProductRepository productRepository;
    private ClientRepository clientRepository;
    private SellerOrderReportMapper sellerOrderReportMapper;
    private OrderModelMapper orderModelMapper;
    private ProductMappingService productMappingService;
    private SequenceIdGenerator sequenceIdGenerator;
    private OrderLoadedRepository orderLoadedRepository;


    public OrderManagerService(OrderService orderService, OrderRepository orderRepository,
                               ProductRepository productRepository, ClientRepository clientRepository,
                               SellerOrderReportMapper sellerOrderReportMapper, OrderModelMapper orderModelMapper,
                               ProductMappingService productMappingService, SequenceIdGenerator sequenceIdGenerator, OrderLoadedRepository orderLoadedRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.clientRepository = clientRepository;
        this.sellerOrderReportMapper = sellerOrderReportMapper;
        this.orderModelMapper = orderModelMapper;
        this.productMappingService = productMappingService;
        this.sequenceIdGenerator = sequenceIdGenerator;
        this.orderLoadedRepository = orderLoadedRepository;
    }

    public List<OrderModel> filterByLatestBatchId() {
        return orderService.filterByLatestBatchId();
    }

    public SellerOrderReportModel createSellerOrderReport(InputStream inputStreamUnshippedOrders, InputStream inputStreamNewOrders) throws IOException {

        List<AmazonCsvOrder> amazonCsvOrders = parseCsv(inputStreamUnshippedOrders, inputStreamNewOrders);
        SellerOrderReportModel sellerOrderReportModel = sellerOrderReportMapper.fromAmazonCsvOrders(amazonCsvOrders);

        saveOrders(sellerOrderReportModel);

        //TODO do wykorzystania przy pobieraniu zamówień bezpośrednio z Amazona
//        List<OrderEntity> foundOrderEntities = orderRepository.findByStatusOrderByProduct_InternalIdDesc(0);

        List<OrderEntity> foundOrderEntities = orderRepository.
                findByOrderItemIdInOrderByProduct_InternalIdDesc(getUnshippedOrderItemIds(sellerOrderReportModel));

        return new SellerOrderReportModel(orderModelMapper.fromEntities(foundOrderEntities), null);
    }

    public void generate(GenerateAddressModel preparedAddressModel) throws OrderManagerException {
        LOGGER.info("Preparing... " + preparedAddressModel);
        try {
            orderService.prepareAddresses(preparedAddressModel);
        } catch (OrderNotFoundException e) {
            throw new OrderManagerException(e.getMessage(), e);
        }
    }

    private List<AmazonCsvOrder> parseCsv(InputStream inputStreamUnshippedOrders, InputStream inputStreamNewOrders) throws IOException {
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

        saveOrUpdateOrders(orderEntities,false);
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

        saveOrUpdateOrders(orderEntities,true);
    }

    private void saveOrUpdateOrders(List<OrderEntity> orderEntities, boolean update) {
        LOGGER.info("saveOrUpdateOrders()");
        LOGGER.info("orderEntities: " + orderEntities);
        LOGGER.info("update: " + update);

        Integer generateId = sequenceIdGenerator.generateId(ORDER_BATCH_ID_SEQ);

        for (OrderEntity orderEntity : orderEntities) {
            String orderId = orderEntity.getOrderId();
            String orderItemId = orderEntity.getOrderItemId();
            OrderLoadedEntity foundOrderLoadedEntity = orderLoadedRepository.findByOrderIdAndOrderItemId(orderId, orderItemId);

            ProductEntity productEntity = orderEntity.getProduct();
            ClientEntity clientEntity = orderEntity.getClient();

            if (foundOrderLoadedEntity != null) {
                if (productEntity != null) productEntity.setId(foundOrderLoadedEntity.getProductId());
                if (clientEntity != null) clientEntity.setId(foundOrderLoadedEntity.getProductId());
            }

            ProductEntity savedProductEntity = productRepository.save(productEntity);
            ClientEntity savedClientEntity = clientRepository.save(clientEntity);

            orderEntity.setProduct(savedProductEntity);
            orderEntity.setClient(savedClientEntity);
            if(!update) {
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

    public void uploadAutomatic() {

    }
}

