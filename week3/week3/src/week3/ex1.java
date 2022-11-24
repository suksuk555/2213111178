package week3;
import javax.swing.*;

public class ex1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input fullname");
		int birthyear = Integer.parseInt(JOptionPane.showInputDialog("Input Birthyear"));
		while(birthyear<1980||birthyear>2018) {
			birthyear = Integer.parseInt(JOptionPane.showInputDialog("Input Birthyear"));
			
		}
		int gender = JOptionPane.showConfirmDialog(null,"Are you Female","Gender",JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null,"Fell naame : "+name+"\nBirth year :"+birthyear+"\nYou're"+(gender == 0 ? "female" : "male"));

	}

}
