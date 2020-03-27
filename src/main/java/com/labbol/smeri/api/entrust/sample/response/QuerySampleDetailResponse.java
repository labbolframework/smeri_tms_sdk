package com.labbol.smeri.api.entrust.sample.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.sample.support.SampleDetail;

/**
 * @author PengFei
 */
public class QuerySampleDetailResponse extends AbstractQueryAPIResponse <SampleDetail>  {

	public QuerySampleDetailResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
