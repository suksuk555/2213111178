package week7;
import java.util.*;

public class studentscore {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		student[] std = new student[3];
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
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("--------------------------");
		/*for(int i = 0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.println(">> "+std[i].getName()+" ("+std[i].getScore()+") ");
			}
		}
		*/
		for(student STD : std) {
			if(STD.isPass()) {
				System.out.println(">> "+STD.getName()+" ("+STD.getScore()+") ");
			}
		}



	}

}
