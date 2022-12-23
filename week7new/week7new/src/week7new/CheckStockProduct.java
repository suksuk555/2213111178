package week7new;
import java.util.*;
import java.text.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("How many product list in stock : ");
        int input = sc.nextInt();
		Product[]  pro = new Product[input];
        System.out.println();
		for(int i = 0;i<input;i++) {
            pro[i]=new Product();
			System.out.print("Input product Id : ");
			pro[i].setId(sc.next());
			System.out.print("Input product Unit : ");
			pro[i].setUnit(sc.nextInt());
			System.out.println();
		}
        System.out.println("--------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------------");
        for(Product pd : pro) {
			if(pd.setStatus(pd.getUnit())=="LOW") {
				System.out.println(">>"+pd.getId()+" has "+pd.getUnit()+" unit");
			}
		}
        System.out.println("--------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------------");
        for(Product pd : pro) {
			if(pd.setStatus(pd.getUnit())=="NORMAL") {
				System.out.println(">>"+pd.getId()+" has "+pd.getUnit()+" unit");
			}
		}
        System.out.println("--------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("--------------------------------------");
        for(Product pd : pro) {
			if(pd.setStatus(pd.getUnit())=="HIGH") {
				System.out.println(">>"+pd.getId()+" has "+pd.getUnit()+" unit");
			}
		}

	}

}
