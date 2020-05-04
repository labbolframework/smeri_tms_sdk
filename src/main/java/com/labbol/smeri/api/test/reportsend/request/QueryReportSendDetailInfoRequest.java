/**
 * 
 */
package com.labbol.smeri.api.test.reportsend.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.test.reportsend.response.QueryReportSendDetailInfoResponse;

/**
 * @author PengFei
 *
 */
public class QueryReportSendDetailInfoRequest extends AbstractQueryAPIRequest<QueryReportSendDetailInfoResponse>{

	public QueryReportSendDetailInfoRequest() {
		super("/v1.0/service_test/queryReportSendDetailInfo", "POST");
	}

	@Override
	public Class<QueryReportSendDetailInfoResponse> getResponseClass() {
		return QueryReportSendDetailInfoResponse.class;
	}

}
