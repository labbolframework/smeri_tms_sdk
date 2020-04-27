/**
 * 
 */
package com.labbol.smeri.api.task.token.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractAPIResponse;
import com.labbol.smeri.api.task.token.support.TokenProject;
import com.labbol.smeri.api.task.token.support.TokenProjectWrapper;

/**
 * @author PengFei
 *
 */
public class GetTaskProjectResponse extends AbstractAPIResponse{

	private final TokenProject tokenProject;
	
	public GetTaskProjectResponse(HttpResponse httpResponse) {
		super(httpResponse);
		if(isSuccess()) {
			tokenProject = gson.fromJson(httpResponse.getContentStr(), TokenProjectWrapper.class).getTokenProject();
		} else {
			tokenProject = null;
		}
	}

	public TokenProject getTokenProject() {
		return tokenProject;
	}

}
