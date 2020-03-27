package com.labbol.smeri.api.test.reportsend.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.test.reportsend.support.ReportSendDetail;
import com.labbol.smeri.api.test.reportsend.support.ReportSendDetailWrapper;

/**
 * @author PengFei
 */
public class GetReportSendDetailResponse extends AbstractAPIResponse  {

	private final ReportSendDetail reportSendDetail;
	
	public GetReportSendDetailResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			reportSendDetail = gson.fromJson(httpResponse.getContentStr(), ReportSendDetailWrapper.class).getReportSendDetail();
		} else {
			reportSendDetail = null;
		}
	}

	public ReportSendDetail getReportSendDetail() {
		return reportSendDetail;
	}

}
