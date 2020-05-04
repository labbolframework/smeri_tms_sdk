package com.labbol.smeri.api.test.reportsend.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.test.reportsend.support.ReportSendDetail;

/**
 * @author PengFei
 */
public class QueryReportSendDetailInfoResponse extends AbstractQueryAPIResponse<ReportSendDetail> {

	public QueryReportSendDetailInfoResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
