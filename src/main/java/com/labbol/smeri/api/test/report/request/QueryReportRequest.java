package com.labbol.smeri.api.test.report.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.test.report.response.QueryReportResponse;

/**
 * @author PengFei
 */
public class QueryReportRequest extends AbstractQueryAPIRequest<QueryReportResponse> {

	public QueryReportRequest() {
		super("/v1.0/service_test/queryReport", "POST");
	}

	@Override
	public Class<QueryReportResponse> getResponseClass() {
		return QueryReportResponse.class;
	}

}
