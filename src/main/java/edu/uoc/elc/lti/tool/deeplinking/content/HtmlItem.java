package edu.uoc.elc.lti.tool.deeplinking.content;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@Getter
@Setter
public class HtmlItem extends Item {
	private static String TYPE = "html";

	/**
	 * HTML fragment to be embedded. The platform is expected to sanitize it against cross-site scripting attacks.
	 */
	private final String html;

	/**
	 * String, plain text to use as the title or heading for content.
	 */
	private String title;

	/**
	 * String, plain text description of the content item intended to be displayed to all users who can access the item.
	 */
	private String text;

	public HtmlItem(String html) {
		super(TYPE);
		this.html = html;
	}

	@Builder
	public HtmlItem(String html, String title, String text) {
		this(html);
		this.title = title;
		this.text = text;
	}
}
