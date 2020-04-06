package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.CreateTaskDeviceResponse;
import com.labbol.smeri.api.task.token.support.TokenDevice;
import com.labbol.smeri.api.task.token.support.TokenDeviceWrapper;

/**
 * @author PengFei
 */
public class CreateTaskDeviceRequest extends AbstractAPIRequest<CreateTaskDeviceResponse>{

	private TokenDevice tokenDevice;
	
	private static final String [] TOKEN_DEVICE_NOT_BLANK_FIELDS = {
			"tokenId","projectId","deviceId",
			"creator","updator","state"
	};
	
	public CreateTaskDeviceRequest() {
		super("/v1.0/service_task/createTaskDevice", "POST");
	}

	@Override
	public Class<CreateTaskDeviceResponse> getResponseClass() {
		return CreateTaskDeviceResponse.class;
	}

	public TokenDevice getTokenDevice() {
		return tokenDevice;
	}

	public void setTokenDevice(TokenDevice tokenDevice) {
		this.tokenDevice = tokenDevice;
		try {
			httpRequest.setContentStr(gson.toJson(new TokenDeviceWrapper(tokenDevice)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(tokenDevice, "tokenDevice");
		RequestCheckUtils.checkBeanFieldNotEmpty(tokenDevice, TOKEN_DEVICE_NOT_BLANK_FIELDS);
	}
	
}
