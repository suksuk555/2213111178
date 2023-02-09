
public class FictionBook implements Author,Book{
	
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook (String title,int publicyear) {
		this.title = title;
		this.publicYear = publicyear;
		
	}
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		if(author_name.contains(" ")) {
			return true;
		}
		else {
			return false;
		}
	}
	public getLastName() {
		
	}
	public String getFirstName() {
		String first = author_name
		return author_name.indexOf(b)
	}
	public String toString() {
		return 
	}
	
}
