package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTaskDeviceResponse;

/**
 * @author PengFei
 */
public class QueryTaskDeviceRequest extends AbstractQueryAPIRequest<QueryTaskDeviceResponse> {

	public QueryTaskDeviceRequest() {
		super("/v1.0/service_task/queryTaskDevice", "POST");
	}

	@Override
	public Class<QueryTaskDeviceResponse> getResponseClass() {
		return QueryTaskDeviceResponse.class;
	}

}
