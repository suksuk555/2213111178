package week10;
import java.util.*;

public class BookDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input author name ; ");
		String name = sc.nextLine();
		System.out.print("Input author e-mail ; ");
		String email = sc.nextLine();
		
		Author1 aut = new Author1(name,email);
		System.out.print(aut);
		
		System.out.println();
		System.out.print("Input book title : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("Input book page : ");
		int page = sc.nextInt();
		
		Book1 book = new Book1(title,aut,page);
		System.out.println(book);





	}

}
