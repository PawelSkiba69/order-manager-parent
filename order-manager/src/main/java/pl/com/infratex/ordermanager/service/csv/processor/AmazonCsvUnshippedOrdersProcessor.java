package pl.com.infratex.ordermanager.service.csv.processor;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrderHeader;

import java.io.IOException;
import java.io.Reader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AmazonCsvUnshippedOrdersProcessor implements AmazonCsvOrdersProcessor {
    private static final Logger LOGGER = Logger.getLogger(AmazonCsvUnshippedOrdersProcessor.class.getName());

    private Reader reader;

    public AmazonCsvUnshippedOrdersProcessor(Reader reader) {
        this.reader = reader;
    }

    @Override
    public List<AmazonCsvOrder> parseOrders() throws IOException {
        CSVParser csvRecords = CSVFormat.TDF.withHeader().parse(reader);
        List<AmazonCsvOrder> amazonCsvOrders = new ArrayList<>();

        for (CSVRecord csvRecord : csvRecords) {
            String orderId = csvRecord.get(AmazonCsvOrderHeader.ORDER_ID.getName());
            AmazonCsvOrder amazonCsvOrder = new AmazonCsvOrder();
            try {
                amazonCsvOrder.setOrderId(orderId);
                amazonCsvOrder.setOrderItemId(csvRecord.get(AmazonCsvOrderHeader.ORDER_ITEM_ID.getName()));
                String purchaseDateString = csvRecord.get(AmazonCsvOrderHeader.PURCHASE_DATE.getName());
                amazonCsvOrder.setPurchaseDate(LocalDateTime.parse(purchaseDateString, DateTimeFormatter.ISO_OFFSET_DATE_TIME));
                amazonCsvOrder.setBuyerEmail(csvRecord.get(AmazonCsvOrderHeader.BUYER_EMAIL.getName()));
                amazonCsvOrder.setBuyerName(csvRecord.get(AmazonCsvOrderHeader.BUYER_NAME.getName()));
                amazonCsvOrder.setBuyerPhone(csvRecord.get(AmazonCsvOrderHeader.BUYER_PHONE_NUMBER.getName()));
                amazonCsvOrder.setSku(csvRecord.get(AmazonCsvOrderHeader.SKU.getName()));
                amazonCsvOrder.setProductName(csvRecord.get(AmazonCsvOrderHeader.PRODUCT_NAME.getName()));
                amazonCsvOrder.setQuantityPurchased(Long.parseLong(csvRecord.get(AmazonCsvOrderHeader.QUANTITY_PURCHASED.getName())));
                amazonCsvOrder.setRecipientName(csvRecord.get(AmazonCsvOrderHeader.RECIPIENT_NAME.getName()));
                amazonCsvOrder.setShipAddress1(csvRecord.get(AmazonCsvOrderHeader.SHIP_ADDRESS_1.getName()));
                amazonCsvOrder.setShipAddress2(csvRecord.get(AmazonCsvOrderHeader.SHIP_ADDRESS_2.getName()));
                amazonCsvOrder.setShipAddress3(csvRecord.get(AmazonCsvOrderHeader.SHIP_ADDRESS_3.getName()));
                amazonCsvOrder.setShipCity(csvRecord.get(AmazonCsvOrderHeader.SHIP_CITY.getName()));
                amazonCsvOrder.setShipState(csvRecord.get(AmazonCsvOrderHeader.SHIP_STATE.getName()));
                amazonCsvOrder.setShipPostalCode(csvRecord.get(AmazonCsvOrderHeader.SHIP_POSTAL_CODE.getName()));
                amazonCsvOrder.setShipCountry(csvRecord.get(AmazonCsvOrderHeader.SHIP_COUNTRY.getName()));
                amazonCsvOrders.add(amazonCsvOrder);
            } catch (NumberFormatException e) {
                LOGGER.severe("Unable to parse number for order id: " + orderId);
            } catch (DateTimeParseException e) {
                LOGGER.severe("Unable to parse purchase data for order id: " + orderId);
            } finally {
                LOGGER.info("Single Amazon csv unshipped order record: " + amazonCsvOrder);
            }
        }

        return amazonCsvOrders;
    }
}
