/**
 * 
 */
package com.labbol.smeri.api.resource.employee.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.resource.employee.support.Employee;

public class QueryEmployeeResponse extends AbstractQueryAPIResponse<Employee>{

	public QueryEmployeeResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
