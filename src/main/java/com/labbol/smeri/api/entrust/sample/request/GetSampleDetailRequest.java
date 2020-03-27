package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.sample.response.GetSampleDetailResponse;

public class GetSampleDetailRequest extends AbstractAPIRequest<GetSampleDetailResponse> {

	private String sampleDetailId;

	public GetSampleDetailRequest() {
		super("/v1.0/service_entrust/getSampleDetail", "GET");
	}

	@Override
	public Class<GetSampleDetailResponse> getResponseClass() {
		return GetSampleDetailResponse.class;
	}

	public String getSampleDetailId() {
		return sampleDetailId;
	}

	public void setSampleDetailId(String sampleDetailId) {
		this.sampleDetailId = sampleDetailId;
		httpRequest.addParam("sampleDetailId", sampleDetailId);
	}
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(sampleDetailId, "sampleDetailId");
	}

}
