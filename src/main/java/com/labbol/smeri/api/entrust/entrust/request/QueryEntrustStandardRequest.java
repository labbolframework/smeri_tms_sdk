package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.entrust.response.QueryEntrustStandardResponse;

/**
 * @author PengFei
 */
public class QueryEntrustStandardRequest extends AbstractQueryAPIRequest<QueryEntrustStandardResponse> {

	public QueryEntrustStandardRequest() {
		super("/v1.0/service_entrust/queryEntrustStandaard", "POST");
	}

	@Override
	public Class<QueryEntrustStandardResponse> getResponseClass() {
		return QueryEntrustStandardResponse.class;
	}
	
}
