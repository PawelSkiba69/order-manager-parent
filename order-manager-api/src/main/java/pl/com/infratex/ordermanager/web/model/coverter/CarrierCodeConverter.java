package pl.com.infratex.ordermanager.web.model.coverter;

import org.springframework.stereotype.Component;

@Component
public class CarrierCodeConverter {
    public String convert(String countryCode){
        if (countryCode.equals("GB")){
            return "Wielka Brytania";
        }
        if (countryCode.equals("DE")){
            return "Deutsche Post";
        }
        if (countryCode.equals("IT")){
            return "Włochy";
        }
        if (countryCode.equals("FR")){
            return "La Poste";
        }
        if (countryCode.equals("ES")){
            return "Hiszpania";
        }
        if (countryCode.equals("AT")){
            return "Austria";
        }
        if (countryCode.equals("BE")){
            return "Belgia";
        }
        if (countryCode.equals("SE")){
            return "Szwecja";
        }
        if (countryCode.equals("IE")){
            return "Irlandia";
        }
        if (countryCode.equals("CY")){
            return "Cypr";
        }
        if (countryCode.equals("NL")){
            return "Holandia";
        }
        if (countryCode.equals("NZ")){
            return "Nowa Zelandia";
        }
        if (countryCode.equals("BG")){
            return "Bułgaria";
        }
        if (countryCode.equals("FI")){
            return "Finlandia";
        }
        if (countryCode.equals("PT")){
            return "Portugalia";
        }
        if (countryCode.equals("HK")){
            return "Chorwacja";
        }
        return countryCode;
    }
}
