/**
 * 
 */
package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.task.token.support.Project;

/**
 * @author PengFei
 *
 */
public class QueryProjectByTokenWriteResponse extends AbstractQueryAPIResponse<Project>{

	public QueryProjectByTokenWriteResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
