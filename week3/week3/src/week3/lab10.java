package week3;
import java.text.*;
import java.util.*;

public class lab10 {

	public static void main(String[] args) {
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		
		DecimalFormat frm = new DecimalFormat("#,##0.00");
		Scanner sc = new Scanner(System.in);
		int sale;
		
		double salary = 0;
		do {
			System.out.print("enter sales in dollors (or -1 to end)");
			sale = sc.nextInt();
			if(sale!=-1) {
				salary = 1000 + sale * COMMISSION_RATE;
				System.out.println("Salary is: $"+frm.format(salary));
				
			}
			else {
				System.out.println("bye");
			}
		}while(sale!=-1);

	}

}
