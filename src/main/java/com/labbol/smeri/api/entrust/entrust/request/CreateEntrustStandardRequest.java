package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.CreateEntrustStandardResponse;
import com.labbol.smeri.api.entrust.entrust.support.EntrustStandard;
import com.labbol.smeri.api.entrust.entrust.support.EntrustStandardWrapper;

/**
 * @author PengFei
 */
public class CreateEntrustStandardRequest extends AbstractAPIRequest<CreateEntrustStandardResponse> {

	private EntrustStandard entrustStandard;
	
	private static final String [] ENTRUST_STANDARD_NOT_BLANK_FIELDES = {
			"entrustId","basisId",
			"creator","updator","state"
	};
	
	public CreateEntrustStandardRequest() {
		super("/v1.0/service_entrust/createEntrustStandard", "POST");
	}

	@Override
	public Class<CreateEntrustStandardResponse> getResponseClass() {
		return CreateEntrustStandardResponse.class;
	}

	public EntrustStandard getEntrustStandard() {
		return entrustStandard;
	}

	public void setEntrustStandard(EntrustStandard entrustStandard) {
		this.entrustStandard = entrustStandard;
		try {
			httpRequest.setContentStr(gson.toJson(new EntrustStandardWrapper(entrustStandard)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(entrustStandard, "entrustStandard");
		RequestCheckUtils.checkBeanFieldNotEmpty(entrustStandard, ENTRUST_STANDARD_NOT_BLANK_FIELDES);
	}

}
