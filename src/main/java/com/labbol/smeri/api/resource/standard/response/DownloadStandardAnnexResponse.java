package com.labbol.smeri.api.resource.standard.response;

import org.yelong.http.response.HttpResponse;
import org.yelong.http.utils.WebUtils;

import com.labbol.api.support.response.AbstractAPIResponse;

public class DownloadStandardAnnexResponse extends AbstractAPIResponse{

	public DownloadStandardAnnexResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}
	
	public String getStandardAnnexName(){
		return WebUtils.getResponseFileName(getHttpResponse());
	}
	
	public byte [] getStandardAnnex() {
		return getHttpResponse().getContent();
	}

}
