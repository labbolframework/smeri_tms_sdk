package com.labbol.smeri.api.resource.device.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.ModifyDeviceUseResponse;
import com.labbol.smeri.api.resource.device.support.DeviceUse;
import com.labbol.smeri.api.resource.device.support.DeviceUseWrapper;

public class ModifyDeviceUseRequest extends AbstractAPIRequest<ModifyDeviceUseResponse>{

	private String deviceUseId;
	
	private DeviceUse deviceUse;

	private static final String [] DEVICE_USE_NOT_BLANK_FIELDS = {"deviceId","useEndTime","creator","updator"};
	
	
	public ModifyDeviceUseRequest() {
		super("/v1.0/service_resource/modifyDeviceUse", "PUT");
	}

	@Override
	public Class<ModifyDeviceUseResponse> getResponseClass() {
		return ModifyDeviceUseResponse.class;
	}
	
	public String getDeviceUseId() {
		return deviceUseId;
	}

	public void setDeviceUseId(String deviceUseId) {
		this.deviceUseId = deviceUseId;
		httpRequest.addParam("deviceUseId", deviceUseId);
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
		RequestCheckUtils.checkNotEmpty(deviceUseId, "deviceUseId");
		RequestCheckUtils.checkNotEmpty(deviceUse, "deviceUse");
		RequestCheckUtils.checkBeanFieldNotEmpty(deviceUse, DEVICE_USE_NOT_BLANK_FIELDS);
	}

}
