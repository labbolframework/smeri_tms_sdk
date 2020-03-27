package com.labbol.smeri.api.test.reportsend.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.reportsend.response.ModifyReportSendResponse;
import com.labbol.smeri.api.test.reportsend.support.ReportSend;
import com.labbol.smeri.api.test.reportsend.support.ReportSendWrapper;

/**
 * @author PengFei
 */
public class ModifyReportSendRequest extends AbstractAPIRequest<ModifyReportSendResponse> {

	private String reportSendId;
	
	private ReportSend reportSend;
	
	private static final String [] REPORT_SEND_NOT_BLANK_FIELDS = {
			"poaId","customerName","receiver","sender","sendType",
			"sendTime","payState","payAmount","creator","updator"
	};
	
	public ModifyReportSendRequest() {
		super("/v1.0/service_test/modifyReportSend", "PUT");
	}

	@Override
	public Class<ModifyReportSendResponse> getResponseClass() {
		return ModifyReportSendResponse.class;
	}
	
	public String getReportSendId() {
		return reportSendId;
	}

	public void setReportSendId(String reportSendId) {
		this.reportSendId = reportSendId;
		httpRequest.addParam("reportSendId", reportSendId);
	}

	public ReportSend getReportSend() {
		return reportSend;
	}

	public void setReportSend(ReportSend reportSend) {
		this.reportSend = reportSend;
		try {
			httpRequest.setContentStr(gson.toJson(new ReportSendWrapper(reportSend)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(reportSendId, "reportSendId");
		RequestCheckUtils.checkNotEmpty(reportSend, "reportSend");
		RequestCheckUtils.checkBeanFieldNotEmpty(reportSend, REPORT_SEND_NOT_BLANK_FIELDS);
	}
	
}
