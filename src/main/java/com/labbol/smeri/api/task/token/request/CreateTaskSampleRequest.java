package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.CreateTaskSampleResponse;
import com.labbol.smeri.api.task.token.support.TokenSample;
import com.labbol.smeri.api.task.token.support.TokenSampleWrapper;

/**
 * @author PengFei
 */
public class CreateTaskSampleRequest extends AbstractAPIRequest<CreateTaskSampleResponse> {

	private TokenSample tokenSample;
	
	private static final String [] TOKEN_SAMPLE_NOT_BLANK_FIELDS = {
			"tokenId","sampleId","tester","planFinishDate",
			"creator","updator","state"
	};
	
	public CreateTaskSampleRequest() {
		super("/v1.0/service_task/createTaskSample", "POST");
	}

	@Override
	public Class<CreateTaskSampleResponse> getResponseClass() {
		return CreateTaskSampleResponse.class;
	}

	public TokenSample getTokenSample() {
		return tokenSample;
	}

	public void setTokenSample(TokenSample tokenSample) {
		this.tokenSample = tokenSample;
		try {
			httpRequest.setContentStr(gson.toJson(new TokenSampleWrapper(tokenSample)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(tokenSample, "tokenSample");
		RequestCheckUtils.checkBeanFieldNotEmpty(tokenSample, TOKEN_SAMPLE_NOT_BLANK_FIELDS);
	}

}
