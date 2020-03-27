package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.entrust.response.QueryEntrustTokenResponse;

/**
 * @author PengFei
 */
public class QueryEntrustTokenRequest extends AbstractQueryAPIRequest<QueryEntrustTokenResponse> {

	public QueryEntrustTokenRequest() {
		super("/v1.0/service_entrust/queryEntrustToken", "POST");
	}

	@Override
	public Class<QueryEntrustTokenResponse> getResponseClass() {
		return QueryEntrustTokenResponse.class;
	}

}
