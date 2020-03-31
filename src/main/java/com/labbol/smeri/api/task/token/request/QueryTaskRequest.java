package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTaskResponse;

/**
 * @author PengFei
 */
public class QueryTaskRequest extends AbstractQueryAPIRequest<QueryTaskResponse> {

	public QueryTaskRequest() {
		super("/v1.0/service_task/queryTask", "POST");
	}

	@Override
	public Class<QueryTaskResponse> getResponseClass() {
		return QueryTaskResponse.class;
	}

}
