package com.labbol.smeri.api.entrust.entrust.request;

import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.smeri.api.entrust.entrust.response.QueryEntrustAnnexResponse;

/**
 * @author PengFei
 */
public class QueryEntrustAnnexRequest extends AbstractQueryAPIRequest<QueryEntrustAnnexResponse> {

	public QueryEntrustAnnexRequest() {
		super("/v1.0/service_entrust/queryEntrustAnnex", "POST");
	}

	@Override
	public Class<QueryEntrustAnnexResponse> getResponseClass() {
		return QueryEntrustAnnexResponse.class;
	}

}
