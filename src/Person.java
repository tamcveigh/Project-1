
public class Person {
	
	/** First name */
	private String first;
	/** Last name */
	private String last;
	/** Marital Status */
	private Status status;
	
	public enum Status{
		Married,
		Single,
		Widowed,
		Divorced;
	}
	
	public Person(String first, String last, Status status) {
		this.first = first;
		this.last = last;
		this.status = status;
	}
	
	public String getFirstName() {
		return first;
	}
	
	public String getLastName() {
		return last;
	}
	
	public String getMaritalStatus() {
		return status.toString();
	}
	
	public void setFirstName(String fName) {
		this.first = fName;
	}
	
	public void setLastName(String lName) {
		this.last = lName;
	}
	
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
