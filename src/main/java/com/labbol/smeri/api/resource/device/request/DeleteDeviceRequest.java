package com.labbol.smeri.api.resource.device.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.DeleteDeviceResponse;

public class DeleteDeviceRequest extends AbstractAPIRequest<DeleteDeviceResponse>{

	private String deviceId;

	public DeleteDeviceRequest() {
		super("/v1.0/service_resource/deleteDevice", "DELETE");
	}
	
	@Override
	public Class<DeleteDeviceResponse> getResponseClass() {
		return DeleteDeviceResponse.class;
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
