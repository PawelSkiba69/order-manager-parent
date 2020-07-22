package pl.com.infratex.ordermanager.service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.coverter.OrderModelConverter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Component
public class OrderModelMapper {
    private static final Logger LOGGER = Logger.getLogger(OrderModelMapper.class.getName());

    public OrderEntity fromModel(OrderModel orderModel) {
        LOGGER.info("orderModel: " + orderModel);
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        OrderEntity orderEntity = modelMapper.map(orderModel, OrderEntity.class);
        LOGGER.info("orderEntity: " + orderEntity);
        return orderEntity;
    }

    public OrderModel fromEntity(OrderEntity orderEntity) {
        ModelMapper modelMapper = new ModelMapper();
        OrderModel orderModel = modelMapper.map(orderEntity, OrderModel.class);
        OrderModelConverter.formatDate(orderModel);

        return orderModel;
    }


    public List<OrderEntity> fromModels(List<OrderModel> orderModels) {
        return orderModels.stream()
                .map(this::fromModel)
                .collect(Collectors.toList());
    }

    public List<OrderModel> fromEntities(List<OrderEntity> orderEntities) {
        return orderEntities.stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }


}
