/**
 * 
 */
package com.labbol.smeri.api.task.token.support;

/**
 * @author PengFei
 *
 */
public class TokenDeviceWrapper {

	private TokenDevice tokenDevice;
	
	public TokenDeviceWrapper() {}
	
	public TokenDeviceWrapper(TokenDevice tokenDevice) {
		this.tokenDevice = tokenDevice;
	}

	public TokenDevice getTokenDevice() {
		return tokenDevice;
	}

	public void setTokenDevice(TokenDevice tokenDevice) {
		this.tokenDevice = tokenDevice;
	}
	
}