/**
 * 
 */
package com.labbol.smeri.api.resource.employee.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.resource.employee.support.Employee;
import com.labbol.smeri.api.resource.employee.support.EmployeeWrapper;

public class GetEmployeeResponse extends AbstractAPIResponse{

	private Employee employee;

	public GetEmployeeResponse(HttpResponse httpResponse) {
		super(httpResponse);
		if(isSuccess()) {
			employee = gson.fromJson(httpResponse.getContentStr(), EmployeeWrapper.class).getEmployee();
		}
	}

	public Employee getEmployee() {
		return employee;
	}

}
