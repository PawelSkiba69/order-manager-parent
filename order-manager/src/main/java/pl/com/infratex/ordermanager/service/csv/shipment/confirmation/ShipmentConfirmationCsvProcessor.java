package pl.com.infratex.ordermanager.service.csv.shipment.confirmation;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.api.exception.shipment.confirmation.ShipmentConfirmationCsvProcessorException;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Component
public class ShipmentConfirmationCsvProcessor {

    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationCsvProcessor.class.getName());
    private static final String SAMPLE_CSV_FILE = "";
    private static final char TAB = '\t';

    //https://docs.developer.amazonservices.com/en_UK/feeds/Feeds_SubmitFeed.html

    public InputStream createCsv(List<ShipmentConfirmationModel> shipmentConfirmationModels) throws ShipmentConfirmationCsvProcessorException {
        LOGGER.info("createCsv("+shipmentConfirmationModels+")");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (OutputStreamWriter writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withDelimiter(TAB)
                     .withHeader("order-id", "order-item-id", "quantity", "ship-date",
                             "carrier-code", "carrier-name", "tracking-number", "ship-method"))) {
            if (shipmentConfirmationModels != null) {
                shipmentConfirmationModels.forEach(
                        shipmentConfirmationModel -> createCsvRecord(shipmentConfirmationModel, csvPrinter));
            }
            csvPrinter.flush();

            byte[] bytes = outputStream.toByteArray();
            return new ByteArrayInputStream(bytes);

        } catch (IOException e) {
            throw new ShipmentConfirmationCsvProcessorException("Nie można stworzyć pliku csv", e);
        }
    }

    private void createCsvRecord(ShipmentConfirmationModel shipmentConfirmationModel, CSVPrinter csvPrinter) {
        List<String> strings = Arrays.asList(
                shipmentConfirmationModel.getOrderId(),
                shipmentConfirmationModel.getOrderItemId(),
                shipmentConfirmationModel.getQuantity(),
                shipmentConfirmationModel.getDataNadania().toString(),
                shipmentConfirmationModel.getCarrierCode(),
                shipmentConfirmationModel.getCarrierName(),
                shipmentConfirmationModel.getNumerNadania(),
                shipmentConfirmationModel.getShipMethod()
        );
        try {
            csvPrinter.printRecord(strings);
            //FIXME rozważyć rzucenie własnego wyjątku
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public static void main(String[] args) throws IOException {
//        try (
//                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
//
//                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
//                        .withHeader("ID", "Name", "Designation", "Company"));
//        ) {
//            csvPrinter.printRecord("1", "Sundar Pichai ♥", "CEO", "Google");
//            csvPrinter.printRecord("2", "Satya Nadella", "CEO", "Microsoft");
//            csvPrinter.printRecord("3", "Tim cook", "CEO", "Apple");
//
//            csvPrinter.printRecord(Arrays.asList("4", "Mark Zuckerberg", "CEO", "Facebook"));
//
//            csvPrinter.flush();
//        }
//    }
}
