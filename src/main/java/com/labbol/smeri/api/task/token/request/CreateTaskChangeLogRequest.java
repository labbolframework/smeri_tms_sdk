/**
 * 
 */
package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.CreateTaskChangeLogResponse;
import com.labbol.smeri.api.task.token.support.TokenChangeLog;
import com.labbol.smeri.api.task.token.support.TokenChangeLogWrapper;

/**
 * @author PengFei
 * @since 1.0.23
 */
public class CreateTaskChangeLogRequest extends AbstractAPIRequest<CreateTaskChangeLogResponse>{

	private TokenChangeLog tokenChangeLog;

	public static final String []CREATE_CHANGE_TOKEN_NOT_EMPTY_FIELD = {
			"tokenId", "changeType", "changeTime", "changer", "changeReason", "lastEntrustState", "creator", "updator", "state"
	};

	public CreateTaskChangeLogRequest() {
		super("/v1.0/service_task/createTaskChangeLog", "POST");
	}

	@Override
	public Class<CreateTaskChangeLogResponse> getResponseClass() {
		return CreateTaskChangeLogResponse.class;
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(tokenChangeLog, "tokenChangeLog");
		RequestCheckUtils.checkBeanFieldNotEmpty(tokenChangeLog, CREATE_CHANGE_TOKEN_NOT_EMPTY_FIELD);
	}

	public TokenChangeLog getTokenChangeLog() {
		return tokenChangeLog;
	}

	public void setTokenChangeLog(TokenChangeLog tokenChangeLog) {
		this.tokenChangeLog = tokenChangeLog;
		try {
			httpRequest.setContentStr(gson.toJson(new TokenChangeLogWrapper(tokenChangeLog)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	

}
