package com.labbol.smeri.api.test.orig.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.test.orig.response.CreateOrigModifyLogResponse;
import com.labbol.smeri.api.test.orig.support.OrigModifyLog;
import com.labbol.smeri.api.test.orig.support.OrigModifyLogWrapper;

/**
 * @author PengFei
s */
public class CreateOrigModifyLogRequest extends AbstractAPIRequest<CreateOrigModifyLogResponse>{

	private OrigModifyLog origModifyLog;

	private static final String [] ORIG_MODIFY_LOG_NOT_BLANK_FIELDS = {"tokenId","projectId","modifier","modifyTime","modifyPos",
			"creator","updator","state"};

	public CreateOrigModifyLogRequest() {
		super("/v1.0/service_test/createOrigModifyLog", "POST");
	}

	@Override
	public Class<CreateOrigModifyLogResponse> getResponseClass() {
		return CreateOrigModifyLogResponse.class;
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
		RequestCheckUtils.checkNotEmpty(origModifyLog, "origModifyLog");
		RequestCheckUtils.checkBeanFieldNotEmpty(origModifyLog, ORIG_MODIFY_LOG_NOT_BLANK_FIELDS);
	}

}
