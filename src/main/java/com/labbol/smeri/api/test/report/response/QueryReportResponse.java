package com.labbol.smeri.api.test.report.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.test.report.support.Report;

/**
 * @author PengFei
 */
public class QueryReportResponse extends AbstractQueryAPIResponse<Report>{

	public QueryReportResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
