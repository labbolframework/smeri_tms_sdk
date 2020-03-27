package com.labbol.smeri.api.resource.standard.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.resource.standard.response.QueryStandardResponse;

public class QueryStandardRequest extends AbstractQueryAPIRequest<QueryStandardResponse>{

	public QueryStandardRequest() {
		super("/v1.0/service_resource/queryStandard","POST");
	}

	@Override
	public Class<QueryStandardResponse> getResponseClass() {
		return QueryStandardResponse.class;
	}

}
