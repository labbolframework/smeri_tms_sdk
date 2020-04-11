/**
 * 
 */
package com.labbol.smeri.api.task.token.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.task.token.response.QueryProjectByTokenWriteResponse;

/**
 * @author PengFei
 *
 */
public class QueryProjectByTokenWriteRequest extends AbstractQueryAPIRequest<QueryProjectByTokenWriteResponse>{

	public QueryProjectByTokenWriteRequest() {
		super("/v1.0/service_task/queryProjectByTokenWrite", "POST");
	}

	@Override
	public Class<QueryProjectByTokenWriteResponse> getResponseClass() {
		return QueryProjectByTokenWriteResponse.class;
	}

}
