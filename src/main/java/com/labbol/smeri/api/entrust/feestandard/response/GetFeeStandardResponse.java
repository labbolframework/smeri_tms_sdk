package com.labbol.smeri.api.entrust.feestandard.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.entrust.feestandard.support.FeeStandard;
import com.labbol.smeri.api.entrust.feestandard.support.FeeStandardWrapper;

public class GetFeeStandardResponse extends AbstractAPIResponse {

	private final FeeStandard feeStandard;
	
	public GetFeeStandardResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			feeStandard = gson.fromJson(httpResponse.getContentStr(), FeeStandardWrapper.class).getFeeStandard();
		} else {
			feeStandard = null;
		}
	}

	public FeeStandard getFeeStandard() {
		return feeStandard;
	}
	
}
