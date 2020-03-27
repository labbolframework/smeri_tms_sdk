/**
 * 
 */
package com.labbol.smeri.api.resource.employee.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.resource.employee.response.QueryEmployeeResponse;

public class QueryEmployeeRequest extends AbstractQueryAPIRequest<QueryEmployeeResponse> {

	public QueryEmployeeRequest() {
		super("/v1.0/service_resource/queryEmployee", "POST");
	}

	@Override
	public Class<QueryEmployeeResponse> getResponseClass() {
		return QueryEmployeeResponse.class;
	}

}
