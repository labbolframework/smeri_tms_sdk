package com.labbol.smeri.api.test.reportsend.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.reportsend.response.GetReportSendResponse;

/**
 * @author PengFei
 */
public class GetReportSendRequest extends AbstractAPIRequest<GetReportSendResponse> {

	private String reportSendId;

	public GetReportSendRequest() {
		super("/v1.0/service_test/getReportSend", "GET");
	}

	@Override
	public Class<GetReportSendResponse> getResponseClass() {
		return GetReportSendResponse.class;
	}

	public String getReportSendId() {
		return reportSendId;
	}

	public void setReportSendId(String reportSendId) {
		this.reportSendId = reportSendId;
		httpRequest.addParam("reportSendId", reportSendId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(reportSendId, "reportSendId");
	}
	
}
