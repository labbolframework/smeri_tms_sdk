package com.labbol.smeri.api.test.report.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.report.response.DeleteReportResponse;

/**
 * @author PengFei
 */
public class DeleteReportRequest extends AbstractAPIRequest<DeleteReportResponse> {

	private String reportId;
	
	public DeleteReportRequest() {
		super("/v1.0/service_test/deleteReport", "DELETE");
	}

	@Override
	public Class<DeleteReportResponse> getResponseClass() {
		return DeleteReportResponse.class;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
		httpRequest.addParam("reportId", reportId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(reportId, "reportId");
	}

}
