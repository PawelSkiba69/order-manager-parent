package pl.com.infratex.ordermanager.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class AmazonSubmitFeedScheduledTask {

    private static final Logger LOGGER = Logger.getLogger(AmazonSubmitFeedScheduledTask.class.getName());

    private ShipmentConfirmationManagerService shipmentConfirmationManagerService;

    public AmazonSubmitFeedScheduledTask(ShipmentConfirmationManagerService shipmentConfirmationManagerService) {
        this.shipmentConfirmationManagerService = shipmentConfirmationManagerService;
    }

    @Scheduled(fixedRate = 50000L)
    public void task() {
        LOGGER.info("executing scheduled task");
        shipmentConfirmationManagerService.confirmShipment();
    }

}
