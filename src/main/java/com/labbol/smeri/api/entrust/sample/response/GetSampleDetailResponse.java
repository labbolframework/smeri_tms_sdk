package com.labbol.smeri.api.entrust.sample.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.entrust.sample.support.SampleDetail;
import com.labbol.smeri.api.entrust.sample.support.SampleDetailWrapper;

/**
 * @author PengFei
 */
public class GetSampleDetailResponse extends AbstractAPIResponse  {
	
	private final SampleDetail sampleDetail;
	
	public GetSampleDetailResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			sampleDetail = gson.fromJson(httpResponse.getContentStr(), SampleDetailWrapper.class).getSampleDetail();
		} else {
			sampleDetail = null;
		}
	}
	
	public SampleDetail getSampleDetail() {
		return sampleDetail;
	}

}
