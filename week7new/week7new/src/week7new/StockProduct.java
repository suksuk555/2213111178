package week7new;
import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("#,###.00");
        Scanner sc = new Scanner(System.in);
		Product[]  pro = new Product[4];
		for(int i = 0;i<pro.length;i++) {
            pro[i]=new Product();
			System.out.print("Input product Id : ");
			pro[i].setId(sc.next());
			System.out.print("Input product Unit : ");
			pro[i].setUnit(sc.nextInt());
			System.out.print("Input product Price : ");
			pro[i].setPrice(sc.nextDouble());
            System.out.println();
		}
		double sum = 0;
		System.out.println("---------------------------------------");
		for(Product pb : pro){
			System.out.println("Product ID : "+pb.getId()+", Total price = "+frm.format(pb.calculate())+" baht.");
			sum  = sum + pb.calculate();;
		}
		
		
		
		System.out.println("Total price of all product is "+frm.format(sum)+" baht.");

	}

}
