package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTaskResponse;

/**
 * @author PengFei
 */
public class QueryTaskRequest extends AbstractAPIRequest<QueryTaskResponse> {

	public QueryTaskRequest() {
		super("/v1.0/service_task/queryTask", "POST");
	}

	@Override
	public Class<QueryTaskResponse> getResponseClass() {
		return QueryTaskResponse.class;
	}

}
