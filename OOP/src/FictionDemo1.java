import java.util.*;
public class FictionDemo1 implement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input title : ");
		String title = sc.nextLine();
		System.out.print("Input publicyear : ");
		int pub = sc.nextInt();
		
		FictionBook book = new FictionBook(title,pub);
		System.out.print("Input author : ");
		String au = sc.nextLine();
		System.out.print("Input author email : ");
		String email = sc.nextLine();

	}

}
