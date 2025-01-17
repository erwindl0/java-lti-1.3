// Generated by delombok at Mon Jul 17 13:40:01 CEST 2023
package edu.uoc.elc.lti.tool;

/**
 * @author xaracil@uoc.edu
 */
public enum ScopeEnum {
	AGS_SCOPE_LINE_ITEM("https://purl.imsglobal.org/spec/lti-ags/scope/lineitem"), AGS_SCOPE_LINE_ITEM_READONLY("https://purl.imsglobal.org/spec/lti-ags/scope/lineitem.readonly"), AGS_SCOPE_RESULT("https://purl.imsglobal.org/spec/lti-ags/scope/result.readonly"), AGS_SCOPE_SCORE("https://purl.imsglobal.org/spec/lti-ags/scope/score"), NAMES_AND_ROLES_SCOPE("https://purl.imsglobal.org/spec/lti-nrps/scope/contextmembership.readonly"), CALIPER_SCOPE("https://purl.imsglobal.org/spec/lti-ces/v1p0/scope/send");
	private String scope;

	@java.lang.SuppressWarnings("all")
	public String getScope() {
		return this.scope;
	}

	@java.lang.SuppressWarnings("all")
	private ScopeEnum(final String scope) {
		this.scope = scope;
	}
}
