package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.entrust.response.QueryEntrustSampleResponse;

/**
 * @author PengFei
 */
public class QueryEntrustSampleRequest extends AbstractQueryAPIRequest<QueryEntrustSampleResponse> {

	public QueryEntrustSampleRequest() {
		super("/v1.0/service_entrust/queryEntrustSample", "POST");
	}

	@Override
	public Class<QueryEntrustSampleResponse> getResponseClass() {
		return QueryEntrustSampleResponse.class;
	}
	
}
