package week4;
import java.util.*;

public class lab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Message : ");
		String message = sc.nextLine();
		message = message.toLowerCase(); 
		if((message.indexOf("nichi")>=0)) {
			System.out.println("Nichi is a sentence");
		}
		else {
			System.out.println(message);
		}

	}

}
