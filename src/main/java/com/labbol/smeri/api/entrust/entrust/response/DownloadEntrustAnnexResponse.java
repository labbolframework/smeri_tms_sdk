package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;
import org.yelong.http.utils.WebUtils;

import com.labbol.api.support.response.AbstractAPIResponse;

/**
 * @author PengFei
 */
public class DownloadEntrustAnnexResponse extends AbstractAPIResponse {

	public DownloadEntrustAnnexResponse(HttpResponse arg0) {
		super(arg0);
	}
	
	public String getEntrustAnnexName(){
		return WebUtils.getResponseFileName(getHttpResponse());
	}
	
	public byte [] getEntrustAnnex() {
		return getHttpResponse().getContent();
	}

}
