/**
 * 
 */
package com.labbol.smeri.api.entrust.feestandard.support;

import java.util.Date;

/**
 * @author PengFei
 */
public class ChangeFeeStandard {

	private String id;
	
	private String entrustId;
	
	private String beforeAmount;
	
	private String afterAmount;
	
	private String changeReason;
	
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

	public String getEntrustId() {
		return entrustId;
	}

	public void setEntrustId(String entrustId) {
		this.entrustId = entrustId;
	}

	public String getBeforeAmount() {
		return beforeAmount;
	}

	public void setBeforeAmount(String beforeAmount) {
		this.beforeAmount = beforeAmount;
	}

	public String getAfterAmount() {
		return afterAmount;
	}

	public void setAfterAmount(String afterAmount) {
		this.afterAmount = afterAmount;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
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
