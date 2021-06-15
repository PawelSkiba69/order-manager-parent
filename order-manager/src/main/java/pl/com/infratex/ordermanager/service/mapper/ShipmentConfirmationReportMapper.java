package pl.com.infratex.ordermanager.service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.dao.entity.ShipmentConfirmationReportEntity;
import pl.com.infratex.ordermanager.web.model.ShipmentConfirmationReportModel;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Component
public class ShipmentConfirmationReportMapper {
    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationReportMapper.class.getName());

    public ShipmentConfirmationReportEntity fromModel(ShipmentConfirmationReportModel shipmentConfirmationReportModel) {
        LOGGER.info("fromModel(" + shipmentConfirmationReportModel + ")");
        ModelMapper modelMapper = new ModelMapper();
        ShipmentConfirmationReportEntity shipmentConfirmationReportEntity = modelMapper.map(shipmentConfirmationReportModel, ShipmentConfirmationReportEntity.class);
        LOGGER.info("fromModel()=" + shipmentConfirmationReportEntity);
        return shipmentConfirmationReportEntity;
    }

    public ShipmentConfirmationReportModel fromEntity(ShipmentConfirmationReportEntity shipmentConfirmationReportEntity) {
        LOGGER.info("fromEntity(" + shipmentConfirmationReportEntity);
        ModelMapper modelMapper = new ModelMapper();
        ShipmentConfirmationReportModel shipmentConfirmationReportModel = modelMapper.map(shipmentConfirmationReportEntity, ShipmentConfirmationReportModel.class);
        LOGGER.info("fromEntity()=" + shipmentConfirmationReportModel);
        return shipmentConfirmationReportModel;
    }

    public List<ShipmentConfirmationReportModel> fromEntities(List<ShipmentConfirmationReportEntity> shipmentConfirmationReportEntities) {
        return shipmentConfirmationReportEntities.stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }
}
