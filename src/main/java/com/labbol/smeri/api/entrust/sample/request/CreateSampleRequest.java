package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.sample.response.CreateSampleResponse;
import com.labbol.smeri.api.entrust.sample.support.Sample;
import com.labbol.smeri.api.entrust.sample.support.SampleWrapper;

/**
 * @author PengFei
 */
public class CreateSampleRequest extends AbstractAPIRequest<CreateSampleResponse> {

	private Sample sample;
	
	private static final String [] SAMPLE_NOT_BLANK_FIELDES = {
			"entrustId","sampleName","producer",
			"sampleModel","sampleSize","sampleWeight","sampleNum",
			"groupId",
			"creator","updator","state"
	};
	
	public CreateSampleRequest() {
		super("/v1.0/service_entrust/createSample", "POST");
	}

	@Override
	public Class<CreateSampleResponse> getResponseClass() {
		return CreateSampleResponse.class;
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
		RequestCheckUtils.checkNotEmpty(sample, "sample");
		RequestCheckUtils.checkBeanFieldNotEmpty(sample, SAMPLE_NOT_BLANK_FIELDES);
	}
	
}
