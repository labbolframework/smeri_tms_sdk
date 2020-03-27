package com.labbol.smeri.api.test.orig.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.test.orig.support.OrigReport;

public class QueryOrigReportResponse extends AbstractQueryAPIResponse<OrigReport> {

	public QueryOrigReportResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}
	

}
