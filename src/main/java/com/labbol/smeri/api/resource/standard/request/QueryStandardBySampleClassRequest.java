package com.labbol.smeri.api.resource.standard.request;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractQueryAPIRequest;
import com.labbol.api.support.request.QueryAPIRequest;
import com.labbol.api.support.request.queryinfo.QueryFilterInfo;
import com.labbol.smeri.api.resource.standard.response.QueryStandardBySampleClassResponse;

public class QueryStandardBySampleClassRequest extends AbstractQueryAPIRequest<QueryStandardBySampleClassResponse>{

	private String MUST_QUERY_FILTER_FIELD = "sampleClassId";
	
	public QueryStandardBySampleClassRequest() {
		super("/V1.0/service_resource/queryStandardBySampleClass", "POST");
	}

	@Override
	public Class<QueryStandardBySampleClassResponse> getResponseClass() {
		return QueryStandardBySampleClassResponse.class;
	}
	
	@Override
	public QueryAPIRequest<QueryStandardBySampleClassResponse> addQueryFilterInfo(QueryFilterInfo queryFilterInfo) {
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
