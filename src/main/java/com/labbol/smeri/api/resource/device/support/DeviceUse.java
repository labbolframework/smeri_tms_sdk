/**
 * 
 */
package com.labbol.smeri.api.resource.device.support;

import java.util.Date;

public class DeviceUse {

	private String id;
	
	private String deviceId;
	
	private String useStartTime;
	
	private String useEndTime;
	
	private String operator;
	
	private String beforeUseState;
	
	private String afterUseState;
	
	private String remark;
	
	private String creator;
	
	private Date createTime;
	
	private String updator;
	
	private Date updateTime;
	
	private String state;

	/**
	 * @since 1.0.25
	 */
	private String tokenProjectId;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getUseStartTime() {
		return useStartTime;
	}

	public void setUseStartTime(String useStartTime) {
		this.useStartTime = useStartTime;
	}

	public String getUseEndTime() {
		return useEndTime;
	}

	public void setUseEndTime(String useEndTime) {
		this.useEndTime = useEndTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getBeforeUseState() {
		return beforeUseState;
	}

	public void setBeforeUseState(String beforeUseState) {
		this.beforeUseState = beforeUseState;
	}

	public String getAfterUseState() {
		return afterUseState;
	}

	public void setAfterUseState(String afterUseState) {
		this.afterUseState = afterUseState;
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

	public String getTokenProjectId() {
		return tokenProjectId;
	}

	public void setTokenProjectId(String tokenProjectId) {
		this.tokenProjectId = tokenProjectId;
	}
	
}
