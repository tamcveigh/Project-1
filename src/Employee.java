//TODO Write Employee Class Javadoc
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
	
	//TODO Finish Employee Class
	
	@Override
	public boolean check(String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean change(String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AttributeInterface makeCopy() {
		// TODO Auto-generated method stub
		return null;
	}

}
