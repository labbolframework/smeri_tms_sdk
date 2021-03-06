package com.labbol.smeri.api.resource.device.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.DeleteDeviceUseResponse;

public class DeleteDeviceUseRequest extends AbstractAPIRequest<DeleteDeviceUseResponse>{

	private String deviceUseId;
	
	public DeleteDeviceUseRequest() {
		super("/v1.0/service_resource/deleteDeviceUse", "DELETE");
	}

	@Override
	public Class<DeleteDeviceUseResponse> getResponseClass() {
		return DeleteDeviceUseResponse.class;
	}
	
	public String getDeviceUseId() {
		return deviceUseId;
	}

	public void setDeviceUseId(String deviceUseId) {
		this.deviceUseId = deviceUseId;
		httpRequest.addParam("deviceUseId", deviceUseId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(deviceUseId, "deviceUseId");
	}

}
