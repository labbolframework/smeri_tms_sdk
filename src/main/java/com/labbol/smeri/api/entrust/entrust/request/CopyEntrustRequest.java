package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.CopyEntrustResponse;

public class CopyEntrustRequest extends AbstractAPIRequest<CopyEntrustResponse> {

	private String entrustId;
	
	public CopyEntrustRequest() {
		super("/v1.0/service_entrust/copyEntrust", "PUT");
	}

	@Override
	public Class<CopyEntrustResponse> getResponseClass() {
		return CopyEntrustResponse.class;
	}

	public String getEntrustId() {
		return entrustId;
	}

	public void setEntrustId(String entrustId) {
		this.entrustId = entrustId;
		httpRequest.addParam("entrustId", entrustId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(entrustId, "entrustId");
	}
	
}
