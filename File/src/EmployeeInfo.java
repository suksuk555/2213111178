import java.util.*;
import java.io.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice;
		System.out.print("Insert or Read data() : ");
		choice = sc.next().toLowerCase();
		while(!choice.equals("insert")&&!choice.equals("read")) {
			System.out.print("Plese text : ");
			choice = sc.next().toLowerCase();
		}
		
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) {
			file.insert();//call insert method
		}
		else {
			System.out.print("\nEnter department : ");
			String department = sc.next();
			file.setDept(department);
			file.read();
		}
		

	}

}
