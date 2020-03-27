package com.labbol.smeri.api.resource.device.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.resource.device.response.QueryDeviceResponse;

public class QueryDeviceRequest extends AbstractQueryAPIRequest<QueryDeviceResponse>{

	public QueryDeviceRequest() {
		super("/v1.0/service_resource/queryDevice", "POST");
	}

	@Override
	public Class<QueryDeviceResponse> getResponseClass() {
		return QueryDeviceResponse.class;
	}

}
