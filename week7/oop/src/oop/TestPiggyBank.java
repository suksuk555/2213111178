package oop;
import java.util.*;

public class TestPiggyBank {
	static Scanner sc = new Scanner(System.in);
	static Piggybank pb = new Piggybank();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piggybank pb = new Piggybank();
		/*
		pb.setPiggyBank(500);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addtwo(34);
		System.out.println("Add 2 baht Money : "+34);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addten(13);
		System.out.println("Add 10 baht Money : "+13);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addtwo(100);
		System.out.println("Add 2 baht Money : "+13);
		System.out.println("Money Total : "+pb.getTotal());
		*/
		sizePiggyBank();


	}
	public static void sizePiggyBank() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please defind size of PiggyBank : ");
		//int size = sc.nextInt();
		pb.setPiggyBank(sc.nextInt());
		System.out.println("Size of your PiggyBank : "+pb.getPiggyBank());
		inputcoin();
		
		
		

		

	}
	public static void inputcoin() {
		while(true) {
		System.out.println("\n==============================");
		System.out.println("Menu of PiggyBank");
		System.out.println("\n==============================");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] exit baht.");
		System.out.println("\n==============================");
		System.out.print("Please select choice: ");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Insert 1 baht : ");
			pb.addOne(sc.nextInt());
			
		}
		else if(choice == 2){
			System.out.println("Insert 2 baht : ");
			pb.addtwo(sc.nextInt());
		}
		else if (choice == 3) {
			System.out.println("Insert 5 baht : ");
			pb.addfive(sc.nextInt());
		}
		else if(choice == 4) {
			System.out.println("Insert 10 baht : ");
			pb.addten(sc.nextInt());
		}
		else if(choice == 5) {
			System.out.println("Bye Bey");
			break;
		}
		}


	}
	

}
