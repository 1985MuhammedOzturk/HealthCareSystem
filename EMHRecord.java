package myHealthCareSystem;

/**
 * This class stores and manipulate the health record data.
 */
public class EMHRecord {
	
	private String reportingFacilityProvince;
	private String institutionNumber;
	private String functionalCentreAccount;
	private int encounterSequence;
	private String healthCareNumber;
	private String chartNumber;
	private String issuingProvince;
	private String residenceCode;
	private String gender;
	private int submissionYear;
	private String adminViaAmbulance;
	private int registrationDate;
	private int registrationTime;
	
	
	/**
	 * 
	 * @param reportingFacilityProvince
	 * @param institutionNumber
	 * @param chartNumber
	 * @param healthCareNumber
	 */
	public EMHRecord (String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber) {
		this.reportingFacilityProvince = reportingFacilityProvince;
		this.institutionNumber = institutionNumber;
		this.chartNumber = chartNumber;
		this.healthCareNumber = healthCareNumber;
		
	}
	
	/** 
	 * 
	 * @return the province of facility.
	 */


	public String getReportingFacilityProvince() {
		return reportingFacilityProvince;
	}
	
	/**
	 * 
	 * @param reportingFacilityProvince
	 */

	public void setReportingFacilityProvince(String reportingFacilityProvince) {
		this.reportingFacilityProvince = reportingFacilityProvince;
	}
	
	/** 
	 * 
	 * @return
	 */

	public String getInstitutionNumber() {
		return institutionNumber;
	}
	
	/**
	 * 
	 * @param institutionNumber
	 */

	public void setInstitutionNumber(String institutionNumber) {
		this.institutionNumber = institutionNumber;
	}

	/**
	 * 
	 * @return
	 */
	public String getFunctionalCentreAccount() {
		return functionalCentreAccount;
	}
	
	/**
	 * 
	 * @param functionalCentreAccount
	 */

	public void setFunctionalCentreAccount(String functionalCentreAccount) {
		this.functionalCentreAccount = functionalCentreAccount;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getEncounterSequence() {
		return encounterSequence;
	}
	
	/**
	 * 
	 * @param encounterSequence
	 */

	public void setEncounterSequence(int encounterSequence) {
		this.encounterSequence = encounterSequence;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getHealthCareNumber() {
		return healthCareNumber;
	}
	
	/**
	 * 
	 * @param healthCareNumber
	 */

	public void setHealthCareNumber(String healthCareNumber) {
		this.healthCareNumber = healthCareNumber;
	}

	/**
	 * 
	 * @return
	 */
	public String getChartNumber() {
		return chartNumber;
	}
	
	/**
	 * 
	 * @param chartNumber
	 */

	public void setChartNumber(String chartNumber) {
		this.chartNumber = chartNumber;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getIssuingProvince() {
		return issuingProvince;
	}
	
	/**
	 * 
	 * @param issuingProvince
	 */

	public void setIssuingProvince(String issuingProvince) {
		this.issuingProvince = issuingProvince;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getResidenceCode() {
		return residenceCode;
	}
	
	/**
	 * 
	 * @param residenceCode
	 */

	public void setResidenceCode(String residenceCode) {
		this.residenceCode = residenceCode;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getGender() {
		return gender;
	}
	
	/**
	 * 
	 * @param gender
	 * @throws
	 */

	public void setGender(String gender) {
		
		if ("M".equals(gender) || "F".equals(gender) || "U".equals(gender) || "O".equals(gender)) {
			
			this.gender = gender;
		}
		
	}
	
	/**
	 * 
	 * @return
	 */

	public int getSubmissionYear() {
		return submissionYear;
	}
	
	/**
	 * 
	 * @param submissionYear
	 */

	public void setSubmissionYear(int submissionYear) {
		this.submissionYear = submissionYear;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getAdminViaAmbulance() {
		return adminViaAmbulance;
	}
	
	/**
	 * 
	 * @param adminViaAmbulance
	 */

	public void setAdminViaAmbulance(String adminViaAmbulance) {
		this.adminViaAmbulance = adminViaAmbulance;
	}
	
	/**
	 * 
	 * @return
	 */

	public int getRegistrationDate() {
		return registrationDate;
	}
	
	/**
	 * 
	 * @param registrationDate
	 */

	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	/**
	 * 
	 * @return
	 */

	public int getRegistrationTime() {
		return registrationTime;
	}
	
	/**
	 * 
	 * @param registrationTime
	 */

	public void setRegistrationTime(int registrationTime) {
		this.registrationTime = registrationTime;
	}

	@Override
	/**
	 * 
	 * String representation of EMHRecord.
	 */
	public String toString() {
		return "EMHRecord [Encounter Sequence=" + encounterSequence + ", Submission Year=" + submissionYear
				+ ", Registration Date=" + registrationDate + ", Registration Time=" + registrationTime + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
