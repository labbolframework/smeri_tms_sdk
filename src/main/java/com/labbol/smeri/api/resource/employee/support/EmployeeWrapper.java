/**
 * 
 */
package com.labbol.smeri.api.resource.employee.support;

public class EmployeeWrapper {

	private Employee employee;

	public EmployeeWrapper() {
	}
	
	public EmployeeWrapper(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
