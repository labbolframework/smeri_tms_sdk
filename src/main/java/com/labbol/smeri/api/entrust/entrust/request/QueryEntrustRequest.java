package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.entrust.response.QueryEntrustResponse;

/**
 * @author PengFei
 */
public class QueryEntrustRequest extends AbstractQueryAPIRequest<QueryEntrustResponse> {

	public QueryEntrustRequest() {
		super("/v1.0/service_entrust/queryEntrust","POST");
	}

	@Override
	public Class<QueryEntrustResponse> getResponseClass() {
		return QueryEntrustResponse.class;
	}

}
