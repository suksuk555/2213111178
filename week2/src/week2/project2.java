package week2;
import java.util.*;

public class project2 {

	public static void main(String[] args) {
	
		System.out.print("Input number of minute: ");
		Scanner sc = new Scanner(System.in);
		int minute = sc.nextInt();
		int year = minute/525660;
		double min = minute/1400;
		double min1 = min%365;
		double min2 =min1*365;
		
		
		
		System.out.println(minute+" minute is approximately "+year+" year and "+min2+" days");
	}

}
