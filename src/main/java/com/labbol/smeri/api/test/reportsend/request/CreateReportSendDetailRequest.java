package com.labbol.smeri.api.test.reportsend.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.reportsend.response.CreateReportSendDetailResponse;
import com.labbol.smeri.api.test.reportsend.support.ReportSendDetail;
import com.labbol.smeri.api.test.reportsend.support.ReportSendDetailWrapper;

/**
 * @author PengFei
 */
public class CreateReportSendDetailRequest extends AbstractAPIRequest<CreateReportSendDetailResponse>{

	private ReportSendDetail reportSendDetail;
	
	private static final String [] REPORT_SEND_DETAIL_SEND_NOT_BLANK_FIELDS = {
			"sendId","reportId","sendNum","creator","updator"
	};
	
	public CreateReportSendDetailRequest(String apiMethodName, String method) {
		super("/v1.0/service_test/createReportSendDetail", "POST");
	}

	@Override
	public Class<CreateReportSendDetailResponse> getResponseClass() {
		return CreateReportSendDetailResponse.class;
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
		RequestCheckUtils.checkNotEmpty(reportSendDetail, "reportSendDetail");
		RequestCheckUtils.checkBeanFieldNotEmpty(reportSendDetail, REPORT_SEND_DETAIL_SEND_NOT_BLANK_FIELDS);
	}

}
