package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.entrust.entrust.support.Entrust;
import com.labbol.smeri.api.entrust.entrust.support.EntrustWrapper;

/**
 * @author PengFei
 */
public class GetEntrustResponse extends AbstractAPIResponse {

	private final Entrust entrust;
	
	public GetEntrustResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			entrust = gson.fromJson(httpResponse.getContentStr(), EntrustWrapper.class).getEntrust();
		} else {
			entrust = null;
		}
	}

	public Entrust getEntrust() {
		return entrust;
	}

}
