/**
 * 
 */
package com.labbol.smeri.api.entrust.entrust.support;

import java.util.Date;

/**
 * @author PengFei
 *
 */
public class EntrustStandard {

	private String id;
	
	private String entrustId;
	
	private String basisId;
	
	private String basisName;
	
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

	public String getBasisId() {
		return basisId;
	}

	public void setBasisId(String basisId) {
		this.basisId = basisId;
	}

	public String getBasisName() {
		return basisName;
	}

	public void setBasisName(String basisName) {
		this.basisName = basisName;
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
