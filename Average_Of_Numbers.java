//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

import java.io.*;
import java.util.*;
class Average_Of_Numbers {
	public static void main(String args[]) {
		int a, b, c, avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		a = sc.nextInt();
		System.out.print("Enter the value of b:");
		b = sc.nextInt();
		System.out.print("Enter the value of c:");
		c = sc.nextInt();
		System.out.println("The average of three no. is :" + average(a, b, c));
	}
	public static int average(int a, int b, int c) {
		return (a + b + c) / 3;
	}
}