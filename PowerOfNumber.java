//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)


import java.util.Scanner;
public class PowerOfNumber {
	static int power(int base, int exponent)  {
		int power = 1;
		for (int i = 1; i <= exponent; i++)
			power = power * base;
		return power;
	}
	public static void main(String args[]) {
		int base, exponent;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base:");
		base = sc.nextInt();
		System.out.print("Enter the exponent:");
		exponent = sc.nextInt();
		int pow = power(base, exponent);
		System.out.println(base + " to the power " + exponent + " is:" + pow);
	}
}