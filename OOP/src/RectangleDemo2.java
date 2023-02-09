import java.util.*;

public class RectangleDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input length : ");
		double l = sc.nextDouble();
		System.out.print("Input length : ");
		double w = sc.nextDouble();
		Rectangle2 rec = new Rectangle2(w,l);
		System.out.println(rec);
		System.out.println("Area of rectangle is "+rec.getArea());

	}
}
