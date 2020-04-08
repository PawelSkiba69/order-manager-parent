package pl.com.infratex.ordermanager.service.csv.processor;

import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.logging.Logger;


public class AmazonCsvOrdersMergeProcessor {

    private static final Logger LOGGER = Logger.getLogger(AmazonCsvOrdersMergeProcessor.class.getName());
    private AmazonCsvProcessor amazonCsvProcessor = new AmazonCsvProcessor();

    public List<AmazonCsvOrder> mergeOrders(Reader unshippedOrdersReader, Reader newOrdersReader) throws IOException {
        //TODO use AmazonCsv Validators
        List<AmazonCsvOrder> amazonCsvUnshippedOrders = amazonCsvProcessor.parseCsv(new AmazonCsvUnshippedOrdersProcessor(unshippedOrdersReader));
        List<AmazonCsvOrder> amazonCsvNewOrders = amazonCsvProcessor.parseCsv(new AmazonCsvNewOrdersProcessor(newOrdersReader));

        for (AmazonCsvOrder amazonCsvUnshippedOrder : amazonCsvUnshippedOrders) {
            String unshippedOrderId = amazonCsvUnshippedOrder.getOrderId();
            for (AmazonCsvOrder amazonCsvNewOrder : amazonCsvNewOrders) {
                String newOrderId = amazonCsvNewOrder.getOrderId();
                if (unshippedOrderId != null && newOrderId != null) {
                    if (unshippedOrderId.equalsIgnoreCase(newOrderId)) {
                        try {
                            amazonCsvUnshippedOrder.setCurrency(amazonCsvNewOrder.getCurrency());
                            amazonCsvUnshippedOrder.setItemPrice(amazonCsvNewOrder.getItemPrice());
                            amazonCsvUnshippedOrder.setShippingPrice(amazonCsvNewOrder.getShippingPrice());
                            amazonCsvUnshippedOrder.setItemTax(amazonCsvNewOrder.getItemTax());
                            amazonCsvUnshippedOrder.setShippingTax(amazonCsvNewOrder.getShippingTax());
                            amazonCsvUnshippedOrder.setBusinessOrder(amazonCsvNewOrder.isBusinessOrder());
                            amazonCsvUnshippedOrder.setShipPhoneNumber(amazonCsvNewOrder.getShipPhoneNumber());
                        } finally {
                            LOGGER.info("Single Amazon csv unshipped order record after merge: " + amazonCsvUnshippedOrder);
                        }
                    }
                }

            }
        }
        return amazonCsvUnshippedOrders;
    }
}
