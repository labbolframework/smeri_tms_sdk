package com.labbol.smeri.api.test.orig.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.orig.response.GetOrigModifyLogResponse;

/**
 * @author PengFei
 */
public class GetOrigModifyLogRequest extends AbstractAPIRequest<GetOrigModifyLogResponse>{

	private String origModifyLogId;

	public GetOrigModifyLogRequest() {
		super("/v1.0/service_test/getOrigModifyLog", "GET");
	}

	@Override
	public Class<GetOrigModifyLogResponse> getResponseClass() {
		return GetOrigModifyLogResponse.class;
	}

	public String getOrigModifyLogId() {
		return origModifyLogId;
	}

	public void setOrigModifyLogId(String origModifyLogId) {
		this.origModifyLogId = origModifyLogId;
		httpRequest.addParam("origModifyLogId", origModifyLogId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(origModifyLogId, "origModifyLogId");
	}	

}
