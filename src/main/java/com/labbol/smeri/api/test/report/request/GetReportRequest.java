package com.labbol.smeri.api.test.report.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.report.response.GetReportResponse;

/**
 * @author PengFei
 */
public class GetReportRequest extends AbstractAPIRequest<GetReportResponse> {

	private String reportId;
	
	public GetReportRequest() {
		super("/v1.0/service_test/getReport", "GET");
	}

	@Override
	public Class<GetReportResponse> getResponseClass() {
		return GetReportResponse.class;
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
