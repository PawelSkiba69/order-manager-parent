package pl.com.infratex.ordermanager.web.model.coverter;

import pl.com.infratex.ordermanager.web.model.CountryInfo;

public class CountryConverter {

    public static CountryInfo countryConvert(String shortCut) {
        return CountryInfo.valueOf(shortCut);
    }
}
