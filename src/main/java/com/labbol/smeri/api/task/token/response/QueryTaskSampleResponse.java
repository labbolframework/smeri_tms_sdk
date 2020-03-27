package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.TokenSample;

/**
 * @author PengFei
 */
public class QueryTaskSampleResponse extends AbstractQueryAPIResponse<TokenSample> {

	public QueryTaskSampleResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
