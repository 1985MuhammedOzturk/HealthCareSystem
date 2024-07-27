package testMyHealthCareSystem;


/*		@(#)BirthDate_Test.java	Jan. 31, 2024
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
* Test class for testing the BirthDate class
* Uses JUnit version 5
* @author 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - BirthDate")
@TestMethodOrder(OrderAnnotation.class)
public class BirthDate_Test {
	
	private BirthDate birthDate;
	int day = 30;
	int month = 4;
	int year = 1985;
	
	@BeforeEach
	void setUp() throws Exception {
		
		birthDate = new BirthDate(30, 04, 1985);
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
	}

	@AfterEach
	void tearDown() throws Exception {
		
		birthDate = null;
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
	}

	/*		Methods to test
	 * 
		+BirthDate(day:int, month:int, year:int)
		+toString():String
		+formattedBirthDate():String
		+getDay():int
		+getMonth():int
		+getYear():int
	 */

	
	@Nested	@DisplayName("BirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class BirthDateTest {
		@Test @Order(1) @DisplayName("BirthDate() test with Null arguments")
		final void testBirthDateWithNullArguments() {
			birthDate = null;
			assertNull(birthDate);
		}
		
		final void testBirthDateWithValidArguments() {
			
		
			assertNotNull(birthDate);
			assertEquals(day, birthDate.getDay());
	        assertEquals(month, birthDate.getMonth());
	        assertEquals(year, birthDate.getYear());
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
			
	        String result = birthDate.toString();
	
	        String expected = "[Day=30, Month=4, Year=1985]" ; 
	        assertEquals(expected, result) ;
			
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}
	
	@Nested	@DisplayName("formattedBirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedBirthDate {
		@Test @Order(1) @DisplayName("formattedBirthDate()")
		final void testFormattedBirthDate() {
			     
		        String formattedDate = birthDate.formattedBirthDate();

		        String expected = "30-04-1985"; 

		        assertEquals(expected, formattedDate);
			/*
			 * TODO: Add code with assertion to test
			 */
		}
		
	}

	@Nested	@DisplayName("getDay() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetDayTest {
		@Test @Order(1) @DisplayName("getDay()")
		final void testGetDay() {
			
			assertEquals(30, birthDate.getDay());
					
			/*
			 * TODO: Add code with assertion to test
			 */
		}	
	}
	
	@Nested	@DisplayName("getMonth() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetMonthTest {
		@Test @Order(1) @DisplayName("getMonth()")
		final void testGetMonth() {
			
			assertEquals(4, birthDate.getMonth());
			/*
			 * TODO: Add code with assertion to test
			 */
		}	
	}
	
	@Nested	@DisplayName("getYear() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetYearTest {
		@Test @Order(1) @DisplayName("getYear()")
		final void testGetYear() {
			
			assertEquals(1985, birthDate.getYear());
			/*
			 * TODO: Add code with assertion to test
			 */
		}	
	}

}
