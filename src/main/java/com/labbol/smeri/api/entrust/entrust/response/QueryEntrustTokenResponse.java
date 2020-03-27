package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.Token;

/**
 * @author PengFei
 */
public class QueryEntrustTokenResponse extends AbstractQueryAPIResponse <Token> {

	public QueryEntrustTokenResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
