package pl.com.infratex.ordermanager.dao.repository;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import pl.com.infratex.ordermanager.dao.entity.ShipmentConfirmationReportEntity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ShipmentConfirmationReportRepositoryTest {

    public static final String CSV_FEED_SUBMISSION_RESULT_ERROR_CSV = "csv/feedSubmissionResultERROR.csv";
    @Autowired
    private ShipmentConfirmationReportRepository shipmentConfirmationReportRepository;

    @Test
    public void givenFile_whenSaveEntity_thenSavedEntityNotNull() throws IOException {
        //GIVEN
        ClassPathResource classPathResource = new ClassPathResource("csv/feedSubmissionResultERROR.csv");
        byte[] file = IOUtils.toByteArray(classPathResource.getInputStream());
        ShipmentConfirmationReportEntity shipmentConfirmationReportEntity = new ShipmentConfirmationReportEntity();
        shipmentConfirmationReportEntity.setFile(file);
        shipmentConfirmationReportEntity.setShipmentWithConfirmErrorNumber(5);
        shipmentConfirmationReportEntity.setReportDate(LocalDateTime.now());
        //WHEN
        ShipmentConfirmationReportEntity savedEntity = shipmentConfirmationReportRepository.save(shipmentConfirmationReportEntity);
        //THEN
        assertNotNull(savedEntity, "Saved entity is null");
    }

    @Test
    public void givenFile_whenSaveEntity_thenSavedFileNotNull() throws IOException {
        //GIVEN
        ClassPathResource classPathResource = new ClassPathResource(CSV_FEED_SUBMISSION_RESULT_ERROR_CSV);
        byte[] file = IOUtils.toByteArray(classPathResource.getInputStream());
        ShipmentConfirmationReportEntity shipmentConfirmationReportEntity = new ShipmentConfirmationReportEntity();
        shipmentConfirmationReportEntity.setFile(file);
        shipmentConfirmationReportEntity.setShipmentWithConfirmErrorNumber(4);
        shipmentConfirmationReportEntity.setReportDate(LocalDateTime.now());
        //WHEN
        ShipmentConfirmationReportEntity savedEntity = shipmentConfirmationReportRepository.save(shipmentConfirmationReportEntity);
        Optional<ShipmentConfirmationReportEntity> foundEntityOptional = shipmentConfirmationReportRepository.findById(savedEntity.getId());
        ShipmentConfirmationReportEntity foundEntity = foundEntityOptional.orElseThrow(()->new FileNotFoundException("No file with id "+savedEntity.getId()));
        //THEN
        assertAll(
                () -> assertNotNull(foundEntity.getFile(), "Saved file is null")
//                () -> assertEquals(shipmentConfirmationReportEntity.getFile(),foundEntity.getFile(),"files are not the same")
        );
    }

}