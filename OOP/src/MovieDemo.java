import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input movie id : ");
		String id = sc.nextLine();
		System.out.print("Input movie name : ");
		String name = sc.nextLine();
		
		
		System.out.println();
		System.out.print("Input director name  : ");
		String diname = sc.nextLine();
		System.out.print("Input director email  : ");
		String email = sc.nextLine();
		System.out.print("Input director gender  : ");
		char gen = sc.next().charAt(0);

		while(!((gen == 'm'||gen == 'M')||(gen == 'f'||gen == 'F'))) {
			System.out.print("Input director gender, again : ");
			gen = sc.next().charAt(0);
		}
		System.out.println();

		System.out.print("input movie theater no. : ");
		int theaterno = sc.nextInt();
		while(!(theaterno >=1&&theaterno<16)) {
			System.out.print("Plese input 1 - 15 only : ");
			theaterno = sc.nextInt();
		}
		Theater t = new Theater(id,name,new Director(diname,email,gen),theaterno);
		System.out.println();
		System.out.println(t);


		
		

	}

}
