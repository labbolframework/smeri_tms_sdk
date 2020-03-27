package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTaskSampleResponse;

/**
 * @author PengFei
 */
public class QueryTaskSampleRequest extends AbstractAPIRequest<QueryTaskSampleResponse> {

	public QueryTaskSampleRequest() {
		super("/v1.0/service_task/queryTaskSample", "POST");
	}

	@Override
	public Class<QueryTaskSampleResponse> getResponseClass() {
		return QueryTaskSampleResponse.class;
	}

}
