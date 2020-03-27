package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.sample.response.GetSampleResponse;

public class GetSampleRequest extends AbstractAPIRequest<GetSampleResponse> {

	private String sampleId;

	public GetSampleRequest() {
		super("/v1.0/service_entrust/getSample", "GET");
	}

	@Override
	public Class<GetSampleResponse> getResponseClass() {
		return GetSampleResponse.class;
	}

	public String getSampleId() {
		return sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
		httpRequest.addParam("sampleId", sampleId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(sampleId, "sampleId");
	}
	
}
