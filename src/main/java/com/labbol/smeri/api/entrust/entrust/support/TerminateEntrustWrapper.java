/**
 * 
 */
package com.labbol.smeri.api.entrust.entrust.support;

/**
 * @author PengFei
 *
 */
public class TerminateEntrustWrapper {

	private TerminateEntrust terminateEntrust;

	public TerminateEntrustWrapper() {}
	
	public TerminateEntrustWrapper(TerminateEntrust terminateEntrust) {
		super();
		this.terminateEntrust = terminateEntrust;
	}

	public TerminateEntrust getTerminateEntrust() {
		return terminateEntrust;
	}

	public void setTerminateEntrust(TerminateEntrust terminateEntrust) {
		this.terminateEntrust = terminateEntrust;
	}
	
}
