package com.labbol.smeri.api.entrust.sample.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.sample.support.Sample;

/**
 * @author PengFei
 */
public class QuerySampleResponse extends AbstractQueryAPIResponse <Sample>  {

	public QuerySampleResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
