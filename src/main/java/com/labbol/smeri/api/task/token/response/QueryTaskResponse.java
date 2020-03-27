package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.Token;

/**
 * @author PengFei
 */
public class QueryTaskResponse extends AbstractQueryAPIResponse<Token> {

	public QueryTaskResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
