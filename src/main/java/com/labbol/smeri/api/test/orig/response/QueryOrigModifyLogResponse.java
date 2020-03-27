package com.labbol.smeri.api.test.orig.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.test.orig.support.OrigModifyLog;

public class QueryOrigModifyLogResponse extends AbstractQueryAPIResponse<OrigModifyLog>{

	public QueryOrigModifyLogResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
