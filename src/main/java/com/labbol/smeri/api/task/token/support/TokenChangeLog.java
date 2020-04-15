package com.labbol.smeri.api.task.token.support;

import java.util.Date;

/**
 * tb_sm_token_change_log 任务变更记录
 * @author dwayne
 * @since 1.0.23
 */
public class TokenChangeLog {
	
	private String tokenId;
	
	private String changeType;
	
	private Date changeTime;
	
	private String changer;
	
	private String changeReason;
	
	private String lastEntrustState;
	
	private String changerName;

	private String id;
	
	private String creator;
	
	private Date createTime;
	
	private String updator;
	
	private Date updateTime;
	
	private String state;
	
	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public String getChangeType() {
		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}
	public Date getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
	public String getChanger() {
		return changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}
	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}
	public String getLastEntrustState() {
		return lastEntrustState;
	}

	public void setLastEntrustState(String lastEntrustState) {
		this.lastEntrustState = lastEntrustState;
	}

	public String getChangerName() {
		return changerName;
	}

	public void setChangerName(String changerName) {
		this.changerName = changerName;
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
	
}
