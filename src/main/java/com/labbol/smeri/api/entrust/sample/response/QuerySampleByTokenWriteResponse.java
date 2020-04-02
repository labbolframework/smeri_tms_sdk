/**
 * 
 */
package com.labbol.smeri.api.entrust.sample.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.sample.support.Sample;

/**
 * @author PengFei
 * @since 1.0.11
 */
public class QuerySampleByTokenWriteResponse extends AbstractQueryAPIResponse<Sample>{

	public QuerySampleByTokenWriteResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
