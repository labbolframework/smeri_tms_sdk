package com.labbol.smeri.api.entrust.sample.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.sample.response.DeleteSampleDetailResponse;

/**
 * @author PengFei
 */
public class DeleteSampleDetailRequest extends AbstractAPIRequest<DeleteSampleDetailResponse> {

	private String sampleDetailId;

	public DeleteSampleDetailRequest() {
		super("/v1.0/service_entrust/deleteSampleDetail", "DELETE");
	}

	@Override
	public Class<DeleteSampleDetailResponse> getResponseClass() {
		return DeleteSampleDetailResponse.class;
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
