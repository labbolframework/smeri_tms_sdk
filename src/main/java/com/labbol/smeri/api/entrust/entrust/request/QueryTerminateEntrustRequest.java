package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.entrust.response.QueryTerminateEntrustResponse;

/**
 * @author PengFei
 */
public class QueryTerminateEntrustRequest extends AbstractQueryAPIRequest<QueryTerminateEntrustResponse> {

	public QueryTerminateEntrustRequest() {
		super("/v1.0/service_entrust/queryTerminateEntrust", "POST");
	}

	@Override
	public Class<QueryTerminateEntrustResponse> getResponseClass() {
		return QueryTerminateEntrustResponse.class;
	}
	
}
