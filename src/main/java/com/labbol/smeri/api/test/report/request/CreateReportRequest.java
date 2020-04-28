package com.labbol.smeri.api.test.report.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.report.response.CreateReportResponse;
import com.labbol.smeri.api.test.report.support.Report;
import com.labbol.smeri.api.test.report.support.ReportWrapper;

/**
 * @author PengFei
 */
public class CreateReportRequest extends AbstractAPIRequest<CreateReportResponse>{

	private Report report;	
	
	private static final String [] REPORT_NOT_BLANK_FIELDS = {"poaId","tokenId","reportNo","reportName",
			"testDate","testAddr","tester","checker","groupId",
			"reportGenSate","creator","updator","state"};
	
	public CreateReportRequest() {
		super("/v1.0/service_test/createReport", "POST");
	}

	@Override
	public Class<CreateReportResponse> getResponseClass() {
		return CreateReportResponse.class;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
		try {
			httpRequest.setContentStr(gson.toJson(new ReportWrapper(report)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(report, "report");
		RequestCheckUtils.checkBeanFieldNotEmpty(report, REPORT_NOT_BLANK_FIELDS);
	}

}
