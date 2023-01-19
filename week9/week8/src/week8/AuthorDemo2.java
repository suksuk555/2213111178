package week8;
import java.util.*;

public class AuthorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		Author [] at = new Author[4];
		int count = 1;
		for(int i = 0;i<at.length;i++) {
			at[i] = new Author();
			System.out.println("Information Author "+count);
			Line();
			System.out.print("Input author name: ");
			String name = sc.nextLine();
			System.out.print("Input author e-mail: ");
			String email = sc.nextLine();
			at[i] = new Author(name,email);
			count++;

		}
		System.out.println();
		for(int i = 0;i<at.length;i++) {
			System.out.println((i+1)+" "+at[i].getName()+" ("+at[i].getEmail()+")");
		}

	}
	public static void Line() {
		System.out.println("-------------------------------------");
	}
	

}
