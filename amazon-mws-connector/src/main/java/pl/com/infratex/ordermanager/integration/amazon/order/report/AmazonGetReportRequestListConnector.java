package pl.com.infratex.ordermanager.integration.amazon.order.report;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.GetReportRequestListRequest;
import com.amazonaws.mws.model.GetReportRequestListResponse;
import com.amazonaws.mws.model.GetReportRequestListResult;
import com.amazonaws.mws.model.ReportRequestInfo;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.exception.OrderManagerDateUtilsException;
import pl.com.infratex.ordermanager.integration.amazon.ConnectorHelper;
import pl.com.infratex.ordermanager.utils.OrderManagerDateUtils;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

@Service
public class AmazonGetReportRequestListConnector {
    private static final Logger LOGGER = Logger.getLogger(AmazonRequestReportConnector.class.getName());

    private static final String MWS_AMAZONSERVICES_CO_UK = "https://mws.amazonservices.co.uk/";

    private static final String KI = "KI";
    private static final String AK = "AK";

    private static final String APP_NAME = "order-manager";
    private static final String APP_VERSION = "1.0.0";

    private static final String M_ID = "A3NLKSN848UAEB";
    public static final int DAYS_OF_RAPORT_REQUEST = 1;

    public List<ReportRequestInfo> reportList(){

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
        config.setServiceURL(MWS_AMAZONSERVICES_CO_UK);

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                ConnectorHelper.getInstance().getPropertyValue(KI),
                ConnectorHelper.getInstance().getPropertyValue(AK),
                APP_NAME, APP_VERSION, config);


        GetReportRequestListRequest request = new GetReportRequestListRequest()
                .withMerchant(M_ID);

        try {
            XMLGregorianCalendar startDate = OrderManagerDateUtils.createXmlGregorianCalendar(LocalDate.now().minusDays(DAYS_OF_RAPORT_REQUEST));
            request.setRequestedFromDate(startDate);
        } catch (OrderManagerDateUtilsException e) {
            e.printStackTrace();
        }

        List<GetReportRequestListRequest> requests = new ArrayList<GetReportRequestListRequest>();
        requests.add(request);

        GetReportRequestListResponse getReportRequestListResponse = invokeReportRequestList(service, request);

       return getReportRequestListResponse.getGetReportRequestListResult().getReportRequestInfoList();

    }

    public GetReportRequestListResponse invokeReportRequestList(MarketplaceWebService service,
                                                                       GetReportRequestListRequest request) {
//        Future<GetReportRequestListResponse> reportRequestListAsyncFuture = service.getReportRequestListAsync(request);
//        while (!reportRequestListAsyncFuture.isDone()) {
//            Thread.yield();
//        }
        GetReportRequestListResponse response = null;
        try {
//            response = reportRequestListAsyncFuture.get();
            ReportRequestListCallable reportRequestListCallable = new ReportRequestListCallable(service, request);
            RetryHelper<GetReportRequestListResponse> retryHelper = new RetryHelper<>(3, 5000, reportRequestListCallable);
            response = retryHelper.retry();

            // Original request corresponding to this response, if needed:
//            GetReportRequestListRequest originalRequest = requests.get(responses.indexOf(future));
            LOGGER.info("Response request id: " + response.getResponseMetadata().getRequestId());
            LOGGER.info(response.getResponseHeaderMetadata() + "");
            response.getGetReportRequestListResult().getReportRequestInfoList()
                    .forEach(reportRequestInfo -> LOGGER.info("#### " + reportRequestInfo.getReportRequestId() + " "
                            + reportRequestInfo.getGeneratedReportId()));
        } catch (Exception e) {
            if (e.getCause() instanceof MarketplaceWebServiceException) {
                MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e.getCause());
                System.out.println("Caught Exception: " + exception.getMessage());
                System.out.println("Response Status Code: " + exception.getStatusCode());
                System.out.println("Error Code: " + exception.getErrorCode());
                System.out.println("Error Type: " + exception.getErrorType());
                System.out.println("Request ID: " + exception.getRequestId());
                System.out.print("XML: " + exception.getXML());
                System.out.println("ResponseHeaderMetadata: " + exception.getResponseHeaderMetadata());
            } else {
                e.printStackTrace();
            }
        }
        return response;
    }

    class ReportRequestListCallable implements Callable<GetReportRequestListResponse> {
        private final MarketplaceWebService service;
        private final GetReportRequestListRequest request;

        public ReportRequestListCallable(MarketplaceWebService service, GetReportRequestListRequest request) {
            this.service = service;
            this.request = request;
        }

        @Override
        public GetReportRequestListResponse call() throws Exception {

            GetReportRequestListResponse response = service.getReportRequestList(request);
            if (response != null) {
                GetReportRequestListResult result = response.getGetReportRequestListResult();
                if (result != null) {
                    List<ReportRequestInfo> list = result.getReportRequestInfoList();
                    for (ReportRequestInfo reportRequestInfo : list) {
                        String generatedReportId = reportRequestInfo.getGeneratedReportId();
                        if (generatedReportId == null) {
                            return null;
                        }
                    }
                }
            }

            return response;
        }
    }


    class RetryHelper<T> {
        private final int tries;
        private final long delay;
        private final Callable<T> callable;

        public RetryHelper(int tries, long delay, Callable<T> callable) {
            this.tries = tries;
            this.delay = delay;
            this.callable = callable;
        }

        public T retry() {
            LOGGER.info("retry...");
            T result = null;
            int count = 0;

            while (result == null) {
                try {
                    result = callable.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                count++;

                try {
//                    Thread.sleep(delay * count);
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    // do nothing...
                }
            }

//            while (count <= tries || result != null) {
//            while (count <= tries) {
//                try {
//                    result = callable.call();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                count++;
//
//                try {
//                    Thread.sleep(delay * count);
//                } catch (InterruptedException e) {
//                    // do nothing...
//                }
//            }

            return result;
        }
    }
}
