package com.labbol.smeri.api.entrust.entrust.support;

import java.util.Date;
import java.util.List;

/**
 * @author PengFei
 */
public class Entrust {

	private String id;
	
	private String entrustNo;
	
	private String customerId;
	
	private String customerName;
	
	private String customerAddr;
	
	private String contactName;
	
	private String tel;
	
	private String fax;
	
	private String testType;
	
	private String needPerfTest;
	
	private String monRequire;
	
	private String poaStandard;
	
	private String poaStandardRemark;
	
	private String testSpecialRequire;
	
	private String sampleReceiveDate;
	
	private String requireFinishDate;
	
	private String needReport;
	
	private String reportType;
	
	private String reportSendType;
	
	private String otherReportSendType;
	
	private String disposeMode;
	
	private String testFee;
	
	private String testFeeChinese;
	
	private String payMode;
	
	private String otherPayMode;
	
	private String sampleProps;
	
	private String taskClass;
	
	private String taskContent;
	
	private String taskExecuteAddress;
	
	private String poaStandardProvWay;
	
	private String poaStandardContent;
	
	private String reportCustomerType;
	
	private String reportCustomerName;
	
	private String reportNo;
	
	private String gfReport;
	
	private String protectInfo;
	
	private String otherRequirements;
	
	private String sampleCheckResult;
	
	private String sampleCheckRemark;
	
	private String needUrgent;
	
	private String haveAttach;
	
	private String attachNameAndNum;
	
	private String haveTechInfo;
	
	private String techInfoNameAndNum;
	
	private String groupId;
	
	private String remark;
	
	private String poaState;
	
	private String needReview;
	
	private String reviewer;
	
	private String reviewState;
	
	private String creator;
	
	private Date createTime;
	
	private String updator;
	
	private Date updateTime;
	
	private String state;

	private String postCode;
	
	private String otherReportType;
	
	/**
	 * @since 704所检测业务管理系统服务平台服务规范-委托及样品管理服务分册V1.1.doc
	 * @since v1.0.1
	 */
	private String tempEntrustId;
	
	/**
	 * @since 704所检测业务管理系统服务平台服务规范-委托及样品管理服务分册V1.1.doc
	 * @since v1.0.1
	 */
	private List<String> standardIdList;
	
	/**
	 * @since v1.0.15
	 */
	private String entrustFilePath;
	
	/**
	 * @since v1.0.15
	 */
	private String entrustFileState;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddr() {
		return customerAddr;
	}

	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getNeedPerfTest() {
		return needPerfTest;
	}

	public void setNeedPerfTest(String needPerfTest) {
		this.needPerfTest = needPerfTest;
	}

	public String getMonRequire() {
		return monRequire;
	}

	public void setMonRequire(String monRequire) {
		this.monRequire = monRequire;
	}

	public String getPoaStandard() {
		return poaStandard;
	}

	public void setPoaStandard(String poaStandard) {
		this.poaStandard = poaStandard;
	}

	public String getPoaStandardRemark() {
		return poaStandardRemark;
	}

	public void setPoaStandardRemark(String poaStandardRemark) {
		this.poaStandardRemark = poaStandardRemark;
	}

	public String getTestSpecialRequire() {
		return testSpecialRequire;
	}

	public void setTestSpecialRequire(String testSpecialRequire) {
		this.testSpecialRequire = testSpecialRequire;
	}

	public String getSampleReceiveDate() {
		return sampleReceiveDate;
	}

	public void setSampleReceiveDate(String sampleReceiveDate) {
		this.sampleReceiveDate = sampleReceiveDate;
	}

	public String getRequireFinishDate() {
		return requireFinishDate;
	}

	public void setRequireFinishDate(String requireFinishDate) {
		this.requireFinishDate = requireFinishDate;
	}

	public String getNeedReport() {
		return needReport;
	}

