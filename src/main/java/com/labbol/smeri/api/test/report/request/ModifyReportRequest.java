package com.labbol.smeri.api.test.report.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.report.response.ModifyReportResponse;
import com.labbol.smeri.api.test.report.support.Report;
import com.labbol.smeri.api.test.report.support.ReportWrapper;

/**
 * @author PengFei
 */
public class ModifyReportRequest extends AbstractAPIRequest<ModifyReportResponse> {

	private String reportId;

	private Report report;	

	private static final String [] REPORT_NOT_BLANK_FIELDS = {"poaId","tokenId","reportNo","reportName","testStartDate"
			,"testEndDate","testAddr","tester","checker","conclusion","groupId",
			"fileUrl","reportGenSate","creator","updator","state"};

	public ModifyReportRequest() {
		super("/v1.0/service_test/modifyReport", "PUT");
	}

	@Override
	public Class<ModifyReportResponse> getResponseClass() {
		return ModifyReportResponse.class;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
		httpRequest.addParam("reportId", reportId);
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
		RequestCheckUtils.checkNotEmpty(reportId, "reportId");
		RequestCheckUtils.checkNotEmpty(report, "report");
		RequestCheckUtils.checkBeanFieldNotEmpty(report, REPORT_NOT_BLANK_FIELDS);
	}

}
