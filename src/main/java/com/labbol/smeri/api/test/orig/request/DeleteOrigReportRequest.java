package com.labbol.smeri.api.test.orig.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.orig.response.DeleteOrigReportResponse;

/**
 * @author PengFei
 */
public class DeleteOrigReportRequest extends AbstractAPIRequest<DeleteOrigReportResponse>{

	private String origReportId;

	public DeleteOrigReportRequest() {
		super("/v1.0/service_test/deleteOrigReport", "DELETE");
	}

	@Override
	public Class<DeleteOrigReportResponse> getResponseClass() {
		return DeleteOrigReportResponse.class;
	}

	public String getOrigReportId() {
		return origReportId;
	}

	public void setOrigReportId(String origReportId) {
		this.origReportId = origReportId;
		httpRequest.addParam("origReportId", origReportId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty("origReportId", origReportId);
	}

}
