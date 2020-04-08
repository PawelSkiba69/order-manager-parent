package pl.com.infratex.ordermanager.service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ShipmentModel;

@Component
public class ShipmentModelMapper {

    public ShipmentModel fromOrderModel(OrderModel orderModel){
        ModelMapper modelMapper=new ModelMapper();
        return modelMapper.map(orderModel, ShipmentModel.class);
    }

}
