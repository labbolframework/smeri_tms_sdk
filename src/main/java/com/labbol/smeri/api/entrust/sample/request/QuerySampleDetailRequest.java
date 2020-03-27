package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.sample.response.QuerySampleDetailResponse;

/**
 * @author PengFei
 */
public class QuerySampleDetailRequest extends AbstractQueryAPIRequest<QuerySampleDetailResponse> {

	public QuerySampleDetailRequest() {
		super("/v1.0/service_entrust/querySampleDetail", "POST");
	}

	@Override
	public Class<QuerySampleDetailResponse> getResponseClass() {
		return QuerySampleDetailResponse.class;
	}

}
