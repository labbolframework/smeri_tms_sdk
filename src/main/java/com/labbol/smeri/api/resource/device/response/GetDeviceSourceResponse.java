package com.labbol.smeri.api.resource.device.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.resource.device.support.DeviceSource;
import com.labbol.smeri.api.resource.device.support.DeviceSourceWrapper;

public class GetDeviceSourceResponse extends AbstractAPIResponse {

	private DeviceSource deviceSource;

	public GetDeviceSourceResponse(HttpResponse httpResponse) {
		super(httpResponse);
		if(isSuccess()) {
			deviceSource = gson.fromJson(httpResponse.getContentStr(), DeviceSourceWrapper.class).getDeviceSource();
		}
	}

	public DeviceSource getDeviceSource() {
		return deviceSource;
	}

}
