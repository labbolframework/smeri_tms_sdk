package com.labbol.smeri.api.resource.device.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.resource.device.response.QueryDeviceUseResponse;

public class QueryDeviceUseRequest extends AbstractQueryAPIRequest<QueryDeviceUseResponse>{

	public QueryDeviceUseRequest() {
		super("/v1.0/service_resource/queryDeviceUse", "POST");
	}

	@Override
	public Class<QueryDeviceUseResponse> getResponseClass() {
		return QueryDeviceUseResponse.class;
	}

}
