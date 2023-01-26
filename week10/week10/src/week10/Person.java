package week10;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person() {
		firstName = "";
		lastName = "";
	}
	public Person(String first,String last) {
		setName(first,last);
	}
	public void setName(String first,String last) {
		firstName = "";
		lastName = "";
	}
	public String getfirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
