/**
 * 
 */
package com.labbol.smeri.api.resource.employee.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.employee.response.CreateEmployeeResponse;
import com.labbol.smeri.api.resource.employee.support.Employee;
import com.labbol.smeri.api.resource.employee.support.EmployeeWrapper;

public class CreateEmployeeRequest extends AbstractAPIRequest<CreateEmployeeResponse>{

	private Employee employee;
	
	private static final String [] EMPLOYEE_NOT_BLANK_FIELDS = {
			"fullName","groupId","employeeState","certState",
			"creator","updator","state"
	};

	public CreateEmployeeRequest() {
		super("/v1.0/service_resource/createEmployee", "POST");
	}

	@Override
	public Class<CreateEmployeeResponse> getResponseClass() {
		return CreateEmployeeResponse.class;
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
		RequestCheckUtils.checkNotEmpty(employee, "employee");
		RequestCheckUtils.checkBeanFieldNotEmpty(employee, EMPLOYEE_NOT_BLANK_FIELDS);
	}

}
