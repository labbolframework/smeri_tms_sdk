/**
 * 
 */
package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.TaskFlow;

/**
 * @author PengFei
 * @since 1.0.20
 */
public class QueryTaskFlowResponse extends AbstractQueryAPIResponse<TaskFlow>{

	public QueryTaskFlowResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
