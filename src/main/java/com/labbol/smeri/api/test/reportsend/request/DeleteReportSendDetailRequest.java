package com.labbol.smeri.api.test.reportsend.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.reportsend.response.DeleteReportSendDetailResponse;

/**
 * @author PengFei
 */
public class DeleteReportSendDetailRequest extends AbstractAPIRequest<DeleteReportSendDetailResponse> {

	private String reportSendDetailId;

	public DeleteReportSendDetailRequest() {
		super("/v1.0/service_test/deleteReportSendDetail", "DELETE");
	}

	@Override
	public Class<DeleteReportSendDetailResponse> getResponseClass() {
		return DeleteReportSendDetailResponse.class;
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
