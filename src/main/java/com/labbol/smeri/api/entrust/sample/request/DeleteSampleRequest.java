package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.sample.response.DeleteSampleResponse;

public class DeleteSampleRequest extends AbstractAPIRequest<DeleteSampleResponse> {

	private String sampleId;
	
	public DeleteSampleRequest() {
		super("/v1.0/service_entrust/deleteSample", "DELETE");
	}

	@Override
	public Class<DeleteSampleResponse> getResponseClass() {
		return DeleteSampleResponse.class;
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
