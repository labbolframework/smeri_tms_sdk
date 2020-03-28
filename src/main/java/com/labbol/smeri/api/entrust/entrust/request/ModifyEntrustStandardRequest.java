package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.ModifyEntrustStandardResponse;
import com.labbol.smeri.api.entrust.entrust.support.EntrustStandard;
import com.labbol.smeri.api.entrust.entrust.support.EntrustStandardWrapper;

/**
 * @author PengFei
 */
public class ModifyEntrustStandardRequest extends AbstractAPIRequest<ModifyEntrustStandardResponse> {

	private String entrustStandardId;
	
	private EntrustStandard entrustStandard;

	private static final String [] ENTRUST_STANDARD_NOT_BLANK_FIELDES = {
			"entrustId","basisId",
			"updator","state"
	};

	public ModifyEntrustStandardRequest() {
		super("/v1.0/service_entrust/modifyEntrustStandard", "PUT");
	}

	@Override
	public Class<ModifyEntrustStandardResponse> getResponseClass() {
		return ModifyEntrustStandardResponse.class;
	}

	public String getEntrustStandardId() {
		return entrustStandardId;
	}

	public void setEntrustStandardId(String entrustStandardId) {
		this.entrustStandardId = entrustStandardId;
		httpRequest.addParam(entrustStandardId, "entrustStandardId");
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
		RequestCheckUtils.checkNotEmpty(entrustStandardId, "entrustStandardId");
		RequestCheckUtils.checkNotEmpty(entrustStandard, "entrustStandard");
		RequestCheckUtils.checkBeanFieldNotEmpty(entrustStandard, ENTRUST_STANDARD_NOT_BLANK_FIELDES);
	}

}
