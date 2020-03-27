package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.TokenProject;

/**
 * @author PengFei
 */
public class QueryTaskProjectResponse extends AbstractQueryAPIResponse <TokenProject>{

	public QueryTaskProjectResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
