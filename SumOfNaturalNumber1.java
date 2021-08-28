//Java Program to Calculate Sum of Natural Numbers

import java.util.Scanner;
public class SumOfNaturalNumber1  {
	public static void main(String[] args) {
		int i, num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		num = sc.nextInt();
		for (i = 1; i <= num; ++i) {
			sum = sum + i;
		}
		System.out.println("Sum of first " + num + " Natural Numbers is=" + sum);
	}
}