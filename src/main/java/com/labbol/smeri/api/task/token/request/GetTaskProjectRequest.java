/**
 * 
 */
package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.GetTaskProjectResponse;

/**
 * @author PengFei
 *
 */
public class GetTaskProjectRequest extends AbstractAPIRequest<GetTaskProjectResponse>{

	private String tokenProjectId; 
	
	public GetTaskProjectRequest() {
		super("/v1.0/service_task/getTaskProject", "GET");
	}

	@Override
	public Class<GetTaskProjectResponse> getResponseClass() {
		return GetTaskProjectResponse.class;
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
