package pl.com.infratex.ordermanager.service;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.dao.entity.OrderLoadedEntity;
import pl.com.infratex.ordermanager.dao.repository.OrderLoadedRepository;
import pl.com.infratex.ordermanager.dao.repository.OrderRepository;
import pl.com.infratex.ordermanager.service.mapper.OrderModelMapper;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.CountryInfo;
import pl.com.infratex.ordermanager.web.model.GenerateAddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.coverter.OrderModelConverter;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private static final Logger LOGGER = Logger.getLogger(OrderService.class.getName());
    private final OrderRepository orderRepository;
    private final OrderLoadedRepository orderLoadedRepository;
    private final OrderModelMapper orderModelMapper;


    public OrderService(OrderRepository orderRepository, OrderLoadedRepository orderLoadedRepository, OrderModelMapper orderModelMapper) {
        this.orderRepository = orderRepository;
        this.orderLoadedRepository = orderLoadedRepository;
        this.orderModelMapper = orderModelMapper;
    }

    public List<OrderModel> list() {
        List<OrderEntity> orderEntities = orderRepository.findAll();
        return orderModelMapper.fromEntities(orderEntities);
    }

    public List<OrderModel> filterByLatestBatchId() {
        List<OrderEntity> orderEntities = orderRepository.ordersWithLatestBatchId();
        return orderModelMapper.fromEntities(orderEntities);
    }

    public List<OrderModel> sortByCustomsDeclarationRequired(List<OrderModel> orders, boolean extraSortInternalIdPurchaseDate) {
//        LOGGER.info("sortByCustomsDeclarationRequired()");
        orders.forEach(orderModel -> OrderModelConverter.countryCode(orderModel, false));

        Comparator<OrderModel> comparator = Comparator.comparing(orderModel -> {
                    CountryInfo countryInfo = orderModel.getCountryInfo();
                    if (countryInfo != null) {
                        return countryInfo.getDeklaracaCelnaRodzaj();
                    } else {
                        return null;
                    }
                },
                Comparator.nullsFirst(Comparator.reverseOrder()));
        if (!extraSortInternalIdPurchaseDate) {
            comparator = comparator.thenComparing(
                    orderModel -> orderModel.getProduct().getInternalId(),
                    Comparator.nullsLast(Comparator.reverseOrder())
            );
            comparator = comparator.thenComparing(OrderModel::getPurchaseDate);
        }
        List<OrderModel> sortedOrders = orders.stream()
                .sorted(comparator)
                .collect(Collectors.toList());

//        LOGGER.info("sortByCustomsDeclarationRequired()");
        return sortedOrders;
    }

    //FIXME Add test
    public List<OrderModel> ordersWithStatus(OrderStatusType orderStatusType) {
        LOGGER.info("ordersWithStatus()");
        List<OrderEntity> orderEntities = orderRepository.findByStatusOrderByProduct_InternalIdDescPurchaseDateAsc(orderStatusType);
        return orderModelMapper.fromEntities(orderEntities);
    }

    //FIXME Add test
    public void prepareAddresses(GenerateAddressModel preparedAddressModel) throws OrderNotFoundException {
//        Long[] chosen = preparedAddressModel.getChosen();
        List<OrderModel> orders = preparedAddressModel.getOrders();

        for (OrderModel order : orders) {
            if (order.isChosen()) {
                Long orderId = order.getOId();
                Optional<OrderEntity> foundOptionalOrderEntity = orderRepository.findById(orderId);
                OrderEntity foundOrderEntity = foundOptionalOrderEntity.orElseThrow(() -> new OrderNotFoundException("No order with id: " + orderId));
                foundOrderEntity.setStatus(OrderStatusType.GENERATED);
                orderRepository.save(foundOrderEntity);
            }
        }

    }

    public List<OrderEntity> updateOrdersWithGuids(List<AddressModel> addresses, List<OrderModel> orders) {
        LOGGER.info("updateOrdersWithGuids()");
        List<OrderModel> ordersWithGuids = copyGuids(addresses, orders);
        List<OrderEntity> orderEntitiesWithGuids = orderModelMapper.fromModels(ordersWithGuids);
        return orderRepository.saveAll(orderEntitiesWithGuids);
    }

    List<OrderModel> copyGuids(List<AddressModel> addresses, List<OrderModel> orders) {
        for (AddressModel address : addresses) {
            Long addressOId = address.getOId();
            for (OrderModel order : orders) {
                Long orderOId = order.getOId();
                if (addressOId.equals(orderOId)) {
                    order.setGuid(address.getGuid());
                }
            }
        }
        return orders;
    }

    //FIXME Add test
    public void updateOrderStatus(List<OrderModel> orders, OrderStatusType orderStatus) throws OrderNotFoundException {
        LOGGER.info("updateOrderStatus("+orderStatus+")");
        if (orders != null) {
            for (OrderModel order : orders) {
                Optional<OrderEntity> foundOptionalOrderEntity = orderRepository.findById(order.getOId());
                OrderEntity foundOrderEntity = foundOptionalOrderEntity.orElseThrow(() -> new OrderNotFoundException("No order with id: " + order.getOId()));
                foundOrderEntity.setStatus(orderStatus);
                orderRepository.save(foundOrderEntity);
            }
        }
    }

    public OrderModel oldestUnshippedLabeledOrder() throws OrderNotFoundException {
        OrderEntity orderEntity = orderRepository.findFirstByStatusOrderByLoadDateAsc(OrderStatusType.LABELED);
        if(orderEntity==null) throw new OrderNotFoundException("Orders with status LABELED not found");
        return orderModelMapper.fromEntity(orderEntity);
    }

    public List<OrderModel> findOrdersByStatusLabeled() {
        List<OrderEntity> orderEntities = orderRepository.findByStatus(OrderStatusType.LABELED);
        return orderModelMapper.fromEntities(orderEntities);
    }

    public List<OrderModel> findOrdersByStatusNotShippedAmazon() {
        LOGGER.info("findOrdersByStatusNotShippedAmazon()");
        List<OrderEntity> orderEntities = orderRepository.findByStatusNotIn(
                OrderStatusType.SHIPPED_AMAZON,OrderStatusType.UNKNOWN);
        return orderModelMapper.fromEntities(orderEntities);
    }

    public void deleteOrdersByStatusShippedAmazonOrUnknownOlderThanThreeDays(){
        LOGGER.info("findOrdersByStatusShippedAmazonOrUnknownOlderThanThreeDays()");
        List<OrderEntity> orderEntities = orderRepository.findByLoadDateBeforeAndStatusIn(
                LocalDateTime.now().minusDays(3), OrderStatusType.SHIPPED_AMAZON, OrderStatusType.UNKNOWN);
        LOGGER.info("orderEntities: "+orderEntities);

        for (OrderEntity orderEntity : orderEntities) {
            OrderLoadedEntity orderLoadedEntity = orderLoadedRepository.findByoId(orderEntity.getoId());
            orderLoadedRepository.delete(orderLoadedEntity);
        }

        orderRepository.deleteAll(orderEntities);
    }

    public List<OrderModel> orderModelsByoIds(List<Long> oIds) {
        LOGGER.info("orderModelsByoIds(" + oIds + ")");
        List<OrderEntity> orderEntities = orderRepository.findByoIdInOrderByProduct_InternalIdDescPurchaseDateAsc(oIds);
        return orderModelMapper.fromEntities(orderEntities);
    }


    public List<String> extractNotNullGuids(List<OrderModel> orders) {
        return orders.stream()
                .filter(orderModel -> orderModel.getGuid() != null)
                .map(OrderModel::getGuid)
                .collect(Collectors.toList());
    }

}
