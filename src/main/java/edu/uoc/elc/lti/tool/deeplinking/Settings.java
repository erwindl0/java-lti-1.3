// Generated by delombok at Mon Jul 17 13:40:01 CEST 2023
package edu.uoc.elc.lti.tool.deeplinking;

import java.util.List;

/**
 * @author xaracil@uoc.edu
 */
public class Settings {
	private List<String> accept_types;
	private String accept_media_types;
	private List<String> accept_presentation_document_targets;
	private boolean accept_multiple;
	private boolean auto_create;
	private String title;
	private String text;
	private String data;
	private String deep_link_return_url;

	@java.lang.SuppressWarnings("all")
	public List<String> getAccept_types() {
		return this.accept_types;
	}

	@java.lang.SuppressWarnings("all")
	public String getAccept_media_types() {
		return this.accept_media_types;
	}

	@java.lang.SuppressWarnings("all")
	public List<String> getAccept_presentation_document_targets() {
		return this.accept_presentation_document_targets;
	}

	@java.lang.SuppressWarnings("all")
	public boolean isAccept_multiple() {
		return this.accept_multiple;
	}

	@java.lang.SuppressWarnings("all")
	public boolean isAuto_create() {
		return this.auto_create;
	}

	@java.lang.SuppressWarnings("all")
	public String getTitle() {
		return this.title;
	}

	@java.lang.SuppressWarnings("all")
	public String getText() {
		return this.text;
	}

	@java.lang.SuppressWarnings("all")
	public String getData() {
		return this.data;
	}

	@java.lang.SuppressWarnings("all")
	public String getDeep_link_return_url() {
		return this.deep_link_return_url;
	}

	@java.lang.SuppressWarnings("all")
	public void setAccept_types(final List<String> accept_types) {
		this.accept_types = accept_types;
	}

	@java.lang.SuppressWarnings("all")
	public void setAccept_media_types(final String accept_media_types) {
		this.accept_media_types = accept_media_types;
	}

	@java.lang.SuppressWarnings("all")
	public void setAccept_presentation_document_targets(final List<String> accept_presentation_document_targets) {
		this.accept_presentation_document_targets = accept_presentation_document_targets;
	}

	@java.lang.SuppressWarnings("all")
	public void setAccept_multiple(final boolean accept_multiple) {
		this.accept_multiple = accept_multiple;
	}

	@java.lang.SuppressWarnings("all")
	public void setAuto_create(final boolean auto_create) {
		this.auto_create = auto_create;
	}

	@java.lang.SuppressWarnings("all")
	public void setTitle(final String title) {
		this.title = title;
	}

	@java.lang.SuppressWarnings("all")
	public void setText(final String text) {
		this.text = text;
	}

	@java.lang.SuppressWarnings("all")
	public void setData(final String data) {
		this.data = data;
	}

	@java.lang.SuppressWarnings("all")
	public void setDeep_link_return_url(final String deep_link_return_url) {
		this.deep_link_return_url = deep_link_return_url;
	}
}
