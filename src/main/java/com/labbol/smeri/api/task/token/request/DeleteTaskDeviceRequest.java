package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.DeleteTaskDeviceResponse;

/**
 * @author PengFei
 */
public class DeleteTaskDeviceRequest extends AbstractAPIRequest<DeleteTaskDeviceResponse> {

	private String tokenDeviceId;
	
	public DeleteTaskDeviceRequest() {
		super("/V1.0/service_task/deleteTaskDevice", "DELETE");
	}

	@Override
	public Class<DeleteTaskDeviceResponse> getResponseClass() {
		return DeleteTaskDeviceResponse.class;
	}

	public String getTokenDeviceId() {
		return tokenDeviceId;
	}

	public void setTokenDeviceId(String tokenDeviceId) {
		this.tokenDeviceId = tokenDeviceId;
		httpRequest.addParam("tokenDeviceId", tokenDeviceId);
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty("tokenDeviceId", tokenDeviceId);
	}
	
}
