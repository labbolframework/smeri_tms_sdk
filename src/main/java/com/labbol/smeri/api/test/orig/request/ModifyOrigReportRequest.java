package com.labbol.smeri.api.test.orig.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.orig.response.ModifyOrigReportResponse;
import com.labbol.smeri.api.test.orig.support.OrigReport;
import com.labbol.smeri.api.test.orig.support.OrigReportWrapper;

/**
 * @author PengFei
 */
public class ModifyOrigReportRequest extends AbstractAPIRequest<ModifyOrigReportResponse>{

	private String origReportId;

	private OrigReport origReport;

	private static final String [] ORIG_REPORT_NOT_BLANK_FIELDS = {"updator","state"};


	public ModifyOrigReportRequest() {
		super("/v1.0/service_test/modifyOrigReport", "PUT");
	}

	@Override
	public Class<ModifyOrigReportResponse> getResponseClass() {
		return ModifyOrigReportResponse.class;
	}

	public String getOrigReportId() {
		return origReportId;
	}

	public void setOrigReportId(String origReportId) {
		this.origReportId = origReportId;
		httpRequest.addParam("origReportId", origReportId);
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
