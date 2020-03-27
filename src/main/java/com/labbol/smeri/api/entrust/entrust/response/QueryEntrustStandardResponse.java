package com.labbol.smeri.api.entrust.entrust.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.entrust.support.EntrustStandard;

/**
 * @author PengFei
 */
public class QueryEntrustStandardResponse extends AbstractQueryAPIResponse <EntrustStandard> {

	public QueryEntrustStandardResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
