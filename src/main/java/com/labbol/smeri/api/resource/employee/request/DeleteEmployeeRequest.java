/**
 * 
 */
package com.labbol.smeri.api.resource.employee.request;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.employee.response.DeleteEmployeeResponse;

public class DeleteEmployeeRequest extends AbstractAPIRequest<DeleteEmployeeResponse> {

	private String employeeId;
	
	public DeleteEmployeeRequest() {
		super("/v1.0/service_resource/deleteEmployee", "DELETE");
	}

	@Override
	public Class<DeleteEmployeeResponse> getResponseClass() {
		return DeleteEmployeeResponse.class;
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
