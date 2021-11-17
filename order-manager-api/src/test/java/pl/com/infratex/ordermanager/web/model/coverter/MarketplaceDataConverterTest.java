package pl.com.infratex.ordermanager.web.model.coverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.web.model.MarketplaceDataModel;

class MarketplaceDataConverterTest {

    @Test
    void extract() {
        //GIVEN
        String buyerEmail="w16ckfncfrjtgkb@marketplace.amazon.co.uk";
        //WHEN
        MarketplaceDataModel marketplaceDataModel = MarketplaceDataConverter.extract(buyerEmail);
        //THEN
        Assertions.assertEquals("A1F83G8C2ARO7P",marketplaceDataModel.getMarketplaceId(),"MarketplaaceIds są różne");
    }
}