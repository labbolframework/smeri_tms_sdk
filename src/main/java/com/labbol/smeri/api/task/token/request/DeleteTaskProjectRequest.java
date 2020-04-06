package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.DeleteTaskProjectResponse;

public class DeleteTaskProjectRequest extends AbstractAPIRequest<DeleteTaskProjectResponse> {

	private String tokenProjectId;

	public DeleteTaskProjectRequest() {
		super("/v1.0/service_task/deleteTaskProject", "DELETE");
	}

	@Override
	public Class<DeleteTaskProjectResponse> getResponseClass() {
		return DeleteTaskProjectResponse.class;
	}

	public String getTokenProjectId() {
		return tokenProjectId;
	}

	public void setTokenProjectId(String tokenProjectId) {
		this.tokenProjectId = tokenProjectId;
		httpRequest.addParam("tokenProjectId", tokenProjectId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(tokenProjectId, "tokenProjectId");
	}

}
