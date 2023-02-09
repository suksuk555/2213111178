import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input radius : ");
		double radius = sc.nextDouble();
		System.out.print("Input height : ");
		double height = sc.nextDouble();
		Circle c1 = new Circle(radius,null);
		
		System.out.println("Circle"+c1);
		System.out.println("Circle"+c1.getArea());
		
		Cylinder cy1 = new Cylinder(radius,height);
		System.out.println("Cylinder"+cy1);
		System.out.println("Cylinder"+cy1.getArea());
		System.out.println("Cylinder"+cy1.getVolum());

		
	}

}
