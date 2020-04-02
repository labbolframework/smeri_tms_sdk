/**
 * 
 */
package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.sample.response.QuerySampleByTokenWriteResponse;

/**
 * @author PengFei
 * @since 1.0.11
 */
public class QuerySampleByTokenWriteRequest extends AbstractQueryAPIRequest<QuerySampleByTokenWriteResponse>{

	public QuerySampleByTokenWriteRequest() {
		super("/v1.0/service_entrust/querySampleByTokenWrite", "POST");
	}

	@Override
	public Class<QuerySampleByTokenWriteResponse> getResponseClass() {
		return QuerySampleByTokenWriteResponse.class;
	}

}
