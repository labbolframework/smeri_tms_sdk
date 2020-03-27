/**
 * 
 */
package com.labbol.smeri.api.entrust.entrust.support;

/**
 * @author PengFei
 *
 */
public class EntrustWrapper {

	private Entrust entrust;

	public EntrustWrapper() {}
	
	public EntrustWrapper(Entrust entrust) {
		this.entrust = entrust;
	}

	public Entrust getEntrust() {
		return entrust;
	}

	public void setEntrust(Entrust entrust) {
		this.entrust = entrust;
	}
	
}
