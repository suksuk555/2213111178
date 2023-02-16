import java.util.*;
import java.io.*;

public class ATMChecking extends ATMData {
	private int money;
	
	public ATMChecking(String ac,String pas,int money) {
		super(ac,pas);
		this.money = money;
	}
	public boolean checkBookBank() throws IOException{
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		
		while(read.hasNext()){
			String account = read.next();
			String password = read.next();
			String money = read.next();
			int newmoney = Integer.parseInt(money);
			
			if((account == super.getID()&&password == super.getPass())&&this.money == newmoney) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
		
	}
	public void show() {
		System.out.println("You drawing for "+this.money+", get");
		
	}
	
}
