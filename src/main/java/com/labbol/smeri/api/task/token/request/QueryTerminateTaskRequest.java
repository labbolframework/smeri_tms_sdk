/**
 * 
 */
package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTerminateTaskResponse;

/**
 * @author PengFei
 */
public class QueryTerminateTaskRequest extends AbstractQueryAPIRequest<QueryTerminateTaskResponse> {

	public QueryTerminateTaskRequest() {
		super("/V1.0/service_task/queryTerminateTask", "POST");
	}

	@Override
	public Class<QueryTerminateTaskResponse> getResponseClass() {
		return QueryTerminateTaskResponse.class;
	}
}
