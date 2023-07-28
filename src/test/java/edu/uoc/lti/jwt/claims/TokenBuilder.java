// Generated by delombok at Fri Jul 28 11:45:02 CEST 2023
package edu.uoc.lti.jwt.claims;

import edu.uoc.lti.claims.ClaimsEnum;
import edu.uoc.lti.jwt.AlgorithmFactory;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author xaracil@uoc.edu
 */
public class TokenBuilder {
	private static final long _5_MINUTES = 5 * 30 * 1000;
	private static final String KID = "kid";
	private static final String ALG = "ALG";
	private static final String ISSUER = "iss";
	private static final String SUBJECT = "sub";
	private static final String AUDIENCE = "aud";
	private static final String EXPIRATION = "exp";
	private static final String ISSUED_AT = "iat";
	private static final String DEPLOYMENT_ID = ClaimsEnum.DEPLOYMENT_ID.getName();
	private static final List<String> PAYLOAD_SPECIAL_KEYS = Arrays.asList(ISSUER, SUBJECT, AUDIENCE, EXPIRATION, ISSUED_AT, DEPLOYMENT_ID);
	private final String kid;
	private final String issuer;
	private final String audience;
	private final String deploymentId;
	private final String publicKey;
	private final String privateKey;
	private final String algorithm;

	public String build(TestLaunch testLaunch) {
		AlgorithmFactory algorithmFactory = new AlgorithmFactory(publicKey, privateKey, algorithm);
		final JwtBuilder builder = Jwts.builder().signWith(algorithmFactory.getPrivateKey());
		if (testLaunch.getHeader() != null) {
			for (Map.Entry<String, Object> entry : testLaunch.getHeader().entrySet()) {
				if (!ALG.equals(entry.getKey())) {
					builder.setHeaderParam(entry.getKey(), entry.getValue());
				}
			}
		} else {
			builder.setHeaderParam(KID, this.kid);
		}
		if (testLaunch.getPayload() != null) {
			for (Map.Entry<String, Object> entry : testLaunch.getPayload().entrySet()) {
				if (isSpecial(entry.getKey())) {
					setSpecial(entry.getKey(), entry.getValue(), builder, testLaunch.getSpecialFieldsToKeepFromPayload());
				} else {
					// is a normal claim
					builder.claim(entry.getKey(), entry.getValue());
				}
			}
		}
		return builder.compact();
	}

	private void setSpecial(String key, Object value, JwtBuilder builder, List<String> excludedKeys) {
		if (ISSUER.equals(key)) {
			builder.setIssuer(isExcluded(key, excludedKeys) ? value.toString() : this.issuer);
		}
		if (SUBJECT.equals(key)) {
			builder.setSubject(value.toString());
		}
		if (AUDIENCE.equals(key)) {
			builder.setAudience(isExcluded(key, excludedKeys) ? value.toString() : this.audience);
		}
		if (EXPIRATION.equals(key)) {
			builder.setExpiration(isExcluded(key, excludedKeys) ? new Date((Integer) value) : new Date(System.currentTimeMillis() + _5_MINUTES));
		}
		if (ISSUED_AT.equals(key)) {
			builder.setIssuedAt(isExcluded(key, excludedKeys) ? new Date((Integer) value) : new Date());
		}
		if (DEPLOYMENT_ID.equals(key)) {
			builder.claim(DEPLOYMENT_ID, isExcluded(key, excludedKeys) ? value.toString() : this.deploymentId);
		}
	}

	private boolean isExcluded(String key, List<String> excludedKeys) {
		return (excludedKeys == null || excludedKeys.size() == 0) ? false : excludedKeys.contains(key);
	}

	private boolean isSpecial(String key) {
		return PAYLOAD_SPECIAL_KEYS.contains(key);
	}

	@java.lang.SuppressWarnings("all")
	public TokenBuilder(final String kid, final String issuer, final String audience, final String deploymentId, final String publicKey, final String privateKey, final String algorithm) {
		this.kid = kid;
		this.issuer = issuer;
		this.audience = audience;
		this.deploymentId = deploymentId;
		this.publicKey = publicKey;
		this.privateKey = privateKey;
		this.algorithm = algorithm;
	}
}
