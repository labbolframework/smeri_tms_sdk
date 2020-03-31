package com.labbol.smeri.api.test.reportsend.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.test.reportsend.response.QueryReportSendDetailResponse;

/**
 * @author PengFei
 */
public class QueryReportSendDetailRequest extends AbstractQueryAPIRequest<QueryReportSendDetailResponse> {

	public QueryReportSendDetailRequest() {
		super("/v1.0/service_test/queryReportSendDetail", "POST");
	}

	@Override
	public Class<QueryReportSendDetailResponse> getResponseClass() {
		return QueryReportSendDetailResponse.class;
	}

}
