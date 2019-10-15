package edu.uoc.elc.lti.tool;

import edu.uoc.elc.lti.tool.claims.ClaimAccessor;
import edu.uoc.elc.lti.tool.claims.ClaimsEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@RequiredArgsConstructor
public class LaunchVerifier {
	private final static String VERSION = "1.3.0";

	private final ToolDefinition toolDefinition;
	private final ClaimAccessor claimAccessor;

	@Getter
	private String reason;


	public boolean validate() {
		// message type
		final String messageTypeClaim = this.claimAccessor.get(ClaimsEnum.MESSAGE_TYPE);
		if (messageTypeClaim == null) {
			reason = "Unknown Message Type";
			return false;
		}

		try {
			MessageTypesEnum.valueOf(messageTypeClaim);
		} catch (IllegalArgumentException e) {
			reason = "Unknown Message Type";
			return false;
		}

		// version
		final String versionClaim = this.claimAccessor.get(ClaimsEnum.VERSION);
		if (versionClaim == null || !VERSION.equals(versionClaim)) {
			reason = "Invalid Version";
			return false;
		}

		// validate id_token, if present, using rules from https://www.imsglobal.org/spec/security/v1p0/#authentication-response-validation

		/**
		 * 2. The Issuer Identifier for the Platform MUST exactly match the value of the iss (Issuer) Claim
		 * (therefore the Tool MUST previously have been made aware of this identifier);
		 */
		if (!this.toolDefinition.getPlatform().equals(this.claimAccessor.getIssuer())) {
			reason = "Issuer invalid";
			return false;
		}

		/** 3. The Tool MUST validate that the aud (audience) Claim contains its client_id value registered as an
		 * audience with the Issuer identified by the iss (Issuer) Claim. The aud (audience) Claim MAY contain an array
		 * with more than one element. The Tool MUST reject the ID Token if it does not list the client_id as a valid
		 * audience, or if it contains additional audiences not trusted by the Tool. The request message will be
		 * rejected with a HTTP code of 401;
		 */
		final String audienceClaim = this.claimAccessor.getAudience();
		final List<String> audiences = Arrays.asList(audienceClaim.split(","));
		if (!audiences.contains(this.toolDefinition.getClientId())) {
			reason = "Audience invalid";
			return false;
		}

		/**
		 * 4. If the ID Token contains multiple audiences, the Tool SHOULD verify that an azp Claim is present;
		 */
		if (audiences.size() > 1) {
			if (this.claimAccessor.getAzp() == null) {
				reason = "Azp claim is not present";
				return false;
			}
		}

		/**
		 * 5. If an azp (authorized party) Claim is present, the Tool SHOULD verify that its client_id is the Claim's value
		 */
		if (this.claimAccessor.getAzp() != null) {
			if (!this.toolDefinition.getClientId().equals(this.claimAccessor.getAzp())) {
				reason = "Azp invalid";
				return false;
			}
		}


		/**
		 * 6. The alg value SHOULD be the default of RS256 or the algorithm sent by the Tool in
		 * the id_token_signed_response_alg parameter during its registration. Use of algorithms other that RS256 will
		 * limit interoperability
		 *
		 * Developer's note: Not doing this
		 */

		/**
		 * 7. The current time MUST be before the time represented by the exp Claim;
		 */
		if (this.claimAccessor.getExpiration().before(new Date())) {
			reason = "Expired";
			return false;
		}

		/**
		 * 8. The Tool MAY use the iat Claim to reject tokens that were issued too far away from the current time,
		 * limiting the amount of time that it needs to store nonces used to prevent attacks.
		 * The Tool MAY define its own acceptable time range;
		 *
		 * Developer's note: Already done in ClaimAccessor
		 */


		/**
		 * 9. The ID Token MUST contain a nonce Claim. The Tool SHOULD verify that it has not yet received this nonce
		 * value (within a Tool-defined time window), in order to help prevent replay attacks. The Tool MAY define its own
		 * precise method for detecting replay attacks.
		 */
		if (this.claimAccessor.get(ClaimsEnum.NONCE) == null) {
			reason = "Nonce not present";
			return false;
		}

		return true;
	}
}
