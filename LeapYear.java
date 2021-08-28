//Java Program to Check Leap year

import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		boolean leap = false;
		System.out.print("Enter the year:");
		year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;
		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}
}