// Generated by delombok at Fri Jul 28 11:41:52 CEST 2023
package edu.uoc.elc.lti.tool;

import java.util.List;
import java.util.Objects;

/**
 * Universitat Oberta de Catalunya
 * Made for the project lti-13
 */
public class KeySet {
	private String id;
	private List<Key> keys;

	public Key getKey(String kid) {
		return Objects.nonNull(keys) ? keys.stream().filter(key -> key.getId().equals(kid)).findFirst().orElse(null) : null;
	}

	@java.lang.SuppressWarnings("all")
	KeySet(final String id, final List<Key> keys) {
		this.id = id;
		this.keys = keys;
	}


	@java.lang.SuppressWarnings("all")
	public static class KeySetBuilder {
		@java.lang.SuppressWarnings("all")
		private String id;
		@java.lang.SuppressWarnings("all")
		private List<Key> keys;

		@java.lang.SuppressWarnings("all")
		KeySetBuilder() {
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public KeySet.KeySetBuilder id(final String id) {
			this.id = id;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public KeySet.KeySetBuilder keys(final List<Key> keys) {
			this.keys = keys;
			return this;
		}

		@java.lang.SuppressWarnings("all")
		public KeySet build() {
			return new KeySet(this.id, this.keys);
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "KeySet.KeySetBuilder(id=" + this.id + ", keys=" + this.keys + ")";
		}
	}

	@java.lang.SuppressWarnings("all")
	public static KeySet.KeySetBuilder builder() {
		return new KeySet.KeySetBuilder();
	}

	@java.lang.SuppressWarnings("all")
	public String getId() {
		return this.id;
	}

	@java.lang.SuppressWarnings("all")
	public List<Key> getKeys() {
		return this.keys;
	}

	@java.lang.SuppressWarnings("all")
	public void setId(final String id) {
		this.id = id;
	}

	@java.lang.SuppressWarnings("all")
	public void setKeys(final List<Key> keys) {
		this.keys = keys;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof KeySet)) return false;
		final KeySet other = (KeySet) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		final java.lang.Object this$id = this.getId();
		final java.lang.Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final java.lang.Object this$keys = this.getKeys();
		final java.lang.Object other$keys = other.getKeys();
		if (this$keys == null ? other$keys != null : !this$keys.equals(other$keys)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof KeySet;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final java.lang.Object $keys = this.getKeys();
		result = result * PRIME + ($keys == null ? 43 : $keys.hashCode());
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public java.lang.String toString() {
		return "KeySet(id=" + this.getId() + ", keys=" + this.getKeys() + ")";
	}
}
