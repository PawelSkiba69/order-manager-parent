package pl.com.infratex.ordermanager.web.model.coverter;

import org.springframework.stereotype.Component;

@Component
public class CarrierCodeConverter {
    public String convert(String countryCode){
        if (countryCode.equals("GB")){
            return "Royal Mail";
        }
        if (countryCode.equals("DE")){
            return "DHL";
        }
        if (countryCode.equals("IT")){
            return "Poste Italiane";
        }
        if (countryCode.equals("FR")){
            return "La Poste";
        }
        if (countryCode.equals("ES")){
            return "Correos";
        }
        if (countryCode.equals("AT")){
            return "AT Post";
        }
        if (countryCode.equals("BE")){
            return "BPost";
        }
        if (countryCode.equals("SE")){
            return "Post Nord";
        }
        if (countryCode.equals("IE")){
            return "AN Post";
        }
        if (countryCode.equals("CY")){
            return "Cyprus Post";
        }
        if (countryCode.equals("NL")){
            return "Post NL";
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
        return "Poczta Polska";
    }
}
