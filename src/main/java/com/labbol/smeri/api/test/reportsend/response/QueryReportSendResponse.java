package com.labbol.smeri.api.test.reportsend.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.test.reportsend.support.ReportSend;

/**
 * @author PengFei
 */
public class QueryReportSendResponse extends AbstractQueryAPIResponse <ReportSend> {

	public QueryReportSendResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
