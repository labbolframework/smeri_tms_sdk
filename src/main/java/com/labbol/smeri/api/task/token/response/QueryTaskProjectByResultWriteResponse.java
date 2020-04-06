/**
 * 
 */
package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.TokenProject;

/**
 * @author PengFei
 * @since 1.0.11
 */
public class QueryTaskProjectByResultWriteResponse extends AbstractQueryAPIResponse<TokenProject>{

	public QueryTaskProjectByResultWriteResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
