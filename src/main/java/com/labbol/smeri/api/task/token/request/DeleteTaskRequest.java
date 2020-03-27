package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.DeleteTaskResponse;

/**
 * @author PengFei
 */
public class DeleteTaskRequest extends AbstractAPIRequest<DeleteTaskResponse> {

	private String tokenId;
	
	public DeleteTaskRequest() {
		super("/v1.0/service_task/deleteTask", "DELETE");
	}

	@Override
	public Class<DeleteTaskResponse> getResponseClass() {
		return DeleteTaskResponse.class;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
		httpRequest.addParam("tokenId", tokenId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(tokenId, "tokenId");
	}
	
}
