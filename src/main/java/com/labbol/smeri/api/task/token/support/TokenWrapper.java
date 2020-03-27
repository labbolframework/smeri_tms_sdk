/**
 * 
 */
package com.labbol.smeri.api.task.token.support;

/**
 * @author PengFei
 *
 */
public class TokenWrapper {

	private Token token;

	public TokenWrapper() {}
	
	public TokenWrapper(Token token) {
		this.token = token;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}
	
}
