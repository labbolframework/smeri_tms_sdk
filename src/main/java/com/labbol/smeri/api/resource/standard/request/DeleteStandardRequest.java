/**
 * 
 */
package com.labbol.smeri.api.resource.standard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.standard.response.DeleteStandardResponse;

public class DeleteStandardRequest extends AbstractAPIRequest<DeleteStandardResponse>{

	private String standardId;
	
	public DeleteStandardRequest() {
		super("/v1.0/service_resource/deleteStandard", "DELETE");
	}

	@Override
	public Class<DeleteStandardResponse> getResponseClass() {
		return DeleteStandardResponse.class;
	}

	public String getStandardId() {
		return standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
		httpRequest.addParam("standardId", standardId);
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(standardId, "standardId");
	}

}
