import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cylinder[] cy = new Cylinder[5];
		
		for(int i = 0;i<cy.length;i++) {
			System.out.print("Input : ");
			double h = sc.nextDouble();
			double r = sc.nextDouble();
			cy[i] = new Cylinder(h,r);
		}
		for(int i = 0;i<cy.length;i++) {
			System.out.println("Cylinder "+i+", Volum = "+cy[i].getVolum());
		}

	}

}
