/**
 * 
 */
package com.labbol.smeri.api.task.token.support;

import java.util.Date;

/**
 * @author PengFei
 *
 */
public class TokenSample {

	private String id;
	
	private String tokenId;
	
	private String projectId;
	
	private String sampleId;
	
	private String tester;
	
	private String planFinishDate;
	
	private String creator;
	
	private Date createTime;
	
	private String updator;
	
	private Date updateTime;
	
	private String state;

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

	public String getSampleId() {
		return sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}

	public String getTester() {
		return tester;
	}

	public void setTester(String tester) {
		this.tester = tester;
	}

	public String getPlanFinishDate() {
		return planFinishDate;
	}

	public void setPlanFinishDate(String planFinishDate) {
		this.planFinishDate = planFinishDate;
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
	
}
