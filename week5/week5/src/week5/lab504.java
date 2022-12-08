package week5;
import java.util.*;

public class lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Plese enter your name, separated by a space.\n:");
		String fullnames = sc.nextLine();
		String name;
		int space = fullnames.indexOf(" ");
		name = fullnames.substring(0,space);
		String newname = abbreviatName(fullnames);
		System.out.println(newname.toUpperCase() + name);
	}
	public static String abbreviatName(String fullname) {
		String first = "";
		for(int i = 0;i < fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				first = first+fullname.charAt(i+1);
				first = first+".";
			}
		}
		return first;
		
	}

}
