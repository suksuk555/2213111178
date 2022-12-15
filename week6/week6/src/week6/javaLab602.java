package week6;
import java.util.*;

public class javaLab602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double []input = new double[5];
		double sum = 0;
		double average = 0;
		for(int i = 0; i<input.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			input[i] = sc.nextInt();
			sum = sum +input[i];
		}
		System.out.println();
		average = sum/(input.length);
		System.out.println("Average of "+input.length+" student is "+average);
		for(int i = 0 ;i<input.length;i++) {
			if(input[i]>average) {
				System.out.println("> Student "+(i+1)+" "+input[i]);

			}
		}

		

	}

}
