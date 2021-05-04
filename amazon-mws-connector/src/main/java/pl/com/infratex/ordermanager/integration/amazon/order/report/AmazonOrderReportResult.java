package pl.com.infratex.ordermanager.integration.amazon.order.report;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.OutputStream;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AmazonOrderReportResult {
    private OutputStream newOrdersOutputStream;
    private OutputStream unshippedOrdersOutputStream;
}
