package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.sample.response.CreateSampleDetailResponse;
import com.labbol.smeri.api.entrust.sample.support.SampleDetail;
import com.labbol.smeri.api.entrust.sample.support.SampleDetailWrapper;

/**
 * @author PengFei
 */
public class CreateSampleDetailRequest extends AbstractAPIRequest<CreateSampleDetailResponse> {

	private SampleDetail sampleDetail;
	
	private static final String [] SAMPLE_DETAIL_NOT_BLANK_FIELDES = {
			"sampleId","sampleNo",
			"sampleState","flowState",
			"creator","updator","state"
	};
	
	public CreateSampleDetailRequest() {
		super("/v1.0/service_entrust/createSampleDetail", "POST");
	}

	@Override
	public Class<CreateSampleDetailResponse> getResponseClass() {
		return CreateSampleDetailResponse.class;
	}
	
	public SampleDetail getSampleDetail() {
		return sampleDetail;
	}

	public void setSampleDetail(SampleDetail sampleDetail) {
		this.sampleDetail = sampleDetail;
		try {
			httpRequest.setContentStr(gson.toJson(new SampleDetailWrapper(sampleDetail)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(sampleDetail, "sampleDetail");
		RequestCheckUtils.checkBeanFieldNotEmpty(sampleDetail, SAMPLE_DETAIL_NOT_BLANK_FIELDES);
	}

}
