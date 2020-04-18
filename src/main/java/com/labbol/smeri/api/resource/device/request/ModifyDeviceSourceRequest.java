package com.labbol.smeri.api.resource.device.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.ModifyDeviceSourceResponse;
import com.labbol.smeri.api.resource.device.support.DeviceSource;
import com.labbol.smeri.api.resource.device.support.DeviceSourceWrapper;

public class ModifyDeviceSourceRequest extends AbstractAPIRequest<ModifyDeviceSourceResponse>{

	private String deviceSourceId;
	
	private DeviceSource deviceSource;

	private static final String [] DEVICE_SOURCE_NOT_BLANK_FIELDS = {
			"updator","state"
	};

	public ModifyDeviceSourceRequest() {
		super("/v1.0/service_resource/modifyDeviceSource", "PUT");
	}

	@Override
	public Class<ModifyDeviceSourceResponse> getResponseClass() {
		return ModifyDeviceSourceResponse.class;
	}

	public String getDeviceSourceId() {
		return deviceSourceId;
	}

	public void setDeviceSourceId(String deviceSourceId) {
		this.deviceSourceId = deviceSourceId;
		httpRequest.addParam("deviceSourceId", deviceSourceId);
	}

	public DeviceSource getDeviceSource() {
		return deviceSource;
	}

	public void setDeviceSource(DeviceSource deviceSource) {
		this.deviceSource = deviceSource;
		try {
			httpRequest.setContentStr(gson.toJson(new DeviceSourceWrapper(deviceSource)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(deviceSourceId, "deviceSourceId");
		RequestCheckUtils.checkNotEmpty(deviceSource, "deviceSource");
		RequestCheckUtils.checkBeanFieldNotEmpty(deviceSource, DEVICE_SOURCE_NOT_BLANK_FIELDS);
	}


}
