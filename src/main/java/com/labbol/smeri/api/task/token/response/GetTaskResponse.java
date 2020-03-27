package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.task.token.support.Token;
import com.labbol.smeri.api.task.token.support.TokenWrapper;

/**
 * @author PengFei
 */
public class GetTaskResponse extends AbstractAPIResponse {

	private final Token token;
	
	public GetTaskResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			token = gson.fromJson(httpResponse.getContentStr(), TokenWrapper.class).getToken();
		} else {
			token = null;
		}
	}

	public Token getToken() {
		return token;
	}
	
}
