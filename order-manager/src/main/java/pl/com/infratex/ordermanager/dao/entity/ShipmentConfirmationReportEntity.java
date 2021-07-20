package pl.com.infratex.ordermanager.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "SHIPMENT_CONFIRM_REPORTS")
public class ShipmentConfirmationReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime reportDate;
    private int shipmentConfirmedNumber;
    private int shipmentWithConfirmErrorNumber;
    private Long fileId;

//    @Lob
//    @Column(name = "file", columnDefinition="BLOB")
//    private byte[] file;

    public ShipmentConfirmationReportEntity() {
    }

    public ShipmentConfirmationReportEntity(Long id, LocalDateTime reportDate, int shipmentConfirmedNumber, int shipmentWithConfirmErrorNumber, Long fileId) {
        this.id = id;
        this.reportDate = reportDate;
        this.shipmentConfirmedNumber = shipmentConfirmedNumber;
        this.shipmentWithConfirmErrorNumber = shipmentWithConfirmErrorNumber;
        this.fileId = fileId;
//        this.file = file;
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

//    public byte[] getFile() {
//        return file;
//    }

//    public void setFile(byte[] file) {
//        this.file = file;
//    }

    @Override
    public String toString() {
        return "ShipmentConfirmationReportEntity{" +
                "id=" + id +
                ", reportDate=" + reportDate +
                ", shipmentConfirmedNumber=" + shipmentConfirmedNumber +
                ", shipmentWithConfirmErrorNumber=" + shipmentWithConfirmErrorNumber +
                ", fileId=" + fileId +
                '}';
    }
}
