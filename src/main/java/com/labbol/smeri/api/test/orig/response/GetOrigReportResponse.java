package com.labbol.smeri.api.test.orig.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.test.orig.support.OrigReport;
import com.labbol.smeri.api.test.orig.support.OrigReportWrapper;

/**
 * @author PengFei
 */
public class GetOrigReportResponse extends AbstractAPIResponse{

	private final OrigReport origReport;

	public GetOrigReportResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			origReport = gson.fromJson(httpResponse.getContentStr(), OrigReportWrapper.class).getOrigReport();
		} else {
			origReport = null;
		}
	}

	public OrigReport getOrigReport() {
		return origReport;
	}

}
