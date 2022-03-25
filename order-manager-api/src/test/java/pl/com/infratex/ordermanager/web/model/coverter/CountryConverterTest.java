package pl.com.infratex.ordermanager.web.model.coverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.web.model.CountryInfo;

import static org.junit.jupiter.api.Assertions.*;

class CountryConverterTest {

    @Test
    void countryConvert() {
        // given
        String shortCut="UN";
        // when
        CountryInfo countryInfo = CountryConverter.countryConvert(shortCut);
        // then
        Assertions.assertEquals(CountryInfo.UNKNOWN,countryInfo,"Not unknown country info");
    }
}