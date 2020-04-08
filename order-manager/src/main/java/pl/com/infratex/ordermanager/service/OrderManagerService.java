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
import java.util.List;
import java.util.logging.Logger;

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


    public OrderManagerService(OrderService orderService, OrderRepository orderRepository,
                               ProductRepository productRepository, ClientRepository clientRepository,
                               SellerOrderReportMapper sellerOrderReportMapper, OrderModelMapper orderModelMapper,
                               ProductMappingService productMappingService) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.clientRepository = clientRepository;
        this.sellerOrderReportMapper = sellerOrderReportMapper;
        this.orderModelMapper = orderModelMapper;
        this.productMappingService = productMappingService;
    }

    public SellerOrderReportModel createSellerOrderReport(InputStream inputStreamUnshippedOrders, InputStream inputStreamNewOrders) throws IOException {

        List<AmazonCsvOrder> amazonCsvOrders = parseCsv(inputStreamUnshippedOrders, inputStreamNewOrders);
        SellerOrderReportModel sellerOrderReportModel = sellerOrderReportMapper.fromAmazonCsvOrders(amazonCsvOrders);

        saveOrders(productMappingService.assignInternalProductId(sellerOrderReportModel));

        List<OrderEntity> foundOrderEntities = orderRepository.findByOrderByProduct_InternalIdDesc();
        List<OrderModel> orderModels = orderModelMapper.fromEntities(foundOrderEntities);

        return new SellerOrderReportModel(orderModels,null);
    }

    public void generate(GenerateAddressModel preparedAddressModel) throws OrderManagerException {
        LOGGER.info("Preparing... " + preparedAddressModel);
        try {
            orderService.prepareAddresses(preparedAddressModel);
        } catch (OrderNotFoundException e) {
            throw new OrderManagerException(e.getMessage(), e);
        }
    }

    public void assignInternalProductId(SellerOrderReportModel sellerOrderReportModel){

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
//        orderRepository.saveAll(orderEntities);

        for (OrderEntity orderEntity : orderEntities) {
            ProductEntity productEntity = productRepository.save(orderEntity.getProduct());
            ClientEntity clientEntity = clientRepository.save(orderEntity.getClient());

            orderEntity.setProduct(productEntity);
            orderEntity.setClient(clientEntity);

            orderRepository.save(orderEntity);
        }
    }
}
