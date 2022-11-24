package week3;

import java.util.*;
import java.text.*;

public class Lab8 {

	public static void main(String[] args) {
		DecimalFormat frn = new DecimalFormat("###0.00");
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;

		int taxableIncome;
		double taxPayable;

		System.out.print("Enter the taxable in come: $");
		taxableIncome = sc.nextInt();
		double truetax;
		if (taxableIncome <= 20000) {

			System.out.println("The income tax payable is :$" + frn.format(0.00));
		} else if (taxableIncome <= 40000) {
			truetax = (taxableIncome-20000) * TAX_RATE_ABOVE_20K;
			System.out.println("The income tax payable is :$" + frn.format(truetax));
		} else if (taxableIncome <= 60000) {
			truetax = 20000 * TAX_RATE_ABOVE_20K + (taxableIncome-40000) * TAX_RATE_ABOVE_40K;
			System.out.println("The income tax payable is :$" + frn.format(truetax));
		} else {
			truetax = 20000 * TAX_RATE_ABOVE_20K + 20000 * TAX_RATE_ABOVE_40K + (taxableIncome-60000) * TAX_RATE_ABOVE_60K;
			System.out.println("The income tax payable is :$" + frn.format(truetax));
		}

	}

}
