package week3;
import javax.swing.*;
import java.text.*;

public class Lab301 {
	static final int priceperson = 299;

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00")
		int numberofcus = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double totalp = numberofcus*priceperson;
		int membercard = JOptionPane.showConfirmDialog(null,"Total price is "+totalp+" baht."+"\nDo you have a membercard");
		do {
		if(membercard == 0) {
			totalp = totalp*90/100;
			JOptionPane.showMessageDialog(null, "Amouth to be paid is "+totalp+" baht.");
		}
		else if(membercard == 1){
			JOptionPane.showMessageDialog(null, "Amouth to be paid is "+totalp+" baht.");
		}
		
			
		}while(membercard == 2);

	}


}