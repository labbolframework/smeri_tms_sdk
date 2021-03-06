package com.labbol.smeri.api.resource.device.request;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.api.support.request.QueryAPIRequest;
import com.labbol.api.support.request.queryinfo.QueryFilterInfo;
import com.labbol.smeri.api.resource.device.response.QueryDeviceBySampleClassResponse;

public class QueryDeviceBySampleClassRequest extends AbstractQueryAPIRequest<QueryDeviceBySampleClassResponse>{

	private String MUST_QUERY_FILTER_FIELD = "projectId";

	public QueryDeviceBySampleClassRequest() {
		super("/V1.0/service_resource/queryDeviceBySampleClass", "POST");
	}

	@Override
	public Class<QueryDeviceBySampleClassResponse> getResponseClass() {
		return QueryDeviceBySampleClassResponse.class;
	}

	@Override
	public QueryAPIRequest<QueryDeviceBySampleClassResponse> addQueryFilterInfo(QueryFilterInfo queryFilterInfo) {
		String fieldName = queryFilterInfo.getFieldName();
		if( !fieldName.equalsIgnoreCase(MUST_QUERY_FILTER_FIELD) ) {
			throw new UnsupportedOperationException(getApiMethodName()+"The interface does not support passing in query parameters other than "+MUST_QUERY_FILTER_FIELD+"");
		}
		return super.addQueryFilterInfo(queryFilterInfo);
	}

	@Override
	public void check() throws APIRuleException {
		super.check();
		List<QueryFilterInfo> filters = getQueryInfo().getFilters();
		if(CollectionUtils.isEmpty(filters)) {
			throw new APIRuleException("40",getApiMethodName()+"The interface must pass in the "+MUST_QUERY_FILTER_FIELD+" query parameter");
		}
	}

}
