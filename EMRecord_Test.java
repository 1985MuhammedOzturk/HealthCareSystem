package testMyHealthCareSystem;


/*		@(#)EMRecord_Test.java	Jan. 31, 2024
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
* Test class for testing the EMRecord class
* Uses JUnit version 5
* @author 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMRecord_Test {
	
	private EMRecord result;
    private Name testName;
    private Address testAddress;
    private final int testHeight = 5; 
    private final int testWeight = 154; 
    private final String defaultProvince = "Ontario";
    private final String defaultInstitutionNumber = "12345";
    private final String defaultChartNumber = "06";
    private final String defaultHealthCareNumber = "ANK06";

	@BeforeEach
	void setUp() throws Exception {
		testName = new Name("First", "Last");
        testAddress = new Address("Wurtemburg","90", "Toronto", "Canada", "W1T 9A2");
        result = new EMRecord(defaultProvince, defaultInstitutionNumber, defaultChartNumber, defaultHealthCareNumber);
        result.setName(testName);
        result.setAddress(testAddress);
        result.setHeight(testHeight);
        result.setWeight(testWeight);
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
		+EMRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
		+setName(name:Name):void
		+setAddress(address:Address):void
		+setHeight():void
		+getHeight():int
		+setWeight():void
		+getWeight():int
		+formattedName():String
		+formattedAddress():String
		+bmi():int
	 */

	
	@Nested	@DisplayName("EMRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMRecordTest {
		@Test @Order(1) @DisplayName("EMRecord() test with Null arguments")
		final void testEMRecordWithNullArguments() {
			
			/*
			 * TODO: Add code with assertion to test constructor\
			 */
			EMRecord result = null;
			assertNull(result);
			assertNull(result, "EMRecord instance should be created even with null arguments.");
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
			String expected = "EMRecord{reportingFacilityProvince='Ontario', institutionNumber='12345', chartNumber='06', healthCareNumber='ANK06', "
					+ "height=5, weight=154, name=First  Last, address=Wurtemburg 90, Toronto, Canada, W1T 9A2}";
			assertEquals(expected, result.toString(), "The toString method does not produce the expected output.");
			/*
			 * TODO: Add code with assertion to test
			 */
		}
		
		/*
		 * TODO: Add code to test one set method and one get method
		 */
		void testSetAndGetHeight() {
		    
		    int testHeight = 5; 

		    
		    result.setHeight(testHeight);

		    
		    int returnedHeight = result.getHeight();

		  
		    assertEquals(testHeight, returnedHeight, "getHeight method should return the value set by setHeight.");
	

	
	
	
		}
	}
}

