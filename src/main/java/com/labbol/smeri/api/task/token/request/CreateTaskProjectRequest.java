package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.CreateTaskProjectResponse;
import com.labbol.smeri.api.task.token.support.TokenProject;
import com.labbol.smeri.api.task.token.support.TokenProjectWrapper;

/**
 * @author PengFei
 */
public class CreateTaskProjectRequest extends AbstractAPIRequest<CreateTaskProjectResponse> {

	private TokenProject tokenProject;
	
	private static final String [] TOKEN_PROJECT_NOT_BLANK_FIELDS = {
			"tokenId","projectName","testLeader","tester","testTime",
			"finishState","creator","updator","state"
	};
	
	public CreateTaskProjectRequest() {
		super("/v1.0/service_task/createTaskProject", "POST");
	}

	@Override
	public Class<CreateTaskProjectResponse> getResponseClass() {
		return CreateTaskProjectResponse.class;
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
		RequestCheckUtils.checkNotEmpty(tokenProject, "tokenProject");
		RequestCheckUtils.checkBeanFieldNotEmpty(tokenProject, TOKEN_PROJECT_NOT_BLANK_FIELDS);
	}

}
