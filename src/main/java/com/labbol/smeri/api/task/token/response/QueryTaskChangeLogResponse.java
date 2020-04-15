/**
 * 
 */
package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.TokenChangeLog;

/**
 * @author PengFei
 * @since 1.0.23
 */
public class QueryTaskChangeLogResponse extends AbstractQueryAPIResponse<TokenChangeLog>{

	public QueryTaskChangeLogResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
