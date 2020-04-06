package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.ModifyTaskProjectResponse;
import com.labbol.smeri.api.task.token.support.TokenProject;
import com.labbol.smeri.api.task.token.support.TokenProjectWrapper;

public class ModifyTaskProjectRequest extends AbstractAPIRequest<ModifyTaskProjectResponse> {

	private String tokenProjectId;
	
	private TokenProject tokenProject;
	
	private static final String [] TOKEN_PROJECT_NOT_BLANK_FIELDS = {
			"tokenId","projectName","testLeader","tester","testTime",
			"finishState","updator","state"
	};
	
	public ModifyTaskProjectRequest() {
		super("/v1.0/service_task/modifyTaskProject", "PUT");
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

	public TokenProject getTokenProject() {
		return tokenProject;
	}

	public void setTokenProject(TokenProject tokenProject) {
		this.tokenProject = tokenProject;
		try {
			httpRequest.setContentStr(gson.toJson(new TokenProjectWrapper(tokenProject)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(tokenProjectId, "tokenProjectId");
		RequestCheckUtils.checkBeanFieldNotEmpty(tokenProject, TOKEN_PROJECT_NOT_BLANK_FIELDS);
	}
	
}
