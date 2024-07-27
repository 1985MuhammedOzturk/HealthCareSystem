package myHealthCareSystem;

/**
 * This class represents a patient's name 
 * with salutation, first name, middle name, and last name.
 */
public class Name {
	
	
	
	/*	Attributes			************************************/
	private String first;
	private String last;
	private String middle;
	private String salutation;
	
	
	/*	Constructors		************************************/
	/**
	 * Default constructor. This constructor initializes an empty name.
	 */
	public Name () {
		this.first = "";
		this.last = "";
		this.middle = "";
		this.salutation = "";
		
	}
	/**
	 * Contructs Name object by parsing a single string
	 * The Name can be in the format like "First Last" or "Last, First".
	 * @param Name
	 */
	public Name (String Name) {
		
		String[] nameparts = Name.split("[, ]+");
		if (Name.contains(",")) {
			this.last = nameparts[0].trim();
			this.first = nameparts[1].trim();
		}
		else {
			this.first = nameparts[0].trim();
			this.last = nameparts.length > 1 ? nameparts[1].trim() : "" ;		
		}
		this.middle = "";
		this.salutation = "";
		
		
	}
	/**
	 * Constructs Name as first and last name
	 * @param first
	 * @param last
	 */
	public Name (String first, String last)	{
		this.first =first;
		this.last = last;
		this.middle = "";
		this.salutation = "";
		
	}	
	/**
	 * Name as first, middle, last name.
	 * @param first
	 * @param last
	 * @param middle
	 */
	public Name (String first, String middle, String last) {
		this.first = first;
		this.last = last;
		this.middle = middle;
		this.salutation = "";
		
	}
	/*	Accessors			************************************/
	/* Modifiers			************************************/

	/**
	 * @return the first name
	 */
	public String getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(String first) {
		this.first = first;
	}

	/** 
	 * 
	 * @return the last name
	 */
	public String getLast() {
		return last;
	}

	/**
	 * 
	 * @param last the last to set
	 */
	public void setLast(String last) {
		this.last = last;
	}

	/**
	 * @return the middle
	 */
	public String getMiddle() {
		return middle;
	}

	/**
	 * @param middle the middle to set
	 */
	public void setMiddle(String middle) {
		this.middle = middle;
	}

	/**
	 * @return the salutation
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * sets the salutation, validating it against accepted values.
	 * @param salutation the salutation to set
	 * @throws exception if the salutation is not "Mr." or "Ms."
	 */
	
	public void setSalutation(String salutation) {
		if (salutation.equals("Mr.") || salutation.equals("Ms.")) {
			this.salutation = salutation;
	}	else {
		throw new IllegalArgumentException("Invalid salutation. Only 'Mr.' or 'Ms.' options are allowed.");
	}
	}	
	
	
	@Override
		 
	public String toString() {
		return formattedName();
	}
	
	/**
	 * each value is seperated by a space. Whitespaces are trimmed.
	 * @return full name with salutation
	 */
	public String formattedName() {
		return String.format("%s %s %s %s", salutation != null && !salutation.isEmpty() ? salutation : "",
				first != null && !first.isEmpty() ? first: "",
				middle != null && !middle.isEmpty() ? middle: "",
				last != null && !last.isEmpty() ? last: "").trim();
		
	}
	
	

	


}
