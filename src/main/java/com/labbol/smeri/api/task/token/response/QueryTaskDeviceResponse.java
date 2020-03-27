package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.TokenDevice;

/**
 * @author PengFei
 */
public class QueryTaskDeviceResponse extends AbstractQueryAPIResponse<TokenDevice> {

	public QueryTaskDeviceResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
