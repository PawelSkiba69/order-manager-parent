package pl.com.infratex.ordermanager.web.model.coverter;

public class CurrencyConverter {
    public static String currencyConvertToSymbol(String currency) {
        if ("GBP".equals(currency)) {
            return "£";
        }
        if ("EUR".equals(currency)) {
            return "€";
        }
        return "";
    }
}
