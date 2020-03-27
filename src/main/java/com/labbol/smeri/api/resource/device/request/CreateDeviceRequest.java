package com.labbol.smeri.api.resource.device.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.device.response.CreateDeviceResponse;
import com.labbol.smeri.api.resource.device.support.Device;
import com.labbol.smeri.api.resource.device.support.DeviceWrapper;

/**
 * @author PengFei
 */
public class CreateDeviceRequest extends AbstractAPIRequest<CreateDeviceResponse>{

	private Device device;

	private static final String [] DEVICE_NOT_BLANK_FIELDS = {
			"deviceNo","deviceName","deviceState","groupId",
			"creator","updator","state"};

	public CreateDeviceRequest() {
		super("/v1.0/service_resource/createDevice", "POST");
	}

	@Override
	public Class<CreateDeviceResponse> getResponseClass() {
		return CreateDeviceResponse.class;
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
		RequestCheckUtils.checkNotEmpty(device, "device");
		RequestCheckUtils.checkBeanFieldNotEmpty(device, DEVICE_NOT_BLANK_FIELDS);
	}

}
