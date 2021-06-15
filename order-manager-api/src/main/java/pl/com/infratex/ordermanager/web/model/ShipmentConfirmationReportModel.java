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

    public ShipmentConfirmationReportModel(Long id, LocalDateTime reportDate, int shipmentConfirmedNumber, int shipmentWithConfirmErrorNumber, Long fileId) {
        this.id = id;
        this.reportDate = reportDate;
        this.shipmentConfirmedNumber = shipmentConfirmedNumber;
        this.shipmentWithConfirmErrorNumber = shipmentWithConfirmErrorNumber;
        this.fileId = fileId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }

    public int getShipmentConfirmedNumber() {
        return shipmentConfirmedNumber;
    }

    public void setShipmentConfirmedNumber(int shipmentConfirmedNumber) {
        this.shipmentConfirmedNumber = shipmentConfirmedNumber;
    }

    public int getShipmentWithConfirmErrorNumber() {
        return shipmentWithConfirmErrorNumber;
    }

    public void setShipmentWithConfirmErrorNumber(int shipmentWithConfirmErrorNumber) {
        this.shipmentWithConfirmErrorNumber = shipmentWithConfirmErrorNumber;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "ShipmentConfirmationReportModel{" +
                "id=" + id +
                ", reportDate=" + reportDate +
                ", shipmentConfirmedNumber=" + shipmentConfirmedNumber +
                ", shipmentWithConfirmErrorNumber=" + shipmentWithConfirmErrorNumber +
                ", fileId=" + fileId +
                '}';
    }
}
