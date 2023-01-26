package week10;

public class Author1 {
	private String name;
	private String email;
	
	public Author1(String name,String email) {
		this.name = name;
		this.email = email;
	}
	public Author1() {
		this(null,null);
		//name = ""
		//email = ""
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String toString() {
		return "Author name:"+getName()+" ("+getEmail()+")";
	}
	
}
