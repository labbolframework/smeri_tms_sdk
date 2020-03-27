package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.sample.response.CopySampleResponse;
import com.labbol.smeri.api.entrust.sample.support.Sample;
import com.labbol.smeri.api.entrust.sample.support.SampleWrapper;

public class CopySampleRequest extends AbstractAPIRequest<CopySampleResponse>{

	private String sampleId;
	
	private String creator;
	
	private String updator;
	
	public CopySampleRequest() {
		super("/v1.0/service_entrust/copySample", "PUT");
	}

	@Override
	public Class<CopySampleResponse> getResponseClass() {
		return CopySampleResponse.class;
	}

	public String getSampleId() {
		return sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
		httpRequest.addParam("sampleId", sampleId);
	}
	
	public void setCreatorAndUpdator(String creator , String updator) {
		this.creator = creator;
		this.updator = updator;
		Sample sample = new Sample();
		sample.setCreator(creator);
		sample.setUpdator(updator);
		try {
			httpRequest.setContentStr(gson.toJson(new SampleWrapper(sample)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getCreator() {
		return creator;
	}

	public String getUpdator() {
		return updator;
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(sampleId, "sampleId");
		RequestCheckUtils.checkNotEmpty(creator, "creator");
		RequestCheckUtils.checkNotEmpty(updator, "updator");
	}
	
}
