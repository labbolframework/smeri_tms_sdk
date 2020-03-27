package com.labbol.smeri.api.entrust.sample.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.entrust.sample.support.Sample;
import com.labbol.smeri.api.entrust.sample.support.SampleWrapper;

/**
 * @author PengFei
 */
public class GetSampleResponse extends AbstractAPIResponse  {

	private final Sample sample;
	
	public GetSampleResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			sample = gson.fromJson(httpResponse.getContentStr(), SampleWrapper.class).getSample();
		} else {
			sample = null;
		}
	}
	
	public Sample getSample() {
		return sample;
	}

}
