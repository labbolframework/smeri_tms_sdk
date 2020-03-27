package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.entrust.support.EntrustSample;

/**
 * @author PengFei
 */
public class QueryEntrustSampleResponse extends AbstractQueryAPIResponse <EntrustSample> {

	public QueryEntrustSampleResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
