package week6;
import java.util.*;

public class javaLab603 {
	static int []number = {78,36,58,41,25,92,75};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Input index of array : ");
		int index = sc.nextInt();
		while(index < 0|| index>number.length-1) {
			System.out.print("Input index of array, again : ");
			index = sc.nextInt();
		}
		System.out.println("value in current index is "+(number[index]));
	//	System.out.println("value in current index is "+(number[index]));
		if(index == 6) {
			System.out.println("Sorry, "+index+" is the last index in array");
		}
		else {
			System.out.println("value in current index is "+(number[index+1]));

		}
	}

}
