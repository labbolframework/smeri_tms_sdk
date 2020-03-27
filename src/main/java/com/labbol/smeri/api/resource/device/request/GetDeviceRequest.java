package com.labbol.smeri.api.resource.device.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.GetDeviceResponse;

public class GetDeviceRequest extends AbstractAPIRequest<GetDeviceResponse>{

	private String deviceId;
	
	public GetDeviceRequest() {
		super("/v1.0/service_resource/getDevice", "GET");
	}

	@Override
	public Class<GetDeviceResponse> getResponseClass() {
		return GetDeviceResponse.class;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		httpRequest.addParam("deviceId", deviceId);
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(deviceId, "deviceId");
	}
	

}
