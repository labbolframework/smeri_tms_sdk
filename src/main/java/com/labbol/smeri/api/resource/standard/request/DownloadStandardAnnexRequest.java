package com.labbol.smeri.api.resource.standard.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.standard.response.DownloadStandardAnnexResponse;

public class DownloadStandardAnnexRequest extends AbstractAPIRequest<DownloadStandardAnnexResponse>{

	/**
	 * @since 1.0.13 参数错误修改
	 */
	@Deprecated
	private String standardId;

	private String standardAnnexId;
	
	public DownloadStandardAnnexRequest() {
		super("/v1.0/service_resource/downloadStandardAnnex", "GET");
	}

	@Override
	public Class<DownloadStandardAnnexResponse> getResponseClass() {
		return DownloadStandardAnnexResponse.class;
	}

	@Deprecated
	public String getStandardId() {
		return standardId;
	}

	@Deprecated
	public void setStandardId(String standardId) {
		this.standardId = standardId;
		httpRequest.addParam("standardId", standardId);
	}

	public String getStandardAnnexId() {
		return standardAnnexId;
	}

	public void setStandardAnnexId(String standardAnnexId) {
		this.standardAnnexId = standardAnnexId;
		httpRequest.addParam("standardAnnexId", standardAnnexId);
	}

	@Override
	public void check() throws APIRuleException {
//		RequestCheckUtils.checkNotEmpty(standardId, "standardId");
		RequestCheckUtils.checkNotEmpty(standardAnnexId, "standardAnnexId");
	}


}
