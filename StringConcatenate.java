//Java Program to Concatenate Two Strings

import java.util.*;
class StringConcatenate {
	public static void main(String args[]) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st string:");
		str1 = sc.nextLine();
		System.out.print("Enter the 2nd string:");
		str2 = sc.nextLine();
		System.out.println("Concatenated String is ");
		System.out.println(str1.concat(str2));
	}
}