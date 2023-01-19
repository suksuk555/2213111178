package week8;
import java.util.*;

public class AuthorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input author name   : ");
		String name = sc.nextLine();
		System.out.print("Input author e-mail : ");
		String email = sc.nextLine();
		System.out.print("Input author gender : ");
		char gender  = sc.next().charAt(0);
		
		
		Author at = new Author(name,email,gender);
		System.out.println();
		System.out.println("Author name:" +at.toString());


	}

}
