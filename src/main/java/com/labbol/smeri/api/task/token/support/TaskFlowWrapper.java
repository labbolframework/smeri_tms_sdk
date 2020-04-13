/**
 * 
 */
package com.labbol.smeri.api.task.token.support;

/**
 * @author PengFei
 *
 */
public class TaskFlowWrapper {

	private TaskFlow taskFlow;
	
	public TaskFlowWrapper() {}
	
	public TaskFlowWrapper( TaskFlow taskFlow) {
		this.taskFlow = taskFlow;
	}

	public TaskFlow getTaskFlow() {
		return taskFlow;
	}

	public void setTaskFlow(TaskFlow taskFlow) {
		this.taskFlow = taskFlow;
	}
	
}
