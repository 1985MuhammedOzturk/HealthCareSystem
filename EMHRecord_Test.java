package testMyHealthCareSystem;


/*		@(#)EMHRecord_Test.java	Jan. 31, 2024
*
*/


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import myHealthCareSystem.*;


/**
* Test class for testing the EMHRecord class
* Uses JUnit version 5
* @author 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMHRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMHRecord_Test {
	private EMHRecord result;
	String defaultProvince = "Ontario";
    String defaultInstitutionNumber = "12345";
    String defaultChartNumber = "06";
    String defaultHealthCareNumber = "ANK06";
	@BeforeEach
	void setUp() throws Exception {
		result = new EMHRecord(defaultProvince, defaultInstitutionNumber, defaultChartNumber, defaultHealthCareNumber);
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
	}

	@AfterEach
	void tearDown() throws Exception {
		result = null;
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
	}

	/*		Methods to test
	 * 
		+EMHRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
	 */

	
	@Nested	@DisplayName("EMHRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMHRecordTest {
		@Test @Order(1) @DisplayName("EMHRecord() test with Null arguments")
		final void testEMHRecordWithNullArguments() {
			
						/*
			 * TODO: Add code with assertion to test constructor\
			 */
			EMHRecord result = new EMHRecord (null, null, null, null);
			assertNotNull(result);
			assertNull(result.getReportingFacilityProvince(), "Reporting Facility Province should be null");
		    assertNull(result.getInstitutionNumber(), "Institution Number should be null");
		    assertNull(result.getChartNumber(), "Chart number should be null");
		    assertNull(result.getHealthCareNumber(), "Healt care number should be null");
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			String expected = "EMHRecord [Encounter Sequence=0, Submission Year=0, Registration Date=0, Registration Time=0]";
					/*
					 * EMHRecord [Encounter Sequence=" + encounterSequence + ", Submission Year=" + submissionYear
				+ ", Registration Date=" + registrationDate + ", Registration Time=" + registrationTime + "]";
					 */
			assertEquals(expected, result.toString(), "toString method does not produce the expected output.");
			
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}

	
	/*
	 * TODO: Add code to test one set method and one get method
	 */
	void testSetGetInstitutionNumber() {
	    String newInstitutionNumber = "67890";
	    result.setInstitutionNumber(newInstitutionNumber);
	    assertEquals(newInstitutionNumber, result.getInstitutionNumber(), "getInstitutionNumber should return what was set by setInstitutionNumber.");
	}
	
}
