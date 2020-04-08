package pl.com.infratex.ordermanager.service.csv.processor;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrderHeader;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class AmazonCsvNewOrdersProcessor implements AmazonCsvOrdersProcessor {

    private static final Logger LOGGER = Logger.getLogger(AmazonCsvNewOrdersProcessor.class.getName());

    private Reader reader;

    public AmazonCsvNewOrdersProcessor(Reader reader) {
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
                amazonCsvOrder.setCurrency(csvRecord.get(AmazonCsvOrderHeader.CURRENCY.getName()));
                amazonCsvOrder.setItemPrice(new BigDecimal(csvRecord.get(AmazonCsvOrderHeader.ITEM_PRICE.getName())));
                amazonCsvOrder.setShippingPrice(new BigDecimal(csvRecord.get(AmazonCsvOrderHeader.SHIPPING_PRICE.getName())));
                amazonCsvOrder.setItemTax(new BigDecimal(csvRecord.get(AmazonCsvOrderHeader.ITEM_TAX.getName())));
                amazonCsvOrder.setShippingTax(new BigDecimal(csvRecord.get(AmazonCsvOrderHeader.SHIPPING_TAX.getName())));
                amazonCsvOrder.setBusinessOrder(Boolean.parseBoolean(csvRecord.get(AmazonCsvOrderHeader.IS_BUSINESS_ORDER.getName())));
                amazonCsvOrder.setShipPhoneNumber(csvRecord.get(AmazonCsvOrderHeader.SHIP_PHONE_NUMBER.getName()));
                amazonCsvOrders.add(amazonCsvOrder);
            } catch (NumberFormatException e) {
                LOGGER.severe("Unable to parse number for order id: " + orderId);
            } catch (DateTimeParseException e) {
                LOGGER.severe("Unable to parse purchase data for order id: " + orderId);
            } catch (IllegalArgumentException e) {
                LOGGER.severe("Column not found for order id: " + orderId);
            } catch (Exception e) {
                LOGGER.severe("Unknown problem for order id: " + orderId);
            } finally {
                LOGGER.info("Single Amazon csv new order record: " + amazonCsvOrder);
            }
        }
        return amazonCsvOrders;
    }
}


