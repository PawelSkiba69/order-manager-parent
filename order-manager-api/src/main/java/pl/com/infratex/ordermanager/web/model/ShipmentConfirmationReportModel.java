package pl.com.infratex.ordermanager.web.model;

import java.time.LocalDateTime;

//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class ShipmentConfirmationReportModel {

    private Long id;
    private LocalDateTime reportDate;
    private int shipmentConfirmedNumber;
    private int shipmentWithConfirmErrorNumber;
    private Long fileId;

    public ShipmentConfirmationReportModel() {
    }

    public ShipmentConfirmationReportModel(LocalDateTime reportDate, int shipmentConfirmedNumber, int shipmentWithConfirmErrorNumber) {
        this.reportDate = reportDate;
        this.shipmentConfirmedNumber = shipmentConfirmedNumber;
        this.shipmentWithConfirmErrorNumber = shipmentWithConfirmErrorNumber;
    }
}
