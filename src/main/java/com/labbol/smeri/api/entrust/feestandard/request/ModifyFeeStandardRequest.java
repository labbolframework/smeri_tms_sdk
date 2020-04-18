package com.labbol.smeri.api.entrust.feestandard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.feestandard.response.ModifyFeeStandardResponse;
import com.labbol.smeri.api.entrust.feestandard.support.FeeStandard;
import com.labbol.smeri.api.entrust.feestandard.support.FeeStandardWrapper;

public class ModifyFeeStandardRequest extends AbstractAPIRequest<ModifyFeeStandardResponse> {

	private String feeStandardId;
	
	private FeeStandard feeStandard;
	
	private static final String [] FEE_STANDARD_NOT_BLANK_FIELDES = {
			"updator","state"
	};
	
	public ModifyFeeStandardRequest() {
		super("/v1.0/service_entrust/modifyFeeStandard", "PUT");
	}

	@Override
	public Class<ModifyFeeStandardResponse> getResponseClass() {
		return ModifyFeeStandardResponse.class;
	}
	
	public String getFeeStandardId() {
		return feeStandardId;
	}

	public void setFeeStandardId(String feeStandardId) {
		this.feeStandardId = feeStandardId;
		httpRequest.addParam("feeStandardId", feeStandardId);
	}

	public FeeStandard getFeeStandard() {
		return feeStandard;
	}

	public void setFeeStandard(FeeStandard feeStandard) {
		this.feeStandard = feeStandard;
		try {
			httpRequest.setContentStr(gson.toJson(new FeeStandardWrapper(feeStandard)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(feeStandardId, "feeStandardId");
		RequestCheckUtils.checkNotEmpty(feeStandard, "feeStandard");
		RequestCheckUtils.checkBeanFieldNotEmpty(feeStandard, FEE_STANDARD_NOT_BLANK_FIELDES);
	}
}
