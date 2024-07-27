package testMyHealthCareSystem;

import myHealthCareSystem.*;

/**
 * This is a simple test demo class for the health care system.
 * This driver class tests the functionality of the My Health System.
 */
public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args	Array of command line arguments input thru the VM
	 */
	public static void main(String[] args) {

		/**
		 * 
		 */

		
		System.out.println("Student Name: Muhammed Ozturk \nLab Section: 312\n\n");
		
		Name patName = new Name ("XYZ, ABC");
		System.out.println("Patient's name: " + patName);
		
		BirthDate patBdate = new BirthDate(13, 1, 1900);
		System.out.println("Birth Date : " + patBdate);
		
		Address patAddress = new Address ("Rideau St.", "50", "Ottawa", "Canada", "K3M 5Y1");
		System.out.println("Address: " + patAddress);
		
		EMRecord patRecord = new EMRecord(null, null, null, null);
		
		
		patRecord.setName(patName);
		patRecord.setAddress(patAddress);
		patRecord.setChartNumber("5");
		patRecord.setEncounterSequence(5);
		patRecord.setGender("M");
		patRecord.setHealthCareNumber("5");
		patRecord.setInstitutionNumber("0606");
		patRecord.setIssuingProvince("Ontario");
		patRecord.setAdminViaAmbulance("Yes");
		patRecord.setRegistrationDate(20240301);
		patRecord.setRegistrationTime(1515);
		patRecord.setReportingFacilityProvince("Ontario");
		patRecord.setResidenceCode("06ANK");
		patRecord.setSubmissionYear(2020);
		patRecord.setFunctionalCentreAccount("1234");
		patRecord.setHeight(75);
		patRecord.setWeight(190);
		
		
		
		System.out.printf("Patient's Name: %s%n", patRecord.getName());
		System.out.printf("Patient's Address: %s%n", patRecord.getAddress());
		System.out.printf("Chart Number: %s%n", patRecord.getChartNumber());
		System.out.printf("Encounter Sequence: %s%n", patRecord.getEncounterSequence());
		System.out.printf("Gender: %s%n", patRecord.getGender());
		System.out.printf("Health Care Number: %s%n", patRecord.getHealthCareNumber());
		System.out.printf("Institution Number: %s%n", patRecord.getInstitutionNumber());
		System.out.printf("Issuing Province: %s%n", patRecord.getIssuingProvince());
		System.out.printf("Admin Via Ambulance: %b%n", patRecord.getAdminViaAmbulance());
		System.out.printf("Registration Date: %d%n", patRecord.getRegistrationDate());
		System.out.printf("Registration Time: %d%n", patRecord.getRegistrationTime());
		System.out.printf("Reporting Facility Province: %s%n", patRecord.getReportingFacilityProvince());
		System.out.printf("Residence Code: %s%n", patRecord.getResidenceCode());
		System.out.printf("Submission Year: %d%n", patRecord.getSubmissionYear());
		System.out.printf("Functional Centre Account: %s%n", patRecord.getFunctionalCentreAccount());
		
		/**
		 * @author Muhammed Ozturk
		 */
		


		/**
		 * Calculated and displays BMI.
		 * Height and weight are retrieved from @code EMRecord
		 * calculates the BMI by using @link MedicalCalculator method.
		 * 
		 */
			
			double bmi = MedicalCalculator.calculateBMI(patRecord.getWeight(), patRecord.getHeight());
			System.out.println("Calculated BMI: " + bmi);
		
			
		
		/*	You do not need to modify this piece of code, it is fine as it is.			*/
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}

}
