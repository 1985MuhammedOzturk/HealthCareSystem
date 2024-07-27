package myHealthCareSystem;

/**
 * Represents a physical address in the healthcare system.
 * This class contains detailed information about the location of the patient.
 */
public class Address {
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 */

	
	/*	Attributes			************************************/
	
	private String street;
	private String number;
	private String city;
	private String country;
	private String postalCode;
	
	/*	Constructors		************************************/
			/**
			 * 
			 * @param street 
			 * @param number The building number.
			 * @param city	
			 * @param country
			 * @param postalCode
			 */
	
	public Address(String street, String number, String city, String country, String postalCode) {
		super();
		this.street = street;
		this.number = number;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
	}



	/*	Accessors			************************************/
		
	/* Modifiers			************************************/
	
	
			/**
			 * @return the street name
			 */
			public String getStreet() {
				return street;
			}



			/**
			 * @param street the street name to set
			 */
			public void setStreet(String street) {
				this.street = street;
			}



			/**
			 * @return the number
			 */
			public String getNumber() {
				return number;
			}



			/**
			 * @param number the number to set
			 */
			public void setNumber(String number) {
				this.number = number;
			}



			/**
			 * @return the city
			 */
			public String getCity() {
				return city;
			}



			/**
			 * @param city the city to set
			 */
			public void setCity(String city) {
				this.city = city;
			}



			/**
			 * @return the country
			 */
			public String getCountry() {
				return country;
			}



			/**
			 * @param country the country to set
			 */
			public void setCountry(String country) {
				this.country = country;
			}



			/**
			 * @return the postalCode
			 */
			public String getPostalCode() {
				return postalCode;
			}



			/**
			 * @param postalCode the postalCode to set
			 */
			public void setPostalCode(String postalCode) {
				this.postalCode = postalCode;
			}



	/*	Normal Behavior	************************************/
	/**
	 * 
	 * @return String representation of the address.
	 */
	
	
	public String toString() {
		return street + " " + number + ", " + city + ", " +  country + ", " + postalCode;
	}
	
	/**
	 * The formatted address as a string.
	 * @return
	 */
	
	public String formattedAddress() {
		return String.format("%s %s, %s, %s, %s", street, number, city, country, postalCode);
		
	}
	
	/*	Helper Methods		************************************/
	


}
