package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.CreateTerminateTaskResponse;
import com.labbol.smeri.api.task.token.support.TerminateToken;
import com.labbol.smeri.api.task.token.support.TerminateTokenWrapper;

public class CreateTerminateTaskRequest extends AbstractAPIRequest<CreateTerminateTaskResponse> {

	private TerminateToken terminateToken;

	private static final String [] TERMINATE_TOKEN_NOT_BLANK_FIELDS = {
			"tokenId","finishTime","finisher","finishReason","lastPoaState",
			"creator","updator","state"
	};
	
	public CreateTerminateTaskRequest() {
		super("/v1.0/service_task/createTerminateTask", "POST");
	}

	@Override
	public Class<CreateTerminateTaskResponse> getResponseClass() {
		return CreateTerminateTaskResponse.class;
	}

	public TerminateToken getTerminateToken() {
		return terminateToken;
	}

	public void setTerminateToken(TerminateToken terminateToken) {
		this.terminateToken = terminateToken;
		try {
			httpRequest.setContentStr(gson.toJson(new TerminateTokenWrapper(terminateToken)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(terminateToken, "terminateToken");
		RequestCheckUtils.checkBeanFieldNotEmpty(terminateToken, TERMINATE_TOKEN_NOT_BLANK_FIELDS);
	}
	
}
