package com.labbol.smeri.api.test.orig.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.orig.response.DeleteOrigModifyLogResponse;

/**
 * @author PengFei
 */
public class DeleteOrigModifyLogRequest extends AbstractAPIRequest<DeleteOrigModifyLogResponse>{
	
	private String origModifyLogId;
	
	public DeleteOrigModifyLogRequest() {
		super("/v1.0/service_test/deleteOrigModifyLog", "DELETE");
	}
	
	@Override
	public Class<DeleteOrigModifyLogResponse> getResponseClass() {
		return DeleteOrigModifyLogResponse.class;
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
