package week5;
import javax.swing.*;

public class lab502 {
	static String email;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		email = JOptionPane.showInputDialog(null,"Input your e-mail:");
		checkEmail(email);

	}
	public static void checkEmail(String checkem) {
		while(checkem.startsWith("@")||checkem.contains(" ")) {
			checkem = JOptionPane.showInputDialog("Input your email, again");
		}
		JOptionPane.showMessageDialog(null, checkEmail(checkem) ? "your email is"+checkem:"your email is not hot mail dot com");
	}
	public static boolean checkEmail(String checkem) {
		if(checkem.endsWith("@gmail.com")||checkem.endsWith("@hotmail.com"));{
		JOptionPane.showMessageDialog(null, "Your email is "+checkem);
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Your email i not hotmail or gmail.com");
		}
	}
	public static void inputEmail() {
		String answer = "";
		do {
			email = JOptionPane.showInputDialog("Input your email");
			checkEmail(email);
			answer = JOptionPane.showInputDialog("Continue[y]||Y to continue]");
		}while(answer.equalsIgnoreCase("y"));
	}

}
