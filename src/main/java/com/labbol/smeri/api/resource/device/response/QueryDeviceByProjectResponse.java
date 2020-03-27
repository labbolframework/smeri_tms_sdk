package com.labbol.smeri.api.resource.device.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.resource.device.support.Device;

public class QueryDeviceByProjectResponse extends AbstractQueryAPIResponse<Device> {

	public QueryDeviceByProjectResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
