/**
 * 
 */
package com.labbol.smeri.api.task.token.request;

import java.io.UnsupportedEncodingException;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.task.token.response.ModifyTaskFlowResponse;
import com.labbol.smeri.api.task.token.support.TaskFlow;
import com.labbol.smeri.api.task.token.support.TaskFlowWrapper;

/**
 * @author PengFei
 * @since 1.0.20
 */
public class ModifyTaskFlowRequest extends AbstractAPIRequest<ModifyTaskFlowResponse>{

	// 修改检测任务
	public static final String []MODIFY_TASKFLOW_NOT_EMPTY_FIELD = {
			"updator", "state"
	};
	
	private TaskFlow taskFlow;
	
	private String taskFlowId;
	
	public ModifyTaskFlowRequest() {
		super("/v1.0/service_task/modifyTaskFlow", "PUT");
	}

	@Override
	public Class<ModifyTaskFlowResponse> getResponseClass() {
		return ModifyTaskFlowResponse.class;
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
	
	public String getTaskFlowId() {
		return taskFlowId;
	}

	public void setTaskFlowId(String taskFlowId) {
		this.taskFlowId = taskFlowId;
		httpRequest.addParam("taskFlowId", taskFlowId);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(taskFlowId, "taskFlowId");
		RequestCheckUtils.checkBeanFieldNotEmpty(taskFlow, MODIFY_TASKFLOW_NOT_EMPTY_FIELD);
	}

}
