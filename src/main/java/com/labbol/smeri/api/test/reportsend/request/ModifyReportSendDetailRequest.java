package com.labbol.smeri.api.test.reportsend.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.reportsend.response.ModifyReportSendDetailResponse;
import com.labbol.smeri.api.test.reportsend.support.ReportSendDetail;
import com.labbol.smeri.api.test.reportsend.support.ReportSendDetailWrapper;

/**
 * @author PengFei
 */
public class ModifyReportSendDetailRequest extends AbstractAPIRequest<ModifyReportSendDetailResponse> {

	private String reportSendDetailId;
	
	private ReportSendDetail reportSendDetail;
	
	private static final String [] REPORT_SEND_DETAIL_SEND_NOT_BLANK_FIELDS = {
			"updator","state"
	};
	
	public ModifyReportSendDetailRequest() {
		super("/v1.0/service_test/modifyReportSendDetail", "PUT");
	}

	@Override
	public Class<ModifyReportSendDetailResponse> getResponseClass() {
		return ModifyReportSendDetailResponse.class;
	}

	public String getReportSendDetailId() {
		return reportSendDetailId;
	}

	public void setReportSendDetailId(String reportSendDetailId) {
		this.reportSendDetailId = reportSendDetailId;
		httpRequest.addParam("reportSendDetailId", reportSendDetailId);
	}

	public ReportSendDetail getReportSendDetail() {
		return reportSendDetail;
	}

	public void setReportSendDetail(ReportSendDetail reportSendDetail) {
		this.reportSendDetail = reportSendDetail;
		try {
			httpRequest.setContentStr(gson.toJson(new ReportSendDetailWrapper(reportSendDetail)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(reportSendDetailId, "reportSendDetailId");
		RequestCheckUtils.checkNotEmpty(reportSendDetail, "reportSendDetail");
		RequestCheckUtils.checkBeanFieldNotEmpty(reportSendDetail, REPORT_SEND_DETAIL_SEND_NOT_BLANK_FIELDS);
	}

}
