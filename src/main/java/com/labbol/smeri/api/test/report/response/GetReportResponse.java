package com.labbol.smeri.api.test.report.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.test.report.support.Report;
import com.labbol.smeri.api.test.report.support.ReportWrapper;

/**
 * @author PengFei
 */
public class GetReportResponse extends AbstractAPIResponse{

	private final Report report;
	
	public GetReportResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			report = gson.fromJson(httpResponse.getContentStr(), ReportWrapper.class).getReport();
		} else {
			report = null;
		}
	}

	public Report getReport() {
		return report;
	}
	
}
