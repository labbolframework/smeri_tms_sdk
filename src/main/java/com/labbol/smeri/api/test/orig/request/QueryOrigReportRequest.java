package com.labbol.smeri.api.test.orig.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.test.orig.response.QueryOrigReportResponse;

/**
 * @author PengFei
 */
public class QueryOrigReportRequest extends AbstractQueryAPIRequest<QueryOrigReportResponse>{

	public QueryOrigReportRequest() {
		super("/v1.0/service_test/queryOrigReport", "POST");
	}

	@Override
	public Class<QueryOrigReportResponse> getResponseClass() {
		return QueryOrigReportResponse.class;
	}

}
