package com.labbol.smeri.api.test.orig.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.orig.response.CreateOrigReportResponse;
import com.labbol.smeri.api.test.orig.support.OrigReport;
import com.labbol.smeri.api.test.orig.support.OrigReportWrapper;

/**
 * @author PengFei
 */
public class CreateOrigReportRequest extends AbstractAPIRequest<CreateOrigReportResponse>{

	private OrigReport origReport;
	
	private static final String [] ORIG_REPORT_NOT_BLANK_FIELDS = {"poaId","tokenId","reportNo","reportName","testStartDate",
			"testEndDate","testAddr","tester","checker","groupId",
			"reportGenSate","creator","updator","state"};
	
	public CreateOrigReportRequest() {
		super("/v1.0/service_test/createOrigReport", "POST");
	}

	@Override
	public Class<CreateOrigReportResponse> getResponseClass() {
		return CreateOrigReportResponse.class;
	}

	public OrigReport getOrigReport() {
		return origReport;
	}

	public void setOrigReport(OrigReport origReport) {
		this.origReport = origReport;
		try {
			httpRequest.setContentStr(gson.toJson(new OrigReportWrapper(origReport)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(origReport, "origReport");
		RequestCheckUtils.checkBeanFieldNotEmpty(origReport, ORIG_REPORT_NOT_BLANK_FIELDS);
	}

}
