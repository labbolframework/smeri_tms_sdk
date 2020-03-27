package com.labbol.smeri.api.test.orig.request;

import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.smeri.api.test.orig.response.QueryOrigModifyLogResponse;

/**
 * 
 * @author PengFei
 */
public class QueryOrigModifyLogRequest extends AbstractAPIRequest<QueryOrigModifyLogResponse>{

	public QueryOrigModifyLogRequest() {
		super("/v1.0/service_test/queryOrigModifyLog", "POST");
	}

	@Override
	public Class<QueryOrigModifyLogResponse> getResponseClass() {
		return QueryOrigModifyLogResponse.class;
	}

}
