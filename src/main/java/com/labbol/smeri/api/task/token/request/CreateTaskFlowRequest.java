/**
 * 
 */
package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.CreateTaskFlowResponse;
import com.labbol.smeri.api.task.token.support.TaskFlow;
import com.labbol.smeri.api.task.token.support.TaskFlowWrapper;

/**
 * @author PengFei
 * @since 1.0.20
 */
public class CreateTaskFlowRequest extends AbstractAPIRequest<CreateTaskFlowResponse>{

	private TaskFlow taskFlow;
	
	// 创建检测任务
	public static final String []CREATE_TASKFLOW_NOT_EMPTY_FIELD = {
			"flowName", "flowState", "flowIdentity", "executors", "sender", "creator", "updator", "state"
	};
	
	public CreateTaskFlowRequest() {
		super("/v1.0/service_task/createTaskFlow", "POST");
	}

	@Override
	public Class<CreateTaskFlowResponse> getResponseClass() {
		return CreateTaskFlowResponse.class;
	}
	
	public TaskFlow getTaskFlow() {
		return taskFlow;
	}

	public void setTaskFlow(TaskFlow taskFlow) {
		this.taskFlow = taskFlow;
		try {
			httpRequest.setContentStr(gson.toJson(new TaskFlowWrapper(taskFlow)));		
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkBeanFieldNotEmpty(taskFlow, CREATE_TASKFLOW_NOT_EMPTY_FIELD);
	}

}
