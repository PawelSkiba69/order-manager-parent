package pl.com.infratex.ordermanager.web.model.coverter;

import pl.com.infratex.ordermanager.web.model.MarketplaceDataModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MarketplaceDataConverter {

    private static final Logger LOGGER = Logger.getLogger(MarketplaceDataConverter.class.getName());
    private static final Map<String, MarketplaceDataModel> MARKETPLACE_DATA = new HashMap<>();


    static {
        MARKETPLACE_DATA.put("GB", MarketplaceDataModel.builder()
                .displayableOrderComment("Thank you for buying").marketplaceId("A1F83G8C2ARO7P").build());
        MARKETPLACE_DATA.put("DE", MarketplaceDataModel.builder()
                .displayableOrderComment("Vielen Dank für Ihre Bestellung").marketplaceId("A1PA6795UKMFR9").build());
        MARKETPLACE_DATA.put("FR", MarketplaceDataModel.builder()
                .displayableOrderComment("Merci de votre commande").marketplaceId("A13V1IB3VIYZZH").build());
        MARKETPLACE_DATA.put("ES", MarketplaceDataModel.builder()
                .displayableOrderComment("Gracias por tu solicitud").marketplaceId("A1RKKUPIHCS9HS").build());
        MARKETPLACE_DATA.put("IT", MarketplaceDataModel.builder()
                .displayableOrderComment("Grazie per il tuo ordine").marketplaceId("APJ6JRA9NG5V4").build());

    }

    public static MarketplaceDataModel extract(String buyerEmail) {
        LOGGER.info("extract(" + buyerEmail + ")");
        MarketplaceDataModel marketplaceDataModel = new MarketplaceDataModel();
        if (buyerEmail != null) {
            String[] strings = buyerEmail.split("\\.");
            LOGGER.info(Arrays.toString(strings));
            String countryCode = strings[strings.length - 1];
            if ("uk".equals(countryCode)) {
                marketplaceDataModel = convert("GB");
            } else {
                marketplaceDataModel = convert(countryCode.toUpperCase());
            }
        }
        LOGGER.info("marketplaceDataModel: " + marketplaceDataModel);
        return marketplaceDataModel;
    }

    public static MarketplaceDataModel convert(String countryCode) {
        LOGGER.info("convert(" + countryCode + ")");
        MarketplaceDataModel marketplaceDataModel = MARKETPLACE_DATA.get(countryCode);
        LOGGER.info("marketplaceDataModel: " + marketplaceDataModel);
        return marketplaceDataModel;
    }
}
