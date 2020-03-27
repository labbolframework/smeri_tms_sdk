/**
 * 
 */
package com.labbol.smeri.api.entrust.entrust.support;

/**
 * @author PengFei
 *
 */
public class ChangeEntrustWrapper {

	private ChangeEntrust changeEntrust;

	public ChangeEntrustWrapper() {}
	
	public ChangeEntrustWrapper(ChangeEntrust changeEntrust) {
		super();
		this.changeEntrust = changeEntrust;
	}

	public ChangeEntrust getChangeEntrust() {
		return changeEntrust;
	}

	public void setChangeEntrust(ChangeEntrust changeEntrust) {
		this.changeEntrust = changeEntrust;
	}
	
}
