/**
 * 
 */
package com.labbol.smeri.api.entrust.feestandard.support;

/**
 * @author PengFei
 *
 */
public class ChangeFeeStandardWrapper {

	private ChangeFeeStandard changeFee;

	public ChangeFeeStandardWrapper() {}
	
	public ChangeFeeStandardWrapper(ChangeFeeStandard changeFee) {
		this.changeFee = changeFee;
	}

	public ChangeFeeStandard getChangeFee() {
		return changeFee;
	}

	public void setChangeFee(ChangeFeeStandard changeFee) {
		this.changeFee = changeFee;
	}
	
}
