/**
 * 
 */
package com.labbol.smeri.api.resource.standard.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.standard.response.ModifyStandardResponse;
import com.labbol.smeri.api.resource.standard.support.Standard;
import com.labbol.smeri.api.resource.standard.support.StandardWrapper;

public class ModifyStandardRequest extends AbstractAPIRequest<ModifyStandardResponse>{

	private String standardId;
	
	private Standard standard;
	
	private static final String [] STANDARD_NOT_BLANK_FIELDS = {"standardNo","standardName","standardType","creator","updator"};
	
	public ModifyStandardRequest() {
		super("/v1.0/service_resource/modifyStandard", "PUT");
	}

	@Override
	public Class<ModifyStandardResponse> getResponseClass() {
		return ModifyStandardResponse.class;
	}

	public String getStandardId() {
		return standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
		httpRequest.addParam("standardId", standardId);
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
		try {
			httpRequest.setContentStr(gson.toJson(new StandardWrapper(standard)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(standard, "standard");
		RequestCheckUtils.checkNotEmpty(standardId, "standardId");
		RequestCheckUtils.checkBeanFieldNotEmpty(standard, STANDARD_NOT_BLANK_FIELDS);
	}
	
}
