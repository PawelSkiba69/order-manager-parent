package pl.com.infratex.ordermanager.service;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.dao.entity.ShipmentConfirmationReportEntity;
import pl.com.infratex.ordermanager.dao.repository.ShipmentConfirmationReportRepository;
import pl.com.infratex.ordermanager.service.mapper.ShipmentConfirmationReportMapper;
import pl.com.infratex.ordermanager.web.model.ShipmentConfirmationReportModel;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ShipmentConfirmationReportService {
    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationReportService.class.getName());

    private final ShipmentConfirmationReportRepository shipmentConfirmationReportRepository;
    private final ShipmentConfirmationReportMapper shipmentConfirmationReportMapper;

    public ShipmentConfirmationReportService(ShipmentConfirmationReportRepository shipmentConfirmationReportRepository, ShipmentConfirmationReportMapper shipmentConfirmationReportMapper) {
        this.shipmentConfirmationReportRepository = shipmentConfirmationReportRepository;
        this.shipmentConfirmationReportMapper = shipmentConfirmationReportMapper;
    }

    public ShipmentConfirmationReportModel save(ShipmentConfirmationReportModel shipmentConfirmationReportModel) {
        LOGGER.info("save(" + shipmentConfirmationReportModel + ")");
        ShipmentConfirmationReportEntity shipmentConfirmationReportEntity = shipmentConfirmationReportMapper.fromModel(shipmentConfirmationReportModel);
        ShipmentConfirmationReportEntity savedShipmentConfirmationReportEntity = shipmentConfirmationReportRepository.save(shipmentConfirmationReportEntity);
        return shipmentConfirmationReportMapper.fromEntity(savedShipmentConfirmationReportEntity);
    }

    public List<ShipmentConfirmationReportModel> list() {
        LOGGER.info("list()");
        List<ShipmentConfirmationReportEntity> shipmentConfirmationReportRepositoryAll = shipmentConfirmationReportRepository.findAll();
        List<ShipmentConfirmationReportModel> shipmentConfirmationReportModels = shipmentConfirmationReportMapper.fromEntities(shipmentConfirmationReportRepositoryAll);
        LOGGER.info("list()=" + shipmentConfirmationReportModels);
        return shipmentConfirmationReportModels;
    }
}
