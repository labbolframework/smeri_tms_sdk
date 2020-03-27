package com.labbol.smeri.api.resource.standard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.standard.response.GetStandardResponse;

public class GetStandardRequest extends AbstractAPIRequest<GetStandardResponse>{

	private String standardId;

	public GetStandardRequest() {
		super("/v1.0/service_resource/getStandard", "GET");
	}

	@Override
	public Class<GetStandardResponse> getResponseClass() {
		return GetStandardResponse.class;
	}

	public String getStandardId() {
		return standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
		httpRequest.addParam("standardId", standardId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(standardId, "standardId");
	}


}
