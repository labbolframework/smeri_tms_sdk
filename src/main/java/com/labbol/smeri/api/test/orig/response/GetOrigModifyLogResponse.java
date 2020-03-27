package com.labbol.smeri.api.test.orig.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.test.orig.support.OrigModifyLog;
import com.labbol.smeri.api.test.orig.support.OrigModifyLogWrapper;

/**
 * @author PengFei
 */
public class GetOrigModifyLogResponse extends AbstractAPIResponse{

	private final OrigModifyLog origModifyLog;
	
	public GetOrigModifyLogResponse(HttpResponse arg0) {
		super(arg0);
		if(isSuccess()) {
			origModifyLog = gson.fromJson(httpResponse.getContentStr(), OrigModifyLogWrapper.class).getOrigModifyLog();
		} else {
			origModifyLog = null;
		}
	}

	public OrigModifyLog getOrigModifyLog() {
		return origModifyLog;
	}

}
