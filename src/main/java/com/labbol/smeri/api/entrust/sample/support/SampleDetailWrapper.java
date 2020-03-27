/**
 * 
 */
package com.labbol.smeri.api.entrust.sample.support;

/**
 * @author PengFei
 */
public class SampleDetailWrapper {

	private SampleDetail sampleDetail;

	public SampleDetailWrapper() {}
	
	public SampleDetailWrapper(SampleDetail sampleDetail) {
		this.sampleDetail = sampleDetail;
	}

	public SampleDetail getSampleDetail() {
		return sampleDetail;
	}

	public void setSampleDetail(SampleDetail sampleDetail) {
		this.sampleDetail = sampleDetail;
	}
	
}
