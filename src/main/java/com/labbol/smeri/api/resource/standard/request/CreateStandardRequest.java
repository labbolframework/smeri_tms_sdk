/**
 * 
 */
package com.labbol.smeri.api.resource.standard.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.standard.response.CreateStandardResponse;
import com.labbol.smeri.api.resource.standard.support.Standard;
import com.labbol.smeri.api.resource.standard.support.StandardWrapper;

public class CreateStandardRequest extends AbstractAPIRequest<CreateStandardResponse>{

	private Standard standard;

	/**
	 * @since 704所检测业务管理系统服务平台服务规范-资源管理服务分册V1.1.doc
	 * @since 1.0.1 新增 standardState
	 */
	private static final String [] STANDARD_NOT_BLANK_FIELDS = {
			"standardNo","standardName","standardType",
			"standardState",
			"creator","updator","state"};

	public CreateStandardRequest() {
		super("/v1.0/service_resource/createStandard", "POST");
	}

	@Override
	public Class<CreateStandardResponse> getResponseClass() {
		return CreateStandardResponse.class;
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(standard, "standard");
		RequestCheckUtils.checkBeanFieldNotEmpty(standard, STANDARD_NOT_BLANK_FIELDS);
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
		try {
			httpRequest.setContentStr(gson.toJson(new StandardWrapper(standard)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

}
