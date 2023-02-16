
public class ATMData {
	private String accountNumber;
	private String password;
	
	public ATMData(String ac,String pass) {
		this.accountNumber = ac;
		this.password = pass;
	}
	public String getID() {
		return this.accountNumber;
	}
	public String getPass() {
		return this.password;
	}
	

}
