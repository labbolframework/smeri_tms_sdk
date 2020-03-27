package com.labbol.smeri.api.test.reportsend.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.test.reportsend.support.ReportSend;
import com.labbol.smeri.api.test.reportsend.support.ReportSendWrapper;

/**
 * @author PengFei
 */
public class GetReportSendResponse extends AbstractAPIResponse  {

	private final ReportSend reportSend;
	
	public GetReportSendResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			reportSend = gson.fromJson(httpResponse.getContentStr(), ReportSendWrapper.class).getReportSend();
		} else {
			reportSend = null;
		}
	}

	public ReportSend getReportSend() {
		return reportSend;
	}
	
}
