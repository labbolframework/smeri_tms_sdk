package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.ChangeEntrustResponse;

@Deprecated
public class ChangeEntrustRequest extends AbstractAPIRequest<ChangeEntrustResponse> {

	private String entrustId;
	
	public ChangeEntrustRequest() {
		super("/v1.0/service_entrust/changeEntrust", "PUT");
	}

	@Override
	public Class<ChangeEntrustResponse> getResponseClass() {
		return ChangeEntrustResponse.class;
	}

	public String getEntrustId() {
		return entrustId;
	}

	public void setEntrustId(String entrustId) {
		this.entrustId = entrustId;
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(entrustId, "entrustId");
	}
	
}
