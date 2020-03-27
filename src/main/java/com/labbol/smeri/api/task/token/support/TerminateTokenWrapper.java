/**
 * 
 */
package com.labbol.smeri.api.task.token.support;

/**
 * @author PengFei
 *
 */
public class TerminateTokenWrapper {

	private TerminateToken terminateToken;

	public TerminateTokenWrapper() {}
	
	public TerminateTokenWrapper(TerminateToken terminateToken) {
		this.terminateToken = terminateToken;
	}

	public TerminateToken getTerminateToken() {
		return terminateToken;
	}

	public void setTerminateToken(TerminateToken terminateToken) {
		this.terminateToken = terminateToken;
	}
	
}
