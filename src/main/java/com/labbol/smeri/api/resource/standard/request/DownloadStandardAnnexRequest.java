package com.labbol.smeri.api.resource.standard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.standard.response.DownloadStandardAnnexResponse;

public class DownloadStandardAnnexRequest extends AbstractAPIRequest<DownloadStandardAnnexResponse>{

	private String standardId;

	public DownloadStandardAnnexRequest() {
		super("/v1.0/service_resource/downloadStandardAnnex", "GET");
	}

	@Override
	public Class<DownloadStandardAnnexResponse> getResponseClass() {
		return DownloadStandardAnnexResponse.class;
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
