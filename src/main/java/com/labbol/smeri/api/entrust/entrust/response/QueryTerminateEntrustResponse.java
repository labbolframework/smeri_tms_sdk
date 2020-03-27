package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.entrust.support.TerminateEntrust;

/**
 * @author PengFei
 */
public class QueryTerminateEntrustResponse extends AbstractQueryAPIResponse <TerminateEntrust> {

	public QueryTerminateEntrustResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
