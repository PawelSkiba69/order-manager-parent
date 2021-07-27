package pl.poczta_polska.e_nadawca;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2021-07-27T18:28:01.268+02:00
 * Generated source version: 3.4.2
 *
 */
@WebServiceClient(name = "ElektronicznyNadawca",
                  wsdlLocation = "classpath:en.wsdl",
                  targetNamespace = "http://e-nadawca.poczta-polska.pl")
public class ElektronicznyNadawca_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://e-nadawca.poczta-polska.pl", "ElektronicznyNadawca");
    public final static QName ENSoap = new QName("http://e-nadawca.poczta-polska.pl", "ENSoap");
    static {
        URL url = ElektronicznyNadawca_Service.class.getClassLoader().getResource("en.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ElektronicznyNadawca_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:en.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ElektronicznyNadawca_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ElektronicznyNadawca_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ElektronicznyNadawca_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ElektronicznyNadawca_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ElektronicznyNadawca_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ElektronicznyNadawca_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ElektronicznyNadawca
     */
    @WebEndpoint(name = "ENSoap")
    public ElektronicznyNadawca getENSoap() {
        return super.getPort(ENSoap, ElektronicznyNadawca.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ElektronicznyNadawca
     */
    @WebEndpoint(name = "ENSoap")
    public ElektronicznyNadawca getENSoap(WebServiceFeature... features) {
        return super.getPort(ENSoap, ElektronicznyNadawca.class, features);
    }

}
