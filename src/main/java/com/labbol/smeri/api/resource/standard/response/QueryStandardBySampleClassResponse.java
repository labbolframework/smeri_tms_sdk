package com.labbol.smeri.api.resource.standard.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.resource.standard.support.Standard;

public class QueryStandardBySampleClassResponse extends AbstractQueryAPIResponse<Standard>{

	public QueryStandardBySampleClassResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}
	
}
