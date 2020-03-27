package com.labbol.smeri.api.entrust.feestandard.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.feestandard.support.FeeStandard;

/**
 * @author PengFei
 */
public class QueryFeeStandardResponse extends AbstractQueryAPIResponse <FeeStandard> {

	public QueryFeeStandardResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
