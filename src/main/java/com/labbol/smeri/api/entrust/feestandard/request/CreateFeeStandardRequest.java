package com.labbol.smeri.api.entrust.feestandard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.feestandard.response.CreateFeeStandardResponse;
import com.labbol.smeri.api.entrust.feestandard.support.FeeStandard;
import com.labbol.smeri.api.entrust.feestandard.support.FeeStandardWrapper;

/**
 * @author PengFei
 */
public class CreateFeeStandardRequest extends AbstractAPIRequest<CreateFeeStandardResponse> {

	private FeeStandard feeStandard;
	
	private static final String [] FEE_STANDARD_NOT_BLANK_FIELDES = {
			"feeName","sampleName","sampleModel","projectName",
			"testFee","remark",
			"creator","updator","state"
	};
	
	public CreateFeeStandardRequest() {
		super("/v1.0/service_entrust/createFeeStandard", "POST");
	}

	@Override
	public Class<CreateFeeStandardResponse> getResponseClass() {
		return CreateFeeStandardResponse.class;
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
		RequestCheckUtils.checkNotEmpty(feeStandard, "feeStandard");
		RequestCheckUtils.checkBeanFieldNotEmpty(feeStandard, FEE_STANDARD_NOT_BLANK_FIELDES);
	}

}
