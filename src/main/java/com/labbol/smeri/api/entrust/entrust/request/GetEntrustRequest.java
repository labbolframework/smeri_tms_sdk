package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.GetEntrustResponse;

/**
 * @author PengFei
 */
public class GetEntrustRequest extends AbstractAPIRequest<GetEntrustResponse> {

	private String entrustId;
	
	public GetEntrustRequest() {
		super("/v1.0/service_entrust/getEntrust", "GET");
	}

	@Override
	public Class<GetEntrustResponse> getResponseClass() {
		return GetEntrustResponse.class;
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
