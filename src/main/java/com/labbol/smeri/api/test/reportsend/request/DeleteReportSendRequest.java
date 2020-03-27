package com.labbol.smeri.api.test.reportsend.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.reportsend.response.DeleteReportSendResponse;

/**
 * @author PengFei
 */
public class DeleteReportSendRequest extends AbstractAPIRequest<DeleteReportSendResponse> {

	private String reportSendId;

	public DeleteReportSendRequest() {
		super("/v1.0/service_test/deleteReportSend", "DELETE");
	}

	@Override
	public Class<DeleteReportSendResponse> getResponseClass() {
		return DeleteReportSendResponse.class;
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
