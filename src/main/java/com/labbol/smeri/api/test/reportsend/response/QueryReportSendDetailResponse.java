package com.labbol.smeri.api.test.reportsend.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.test.reportsend.support.ReportSendDetail;

/**
 * @author PengFei
 */
public class QueryReportSendDetailResponse extends AbstractQueryAPIResponse<ReportSendDetail>  {

	public QueryReportSendDetailResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}
	
}
