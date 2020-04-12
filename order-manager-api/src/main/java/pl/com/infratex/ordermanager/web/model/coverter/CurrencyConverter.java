package pl.com.infratex.ordermanager.web.model.coverter;

public class CurrencyConverter {
    public static String currencyConvertToSymbol(String currency) {
        if (currency.equals("GBP")) {
            return "£";
        }
        if (currency.equals("EUR")) {
            return "€";
        }
        else
            return "";
    }
}
