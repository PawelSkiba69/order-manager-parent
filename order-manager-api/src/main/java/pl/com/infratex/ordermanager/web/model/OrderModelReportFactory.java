package pl.com.infratex.ordermanager.web.model;

import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderModelReportFactory {

    public static Collection<OrderModel> getOrders(){
        List<OrderModel> orders=new ArrayList<>();
        orders.add(new OrderModel(1L,"111", BigDecimal.valueOf(12L)));
        orders.add(new OrderModel(2L,"151", BigDecimal.valueOf(14L)));
        orders.add(new OrderModel(3L,"118", BigDecimal.valueOf(8L)));
        return orders;
    }
}
