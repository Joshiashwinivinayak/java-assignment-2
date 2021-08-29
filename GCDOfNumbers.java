//Java Program to Find G.C.D Using Recursion

import java.util.Scanner;
public class GCD OfNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("Enter the first number:");
		n1 = sc.nextInt();
		System.out.print("Enter the second number:");
		n2 = sc.nextInt();
		int gcd = gcd(n1, n2);
		System.out.printf("G.C.D of %d and %d is %d.", n1, n2, gcd);
	}
	public static int gcd(int n1, int n2) {
		if (n2 != 0)
			return gcd(n2, n1 % n2);
		else
			return n1;
	}
}