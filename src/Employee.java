//TODO Write Employee Class JavaDoc
public class Employee implements AttributeInterface {
	
	/** Identification number */
	private String id;
	/** Phone number */
	private String phone;
	/** Division within the institution */
	private String division;
	/** Number of years employed */
	private String years;
	/** Personal information */
	private Person person;
	/** Current department or classification */
	private String department;
	
	/**
	 * 
	 * 
	 * @param person
	 * @param id
	 * @param phone
	 * @param division
	 * @param years
	 * @param department
	 */
	public Employee(Person person, String id, String phone, String division, String years, String department) {
		this.person = person;
		this.id = id;
		this.phone = phone;
		this.division = division;
		this.years = years;
		this.department = department;
	}
	
	/**
	 * 
	 * @param first
	 * @param last
	 * @param status
	 * @param id
	 * @param phone
	 * @param division
	 * @param years
	 * @param department
	 */
	public Employee(String first, String last, Person.Status status, String id, String phone, String division, String years, String department) {
		this.person = new Person(first, last, status);
		this.id = id;
		this.phone = phone;
		this.division = division;
		this.years = years;
		this.department = department;
	}
	
	
	@Override
	public boolean check(String attribute, String value) {
		switch(attribute) {
		case "first name":
		case "first":
			return(this.person.getFirstName().equals(value));
		case "last name":
		case "last":
			return(this.person.getLastName().equals(value));
		case "marital status":
		case "status":
			return(this.person.getMaritalStatus().equals(value));
		case "id":
			return(this.id.equals(value));
		case "phone":
			return(this.phone.equals(value));
		case "division":
			return(this.division.equals(value));
		case "years":
			return(this.years.equals(value));
		case "department":
			return(this.department.equals(value));
		}
		return false;
	}

	@Override
	public boolean change(String attribute, String value) {
		switch(attribute) {
		case "first name":
		case "first":
			person.setFirstName(value);
			return true;
		case "last name":
		case "last":
			person.setLastName(value);
			return true;
		case "marital status":
		case "status":
			return(person.setMaritalStatus(value));
		case "id":
			this.id = value;
			return true;
		case "phone":
			this.phone = value;
			return true;
		case "division":
			this.division = value;
			return true;
		case "years":
			this.years = value;
			return true;
		case "department":
			this.department = value;
			return true;
		default:
			return false;
		}
	}

	@Override
	public AttributeInterface makeCopy() {
		// TODO Auto-generated method stub
		return null;
	}

}
