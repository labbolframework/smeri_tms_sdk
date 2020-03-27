/**
 * 
 */
package com.labbol.smeri.api.resource.device.support;

import java.util.Date;

public class DeviceSource {

	private String id;
	
	private String deviceId;
	
	private String sourceUnit;
	
	private String sourceCycle;
	
	private String sourcePlanTime;
	
	private String sourceTime;
	
	private String sourceResult;
	
	private String verificationNo;
	
	private String remark;
	
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

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSourceUnit() {
		return sourceUnit;
	}

	public void setSourceUnit(String sourceUnit) {
		this.sourceUnit = sourceUnit;
	}

	public String getSourceCycle() {
		return sourceCycle;
	}

	public void setSourceCycle(String sourceCycle) {
		this.sourceCycle = sourceCycle;
	}

	public String getSourcePlanTime() {
		return sourcePlanTime;
	}

	public void setSourcePlanTime(String sourcePlanTime) {
		this.sourcePlanTime = sourcePlanTime;
	}

	public String getSourceTime() {
		return sourceTime;
	}

	public void setSourceTime(String sourceTime) {
		this.sourceTime = sourceTime;
	}

	public String getSourceResult() {
		return sourceResult;
	}

	public void setSourceResult(String sourceResult) {
		this.sourceResult = sourceResult;
	}

	public String getVerificationNo() {
		return verificationNo;
	}

	public void setVerificationNo(String verificationNo) {
		this.verificationNo = verificationNo;
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
	
}
