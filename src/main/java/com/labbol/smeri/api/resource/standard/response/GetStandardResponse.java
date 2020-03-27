package com.labbol.smeri.api.resource.standard.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.resource.standard.support.Standard;
import com.labbol.smeri.api.resource.standard.support.StandardWrapper;

public class GetStandardResponse extends AbstractAPIResponse{

	private Standard standard;
	
	public GetStandardResponse(HttpResponse httpResponse) {
		super(httpResponse);
		if(isSuccess()) {
			standard = gson.fromJson(httpResponse.getContentStr(), StandardWrapper.class).getStandard();
		}
	}
	
	public Standard getStandard() {
		return standard;
	}

}
