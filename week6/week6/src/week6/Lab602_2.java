package week6;

import javax.swing.JOptionPane;

public class Lab602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean check = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputname = JOptionPane.showInputDialog("Enter a department name");
		for(int i = 0;i<deptName.length;i++) {
			if(inputname.equalsIgnoreCase(deptName[i])) {
				
				check = true;
			}
			
		}
		if(check) {
			JOptionPane.showMessageDialog(null, inputname+" was found in list");
		}
		else {
			JOptionPane.showMessageDialog(null, inputname+" was not found in list");
		}
	}

}
