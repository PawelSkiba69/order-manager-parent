package pl.com.infratex.ordermanager.web.model.coverter;

import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.web.model.ShipmentConfirmationReportModel;

import java.time.LocalDateTime;

@Component
public class ShipmentConfirmationReportConverter {

    public ShipmentConfirmationReportModel convert(LocalDateTime reportDate,
                                                   int shipmentConfirmedNumber,
                                                   int shipmentWithConfirmErrorNumber) {
        ShipmentConfirmationReportModel report = new ShipmentConfirmationReportModel(
                reportDate, shipmentConfirmedNumber, shipmentWithConfirmErrorNumber);
        return report;
    }

}
