package com.labbol.smeri.api.entrust.feestandard.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.feestandard.response.QueryFeeStandardResponse;

/**
 * @author PengFei
 */
public class QueryFeeStandardRequest extends AbstractQueryAPIRequest<QueryFeeStandardResponse> {

	public QueryFeeStandardRequest() {
		super("/v1.0/service_entrust/queryFeeStandard", "POST");
	}

	@Override
	public Class<QueryFeeStandardResponse> getResponseClass() {
		return QueryFeeStandardResponse.class;
	}
	
}
