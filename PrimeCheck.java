//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

import java.util.Scanner;
class PrimeCheck {
	public static void main(String args[]) {
		int temp;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any positive number:");
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