package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.TerminateEntrustResponse;
import com.labbol.smeri.api.entrust.entrust.support.TerminateEntrust;
import com.labbol.smeri.api.entrust.entrust.support.TerminateEntrustWrapper;

@Deprecated
public class TerminateEntrustRequest extends AbstractAPIRequest<TerminateEntrustResponse> {

	private TerminateEntrust terminateEntrust;
	
	private static final String [] TERMINATE_ENTRUST_NOT_BLANK_FIELDES = {
			"finishReason",
			"creator","updator","state"
	};
	
	public TerminateEntrustRequest() {
		super("/v1.0/service_entrust/terminateEntrust", "PUT");
	}

	@Override
	public Class<TerminateEntrustResponse> getResponseClass() {
		return TerminateEntrustResponse.class;
	}

	public TerminateEntrust getTerminateEntrust() {
		return terminateEntrust;
	}

	public void setTerminateEntrust(TerminateEntrust terminateEntrust) {
		this.terminateEntrust = terminateEntrust;
		try {
			httpRequest.setContentStr(gson.toJson(new TerminateEntrustWrapper(terminateEntrust)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(terminateEntrust, "terminateEntrust");
		RequestCheckUtils.checkBeanFieldNotEmpty(terminateEntrust, TERMINATE_ENTRUST_NOT_BLANK_FIELDES);
	}

}
