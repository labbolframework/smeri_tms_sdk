package com.labbol.smeri.api.resource.device.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.GetDeviceSourceResponse;

public class GetDeviceSourceRequest extends AbstractAPIRequest<GetDeviceSourceResponse>{

	private String deviceSourceId;
	
	public GetDeviceSourceRequest() {
		super("/v1.0/service_resource/getDeviceSource", "GET");
	}

	@Override
	public Class<GetDeviceSourceResponse> getResponseClass() {
		return GetDeviceSourceResponse.class;
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
