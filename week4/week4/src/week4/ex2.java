package week4;
import javax.swing.*;

public class ex2 {

	public static void main(String[] args) {
		
		String inputemail = JOptionPane.showInputDialog(null,"Input your e-mail:");
		while(inputemail.startsWith("@")||inputemail.contains(" ")) {
			inputemail = JOptionPane.showInputDialog(null,"Input your e-mail ,again:");
			
		}
		inputemail = inputemail.toLowerCase();
		
/*		if(inputemail.endsWith("@gmail.com")||inputemail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "your email is "+inputemail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your email i not hotmail or gmail.com");
		}*/
		boolean check = inputemail.endsWith("@gmail.com")||inputemail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (check)?"Your e-mail is"+inputemail : "Your e-mail is not hotmail or gmail.com");
	}

}
