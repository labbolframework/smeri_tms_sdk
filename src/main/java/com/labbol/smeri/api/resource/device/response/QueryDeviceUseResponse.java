package com.labbol.smeri.api.resource.device.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.resource.device.support.DeviceUse;

public class QueryDeviceUseResponse extends AbstractQueryAPIResponse<DeviceUse> {

	public QueryDeviceUseResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
