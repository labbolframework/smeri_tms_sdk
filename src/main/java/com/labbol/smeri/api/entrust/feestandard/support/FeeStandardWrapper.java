/**
 * 
 */
package com.labbol.smeri.api.entrust.feestandard.support;

/**
 * @author PengFei
 *
 */
public class FeeStandardWrapper {
	
	private FeeStandard feeStandard;

	public FeeStandardWrapper() {}
	
	public FeeStandardWrapper(FeeStandard feeStandard) {
		super();
		this.feeStandard = feeStandard;
	}

	public FeeStandard getFeeStandard() {
		return feeStandard;
	}

	public void setFeeStandard(FeeStandard feeStandard) {
		this.feeStandard = feeStandard;
	}

}
