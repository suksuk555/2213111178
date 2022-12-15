package week6;
import java.util.*;


public class Lab603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		int num = sumOfPos(arr);
		System.out.println("\nSummation of positive number is "+num);

	}
	public static int sumOfPos(int[]nums) {
		
		int sum = 0;
		for(int i : nums) {
			sum = sum+i;
		}
		return sum;
	}

}
