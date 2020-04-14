package pl.com.infratex.ordermanager.service.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.dao.entity.AddressEntity;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Component
public class AddressModelMapper {

    private static final Logger LOGGER = Logger.getLogger(AddressModelMapper.class.getName());

    public AddressEntity fromModel(AddressModel addressModel) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(addressModel, AddressEntity.class);
    }

    public AddressModel fromEntity(AddressEntity addressEntity) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(addressEntity, AddressModel.class);
    }

    public List<AddressModel> fromEntities(List<AddressEntity> addressEntities) {
        return addressEntities.stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }

    public AddressModel fromOrderModel(OrderModel orderModel) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);

        TypeMap<OrderModel, AddressModel> typeMap = modelMapper.createTypeMap(OrderModel.class, AddressModel.class);
//        typeMap.addMapping(OrderModel::getOId, AddressModel::setId);

        ClientModel clientModel = extractClientModel(orderModel);
//        ProductModel productModel = extractProductModel(orderModel);

        AddressModel addressModel = modelMapper.map(orderModel, AddressModel.class);
//        if (productModel != null) {
//            addressModel.setInternalId(productModel.getInternalId());
//        }
        addressModel.setOId(orderModel.getOId());
        addressModel.setRecipientName(clientModel.getRecipientName());
        addressModel.setShipAddress1(clientModel.getShipAddress1());
        addressModel.setShipAddress2(clientModel.getShipAddress2());
        addressModel.setShipAddress3(clientModel.getShipAddress3());
        addressModel.setShipCity(clientModel.getShipCity());
        addressModel.setShipPostalCode(clientModel.getShipPostalCode());
        addressModel.setShipCountry(clientModel.getShipCountry());
        addressModel.setWeight(1);
        LOGGER.info("Dane klienta: " + addressModel);
        return addressModel;
    }

    public List<AddressModel> fromOrderModels(List<OrderModel> orderModels) {
        return orderModels.stream()
                .map(this::fromOrderModel)
                .collect(Collectors.toList());
    }

    ClientModel extractClientModel(OrderModel orderModel) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(orderModel.getClient(), ClientModel.class);
    }

    ProductModel extractProductModel(OrderModel orderModel) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(orderModel.getProduct(), ProductModel.class);
    }
}
