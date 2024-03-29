package pl.com.infratex.ordermanager.web.model.coverter;

import org.apache.commons.lang3.StringUtils;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.CountryInfo;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.poczta_polska.e_nadawca.DeklaracaCelnaRodzajEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Logger;

public class OrderModelConverter {

    private static final Logger LOGGER = Logger.getLogger(OrderModelConverter.class.getName());

    public static List<OrderModel> convert(List<OrderModel> orders) {
        for (OrderModel order : orders) {
            formatShipAddress(order);
            toUpperCase(order);
            countryCode(order, true);
        }
        return orders;
    }

    public static void formatDate(OrderModel order) {
        LocalDateTime purchaseDate = order.getPurchaseDate();
        if (purchaseDate != null) {
            String format = purchaseDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            order.setPurchaseDateFormatted(format);
        }
    }

    public static void countryCode(OrderModel order, boolean withCountryName) {
        ClientModel client = order.getClient();
        if (client != null) {
            CountryInfo countryInfo = CountryConverter.countryConvert(client.getShipCountry());
            if (countryInfo != null) {
                if (withCountryName) {
                    client.setShipCountry(countryInfo.getCountryName());
                }
                DeklaracaCelnaRodzajEnum deklaracaCelnaRodzaj = countryInfo.getDeklaracaCelnaRodzaj();
                if (deklaracaCelnaRodzaj != null) {
                    order.setCountryInfo(countryInfo);
                }
            }
            order.setClient(client);
        }
    }

    private static void formatShipAddress(OrderModel order) {
        //  LOGGER.info("formatShipAddress("+order+")");
        ClientModel client = order.getClient();
        if (client != null) {
            String shipAddress1 = client.getShipAddress1();
            String shipAddress2 = client.getShipAddress2();
            if (StringUtils.isBlank(shipAddress2)) {
                client.setShipAddress2(shipAddress1);
                client.setShipAddress1("");
            } else if (shipAddress2.length() < 4 || shipAddress1.length() < 4) {
                client.setShipAddress2(shipAddress1 + " " + shipAddress2);
                client.setShipAddress1("");
            }
        }
        //   LOGGER.info("formatShipAddress("+order+")");
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
}
