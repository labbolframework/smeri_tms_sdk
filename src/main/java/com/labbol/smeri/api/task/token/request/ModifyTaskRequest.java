package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.ModifyTaskResponse;
import com.labbol.smeri.api.task.token.support.Token;
import com.labbol.smeri.api.task.token.support.TokenWrapper;

/**
 * @author PengFei
 */
public class ModifyTaskRequest extends AbstractAPIRequest<ModifyTaskResponse> {

	private String tokenId;
	
	private Token token;

	private static final String [] TOKEN_NOT_BLANK_FIELDS = {
			"entrustId","tokenSubject","builder","buildTime","tokenState",
			"groupId","updator","state"
	};

	public ModifyTaskRequest() {
		super("/v1.0/service_task/modifyTask", "PUT");
	}

	@Override
	public Class<ModifyTaskResponse> getResponseClass() {
		return ModifyTaskResponse.class;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
		httpRequest.addParam("tokenId", tokenId);
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
		RequestCheckUtils.checkNotEmpty(tokenId, "tokenId");
		RequestCheckUtils.checkNotEmpty(token, "token");
		RequestCheckUtils.checkBeanFieldNotEmpty(token, TOKEN_NOT_BLANK_FIELDS);
	}
	
}
