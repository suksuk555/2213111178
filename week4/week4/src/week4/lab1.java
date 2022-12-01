package week4;
import java.util.*;

public class lab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Full name : ");
		String full = sc.nextLine();
		int space = full.indexOf(' ');
		if(space == -1) {
			System.out.println("Incorrect Name");
		}
		else {
			System.out.println("First Name : "+full.substring(0,space).toUpperCase());
			System.out.println("Last Name : "+full.substring(space+1).toLowerCase());
		}

	}

}
