package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.sample.response.ModifySampleDetailResponse;
import com.labbol.smeri.api.entrust.sample.support.SampleDetail;
import com.labbol.smeri.api.entrust.sample.support.SampleDetailWrapper;

/**
 * @author PengFei
 */
public class ModifySampleDetailRequest extends AbstractAPIRequest<ModifySampleDetailResponse> {

	private String sampleDetailId;
	
	private SampleDetail sampleDetail;
	
	private static final String [] SAMPLE_DETAIL_NOT_BLANK_FIELDES = {
			"sampleId","sampleNo","origReportNo","reportNo",
			"gfReportNo","sampleState","flowState",
			"updator","state"
	};
	
	public ModifySampleDetailRequest() {
		super("/v1.0/service_entrust/modifySampleDetail", "PUT");
	}

	@Override
	public Class<ModifySampleDetailResponse> getResponseClass() {
		return ModifySampleDetailResponse.class;
	}
	
	public String getSampleDetailId() {
		return sampleDetailId;
	}

	public void setSampleDetailId(String sampleDetailId) {
		this.sampleDetailId = sampleDetailId;
		httpRequest.addParam("sampleDetailId", sampleDetailId);
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
		RequestCheckUtils.checkNotEmpty(sampleDetailId, "sampleDetailId");
		RequestCheckUtils.checkNotEmpty(sampleDetail, "sampleDetail");
		RequestCheckUtils.checkBeanFieldNotEmpty(sampleDetail, SAMPLE_DETAIL_NOT_BLANK_FIELDES);
	}
	
}
