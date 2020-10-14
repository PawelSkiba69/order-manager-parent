package pl.com.infratex.ordermanager.web.model.coverter;

import org.springframework.stereotype.Component;

@Component
public class CarrierCodeConverter {
    public String convert(String countryCode){
        return countryCode;
    }
}
