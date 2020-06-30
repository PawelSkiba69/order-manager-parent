package pl.com.infratex.ordermanager.service;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.exception.order.OrderManagerException;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.dao.entity.ClientEntity;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.dao.entity.ProductEntity;
import pl.com.infratex.ordermanager.dao.repository.ClientRepository;
import pl.com.infratex.ordermanager.dao.repository.OrderRepository;
import pl.com.infratex.ordermanager.dao.repository.ProductRepository;
import pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator;
import pl.com.infratex.ordermanager.service.csv.processor.AmazonCsvOrdersMergeProcessor;
import pl.com.infratex.ordermanager.service.mapper.OrderModelMapper;
import pl.com.infratex.ordermanager.service.mapper.SellerOrderReportMapper;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;
import pl.com.infratex.ordermanager.web.model.GenerateAddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.time.LocalDateTime;
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


    public OrderManagerService(OrderService orderService, OrderRepository orderRepository,
                               ProductRepository productRepository, ClientRepository clientRepository,
                               SellerOrderReportMapper sellerOrderReportMapper, OrderModelMapper orderModelMapper,
                               ProductMappingService productMappingService, SequenceIdGenerator sequenceIdGenerator) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.clientRepository = clientRepository;
        this.sellerOrderReportMapper = sellerOrderReportMapper;
        this.orderModelMapper = orderModelMapper;
        this.productMappingService = productMappingService;
        this.sequenceIdGenerator = sequenceIdGenerator;
    }

    public SellerOrderReportModel createSellerOrderReport(InputStream inputStreamUnshippedOrders, InputStream inputStreamNewOrders) throws IOException {

        List<AmazonCsvOrder> amazonCsvOrders = parseCsv(inputStreamUnshippedOrders, inputStreamNewOrders);
        SellerOrderReportModel sellerOrderReportModel = sellerOrderReportMapper.fromAmazonCsvOrders(amazonCsvOrders);

        saveOrders(productMappingService.assignAdditionalProductInfo(sellerOrderReportModel));

        //TODO do wykorzystania przy pobieraniu zamówień bezpośrednio z Amazona
//        List<OrderEntity> foundOrderEntities = orderRepository.findByStatusOrderByProduct_InternalIdDesc(0);

        List<OrderEntity> foundOrderEntities = orderRepository.
                findByOrderItemIdInOrderByProduct_InternalIdDesc(getUnshippedOrderItemIds(sellerOrderReportModel));

        return new SellerOrderReportModel(orderModelMapper.fromEntities(foundOrderEntities) ,null);
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

    private void saveOrders(SellerOrderReportModel sellerOrderReportModel) {
        List<OrderModel> orders = sellerOrderReportModel.getOrders();
        List<OrderEntity> orderEntities = orderModelMapper.fromModels(orders);
        Integer generateId = sequenceIdGenerator.generateId(ORDER_BATCH_ID_SEQ);

        for (OrderEntity orderEntity : orderEntities) {
            if (orderNotExist(orderEntity)) {
                ProductEntity productEntity = productRepository.save(orderEntity.getProduct());
                ClientEntity clientEntity = clientRepository.save(orderEntity.getClient());

                orderEntity.setProduct(productEntity);
                orderEntity.setClient(clientEntity);
                orderEntity.setBatchId(generateId);
                orderEntity.setLoadDate(LocalDateTime.now());
                orderRepository.save(orderEntity);
            }
        }
    }

    private boolean orderNotExist(OrderEntity orderEntity){
        return orderRepository.findByOrderIdAndOrderItemId(
                orderEntity.getOrderId(),orderEntity.getOrderItemId()).isEmpty();
    }

    private List<String>getUnshippedOrderItemIds(SellerOrderReportModel sellerOrderReportModel){
        return sellerOrderReportModel.getOrders().stream()
                .map(OrderModel::getOrderItemId)
                .collect(Collectors.toList());
    }

}

