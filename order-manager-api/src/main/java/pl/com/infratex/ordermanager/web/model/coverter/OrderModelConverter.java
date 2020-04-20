package pl.com.infratex.ordermanager.web.model.coverter;

import org.apache.commons.lang3.StringUtils;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static pl.com.infratex.ordermanager.web.model.coverter.CountryConverter.countryConvert;

public class OrderModelConverter {

    public static List<OrderModel> convert(List<OrderModel> orders) {
        for (OrderModel order : orders) {
            fillBlank(order);
            toUpperCase(order);
            countryCode(order);
        }
        return orders;
    }

    public static void formatDate(OrderModel order) {
        LocalDateTime purchaseDate = order.getPurchaseDate();
        String format = purchaseDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        order.setPurchaseDateFormatted(format);
    }

    private static void fillBlank(OrderModel order) {
        ClientModel client = order.getClient();
        if (client != null) {
            if (StringUtils.isBlank(client.getShipAddress2())) {
                client.setShipAddress2(client.getShipAddress1());
                client.setShipAddress1("");
            }
        }
    }

    private static void toUpperCase(OrderModel order) {
        ClientModel client = order.getClient();
        if (client != null) {
            client.setRecipientName(client.getRecipientName().toUpperCase());
            client.setShipAddress1(client.getShipAddress1().toUpperCase());
            client.setShipAddress2(client.getShipAddress2().toUpperCase());
            client.setShipAddress3(client.getShipAddress3().toUpperCase());
            client.setShipCity(client.getShipCity().toUpperCase());

            order.setClient(client);
        }
    }

    private static void countryCode(OrderModel order) {
        ClientModel client = order.getClient();
        if (client != null) {
            client.setShipCountry(countryConvert(client.getShipCountry()));
            order.setClient(client);
        }
    }
}
