package pl.com.infratex.ordermanager.web.model.coverter;

import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.web.model.ShipmentConfirmationReportModel;

import java.time.LocalDateTime;
import java.util.logging.Logger;

@Component
public class ShipmentConfirmationReportConverter {

    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationReportConverter.class.getName());

    public ShipmentConfirmationReportModel convert(LocalDateTime reportDate,
                                                   int shipmentConfirmedNumber,
                                                   int shipmentWithConfirmErrorNumber) {
        LOGGER.info("convert(" + reportDate + ", " + shipmentConfirmedNumber + ", " + shipmentWithConfirmErrorNumber + ")");
        ShipmentConfirmationReportModel report = new ShipmentConfirmationReportModel(
                reportDate, shipmentConfirmedNumber, shipmentWithConfirmErrorNumber);
        LOGGER.info("converter(" + report + ")");
        return report;
    }

}
