package com.labbol.smeri.api.test.reportsend.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.reportsend.response.GetReportSendDetailResponse;

/**
 * @author PengFei
 */
public class GetReportSendDetailRequest extends AbstractAPIRequest<GetReportSendDetailResponse> {

	private String reportSendDetailId;

	public GetReportSendDetailRequest() {
		super("/v1.0/service_test/getReportSendDetail", "GET");
	}

	@Override
	public Class<GetReportSendDetailResponse> getResponseClass() {
		return GetReportSendDetailResponse.class;
	}

	public String getReportSendDetailId() {
		return reportSendDetailId;
	}

	public void setReportSendDetailId(String reportSendDetailId) {
		this.reportSendDetailId = reportSendDetailId;
		httpRequest.addParam("reportSendDetailId", reportSendDetailId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(reportSendDetailId, "reportSendDetailId");
	}

}
