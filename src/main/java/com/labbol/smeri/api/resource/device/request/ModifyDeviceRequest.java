package com.labbol.smeri.api.resource.device.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.ModifyDeviceResponse;
import com.labbol.smeri.api.resource.device.support.Device;
import com.labbol.smeri.api.resource.device.support.DeviceWrapper;

public class ModifyDeviceRequest extends AbstractAPIRequest<ModifyDeviceResponse>{

	private Device device;

	private String deviceId;
	
	private static final String [] DEVICE_NOT_BLANK_FIELDS = {
			"deviceNo","deviceName",
			"updator","state"
	};
	
	public ModifyDeviceRequest() {
		super("/v1.0/service_resource/modifyDevice", "PUT");
	}
	
	@Override
	public Class<ModifyDeviceResponse> getResponseClass() {
		return ModifyDeviceResponse.class;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		httpRequest.addParam("deviceId", deviceId);
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
		try {
			httpRequest.setContentStr(gson.toJson(new DeviceWrapper(device)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(deviceId, "deviceId");
		RequestCheckUtils.checkNotEmpty(device, "device");
		RequestCheckUtils.checkBeanFieldNotEmpty(device, DEVICE_NOT_BLANK_FIELDS);
	}
	
}
