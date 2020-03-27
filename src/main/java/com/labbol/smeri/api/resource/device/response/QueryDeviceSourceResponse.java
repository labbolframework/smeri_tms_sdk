package com.labbol.smeri.api.resource.device.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.resource.device.support.DeviceSource;

public class QueryDeviceSourceResponse extends AbstractQueryAPIResponse<DeviceSource> {

	public QueryDeviceSourceResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
