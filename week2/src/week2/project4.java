package week2;
import javax.swing.*;
import java.text.*;

public class project4 {
	static final double tax = .0625;

	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("##.##");
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		NumberFormat f2 = NumberFormat.getPercentInstance();
		String id = JOptionPane.showInputDialog("This programs calculates the total cost of a CD order\nPlese enter the ID of the CD");
		String title = JOptionPane.showInputDialog("Plese enter the title of the CD");
		String str_price = JOptionPane.showInputDialog("Plese enter the price of CD in U.S. dollars");
		double price = Double.parseDouble(str_price);
		String str_quan = JOptionPane.showInputDialog("Plese enter the quantity to be purchased");
		int quan = Integer.parseInt(str_quan);
		
		double subtotal = price*quan;
		double newtotal = subtotal*(1+tax);
		
		
		
		JOptionPane.showMessageDialog(null, "CD ID: "+id+
									"\nCD Tit;e: "+title+
									"\nCD Unit Price: "+f1.format(price)+
									"\nCD Quantity: "+quan+
									"\n\n"+
									"Subtotal: $"+subtotal+
									"\nTax rate: "+tax*100+"%"+
									"\nTotal: $"+newtotal+
									"\n\n"+
									"End of Program");
	}

}
