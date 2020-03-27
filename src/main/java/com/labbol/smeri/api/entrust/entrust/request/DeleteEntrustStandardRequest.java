package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.DeleteEntrustStandardResponse;

public class DeleteEntrustStandardRequest extends AbstractAPIRequest<DeleteEntrustStandardResponse> {

	private String entrustStandardId;
	
	public DeleteEntrustStandardRequest() {
		super("/v1.0/service_entrust/deleteEntrustStandard", "DELETE");
	}

	@Override
	public Class<DeleteEntrustStandardResponse> getResponseClass() {
		return DeleteEntrustStandardResponse.class;
	}

	public String getEntrustStandardId() {
		return entrustStandardId;
	}

	public void setEntrustStandardId(String entrustStandardId) {
		this.entrustStandardId = entrustStandardId;
		httpRequest.addParam(entrustStandardId, "entrustStandardId");
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(entrustStandardId, "entrustStandardId");
	}

}
