package week5;
import javax.swing.*;

public class lab503 {
	static int inputyear;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	inputyear = Integer.parseInt(JOptionPane.showInputDialog("Input year"));
	//	boolean chkyear = checkyear(inputyear);
		inputyear = Integer.parseInt(JOptionPane.showInputDialog("Input year"));
		while(!checkyear(inputyear)) {
			inputyear =  Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000"));
		}
		if(isleapyear(inputyear)) {
			JOptionPane.showMessageDialog(null, inputyear+"is leap year");
		}
		else {
			JOptionPane.showMessageDialog(null, inputyear+"is not leap year");
		}
	}
	public static boolean checkyear(int year) {
		if(year >= 100 && year <= 3000) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isleapyear(int year) {
		if((year%4==0)&&((year%100!=0)||(year%400==0))) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
