package com.labbol.smeri.api.resource.device.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.CreateDeviceSourceResponse;
import com.labbol.smeri.api.resource.device.support.DeviceSource;
import com.labbol.smeri.api.resource.device.support.DeviceSourceWrapper;

/**
 * @author PengFei
 *
 */
public class CreateDeviceSourceRequest extends AbstractAPIRequest<CreateDeviceSourceResponse>{

	private DeviceSource deviceSource;

	private static final String [] DEVICE_SOURCE_NOT_BLANK_FIELDS = {
			"deviceId","sourceCycle","sourceUnit","sourcePlanTime",
			"creator","updator","state"};

	public CreateDeviceSourceRequest() {
		super("/v1.0/service_resource/createDeviceSource", "POST");
	}

	@Override
	public Class<CreateDeviceSourceResponse> getResponseClass() {
		return CreateDeviceSourceResponse.class;
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
		RequestCheckUtils.checkNotEmpty(deviceSource, "deviceSource");
		RequestCheckUtils.checkBeanFieldNotEmpty(deviceSource, DEVICE_SOURCE_NOT_BLANK_FIELDS);
	}


}
