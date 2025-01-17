// Generated by delombok at Mon Jul 17 13:40:01 CEST 2023
package edu.uoc.elc.lti.tool.oidc;

import edu.uoc.lti.oidc.OIDCLaunchSession;

/**
 * @author xaracil@uoc.edu
 */
public class InMemoryOIDCLaunchSession implements OIDCLaunchSession {
	private String state;
	private String nonce;
	private String targetLinkUri;
	private String clientId;
	private String deploymentId;

	@java.lang.SuppressWarnings("all")
	public String getState() {
		return this.state;
	}

	@java.lang.SuppressWarnings("all")
	public String getNonce() {
		return this.nonce;
	}

	@java.lang.SuppressWarnings("all")
	public String getTargetLinkUri() {
		return this.targetLinkUri;
	}

	@java.lang.SuppressWarnings("all")
	public String getClientId() {
		return this.clientId;
	}

	@java.lang.SuppressWarnings("all")
	public String getDeploymentId() {
		return this.deploymentId;
	}

	@java.lang.SuppressWarnings("all")
	public void setState(final String state) {
		this.state = state;
	}

	@java.lang.SuppressWarnings("all")
	public void setNonce(final String nonce) {
		this.nonce = nonce;
	}

	@java.lang.SuppressWarnings("all")
	public void setTargetLinkUri(final String targetLinkUri) {
		this.targetLinkUri = targetLinkUri;
	}

	@java.lang.SuppressWarnings("all")
	public void setClientId(final String clientId) {
		this.clientId = clientId;
	}

	@java.lang.SuppressWarnings("all")
	public void setDeploymentId(final String deploymentId) {
		this.deploymentId = deploymentId;
	}
}
