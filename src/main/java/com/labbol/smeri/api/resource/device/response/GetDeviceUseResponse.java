package com.labbol.smeri.api.resource.device.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.resource.device.support.DeviceUse;
import com.labbol.smeri.api.resource.device.support.DeviceUseWrapper;

public class GetDeviceUseResponse extends AbstractAPIResponse {

	private DeviceUse deviceUse;
	
	public GetDeviceUseResponse(HttpResponse httpResponse) {
		super(httpResponse);
		if(isSuccess()) {
			deviceUse = gson.fromJson(httpResponse.getContentStr(), DeviceUseWrapper.class).getDeviceUse();
		}
	}
	
	public DeviceUse getDeviceUse() {
		return deviceUse;
	}

}
