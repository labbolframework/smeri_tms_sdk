package com.labbol.smeri.api.entrust.feestandard.response;

import org.yelong.http.response.HttpResponse;

import com.labbol.api.support.response.AbstractQueryAPIResponse;
import com.labbol.smeri.api.entrust.feestandard.support.ChangeFeeStandard;

/**
 * @author PengFei
 */
public class QueryChangeFeeStandardResponse extends AbstractQueryAPIResponse <ChangeFeeStandard> {

	public QueryChangeFeeStandardResponse(HttpResponse httpResponse) {
		super(httpResponse);
	}

}
