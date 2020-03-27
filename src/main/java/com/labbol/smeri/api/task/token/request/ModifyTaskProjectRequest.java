package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.ModifyTaskProjectResponse;

public class ModifyTaskProjectRequest extends AbstractAPIRequest<ModifyTaskProjectResponse> {

	private String tokenProjectId;
	
	public ModifyTaskProjectRequest() {
		super("/V1.0/service_task/modifyTaskProject", "PUT");
	}

	@Override
	public Class<ModifyTaskProjectResponse> getResponseClass() {
		return ModifyTaskProjectResponse.class;
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
