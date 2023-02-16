import java.util.*;
public class ATMBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account : ");
		String account = sc.nextLine();
		while(account == "#-###-###-##-#") {
			System.out.print("Input wrong type, Enter account number : ");
		}
		
		System.out.print("Enter password : ");
		String password = sc.nextLine();
		while(password.length() != 4) {
			System.out.print("Enter password : ");
			password = sc.nextLine();
		}
		
		
		System.out.print("Enter money");
		int money = sc.nextInt();
		while(money < 0) {
			System.out.print("Enter money : ");
			money = sc.nextInt();
		}
		
		
		ATMChecking atm = new ATMChecking(account,password,money);
		atm.show();
	}

}
