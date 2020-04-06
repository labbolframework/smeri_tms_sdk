/**
 * 
 */
package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTaskProjectByResultWriteResponse;

/**
 * @author PengFei
 * @since 1.0.11
 */
public class QueryTaskProjectByResultWriteRequest extends AbstractQueryAPIRequest<QueryTaskProjectByResultWriteResponse>{

	public QueryTaskProjectByResultWriteRequest() {
		super("/v1.0/service_task/queryTaskProjectByResultWrite", "POST");
	}

	@Override
	public Class<QueryTaskProjectByResultWriteResponse> getResponseClass() {
		return QueryTaskProjectByResultWriteResponse.class;
	}

}
