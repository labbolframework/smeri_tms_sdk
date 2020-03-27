package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.GetEntrustFinishReasonResponse;

@Deprecated
public class GetEntrustFinishReasonRequest extends AbstractAPIRequest<GetEntrustFinishReasonResponse> {

	private String entrustId;

	public GetEntrustFinishReasonRequest() {
		super("/v1.0/service_entrust/getEntrustFinishReason", "GET");
	}

	@Override
	public Class<GetEntrustFinishReasonResponse> getResponseClass() {
		return GetEntrustFinishReasonResponse.class;
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
