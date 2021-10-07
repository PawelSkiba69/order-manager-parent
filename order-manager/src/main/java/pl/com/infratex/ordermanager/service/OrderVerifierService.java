package pl.com.infratex.ordermanager.service;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class OrderVerifierService {
    private static final Logger LOGGER = Logger.getLogger(OrderVerifierService.class.getName());

    private final OrderService orderService;

    public OrderVerifierService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void markOrderStatusUnknown(List<OrderModel> unshippedOrders) throws OrderNotFoundException {
        LOGGER.info("markOrderStatusUnknown()");
        List<OrderModel> ordersByStatusNotShippedAmazon = orderService.findOrdersByStatusNotShippedAmazon();

        Set<Long> oIds = unshippedOrders.stream()
                .map(OrderModel::getOId)
                .collect(Collectors.toSet());
        List<OrderModel> ordersToChangeStatusUnknown = ordersByStatusNotShippedAmazon.stream()
                .filter(order -> !oIds.contains(order.getOId()))
                .collect(Collectors.toList());

        orderService.updateOrderStatus(ordersToChangeStatusUnknown, OrderStatusType.UNKNOWN);
        LOGGER.info("markOrderStatusUnknown()");
    }
}
