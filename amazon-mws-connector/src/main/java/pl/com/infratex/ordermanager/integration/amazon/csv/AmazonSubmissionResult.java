package pl.com.infratex.ordermanager.integration.amazon.csv;

import com.amazonaws.mws.model.GetFeedSubmissionResultResponse;
import pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel;

import java.util.List;

public class AmazonSubmissionResult {
    private List<AmazonCsvSubmissionResultModel> amazonCsvSubmissionResultModels;
    private GetFeedSubmissionResultResponse getFeedSubmissionResultResponse;

    public AmazonSubmissionResult(List<AmazonCsvSubmissionResultModel> amazonCsvSubmissionResultModels,
                                  GetFeedSubmissionResultResponse getFeedSubmissionResultResponse) {
        this.amazonCsvSubmissionResultModels = amazonCsvSubmissionResultModels;
        this.getFeedSubmissionResultResponse = getFeedSubmissionResultResponse;
    }

    public List<AmazonCsvSubmissionResultModel> getAmazonCsvSubmissionResultModels() {
        return amazonCsvSubmissionResultModels;
    }

    public GetFeedSubmissionResultResponse getGetFeedSubmissionResultResponse() {
        return getFeedSubmissionResultResponse;
    }

    @Override
    public String toString() {
        return "AmazonSubmissionResult{" +
                "amazonCsvSubmissionResultModels=" + amazonCsvSubmissionResultModels +
                ", getFeedSubmissionResultResponse=" + getFeedSubmissionResultResponse +
                '}';
    }
}
