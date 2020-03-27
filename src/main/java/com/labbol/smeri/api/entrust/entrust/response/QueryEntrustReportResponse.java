package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.entrust.support.Entrust;

/**
 * @author PengFei
 */
public class QueryEntrustReportResponse extends AbstractQueryAPIResponse <Entrust> {

	public QueryEntrustReportResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
