/**
 * 
 */
package com.labbol.smeri.api.task.token.support;

/**
 * @author PengFei
 *
 */
public class TokenProjectWrapper {

	private TokenProject tokenProject;

	public TokenProjectWrapper() {}
	
	public TokenProjectWrapper(TokenProject tokenProject) {
		this.tokenProject = tokenProject;
	}

	public TokenProject getTokenProject() {
		return tokenProject;
	}

	public void setTokenProject(TokenProject tokenProject) {
		this.tokenProject = tokenProject;
	}
	
}
