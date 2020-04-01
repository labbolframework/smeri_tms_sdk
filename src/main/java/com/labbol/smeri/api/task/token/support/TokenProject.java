/**
 * 
 */
package com.labbol.smeri.api.task.token.support;

import java.util.Date;
import java.util.List;

/**
 * @author PengFei
 *
 */
public class TokenProject {

	private String id;
	
	private String tokenId;
	
	private String projectId;
	
	private String projectName;
	
	private String testAddr;
	
	private String testLeader;
	
	private String tester;
	
	private String checker;
	
	private String testTime;
	
	private String finishTime;
	
	private String testFilePath;
	
	private String conclusion;
	
	private String finishState;
	
	private String remark;
	
	private Integer projectOrder;
	
	private String creator;
	
	private Date createTime;
	
	private String updator;
	
	private Date updateTime;
	
	private String state;
	
	/**
	 * @since 1.0.10
	 */
	private List<TokenSample> tokenSampleList;
	
	/**
	 * @since 1.0.10
	 */
	private List<TokenDevice> tokenDeviceList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTestAddr() {
		return testAddr;
	}

	public void setTestAddr(String testAddr) {
		this.testAddr = testAddr;
	}

	public String getTestLeader() {
		return testLeader;
	}

	public void setTestLeader(String testLeader) {
		this.testLeader = testLeader;
	}

	public String getTester() {
		return tester;
	}

	public void setTester(String tester) {
		this.tester = tester;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getTestTime() {
		return testTime;
	}

	public void setTestTime(String testTime) {
		this.testTime = testTime;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getTestFilePath() {
		return testFilePath;
	}

	public void setTestFilePath(String testFilePath) {
		this.testFilePath = testFilePath;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getFinishState() {
		return finishState;
	}

	public void setFinishState(String finishState) {
		this.finishState = finishState;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getProjectOrder() {
		return projectOrder;
	}

	public void setProjectOrder(Integer projectOrder) {
		this.projectOrder = projectOrder;
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

	public List<TokenSample> getTokenSampleList() {
		return tokenSampleList;
	}

	public void setTokenSampleList(List<TokenSample> tokenSampleList) {
		this.tokenSampleList = tokenSampleList;
	}

	public List<TokenDevice> getTokenDeviceList() {
		return tokenDeviceList;
	}

	public void setTokenDeviceList(List<TokenDevice> tokenDeviceList) {
		this.tokenDeviceList = tokenDeviceList;
	}
	
}
