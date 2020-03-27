package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.GetTaskResponse;

/**
 * @author PengFei
 */
public class GetTaskRequest extends AbstractAPIRequest<GetTaskResponse> {

	private String tokenId;

	public GetTaskRequest() {
		super("/v1.0/service_task/getTask", "GET");
	}

	@Override
	public Class<GetTaskResponse> getResponseClass() {
		return GetTaskResponse.class;
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
