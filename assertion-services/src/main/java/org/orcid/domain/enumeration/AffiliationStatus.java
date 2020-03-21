package org.orcid.domain.enumeration;

public enum AffiliationStatus {
	
	USER_DENIED_ACCESS("User denied access"),
	PENDING("Pending"),
	DELETED_IN_ORCID("Deleted in ORCID"),
	IN_ORCID("In ORCID"),
	USER_GRANTED_ACCESS("User granted access"),
	USER_DELETED_FROM_ORCID("User deleted from ORCID"),
	USER_REVOKED_ACCESS("User revoked access"),
	ERROR_ADDIN_TO_ORCID("Error adding to ORCID");
	
	public final String value;
	
	AffiliationStatus(String value) {
		this.value = value;
	}
	
	

}
