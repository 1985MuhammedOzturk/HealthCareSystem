package testMyHealthCareSystem;


/*		@(#)Address_Test.java	Jan. 31, 2024
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
* Test class for testing the Address class
* Uses JUnit version 5
* @author 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Address")
@TestMethodOrder(OrderAnnotation.class)
public class Address_Test {
	
	private Address result;

	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
		result = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
		result = null;
	}

	/*		Methods to test
	 * 
	 * 	+Address(...)
			+formattedAddress():String
			+street():String
			+postalCode():String
			+getCity():String
			+setStreet(street:String):void
			+setNumber(number:String):void
			+setCity(city:String):void
			+setCountry(country:String):void
			+setPostalCode(postalCode:String):void
	 */
	
	@Nested	@DisplayName("Address() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class AddressTest {
		@Test @Order(1) @DisplayName("Address() test with Null arguments")
		final void testAddressWithNullArguments() {
			Address result = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
			assertNotNull(result);
			assertNotNull(result, "Address object should not be null");
		    assertEquals("192 Rideau St", result.getStreet(), "Street should be '192 Rideau St'");
		    assertEquals("45", result.getNumber(), "Number should be '45'");
		    assertEquals("Ottawa", result.getCity(), "City should be 'Ottawa'");
		    assertEquals("Canada", result.getCountry(), "Country should be 'Canada'");
		    assertEquals("12345", result.getPostalCode(), "PostalCode should be '12345'");
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
			
			Address address = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
	        String expected = "192 Rideau St 45, Ottawa, Canada, 12345";
	        
	        String actual = address.toString();
	        assertEquals(expected, actual, "toString() should return the correct string representation");
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			
			Address address = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
	        String expected = "192 Rideau St 45, Ottawa, Canada, 12345";
	        
	        String actual = address.formattedAddress();
	        
	        assertEquals(expected, actual, "formattedAddress() should return a correctly formatted address string");
	        	        
			/*
			 * TODO: Add code with assertion to test
			 */
		}
		
	}

	@Nested	@DisplayName("postalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class PostalCodeTest {
		@Test @Order(1) @DisplayName("postalCode()")
		final void testPostalCode() {
			
			Address address = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
		    assertEquals("12345", address.getPostalCode());
			/*
			 * TODO: Add code with assertion to test
			 */
		}	
	}

	@Nested	@DisplayName("getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetCityTest {
		@Test @Order(1) @DisplayName("getCity()")
		final void testGetCity() {
			
			Address address = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
	        assertEquals("Ottawa", address.getCity());
			/*
			 * TODO: Add code with assertion to test
			 */
		}	
	}

	
	@Nested	@DisplayName("setStreet() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetStreetTest {
		@Test @Order(1) @DisplayName("setStreet()")
		final void testSetStreet() {
			Address address = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
		    String newStreet = "200 Rideau St";
		    address.setStreet(newStreet); // Set the new street
	        assertEquals(newStreet, address.getStreet());
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}
	
	@Nested	@DisplayName("setNumber() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNumberTest {
		@Test @Order(1) @DisplayName("setNumber()")
		final void testSetNumber() {
			
			Address address = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
	        String newNumber = "50";
	        address.setNumber(newNumber); 
	        assertEquals(newNumber, address.getNumber());
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}


	@Nested	@DisplayName("setCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCityTest {
		@Test @Order(1) @DisplayName("setCity()")
		final void testSetCity() {
			Address address = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
	        String newCity = "Toronto";
	        address.setCity(newCity); // Set the new city
	        assertEquals(newCity, address.getCity());
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}
	
	@Nested	@DisplayName("setCountry() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCountryTest {
		@Test @Order(1) @DisplayName("setCountry()")
		final void testSetCountry() {
			Address address = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
	        String newCountry = "USA";
	        address.setCountry(newCountry); // Set the new country
	        assertEquals(newCountry, address.getCountry());
			
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}
	
	@Nested	@DisplayName("setPostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetPostalCodeTest {
		@Test @Order(1) @DisplayName("setPostalCode()")
		final void testSetCountry() {
			Address address = new Address("192 Rideau St", "45", "Ottawa", "Canada", "12345");
	        String newPostalCode = "K2P 0B6";
	        address.setPostalCode(newPostalCode); // Set the new postal code
	        assertEquals(newPostalCode, address.getPostalCode());
			/*
			 * TODO: Add code with assertion to test
			 */
		}
	}




}
