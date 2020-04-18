/**
 * 
 */
package com.labbol.smeri.api.resource.employee.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.employee.response.ModifyEmployeeResponse;
import com.labbol.smeri.api.resource.employee.support.Employee;
import com.labbol.smeri.api.resource.employee.support.EmployeeWrapper;

public class ModifyEmployeeRequest extends AbstractAPIRequest<ModifyEmployeeResponse> {

	private String employeeId;

	private Employee employee;

	private static final String [] EMPLOYEE_NOT_BLANK_FIELDS = {
			"updator","state"
	};

	public ModifyEmployeeRequest() {
		super("/v1.0/service_resource/modifyEmployee", "PUT");
	}

	@Override
	public Class<ModifyEmployeeResponse> getResponseClass() {
		return ModifyEmployeeResponse.class;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
		httpRequest.addParam("employeeId", employeeId);
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
		try {
			httpRequest.setContentStr(gson.toJson(new EmployeeWrapper(employee)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(employeeId, "employeeId");
		RequestCheckUtils.checkNotEmpty(employee, "employee");
		RequestCheckUtils.checkBeanFieldNotEmpty(employee, EMPLOYEE_NOT_BLANK_FIELDS);
	}


}
