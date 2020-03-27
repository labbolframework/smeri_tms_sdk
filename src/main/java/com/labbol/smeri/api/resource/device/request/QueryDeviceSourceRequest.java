package com.labbol.smeri.api.resource.device.request;

import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.smeri.api.resource.device.response.QueryDeviceSourceResponse;

public class QueryDeviceSourceRequest extends AbstractAPIRequest<QueryDeviceSourceResponse>{

	public QueryDeviceSourceRequest() {
		super("/v1.0/service_resource/queryDeviceSource", "POST");
	}

	@Override
	public Class<QueryDeviceSourceResponse> getResponseClass() {
		return QueryDeviceSourceResponse.class;
	}

}
