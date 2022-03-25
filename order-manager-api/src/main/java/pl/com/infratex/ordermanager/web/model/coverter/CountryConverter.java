package pl.com.infratex.ordermanager.web.model.coverter;

import pl.com.infratex.ordermanager.web.model.CountryInfo;

import java.util.logging.Logger;

public class CountryConverter {

    private static final Logger LOGGER = Logger.getLogger(CountryConverter.class.getName());

    public static CountryInfo countryConvert(String shortCut) {
//        LOGGER.info("countryConvert("+shortCut+")");
        try {
            return CountryInfo.valueOf(shortCut);
            //        LOGGER.info("countryInfo: "+countryInfo);
        } catch (IllegalArgumentException e) {
            return CountryInfo.UNKNOWN;
        }
    }
}
