package pl.com.infratex.ordermanager.web.model.coverter;

public class CountryConverter {

    public static String countryConvert(String shortCut){
        if (shortCut.equals("GB")){
            return "Wielka Brytania";
        }
        if (shortCut.equals("DE")){
            return "Niemcy";
        }
        if (shortCut.equals("IT")){
            return "Włochy";
        }
        if (shortCut.equals("FR")){
            return "Francja";
        }
        if (shortCut.equals("ES")){
            return "Hiszpania";
        }
        if (shortCut.equals("AT")){
            return "Austria";
        }
        if (shortCut.equals("BE")){
            return "Belgia";
        }
        if (shortCut.equals("SE")){
            return "Szwecja";
        }
        if (shortCut.equals("IE")){
            return "Irlandia";
        }
        if (shortCut.equals("CY")){
            return "Cypr";
        }
        if (shortCut.equals("NL")){
            return "Holandia";
        }
        if (shortCut.equals("NZ")){
            return "Nowa Zelandia";
        }
        if (shortCut.equals("BG")){
            return "Bułgaria";
        }
        if (shortCut.equals("FI")){
            return "Finlandia";
        }
        if (shortCut.equals("PT")){
            return "Portugalia";
        }
        if (shortCut.equals("HK")){
            return "Chorwacja";
        }
        return shortCut+"!!!!!!!!!!!";
    }

}
