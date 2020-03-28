package com.labbol.smeri.api.entrust.entrust.request;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.CopyEntrustResponse;

public class CopyEntrustRequest extends AbstractAPIRequest<CopyEntrustResponse> {

	private String entrustId;
	
	private String creator;
	
	private String updator;
	
	public CopyEntrustRequest() {
		super("/v1.0/service_entrust/copyEntrust", "PUT");
	}

	@Override
	public Class<CopyEntrustResponse> getResponseClass() {
		return CopyEntrustResponse.class;
	}

	public String getEntrustId() {
		return entrustId;
	}

	public void setEntrustId(String entrustId) {
		this.entrustId = entrustId;
		httpRequest.addParam("entrustId", entrustId);
	}

	public String getCreator() {
		return creator;
	}

	public String getUpdator() {
		return updator;
	}
	
	public void setCreatorAndUpdator(String creator,String updator) {
		this.creator = creator;
		this.updator = updator;
		Map<String,Object> params = new HashMap<String,Object>(2);
		Map<String,Object> entrust = new HashMap<String,Object>(2);
		entrust.put("creator", creator);
		entrust.put("updator", updator);
		params.put("entrust", entrust);
		try {
			httpRequest.setContentStr(gson.toJson(params));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(entrustId, "entrustId");
	}
	
}
