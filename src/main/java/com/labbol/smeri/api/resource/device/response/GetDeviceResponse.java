package com.labbol.smeri.api.resource.device.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.resource.device.support.Device;
import com.labbol.smeri.api.resource.device.support.DeviceWrapper;

public class GetDeviceResponse extends AbstractAPIResponse {

	private Device device;
	
	public GetDeviceResponse(HttpResponse httpResponse) {
		super(httpResponse);
		if(isSuccess()) {
			device = gson.fromJson(httpResponse.getContentStr(), DeviceWrapper.class).getDevice();
		}
	}

	public Device getDevice() {
		return device;
	}

}
