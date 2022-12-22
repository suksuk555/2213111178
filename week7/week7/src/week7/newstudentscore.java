package week7;


import java.util.Scanner;

public class newstudentscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many student in the classroom : ");
		int students = sc.nextInt();
		student[] std = new student[students];
		
		for(int i = 0;i<std.length;i++) {
			std[i] = new student();
			System.out.print("Input student name : ");
			std[i].setName(sc.nextLine());
			System.out.print("Input student score : ");
			std[i].setScore(sc.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score again : ");
				std[i].setScore(sc.nextInt());
			}
			System.out.println("-------------------------");

	}
		for(student STD : std) {
			if(STD.isPass()) {
				System.out.println(">> "+STD.getName()+" ("+STD.getScore()+") ");
			}
		}

}
}
