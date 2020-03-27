package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.sample.response.QuerySampleResponse;

/**
 * @author PengFei
 */
public class QuerySampleRequest extends AbstractQueryAPIRequest<QuerySampleResponse> {

	public QuerySampleRequest() {
		super("/v1.0/service_entrust/querySample", "POST");
	}

	@Override
	public Class<QuerySampleResponse> getResponseClass() {
		return QuerySampleResponse.class;
	}

}
