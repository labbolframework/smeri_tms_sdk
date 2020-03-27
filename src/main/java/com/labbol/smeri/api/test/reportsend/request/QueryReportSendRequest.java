package com.labbol.smeri.api.test.reportsend.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.test.reportsend.response.QueryReportSendResponse;

/**
 * @author PengFei
 */
public class QueryReportSendRequest extends AbstractQueryAPIRequest<QueryReportSendResponse> {

	public QueryReportSendRequest(String apiMethodName, String method) {
		super("/v1.0/service_test/queryReportSend", "POST");
	}

	@Override
	public Class<QueryReportSendResponse> getResponseClass() {
		return QueryReportSendResponse.class;
	}

}
