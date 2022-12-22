package week7;
import java.util.*;

public class stockproduct {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product[]  pro = new product[3];
		for(int i = 0;i<4;i++) {
			System.out.print("Input product Id : ");
			pro[i].setId(sc.nextLine());
			System.out.print("Input product Unit : ");
			pro[i].setUnit(sc.nextInt());
			System.out.print("Input product Price : ");
			pro[i].setPrice(sc.nextDouble());
		}
		
		

	}

}
