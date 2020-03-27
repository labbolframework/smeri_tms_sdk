package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.sample.response.ModifySampleResponse;
import com.labbol.smeri.api.entrust.sample.support.Sample;
import com.labbol.smeri.api.entrust.sample.support.SampleWrapper;

public class ModifySampleRequest extends AbstractAPIRequest<ModifySampleResponse> {

	private String sampleId;
	
	private Sample sample;

	private static final String [] SAMPLE_NOT_BLANK_FIELDES = {
			"entrustId","productNo","sampleName","producer",
			"sampleModel","sampleSize","sampleWeight","sampleNum",
			"groupId",
			"creator","updator","state"
	};

	public ModifySampleRequest() {
		super("/v1.0/service_entrust/modifySample", "PUT");
	}

	@Override
	public Class<ModifySampleResponse> getResponseClass() {
		return ModifySampleResponse.class;
	}

	public String getSampleId() {
		return sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
		httpRequest.addParam("sampleId", sampleId);
	}

	public Sample getSample() {
		return sample;
	}

	public void setSample(Sample sample) {
		this.sample = sample;
		try {
			httpRequest.setContentStr(gson.toJson(new SampleWrapper(sample)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(sampleId, "sampleId");
		RequestCheckUtils.checkNotEmpty(sample, "sample");
		RequestCheckUtils.checkBeanFieldNotEmpty(sample, SAMPLE_NOT_BLANK_FIELDES);
	}
	
}
