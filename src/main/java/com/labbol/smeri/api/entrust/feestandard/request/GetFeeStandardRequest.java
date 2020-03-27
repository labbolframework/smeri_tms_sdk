package com.labbol.smeri.api.entrust.feestandard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.feestandard.response.GetFeeStandardResponse;

public class GetFeeStandardRequest extends AbstractAPIRequest<GetFeeStandardResponse> {

	private String feeStandardId;

	public GetFeeStandardRequest() {
		super("/v1.0/service_entrust/getFeeStandard", "GET");
	}

	@Override
	public Class<GetFeeStandardResponse> getResponseClass() {
		return GetFeeStandardResponse.class;
	}

	public String getFeeStandardId() {
		return feeStandardId;
	}

	public void setFeeStandardId(String feeStandardId) {
		this.feeStandardId = feeStandardId;
		httpRequest.addParam("feeStandardId", feeStandardId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(feeStandardId, "feeStandardId");
	}

}
