package pl.com.infratex.ordermanager.service.csv.order;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.api.exception.order.OrderMultiChannelFulfillmentCsvProcessorException;
import pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.MarketplaceDataModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;
import pl.com.infratex.ordermanager.web.model.coverter.MarketplaceDataConverter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import static pl.com.infratex.ordermanager.dao.utils.SequenceIdGenerator.ORDER_BATCH_ID_SEQ;

@Component
public class OrderMultiChannelFulfillmentCsvProcessor {

    private static final Logger LOGGER = Logger.getLogger(OrderMultiChannelFulfillmentCsvProcessor.class.getName());
    private static final String SAMPLE_CSV_FILE = "";
    private static final char TAB = '\t';
    public static final String MULTICHANNEL_FULFILLMENT_ORDER_ALWIR = "MFO_AW";
    public static final String FULFILLMENT_ACTION_SHIP = "Ship";
    public static final String DELIVERY_SLA_STANDARD = "Standard";

    private final SequenceIdGenerator sequenceIdGenerator;

    public OrderMultiChannelFulfillmentCsvProcessor(SequenceIdGenerator sequenceIdGenerator) {
        this.sequenceIdGenerator = sequenceIdGenerator;
    }

    public InputStream createCsv(List<OrderModel> orderModels) throws OrderMultiChannelFulfillmentCsvProcessorException {
        LOGGER.info("createCsv("+orderModels+")");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (OutputStreamWriter writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withDelimiter(TAB)
                     .withHeader("MerchantFulfillmentOrderID", "DisplayableOrderID", "DisplayableOrderDate", "MerchantSKU", "Quantity",
                             "MerchantFulfillmentOrderItemID", "GiftMessage", "DisplayableComment", "DisplayableOrderComment", "DeliverySLA",
                             "AddressName", "AddressFieldOne", "AddressFieldTwo", "AddressFieldThree", "AddressCity", "AddressCountryCode",
                             "AddressStateOrRegion", "AddressPostalCode", "AddressPhoneNumber", "NotificationEmail", "FulfillmentAction", "MarketplaceID"
                             ,"OrderName","ProductAsin","ProductName"
                     ))) {
            if (orderModels != null) {
                orderModels.forEach(
                        orderModel -> createCsvRecord(orderModel, csvPrinter));
            }
            csvPrinter.flush();

            byte[] bytes = outputStream.toByteArray();
            return new ByteArrayInputStream(bytes);

        } catch (IOException e) {
            throw new OrderMultiChannelFulfillmentCsvProcessorException("Nie można stworzyć pliku csv", e);
        }
    }

    private void createCsvRecord(OrderModel orderModel, CSVPrinter csvPrinter) {

        ClientModel client = orderModel.getClient();
        ProductModel product = orderModel.getProduct();
        if(client!=null && product!=null) {
            Integer merchantFulfillmentOrderID = sequenceIdGenerator.generateId(ORDER_BATCH_ID_SEQ);
            MarketplaceDataModel marketplaceDataModel = MarketplaceDataConverter.extract(client.getBuyerEmail());
            List<String> strings = Arrays.asList(
                    MULTICHANNEL_FULFILLMENT_ORDER_ALWIR +merchantFulfillmentOrderID,   //MerchantFulfillmentOrderID
                    MULTICHANNEL_FULFILLMENT_ORDER_ALWIR +merchantFulfillmentOrderID,   //DisplayableOrderID
                    LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),        //DisplayableOrderDate
                    "",     //MerchantSKU
                    String.valueOf(orderModel.getQuantityPurchased()),//Quantity
                    "",//MerchantFulfillmentOrderItemID
                    "",//GiftMessage
                    "",//DisplayableComment
                    marketplaceDataModel.getDisplayableOrderComment(),//DisplayableOrderComment
                    DELIVERY_SLA_STANDARD,//DeliverySLA
                    client.getRecipientName(),//AddressName
                    client.getShipAddress1(),//AddressFieldOne
                    client.getShipAddress2(),//AddressFieldTwo
                    client.getShipAddress3(),//AddressFieldThree
                    client.getShipCity(),//AddressCity
                    client.getShipCountry(),//AddressCountryCode
                    client.getShipState(),//AddressStateOrRegion
                    client.getShipPostalCode(),//AddressPostalCode
                    client.getShipPhoneNumber(),//AddressPhoneNumber
                    client.getBuyerEmail(),//NotificationEmail
                    FULFILLMENT_ACTION_SHIP,//FulfillmentAction
                    marketplaceDataModel.getMarketplaceId(),//MarketplaceID,
                    orderModel.getOrderId(),
                    orderModel.getAsin(),
                    product.getProductName()
            );
            try {
                csvPrinter.printRecord(strings);
                //FIXME rozważyć rzucenie własnego wyjątku
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
