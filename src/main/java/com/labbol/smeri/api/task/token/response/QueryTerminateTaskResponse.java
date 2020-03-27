/**
 * 
 */
package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.TerminateToken;

/**
 * @author PengFei
 *
 */
public class QueryTerminateTaskResponse extends AbstractQueryAPIResponse<TerminateToken> {

	public QueryTerminateTaskResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
