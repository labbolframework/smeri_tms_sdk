package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.entrust.entrust.support.TerminateEntrust;
import com.labbol.smeri.api.entrust.entrust.support.TerminateEntrustWrapper;

@Deprecated
public class GetEntrustFinishReasonResponse extends AbstractAPIResponse {

	private final TerminateEntrust terminateEntrust;
	
	public GetEntrustFinishReasonResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			terminateEntrust = gson.fromJson(httpResponse.getContentStr(), TerminateEntrustWrapper.class).getTerminateEntrust();
		} else {
			terminateEntrust = null;
		}
	}
	
	public TerminateEntrust getTerminateEntrust() {
		return terminateEntrust;
	}

}
