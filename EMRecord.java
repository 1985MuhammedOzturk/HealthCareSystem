package myHealthCareSystem;

/*
 * 	W24	CST8284
 * 	Assignment 1: My Health System
 * 
 *		This is the start of a system which would maintain Electronic Medical Records for patients.
 *		This class assumes all values passed to the set methods are correct and valid.
 *		REVIEW THIS FILE, ASSIGNMENT INSTRUCTIONS, UML Class Diagram CAREFULLY BEFORE YOU START CODING!
 *
 * 	Remove unneeded comments/code when you are done. (Clean code is better code).
 * 
 * 	Field values and constraints can be found in the Standards guide
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024)
 * 
 */

/**
 * This class represents the Electronic Medical Record for a patient in the healthcare system.
 * This class extends {@link EMHRecord}.
 */
public class EMRecord extends EMHRecord		{
	

	
	/*	Attributes			************************************/
	
	private int height;
	private int weight;
	private Name name;
	private Address address;
	
	/*	Constructors		************************************/
	/**
	 * 
	 * @param reportingFacilityProvince The province of the reporting healthcare facility.
	 * @param institutionNumber The unique number identifying the healthcare institution.
	 * @param chartNumber The patient's chart number.
	 * @param healthCareNumber The healthcare number of the patient.
	 */
	public EMRecord(String reportingFacilityProvince, String institutionNumber, String chartNumber,
		String healthCareNumber) {
		super(reportingFacilityProvince, institutionNumber, chartNumber, healthCareNumber);
		
}

	
	/*	Accessors			************************************/
	
	
	/* Modifiers			************************************/
	

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}


	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}


	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}


	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	/*	Normal Behavior	************************************/
	/**
	 * 
	 * 
	 * @return
	 */
	public String formattedName () {
		return name.formattedName ();
	}
	
	
	/**
	 * 
	 * 
	 */
	
	public String toString() {
	    return String.format("EMRecord{reportingFacilityProvince='%s', institutionNumber='%s', chartNumber='%s', healthCareNumber='%s', " +
	            "height=%d, weight=%d, name=%s, address=%s}", getReportingFacilityProvince(), getInstitutionNumber(), getChartNumber(),
	            getHealthCareNumber(), height, weight, name, address);
	}
	
		/**
		 * BMI of the patient, rounded to the nearest whole number.
		 * @return
		 */
	
		public int bmi() {
			double bmiValue = MedicalCalculator.calculateBMI(weight, height);
			return (int) Math.round(bmiValue);
	}

}
	

    

