package pl.com.infratex.ordermanager.web.model;

import pl.poczta_polska.e_nadawca.DeklaracaCelnaRodzajEnum;

public enum CountryInfo {
    PL("Polska","PL","Poczta Polska", null),
    ES("Hiszpania","ES","Correos", null),
    FR("Francja","FR","La Poste", null),
    DE("Niemcy","DE","Deutsche Post", null),
    IT("Włochy","IT","Poste Italiane", null),
    AT("Austria","AT","AG Post", null),
    BE("Belgia","BE","BPost", null),
    SE("Szwecja","SE","Post Nord", null),
    IE("Irlandia","IE","AN Post", null),
    CY("Cypr","CY","Cyprus Post", null),
    PT("Portugalia","PT","CTT", null),
    CH("Szwajcaria","CH","Swiss Post", DeklaracaCelnaRodzajEnum.CN_22),
    CZ("Czechy","CZ","Česká pošta", null),
    LU("Luksemburg","LU","POST LUXEMBOURG", null),
    SI("Słowenia","SI","Pošta Slovenije", null),
    GB("Wielka Brytania","GB","Royal Mail", DeklaracaCelnaRodzajEnum.CN_22);

    private String countryName;
    private String countryCode;
    private String carrierName;
    private DeklaracaCelnaRodzajEnum deklaracaCelnaRodzaj;

    CountryInfo(String countryName, String countryCode, String carrierName, DeklaracaCelnaRodzajEnum deklaracaCelnaRodzaj) {

        this.countryName = countryName;
        this.countryCode = countryCode;
        this.carrierName = carrierName;
        this.deklaracaCelnaRodzaj = deklaracaCelnaRodzaj;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCarrierName() {
        return carrierName;
    }
}
