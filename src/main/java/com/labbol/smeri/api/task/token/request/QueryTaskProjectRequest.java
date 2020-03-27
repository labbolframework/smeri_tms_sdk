package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTaskProjectResponse;

/**
 * @author PengFei
 */
public class QueryTaskProjectRequest extends AbstractAPIRequest<QueryTaskProjectResponse> {

	public QueryTaskProjectRequest() {
		super("/V1.0/service_task/queryTaskProject", "POST");
	}

	@Override
	public Class<QueryTaskProjectResponse> getResponseClass() {
		return QueryTaskProjectResponse.class;
	}

}
