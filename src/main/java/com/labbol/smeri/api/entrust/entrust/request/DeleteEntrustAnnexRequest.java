package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.DeleteEntrustAnnexResponse;

public class DeleteEntrustAnnexRequest extends AbstractAPIRequest<DeleteEntrustAnnexResponse> {

	private String entrustAnnexId;

	public DeleteEntrustAnnexRequest() {
		super("/v1.0/service_entrust/deleteEntrustAnnex", "DELETE");
	}

	@Override
	public Class<DeleteEntrustAnnexResponse> getResponseClass() {
		return DeleteEntrustAnnexResponse.class;
	}

	public String getEntrustAnnexId() {
		return entrustAnnexId;
	}

	public void setEntrustAnnexId(String entrustAnnexId) {
		this.entrustAnnexId = entrustAnnexId;
		httpRequest.addParam(entrustAnnexId, "entrustAnnexId");
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(entrustAnnexId, "entrustAnnexId");
	}

}
