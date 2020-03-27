package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTaskDeviceResponse;

/**
 * @author PengFei
 */
public class QueryTaskDeviceRequest extends AbstractAPIRequest<QueryTaskDeviceResponse> {

	public QueryTaskDeviceRequest() {
		super("/V1.0/service_task/queryTaskDevice", "POST");
	}

	@Override
	public Class<QueryTaskDeviceResponse> getResponseClass() {
		return QueryTaskDeviceResponse.class;
	}

}
