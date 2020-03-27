package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.smeri.api.entrust.entrust.response.QueryEntrustProjectResponse;

@Deprecated
public class QueryEntrustProjectRequest extends AbstractAPIRequest<QueryEntrustProjectResponse> {

	public QueryEntrustProjectRequest(String apiMethodName, String method) {
		super(apiMethodName, method);
	}

	@Override
	public Class<QueryEntrustProjectResponse> getResponseClass() {
		return QueryEntrustProjectResponse.class;
	}

}
