// Generated by delombok at Fri Jul 28 11:41:52 CEST 2023
package edu.uoc.elc.lti.platform;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author xaracil@uoc.edu
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
	@JsonProperty("context_id")
	private String contextId;
	@JsonProperty("context_label")
	private String contextLabel;
	@JsonProperty("context_title")
	private String contextTitle;
	@JsonProperty("name")
	private String name;
	@JsonProperty("picture")
	private String picture;
	@JsonProperty("given_name")
	private String givenName;
	@JsonProperty("family_name")
	private String familyName;
	@JsonProperty("middle_name")
	private String middleName;
	@JsonProperty("email")
	private String email;
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("lis_person_sourcedid")
	private String lisPersonSourceid;
	@JsonProperty("roles")
	private List<String> roles;

	@java.lang.SuppressWarnings("all")
	public String getContextId() {
		return this.contextId;
	}

	@java.lang.SuppressWarnings("all")
	public String getContextLabel() {
		return this.contextLabel;
	}

	@java.lang.SuppressWarnings("all")
	public String getContextTitle() {
		return this.contextTitle;
	}

	@java.lang.SuppressWarnings("all")
	public String getName() {
		return this.name;
	}

	@java.lang.SuppressWarnings("all")
	public String getPicture() {
		return this.picture;
	}

	@java.lang.SuppressWarnings("all")
	public String getGivenName() {
		return this.givenName;
	}

	@java.lang.SuppressWarnings("all")
	public String getFamilyName() {
		return this.familyName;
	}

	@java.lang.SuppressWarnings("all")
	public String getMiddleName() {
		return this.middleName;
	}

	@java.lang.SuppressWarnings("all")
	public String getEmail() {
		return this.email;
	}

	@java.lang.SuppressWarnings("all")
	public String getUserId() {
		return this.userId;
	}

	@java.lang.SuppressWarnings("all")
	public String getLisPersonSourceid() {
		return this.lisPersonSourceid;
	}

	@java.lang.SuppressWarnings("all")
	public List<String> getRoles() {
		return this.roles;
	}

	@JsonProperty("context_id")
	@java.lang.SuppressWarnings("all")
	public void setContextId(final String contextId) {
		this.contextId = contextId;
	}

	@JsonProperty("context_label")
	@java.lang.SuppressWarnings("all")
	public void setContextLabel(final String contextLabel) {
		this.contextLabel = contextLabel;
	}

	@JsonProperty("context_title")
	@java.lang.SuppressWarnings("all")
	public void setContextTitle(final String contextTitle) {
		this.contextTitle = contextTitle;
	}

	@JsonProperty("name")
	@java.lang.SuppressWarnings("all")
	public void setName(final String name) {
		this.name = name;
	}

	@JsonProperty("picture")
	@java.lang.SuppressWarnings("all")
	public void setPicture(final String picture) {
		this.picture = picture;
	}

	@JsonProperty("given_name")
	@java.lang.SuppressWarnings("all")
	public void setGivenName(final String givenName) {
		this.givenName = givenName;
	}

	@JsonProperty("family_name")
	@java.lang.SuppressWarnings("all")
	public void setFamilyName(final String familyName) {
		this.familyName = familyName;
	}

	@JsonProperty("middle_name")
	@java.lang.SuppressWarnings("all")
	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	@JsonProperty("email")
	@java.lang.SuppressWarnings("all")
	public void setEmail(final String email) {
		this.email = email;
	}

	@JsonProperty("user_id")
	@java.lang.SuppressWarnings("all")
	public void setUserId(final String userId) {
		this.userId = userId;
	}

	@JsonProperty("lis_person_sourcedid")
	@java.lang.SuppressWarnings("all")
	public void setLisPersonSourceid(final String lisPersonSourceid) {
		this.lisPersonSourceid = lisPersonSourceid;
	}

	@JsonProperty("roles")
	@java.lang.SuppressWarnings("all")
	public void setRoles(final List<String> roles) {
		this.roles = roles;
	}
}
