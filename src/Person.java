/**
 * 
 * @author Tyler
 *
 */
public class Person {
	
	/** First name */
	private String first;
	/** Last name */
	private String last;
	/** Marital Status */
	private Status status;
	
	/**
	 * 
	 * @author Tyler
	 *
	 */
	public enum Status{
		Married,
		Single,
		Widowed,
		Divorced;
	}
	
	/**
	 * 
	 * @param first
	 * @param last
	 * @param status
	 */
	public Person(String first, String last, Status status) {
		this.first = first;
		this.last = last;
		this.status = status;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return first;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return last;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMaritalStatus() {
		return status.toString();
	}
	
	/**
	 * 
	 * @param fName
	 */
	public void setFirstName(String fName) {
		this.first = fName;
	}
	
	/**
	 * 
	 * @param lName
	 */
	public void setLastName(String lName) {
		this.last = lName;
	}
	
	/**
	 * 
	 * @param status
	 * @return
	 */
	public Boolean setMaritalStatus(String status) {
		switch(status) {
		case "Married":
			this.status = Status.Married;
			return true;
		case "Single":
			this.status = Status.Single;
			return true;
		case "Widowed":
			this.status = Status.Widowed;
			return true;
		case "Divorced":
			this.status = Status.Divorced;
			return true;
		default:
			return false;
		}
	}
}
