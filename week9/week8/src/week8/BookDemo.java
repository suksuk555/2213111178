package week8;
import java.util.*;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input book title : ");
		b.setTitle(sc.nextLine());
		System.out.print("Input book price : ");
		b.setPrice(sc.nextFloat());
		System.out.print("Input book title : ");
		b.setPublishyear(sc.nextInt());
		System.out.println();
		System.out.println("Title: "+b.toString());

	}

}
