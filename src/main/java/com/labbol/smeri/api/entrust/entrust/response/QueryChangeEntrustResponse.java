package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.entrust.support.ChangeEntrust;

/**
 * @author PengFei
 */
public class QueryChangeEntrustResponse extends AbstractQueryAPIResponse<ChangeEntrust> {

	public QueryChangeEntrustResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
