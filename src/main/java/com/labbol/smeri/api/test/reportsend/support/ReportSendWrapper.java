/**
 * 
 */
package com.labbol.smeri.api.test.reportsend.support;

/**
 * @author PengFei
 *
 */
public class ReportSendWrapper {

	private ReportSend reportSend;

	public ReportSendWrapper() {}
	
	public ReportSendWrapper(ReportSend reportSend) {
		this.reportSend = reportSend;
	}
	
	public ReportSend getReportSend() {
		return reportSend;
	}

	public void setReportSend(ReportSend reportSend) {
		this.reportSend = reportSend;
	}
	
}
