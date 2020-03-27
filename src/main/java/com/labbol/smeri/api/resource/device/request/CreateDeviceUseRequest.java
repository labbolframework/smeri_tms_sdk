package com.labbol.smeri.api.resource.device.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.CreateDeviceUseResponse;
import com.labbol.smeri.api.resource.device.support.DeviceUse;
import com.labbol.smeri.api.resource.device.support.DeviceUseWrapper;

public class CreateDeviceUseRequest extends AbstractAPIRequest<CreateDeviceUseResponse>{

	private DeviceUse deviceUse;

	private static final String [] DEVICE_USE_NOT_BLANK_FIELDS = {
			"deviceId","useStartTime","beforeUseState","operator",
			"creator","updator","state"};
	
	public CreateDeviceUseRequest() {
		super("/v1.0/service_resource/createDeviceUse", "POST");
	}

	@Override
	public Class<CreateDeviceUseResponse> getResponseClass() {
		return CreateDeviceUseResponse.class;
	}
	
	public DeviceUse getDeviceUse() {
		return deviceUse;
	}

	public void setDeviceUse(DeviceUse deviceUse) {
		this.deviceUse = deviceUse;
		try {
			httpRequest.setContentStr(gson.toJson(new DeviceUseWrapper(deviceUse)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(deviceUse, "deviceUse");
		RequestCheckUtils.checkBeanFieldNotEmpty(deviceUse, DEVICE_USE_NOT_BLANK_FIELDS);
	}


}
