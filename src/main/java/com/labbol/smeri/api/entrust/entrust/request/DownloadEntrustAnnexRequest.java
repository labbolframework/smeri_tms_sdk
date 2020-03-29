package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.DownloadEntrustAnnexResponse;

public class DownloadEntrustAnnexRequest extends AbstractAPIRequest<DownloadEntrustAnnexResponse> {

	private String entrustAnnexId;

	public DownloadEntrustAnnexRequest() {
		super("/v1.0/service_entrust/downloadEntrustAnnex", "GET");
	}

	@Override
	public Class<DownloadEntrustAnnexResponse> getResponseClass() {
		return DownloadEntrustAnnexResponse.class;
	}

	public String getEntrustAnnexId() {
		return entrustAnnexId;
	}

	public void setEntrustAnnexId(String entrustAnnexId) {
		this.entrustAnnexId = entrustAnnexId;
		httpRequest.addParam("entrustAnnexId", entrustAnnexId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(entrustAnnexId, "entrustAnnexId");
	}
	
}
