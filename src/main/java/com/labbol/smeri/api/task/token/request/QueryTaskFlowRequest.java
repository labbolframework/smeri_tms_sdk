/**
 * 
 */
package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTaskFlowResponse;

/**
 * @author PengFei
 * @since 1.0.20
 */
public class QueryTaskFlowRequest extends AbstractQueryAPIRequest<QueryTaskFlowResponse>{

	public QueryTaskFlowRequest() {
		super("/v1.0/service_task/queryTaskFlow", "PUT");
	}

	@Override
	public Class<QueryTaskFlowResponse> getResponseClass() {
		return QueryTaskFlowResponse.class;
	}

}
