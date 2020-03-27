/**
 * 
 */
package com.labbol.smeri.api.resource.employee.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.employee.response.GetEmployeeResponse;

public class GetEmployeeRequest extends AbstractAPIRequest<GetEmployeeResponse> {

	private String employeeId;
	
	public GetEmployeeRequest() {
		super("/v1.0/service_resource/getEmployee", "GET");
	}

	@Override
	public Class<GetEmployeeResponse> getResponseClass() {
		return GetEmployeeResponse.class;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
		httpRequest.addParam("employeeId", employeeId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(employeeId, "employeeId");
	}

}
