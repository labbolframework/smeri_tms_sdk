/**
 * 
 */
package com.labbol.smeri.api.resource.standard.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.resource.standard.response.QueryStandardAnnexResponse;

/**
 * @author PengFei
 *
 */
public class QueryStandardAnnexRequest extends AbstractQueryAPIRequest<QueryStandardAnnexResponse> {

	public QueryStandardAnnexRequest() {
		super("/V1.0/service_resource/queryStandardAnnex", "POST");
	}

	@Override
	public Class<QueryStandardAnnexResponse> getResponseClass() {
		return QueryStandardAnnexResponse.class;
	}
	
}
