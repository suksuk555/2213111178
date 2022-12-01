package week4;
import java.util.*;
import javax.swing.*;

public class ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "";
		String txt = "";
		while(true) {
			System.out.print("Enter word : ");
			word = sc.nextLine();
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			txt = txt+word+" ";
		}
		System.out.println(txt);

	}

}
