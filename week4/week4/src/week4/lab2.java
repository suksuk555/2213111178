package week4;
import java.util.*;

public class lab2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Input some sentence : ");
		String newsen = sc.nextLine();
		while(!newsen.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			newsen = sc.nextLine();
		}
		System.out.println();
		
		for(int i = 0;i<newsen.length();i++) {
			if(newsen.charAt(i) != ' ') {
				System.out.print(newsen.charAt(i));
			}
			else {
				System.out.println();
			}
		}

	}

}
