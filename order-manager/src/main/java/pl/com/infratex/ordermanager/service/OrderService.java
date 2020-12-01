package pl.com.infratex.ordermanager.service;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.dao.repository.OrderRepository;
import pl.com.infratex.ordermanager.service.mapper.OrderModelMapper;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.GenerateAddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private OrderModelMapper orderModelMapper;

    public OrderService(OrderRepository orderRepository, OrderModelMapper orderModelMapper) {
        this.orderRepository = orderRepository;
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

    //FIXME Add test
    public List<OrderModel> ordersWithStatus(OrderStatusType orderStatusType) {
        List<OrderEntity> orderEntities = orderRepository.findByStatusOrderByProduct_InternalIdDesc(orderStatusType);
        return orderModelMapper.fromEntities(orderEntities);
    }

    //FIXME Add test
    public void prepareAddresses(GenerateAddressModel preparedAddressModel) throws OrderNotFoundException {
//        Long[] chosen = preparedAddressModel.getChosen();
        List<OrderModel> orders = preparedAddressModel.getOrders();

        if (orders != null) {
            for (OrderModel order : orders) {
                if(order.isChosen()) {
                    Long orderId = order.getOId();
                    Optional<OrderEntity> foundOptionalOrderEntity = orderRepository.findById(orderId);
                    OrderEntity foundOrderEntity = foundOptionalOrderEntity.orElseThrow(() -> new OrderNotFoundException("No order with id: " + orderId));
                    foundOrderEntity.setStatus(OrderStatusType.GENERATED);
                    orderRepository.save(foundOrderEntity);
                }
            }
        }
    }

    public List<OrderEntity> updateOrdersWithGuids(List<AddressModel> addresses, List<OrderModel> orders) {
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
        if (orders != null) {
            for (OrderModel order : orders) {
                Optional<OrderEntity> foundOptionalOrderEntity = orderRepository.findById(order.getOId());
                OrderEntity foundOrderEntity = foundOptionalOrderEntity.orElseThrow(() -> new OrderNotFoundException("No order with id: " + order.getOId()));
                foundOrderEntity.setStatus(orderStatus);
                orderRepository.save(foundOrderEntity);
            }
        }
    }

    public OrderModel oldestUnshippedLabeledOrder() {
        OrderEntity orderEntity = orderRepository.findFirstByStatusOrderByLoadDateAsc(OrderStatusType.LABELED);
        return orderModelMapper.fromEntity(orderEntity);
    }

    public List<OrderModel> findOrdersByStatusLabeled() {
        List<OrderEntity> orderEntities = orderRepository.findByStatus(OrderStatusType.LABELED);
        return orderModelMapper.fromEntities(orderEntities);
    }

    public List<String> extractNotNullGuids(List<OrderModel> orders) {
        return orders.stream()
                .filter(orderModel -> orderModel.getGuid() != null)
                .map(OrderModel::getGuid)
                .collect(Collectors.toList());
    }
}
