package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.entrust.support.EntrustAnnex;

/**
 * @author PengFei
 */
public class QueryEntrustAnnexResponse extends AbstractQueryAPIResponse <EntrustAnnex> {

	public QueryEntrustAnnexResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
