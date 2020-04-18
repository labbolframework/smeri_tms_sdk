package com.labbol.smeri.api.test.orig.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.orig.response.ModifyOrigModifyLogResponse;
import com.labbol.smeri.api.test.orig.support.OrigModifyLog;
import com.labbol.smeri.api.test.orig.support.OrigModifyLogWrapper;

/**
 * @author PengFei
 */
public class ModifyOrigModifyLogRequest extends AbstractAPIRequest<ModifyOrigModifyLogResponse>{

	private String origModifyLogId;
	
	private OrigModifyLog origModifyLog;

	private static final String [] ORIG_MODIFY_LOG_NOT_BLANK_FIELDS = {
			"updator","state"
	};
	
	public ModifyOrigModifyLogRequest() {
		super("/v1.0/service_test/modifyOrigModifyLog", "PUT");
	}

	@Override
	public Class<ModifyOrigModifyLogResponse> getResponseClass() {
		return ModifyOrigModifyLogResponse.class;
	}
	
	public String getOrigModifyLogId() {
		return origModifyLogId;
	}

	public void setOrigModifyLogId(String origModifyLogId) {
		this.origModifyLogId = origModifyLogId;
		httpRequest.addParam("origModifyLogId", origModifyLogId);
	}

	public OrigModifyLog getOrigModifyLog() {
		return origModifyLog;
	}

	public void setOrigModifyLog(OrigModifyLog origModifyLog) {
		this.origModifyLog = origModifyLog;
		try {
			httpRequest.setContentStr(gson.toJson(new OrigModifyLogWrapper(origModifyLog)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(origModifyLogId, "origModifyLogId");
		RequestCheckUtils.checkNotEmpty(origModifyLog, "origModifyLog");
		RequestCheckUtils.checkBeanFieldNotEmpty(origModifyLog, ORIG_MODIFY_LOG_NOT_BLANK_FIELDS);
	}

}
