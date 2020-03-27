package com.labbol.smeri.api.entrust.feestandard.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.feestandard.response.QueryChangeFeeStandardResponse;

/**
 * @author PengFei
 */
public class QueryChangeFeeStandardRequest extends AbstractQueryAPIRequest<QueryChangeFeeStandardResponse> {

	public QueryChangeFeeStandardRequest() {
		super("/v1.0/service_entrust/queryChangeFeeStandard", "POST");
	}

	@Override
	public Class<QueryChangeFeeStandardResponse> getResponseClass() {
		return QueryChangeFeeStandardResponse.class;
	}
	
}
