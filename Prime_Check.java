//Java Program to Check Whether a Number is Prime or Not.

import java.util.Scanner;
class Prime_Check {
	public static void main(String args[]) {
		int temp;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		sc.close();
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}
}