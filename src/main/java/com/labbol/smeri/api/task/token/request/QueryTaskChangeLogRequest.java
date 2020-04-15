/**
 * 
 */
package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryTaskChangeLogResponse;

/**
 * @author PengFei
 * @since 1.0.23
 */
public class QueryTaskChangeLogRequest extends AbstractQueryAPIRequest<QueryTaskChangeLogResponse>{

	public QueryTaskChangeLogRequest() {
		super("/v1.0/service_task/queryTaskChangeLog", "POST");
	}

	@Override
	public Class<QueryTaskChangeLogResponse> getResponseClass() {
		return QueryTaskChangeLogResponse.class;
	}

}
