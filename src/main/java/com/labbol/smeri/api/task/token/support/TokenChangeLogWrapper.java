package com.labbol.smeri.api.task.token.support;

/**
 * 
 * @author PengFei
 * @since 1.0.23
 */
public class TokenChangeLogWrapper {

	private TokenChangeLog tokenChangeLog;

	public TokenChangeLogWrapper() {}
	
	public TokenChangeLogWrapper(TokenChangeLog tokenChangeLog) {
		this.tokenChangeLog = tokenChangeLog;
	}
	
	public TokenChangeLog getTokenChangeLog() {
		return tokenChangeLog;
	}

	public void setTokenChangeLog(TokenChangeLog tokenChangeLog) {
		this.tokenChangeLog = tokenChangeLog;
	}
	
}
