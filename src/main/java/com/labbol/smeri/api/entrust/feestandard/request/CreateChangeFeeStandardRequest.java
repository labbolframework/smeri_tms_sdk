/**
 * 
 */
package com.labbol.smeri.api.entrust.feestandard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.feestandard.response.CreateChangeFeeStandardResponse;
import com.labbol.smeri.api.entrust.feestandard.support.ChangeFeeStandard;
import com.labbol.smeri.api.entrust.feestandard.support.ChangeFeeStandardWrapper;

/**
 * @author PengFei
 *
 */
public class CreateChangeFeeStandardRequest extends AbstractAPIRequest<CreateChangeFeeStandardResponse>{

	private ChangeFeeStandard changeFeeStandard;

	private static final String [] CHANGE_FEE_STANDARD_NOT_BLANK_FIELDES = {
			"entrustId","beforeAmount","afterAmount","changeReason",
			"creator","updator","state"
	};

	public CreateChangeFeeStandardRequest() {
		super("/v1.0/service_entrust/createChangeFeeStandard", "POST");
	}

	@Override
	public Class<CreateChangeFeeStandardResponse> getResponseClass() {
		return CreateChangeFeeStandardResponse.class;
	}

	public ChangeFeeStandard getChangeFeeStandard() {
		return changeFeeStandard;
	}

	public void setChangeFeeStandard(ChangeFeeStandard changeFeeStandard) {
		this.changeFeeStandard = changeFeeStandard;
		try {
			httpRequest.setContentStr(gson.toJson(new ChangeFeeStandardWrapper(changeFeeStandard)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(changeFeeStandard, "changeFeeStandard");
		RequestCheckUtils.checkBeanFieldNotEmpty(changeFeeStandard, CHANGE_FEE_STANDARD_NOT_BLANK_FIELDES);
	}
}
