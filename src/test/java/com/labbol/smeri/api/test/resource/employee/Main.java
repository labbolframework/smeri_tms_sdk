/**
 * 
 */
package com.labbol.smeri.api.test.resource.employee;

import java.io.IOException;

import org.yelong.http.client.HttpClient;

import com.labbol.api.support.client.APIClient;
import com.labbol.api.support.client.APIClientFactory;
import com.labbol.api.support.client.DefaultAPIClient;
import com.labbol.api.support.exception.APIException;
import com.labbol.smeri.api.resource.employee.request.GetEmployeeRequest;
import com.labbol.smeri.api.resource.employee.response.GetEmployeeResponse;

/**
 * @author PengFei
 *
 */
public class Main {

	public static final APIClient apiClient = new DefaultAPIClient("http://47.104.68.37:10000/", "torque", "torque_secret");
	
	static {
		HttpClient httpClient = apiClient.getHttpClient();
		httpClient.addHttpRequestInterceptor(x->{
			System.out.println("请求url:"+x.getUrl());
			System.out.println("请求参数："+x.getParams());
			System.out.println("请求headers："+x.getHeaders());
			System.out.println("请求body："+x.getContentStr());
		});
		httpClient.addHttpResponseInterceptor(x->{
			System.out.println("响应状态码："+x.getResponseCode());
			System.out.println("响应headers："+x.getHeaders());
			System.out.println("响应body："+x.getContentStr());
		});
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws APIException 
	 */
	public static void main(String[] args) throws APIException, IOException {
		employeeGet();
	}
	
	public static final void employeeGet() throws APIException, IOException {
		GetEmployeeRequest request = new GetEmployeeRequest();
		request.setEmployeeId("132");
		GetEmployeeResponse response = apiClient.execute(request);
		System.out.println(response.getEmployee().getAge());
	}
	

}
