package week4;
import java.util.*;
import javax.swing.*;

public class ex3 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String input = sc.nextLine();
		
		while(!input.endsWith(".")) {
			
		}
		System.out.println("This sentence");
		int space = 0;
		for(int i = 0;i<input.length();i++) {
			if(input.charAt(i)== ' ') {
				space++;
			}
		}
		System.out.println("This sentence has "+space+" spacebar.");
		System.out.println("This sentence has "+(space+1)+" word.");
*/
		String input = JOptionPane.showInputDialog(null,"Input a sentance:");
		while(!input.endsWith(".")) {
			input = JOptionPane.showInputDialog(null,"Input a sentance, again:");
		}
		int space = 0;
		for(int i = 0;i<input.length();i++) {
			if(input.charAt(i) == ' ') {
				space++;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has "+space+" spacebar."+"\nThis sentence has "+(space+1)+" word.");
		
	}

}
