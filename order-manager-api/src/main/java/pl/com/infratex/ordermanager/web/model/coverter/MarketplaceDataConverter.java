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
