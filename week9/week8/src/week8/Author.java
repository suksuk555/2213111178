package week8;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender =gender;
		
	}
	public Author(String name,String email) {
		this.name = name;
		this.email = email;
		this.gender = ' ';
	}
	public Author() {
		this.name = "";
		this.email = "";
		this.gender = ' ';
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	
	public String getGenderName() {
		if(this.gender == 'M'||this.gender == 'm') {
			return "Male";
		}
		else if(this.gender == 'F'||this.gender == 'f') {
			return "Female";
		}
		else {
			return null;
		}
	}
	public String toString(){
		return getName()+" ("+getEmail()+";"+getGenderName()+")";
	}
}
