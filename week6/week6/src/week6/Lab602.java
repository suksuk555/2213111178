package week6;

import javax.swing.JOptionPane;

public class Lab602 {
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	static double itemprice = 0;
	static boolean vitem = false;
	static int itemorder;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputItem();

	}
	public static void inputItem() {
		itemorder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		boolean check = checkitem(itemorder);
		if(check) {
			System.out.println("Item "+itemorder+" is "+itemprice);
		}
		else {
			System.out.println("invalid Item");

		}
	}
	
	public static boolean checkitem(int item) {
		for(int i = 0;i<validValues.length;i++) {
			if(item == validValues[i]) {
				vitem = true;
				itemprice = price[i];
			}
			
	}
		return vitem;
	}
}
