package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.CreateEntrustResponse;
import com.labbol.smeri.api.entrust.entrust.support.Entrust;
import com.labbol.smeri.api.entrust.entrust.support.EntrustWrapper;

/**
 * @author PengFei
 */
public class CreateEntrustRequest extends AbstractAPIRequest<CreateEntrustResponse>{

	private Entrust entrust;

	private static final String [] ENTRUST_NOT_BLANK_FIELDES = {
			"customerName","tempEntrustId","standardIdList",
			"groupId","poaState",
			"creator","updator","state"
	};

	public CreateEntrustRequest() {
		super("/v1.0/service_entrust/createEntrust", "POST");
	}

	@Override
	public Class<CreateEntrustResponse> getResponseClass() {
		return CreateEntrustResponse.class;
	}

	public Entrust getEntrust() {
		return entrust;
	}

	public void setEntrust(Entrust entrust) {
		this.entrust = entrust;
		try {
			httpRequest.setContentStr(gson.toJson(new EntrustWrapper(entrust)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(entrust, "entrust");
		RequestCheckUtils.checkBeanFieldNotEmpty(entrust, ENTRUST_NOT_BLANK_FIELDES);
	}

}
