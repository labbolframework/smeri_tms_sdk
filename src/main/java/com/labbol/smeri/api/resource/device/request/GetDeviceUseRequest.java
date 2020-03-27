package com.labbol.smeri.api.resource.device.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.GetDeviceUseResponse;

public class GetDeviceUseRequest extends AbstractAPIRequest<GetDeviceUseResponse>{

	private String deviceUseId;

	public GetDeviceUseRequest() {
		super("/v1.0/service_resource/getDeviceUse", "GET");
	}

	@Override
	public Class<GetDeviceUseResponse> getResponseClass() {
		return GetDeviceUseResponse.class;
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
