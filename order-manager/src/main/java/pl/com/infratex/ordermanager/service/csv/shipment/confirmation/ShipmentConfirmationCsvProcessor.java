package pl.com.infratex.ordermanager.service.csv.shipment.confirmation;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@Component
public class ShipmentConfirmationCsvProcessor {
    private static final String SAMPLE_CSV_FILE = "";

    //https://docs.developer.amazonservices.com/en_UK/feeds/Feeds_SubmitFeed.html

    public void createCsv(List<ShipmentConfirmationModel> shipmentConfirmationModels) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("order-id", "order-item-id", "quantity", "ship-date",
                                "carrier-code","carrier-name","tracking-number","ship-method"))) {
            shipmentConfirmationModels.forEach(
                    shipmentConfirmationModel -> createCsvRecord(shipmentConfirmationModel, csvPrinter));

            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
            //FIXME rozważyć rzucenie własnego wyjątku
        }
    }

    private void createCsvRecord(ShipmentConfirmationModel shipmentConfirmationModel, CSVPrinter csvPrinter) {
        List<String> strings = Arrays.asList(
                shipmentConfirmationModel.getOrderId(),
                shipmentConfirmationModel.getOrderItemId(),
                shipmentConfirmationModel.getQuantity(),
                shipmentConfirmationModel.getDataNadania().toString(),
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
