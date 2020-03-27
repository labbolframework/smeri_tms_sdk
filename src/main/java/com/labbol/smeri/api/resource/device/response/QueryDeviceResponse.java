package com.labbol.smeri.api.resource.device.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.resource.device.support.Device;

public class QueryDeviceResponse extends AbstractQueryAPIResponse<Device> {

	public QueryDeviceResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
