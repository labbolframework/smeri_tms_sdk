package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.DeleteTaskSampleResponse;

/**
 * @author PengFei
 */
public class DeleteTaskSampleRequest extends AbstractAPIRequest<DeleteTaskSampleResponse> {

	private String tokenSampleId;

	public DeleteTaskSampleRequest() {
		super("/v1.0/service_task/deleteTaskSample", "DELETE");
	}

	@Override
	public Class<DeleteTaskSampleResponse> getResponseClass() {
		return DeleteTaskSampleResponse.class;
	}

	public String getTokenSampleId() {
		return tokenSampleId;
	}

	public void setTokenSampleId(String tokenSampleId) {
		this.tokenSampleId = tokenSampleId;
		httpRequest.addParam("tokenSampleId", tokenSampleId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(tokenSampleId, "tokenSampleId");
	}


}
