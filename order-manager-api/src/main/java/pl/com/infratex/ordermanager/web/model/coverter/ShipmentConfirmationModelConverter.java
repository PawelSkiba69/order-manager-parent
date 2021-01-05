package pl.com.infratex.ordermanager.web.model.coverter;

import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShipmentConfirmationModelConverter {

    public OrderModel from(ShipmentConfirmationModel shipmentConfirmationModel) {
        OrderModel orderModel = new OrderModel();
        orderModel.setOId(shipmentConfirmationModel.getOId());
        return orderModel;
    }

    public List<OrderModel> from(List<ShipmentConfirmationModel> shipmentConfirmationModels) {
        return shipmentConfirmationModels.stream()
                .map(this::from)
                .collect(Collectors.toList());
    }
}
