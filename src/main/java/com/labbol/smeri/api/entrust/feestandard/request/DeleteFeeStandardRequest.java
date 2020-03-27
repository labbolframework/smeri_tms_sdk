package com.labbol.smeri.api.entrust.feestandard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.feestandard.response.DeleteFeeStandardResponse;

public class DeleteFeeStandardRequest extends AbstractAPIRequest<DeleteFeeStandardResponse> {

	private String feeStandardId;
	
	public DeleteFeeStandardRequest() {
		super("/v1.0/service_entrust/deleteFeeStandard", "DELETE");
	}

	@Override
	public Class<DeleteFeeStandardResponse> getResponseClass() {
		return DeleteFeeStandardResponse.class;
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
