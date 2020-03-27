package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.entrust.response.QueryEntrustReportResponse;

/**
 * @author PengFei
 */
public class QueryEntrustReportRequest extends AbstractQueryAPIRequest<QueryEntrustReportResponse> {

	public QueryEntrustReportRequest() {
		super("/v1.0/service_entrust/queryEntrustReport", "POST");
	}

	@Override
	public Class<QueryEntrustReportResponse> getResponseClass() {
		return QueryEntrustReportResponse.class;
	}
	
}
