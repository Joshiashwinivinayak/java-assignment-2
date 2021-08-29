//Write a program to reverse a String in C/Java/Python or choice of your programming language. You can write either the recursive or iterative solution. For example, if a given input is "abcd," then your function should return "dcba".


import java.util.*;
class ReverseStringExample {
	public static void main(String args[]) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string to reverse:");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1 ; i >= 0 ; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reverse of the string:" + reverse);
	}
}