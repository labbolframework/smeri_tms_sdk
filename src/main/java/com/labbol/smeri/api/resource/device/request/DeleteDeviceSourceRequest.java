package com.labbol.smeri.api.resource.device.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.DeleteDeviceSourceResponse;

public class DeleteDeviceSourceRequest extends AbstractAPIRequest<DeleteDeviceSourceResponse>{

	private String deviceSourceId;
	
	public DeleteDeviceSourceRequest() {
		super("/v1.0/service_resource/deleteDeviceSource", "DELETE");
	}

	@Override
	public Class<DeleteDeviceSourceResponse> getResponseClass() {
		return DeleteDeviceSourceResponse.class;
	}

	public String getDeviceSourceId() {
		return deviceSourceId;
	}

	public void setDeviceSourceId(String deviceSourceId) {
		this.deviceSourceId = deviceSourceId;
		httpRequest.addParam("deviceSourceId", deviceSourceId);
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(deviceSourceId, "deviceSourceId");
	}

}
