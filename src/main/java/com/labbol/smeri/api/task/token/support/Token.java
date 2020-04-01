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
public class Token {

	private String id;
	
	private String entrustId;
	
	private String tokenSubject;
	
	private String builder;
	
	private String buildTime;
	
	private String tokenState;
	
	private String groupId;
	
	private String standardState;
	
	private String remark;
	
	private String creator;
	
	private Date createTime;
	
	private String updator;
	
	private Date updateTime;
	
	private String state;

	/**
	 * @since 1.0.10
	 */
	private List<TokenProject> tokenProjectList;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEntrustId() {
		return entrustId;
	}

	public void setEntrustId(String entrustId) {
		this.entrustId = entrustId;
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

	public String getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
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

	public String getStandardState() {
		return standardState;
	}

	public void setStandardState(String standardState) {
		this.standardState = standardState;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public List<TokenProject> getTokenProjectList() {
		return tokenProjectList;
	}

	public void setTokenProjectList(List<TokenProject> tokenProjectList) {
		this.tokenProjectList = tokenProjectList;
	}
	
	
}
