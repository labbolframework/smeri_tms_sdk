package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.ModifyEntrustResponse;
import com.labbol.smeri.api.entrust.entrust.support.Entrust;
import com.labbol.smeri.api.entrust.entrust.support.EntrustWrapper;

public class ModifyEntrustRequest extends AbstractAPIRequest<ModifyEntrustResponse> {

	private String entrustId;
	
	private Entrust entrust;

	private static final String [] ENTRUST_NOT_BLANK_FIELDES = {
			"updator","state"
	};

	public ModifyEntrustRequest() {
		super("/v1.0/service_entrust/modifyEntrust", "PUT");
	}

	@Override
	public Class<ModifyEntrustResponse> getResponseClass() {
		return ModifyEntrustResponse.class;
	}

	public String getEntrustId() {
		return entrustId;
	}

	public void setEntrustId(String entrustId) {
		this.entrustId = entrustId;
		httpRequest.addParam("entrustId", entrustId);
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
		RequestCheckUtils.checkNotEmpty(entrustId, "entrustId");
		RequestCheckUtils.checkNotEmpty(entrust, "entrust");
		RequestCheckUtils.checkBeanFieldNotEmpty(entrust, ENTRUST_NOT_BLANK_FIELDES);
	}
	
}
