/**
 * 
 */
package com.labbol.smeri.api.resource.standard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.standard.response.DeleteStandardAnnexResponse;

/**
 * @author PengFei
 *
 */
public class DeleteStandardAnnexRequest extends AbstractAPIRequest<DeleteStandardAnnexResponse>{

	private String standardAnnexId;

	public DeleteStandardAnnexRequest() {
		super("/V1.0/service_resource/deleteStandardAnnex", "DELETE");
	}

	@Override
	public Class<DeleteStandardAnnexResponse> getResponseClass() {
		return DeleteStandardAnnexResponse.class;
	}

	public String getStandardAnnexId() {
		return standardAnnexId;
	}

	public void setStandardAnnexId(String standardAnnexId) {
		this.standardAnnexId = standardAnnexId;
		httpRequest.addParam("standardAnnexId",standardAnnexId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkBeanFieldNotEmpty(standardAnnexId, "standardAnnexId");
	}

}
