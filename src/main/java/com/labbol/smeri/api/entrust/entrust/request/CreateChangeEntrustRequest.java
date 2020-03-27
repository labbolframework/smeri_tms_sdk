package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.CreateChangeEntrustResponse;
import com.labbol.smeri.api.entrust.entrust.support.ChangeEntrust;
import com.labbol.smeri.api.entrust.entrust.support.ChangeEntrustWrapper;

/**
 * @author PengFei
 */
public class CreateChangeEntrustRequest extends AbstractAPIRequest<CreateChangeEntrustResponse> {

	private ChangeEntrust changeEntrust;
	

	private static final String [] CHANGE_ENTRUST_NOT_BLANK_FIELDES = {
			"entrustId","changeTime","changer","changeContent",
			"creator","updator","state"
	};
	
	public CreateChangeEntrustRequest() {
		super("/v1.0/service_entrust/crateteChangeEntrust", "POST");
	}

	@Override
	public Class<CreateChangeEntrustResponse> getResponseClass() {
		return CreateChangeEntrustResponse.class;
	}

	public ChangeEntrust getChangeEntrust() {
		return changeEntrust;
	}

	public void setChangeEntrust(ChangeEntrust changeEntrust) {
		this.changeEntrust = changeEntrust;
		try {
			httpRequest.setContentStr(gson.toJson(new ChangeEntrustWrapper(changeEntrust)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(changeEntrust, "changeEntrust");
		RequestCheckUtils.checkBeanFieldNotEmpty(changeEntrust, CHANGE_ENTRUST_NOT_BLANK_FIELDES);
	}

}