	public void setNeedReport(String needReport) {
		this.needReport = needReport;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getReportSendType() {
		return reportSendType;
	}

	public void setReportSendType(String reportSendType) {
		this.reportSendType = reportSendType;
	}

	public String getOtherReportSendType() {
		return otherReportSendType;
	}

	public void setOtherReportSendType(String otherReportSendType) {
		this.otherReportSendType = otherReportSendType;
	}

	public String getDisposeMode() {
		return disposeMode;
	}

	public void setDisposeMode(String disposeMode) {
		this.disposeMode = disposeMode;
	}

	public String getTestFee() {
		return testFee;
	}

	public void setTestFee(String testFee) {
		this.testFee = testFee;
	}

	public String getTestFeeChinese() {
		return testFeeChinese;
	}

	public void setTestFeeChinese(String testFeeChinese) {
		this.testFeeChinese = testFeeChinese;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getOtherPayMode() {
		return otherPayMode;
	}

	public void setOtherPayMode(String otherPayMode) {
		this.otherPayMode = otherPayMode;
	}

	public String getSampleProps() {
		return sampleProps;
	}

	public void setSampleProps(String sampleProps) {
		this.sampleProps = sampleProps;
	}

	public String getTaskClass() {
		return taskClass;
	}

	public void setTaskClass(String taskClass) {
		this.taskClass = taskClass;
	}

	public String getTaskContent() {
		return taskContent;
	}

	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}

	public String getTaskExecuteAddress() {
		return taskExecuteAddress;
	}

	public void setTaskExecuteAddress(String taskExecuteAddress) {
		this.taskExecuteAddress = taskExecuteAddress;
	}

	public String getPoaStandardProvWay() {
		return poaStandardProvWay;
	}

	public void setPoaStandardProvWay(String poaStandardProvWay) {
		this.poaStandardProvWay = poaStandardProvWay;
	}

	public String getPoaStandardContent() {
		return poaStandardContent;
	}

	public void setPoaStandardContent(String poaStandardContent) {
		this.poaStandardContent = poaStandardContent;
	}

	public String getReportCustomerType() {
		return reportCustomerType;
	}

	public void setReportCustomerType(String reportCustomerType) {
		this.reportCustomerType = reportCustomerType;
	}

	public String getReportCustomerName() {
		return reportCustomerName;
	}

	public void setReportCustomerName(String reportCustomerName) {
		this.reportCustomerName = reportCustomerName;
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getGfReport() {
		return gfReport;
	}

	public void setGfReport(String gfReport) {
		this.gfReport = gfReport;
	}

	public String getProtectInfo() {
		return protectInfo;
	}

	public void setProtectInfo(String protectInfo) {
		this.protectInfo = protectInfo;
	}

	public String getOtherRequirements() {
		return otherRequirements;
	}

	public void setOtherRequirements(String otherRequirements) {
		this.otherRequirements = otherRequirements;
	}

	public String getSampleCheckResult() {
		return sampleCheckResult;
	}

	public void setSampleCheckResult(String sampleCheckResult) {
		this.sampleCheckResult = sampleCheckResult;
	}

	public String getSampleCheckRemark() {
		return sampleCheckRemark;
	}

	public void setSampleCheckRemark(String sampleCheckRemark) {
		this.sampleCheckRemark = sampleCheckRemark;
	}

	public String getNeedUrgent() {
		return needUrgent;
	}

	public void setNeedUrgent(String needUrgent) {
		this.needUrgent = needUrgent;
	}

	public String getHaveAttach() {
		return haveAttach;
	}

	public void setHaveAttach(String haveAttach) {
		this.haveAttach = haveAttach;
	}

	public String getAttachNameAndNum() {
		return attachNameAndNum;
	}

	public void setAttachNameAndNum(String attachNameAndNum) {
		this.attachNameAndNum = attachNameAndNum;
	}

	public String getHaveTechInfo() {
		return haveTechInfo;
	}

	public void setHaveTechInfo(String haveTechInfo) {
		this.haveTechInfo = haveTechInfo;
	}

	public String getTechInfoNameAndNum() {
		return techInfoNameAndNum;
	}

	public void setTechInfoNameAndNum(String techInfoNameAndNum) {
		this.techInfoNameAndNum = techInfoNameAndNum;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPoaState() {
		return poaState;
	}

	public void setPoaState(String poaState) {
		this.poaState = poaState;
	}

	public String getNeedReview() {
		return needReview;
	}

	public void setNeedReview(String needReview) {
		this.needReview = needReview;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getReviewState() {
		return reviewState;
	}

	public void setReviewState(String reviewState) {
		this.reviewState = reviewState;
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

	public String getTempEntrustId() {
		return tempEntrustId;
	}

	public void setTempEntrustId(String tempEntrustId) {
		this.tempEntrustId = tempEntrustId;
	}

	public List<String> getStandardIdList() {
		return standardIdList;
	}

	public void setStandardIdList(List<String> standardIdList) {
		this.standardIdList = standardIdList;
	}

	public String getEntrustNo() {
		return entrustNo;
	}

	public void setEntrustNo(String entrustNo) {
		this.entrustNo = entrustNo;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getOtherReportType() {
		return otherReportType;
	}

	public void setOtherReportType(String otherReportType) {
		this.otherReportType = otherReportType;
	}

	public String getEntrustFilePath() {
		return entrustFilePath;
	}

	public void setEntrustFilePath(String entrustFilePath) {
		this.entrustFilePath = entrustFilePath;
	}

	public String getEntrustFileState() {
		return entrustFileState;
	}

	public void setEntrustFileState(String entrustFileState) {
		this.entrustFileState = entrustFileState;
	}
	
}
