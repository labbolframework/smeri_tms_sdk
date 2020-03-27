package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.CreateTaskResponse;
import com.labbol.smeri.api.task.token.support.Token;
import com.labbol.smeri.api.task.token.support.TokenWrapper;

/**
 * @author PengFei
 */
public class CreateTaskRequest extends AbstractAPIRequest<CreateTaskResponse> {

	private Token token;

	private static final String [] TOKEN_NOT_BLANK_FIELDS = {
			"entrustId","tokenSubject","builder","buildTime","tokenState",
			"groupId","creator","updator","state"
	};

	public CreateTaskRequest() {
		super("/v1.0/service_task/createTask", "POST");
	}

	@Override
	public Class<CreateTaskResponse> getResponseClass() {
		return CreateTaskResponse.class;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
		try {
			httpRequest.setContentStr(gson.toJson(new TokenWrapper(token)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(token, "token");
		RequestCheckUtils.checkBeanFieldNotEmpty(token, TOKEN_NOT_BLANK_FIELDS);
	}

}
