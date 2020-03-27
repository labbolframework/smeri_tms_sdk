package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.entrust.response.QueryChangeEntrustResponse;

/**
 * @author PengFei
 */
public class QueryChangeEntrustRequest extends AbstractQueryAPIRequest<QueryChangeEntrustResponse> {

	public QueryChangeEntrustRequest() {
		super("/v1.0/service_entrust/queryChangeEntrust", "POST");
	}

	@Override
	public Class<QueryChangeEntrustResponse> getResponseClass() {
		return QueryChangeEntrustResponse.class;
	}
	
}
