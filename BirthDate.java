package myHealthCareSystem;

/**
 * Represents the birth date for a patient.  A birth date, once created
 * cannot be changed.
 * 
 */
public class BirthDate {
	/*	Attributes			************************************/
	/** Birth day															*/
	private	final int day;
	/** Birth month.														*/
	private	final int month;
	/** Birth year.														*/
	private	final int year;	
	
	/*	Constructors		************************************/
	/**
	 * Create the birth date for this patient.
	 * @param year		Year of birth (4 numeric characters)
	 * @param month	Month of birth (01 thru 12) (2 digit month)
	 * @param day	Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
	 */
	public	BirthDate(int day, int month, int year)	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * Returns a string representation of the birth date 
	 * @return	This object as a string.
	 */
	public String toString()	{
		
		return  "[Day=" + day + ", Month=" + month + ", Year=" + year + "]";
	}
	
	/*	Accessors			************************************/
	
	
	/**
	 * 
	 * @return
	 */

	public int	getDay(){	
		return day;			
		}
	public int	getMonth(){	
		return month;		
		}
	public int	getYear(){	
		return year;		
		}
	
		
	
	/**
	 * Formats the birth date into a standard date string.
	 * @return The formatted birth date in DD-MM-YYYY format.
	 */
	
	public String formattedBirthDate()	{
				
		return String.format("%02d-%02d-%04d", day, month, year);
	}


	
	
	

}
