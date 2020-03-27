package com.labbol.smeri.api.resource.standard.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.resource.standard.support.Standard;

public class QueryStandardResponse extends AbstractQueryAPIResponse<Standard>{

	public QueryStandardResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
