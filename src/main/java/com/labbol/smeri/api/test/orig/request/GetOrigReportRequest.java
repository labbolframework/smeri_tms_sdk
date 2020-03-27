package com.labbol.smeri.api.test.orig.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.orig.response.GetOrigReportResponse;

/**
 * @author PengFei
 */
public class GetOrigReportRequest extends AbstractAPIRequest<GetOrigReportResponse>{

	private String origReportId;
	
	public GetOrigReportRequest() {
		super("/v1.0/service_test/getOrigReport", "GET");
	}

	@Override
	public Class<GetOrigReportResponse> getResponseClass() {
		return GetOrigReportResponse.class;
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
