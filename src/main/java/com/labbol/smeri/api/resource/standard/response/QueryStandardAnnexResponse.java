/**
 * 
 */
package com.labbol.smeri.api.resource.standard.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.resource.standard.support.StandardAnnex;

/**
 * @author PengFei
 *
 */
public class QueryStandardAnnexResponse extends AbstractQueryAPIResponse<StandardAnnex>{

	public QueryStandardAnnexResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
