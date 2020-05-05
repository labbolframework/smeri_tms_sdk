package com.labbol.smeri.api.task.token.support;


import java.util.Date;

/**
 * tb_sm_task_flow 任务流程记录
 * @author dwyane
 * @since 1.0.20
 */
public class TaskFlow{

	private String flowName;

	private String flowState;

	/**
	 * @since 1.0.27
	 */
	private String flowCode;

	private String flowIdentity;

	private String executor;

	private String sender;

	private Date beginTime;

	private Date endTime;

	private String approveResult;

	private String approveRemark;

	private String extendField1;

	private String extendField2;

	private String extendField3;

	private String extendField4;

	private String extendField5;

	private String executors;

	private String executorName;

	private String senderName;

	private String entrustId;

	private String entrustNo;

	private String customerName;

	private String tokenId;

	private String tokenNo;

	private String tokenSubject;

	private String builder;

	private String builderName;

	private String tokenState;

	private String groupId;

	private String groupName;

	private String remark;

	private String id;

	private String creator;

	private Date createTime;

	private String updator;

	private Date updateTime;

	private String state;


	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}
	public String getFlowState() {
		return flowState;
	}

	public void setFlowState(String flowState) {
		this.flowState = flowState;
	}
	public String getFlowIdentity() {
		return flowIdentity;
	}

	public void setFlowIdentity(String flowIdentity) {
		this.flowIdentity = flowIdentity;
	}
	public String getExecutor() {
		return executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
	}
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}
	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getApproveResult() {
		return approveResult;
	}

	public void setApproveResult(String approveResult) {
		this.approveResult = approveResult;
	}
	public String getApproveRemark() {
		return approveRemark;
	}

	public void setApproveRemark(String approveRemark) {
		this.approveRemark = approveRemark;
	}
	public String getExtendField1() {
		return extendField1;
	}

	public void setExtendField1(String extendField1) {
		this.extendField1 = extendField1;
	}
	public String getExtendField2() {
		return extendField2;
	}

	public void setExtendField2(String extendField2) {
		this.extendField2 = extendField2;
	}
	public String getExtendField3() {
		return extendField3;
	}

	public void setExtendField3(String extendField3) {
		this.extendField3 = extendField3;
	}
	public String getExtendField4() {
		return extendField4;
	}

	public void setExtendField4(String extendField4) {
		this.extendField4 = extendField4;
	}
	public String getExtendField5() {
		return extendField5;
	}

	public void setExtendField5(String extendField5) {
		this.extendField5 = extendField5;
	}

	public String getExecutors() {
		return executors;
	}

	public void setExecutors(String executors) {
		this.executors = executors;
	}

	public String getExecutorName() {
		return executorName;
	}

	public void setExecutorName(String executorName) {
		this.executorName = executorName;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getEntrustId() {
		return entrustId;
	}

	public void setEntrustId(String entrustId) {
		this.entrustId = entrustId;
	}

	public String getEntrustNo() {
		return entrustNo;
	}

	public void setEntrustNo(String entrustNo) {
		this.entrustNo = entrustNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getTokenNo() {
		return tokenNo;
	}

	public void setTokenNo(String tokenNo) {
		this.tokenNo = tokenNo;
	}

	public String getTokenSubject() {
		return tokenSubject;
	}

	public void setTokenSubject(String tokenSubject) {
		this.tokenSubject = tokenSubject;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getBuilderName() {
		return builderName;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

	public String getTokenState() {
		return tokenState;
	}

	public void setTokenState(String tokenState) {
		this.tokenState = tokenState;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFlowCode() {
		return flowCode;
	}

	public void setFlowCode(String flowCode) {
		this.flowCode = flowCode;
	}

}
