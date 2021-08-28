//Java Program to Add, subtract, multiply and divide Two Numbers

import java.util.Scanner;
public class ArithmeticOperations {
	public static void main(String args[])  {
		int num1, num2, add, subtract, multiply;
		float devide;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		add = num1 + num2;
		subtract = num1 - num2;
		multiply = num1 * num2;
		devide = (float) num1 / num2;
		System.out.println("Sum=" + add);
		System.out.println("Difference=" + subtract);
		System.out.println("Multiplication=" + multiply);
		System.out.println("Division=" + devide);
	}
}