//Write a program in any programming language you to find the first non-repeated character in a given String, for example, if the given String is "Java" then the first non-repeated character is "J"

import java.util.*;
public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str1 = "google";
		System.out.println("The given string is: " + str1);
		for (int i = 0; i < str1.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println("The first non repeated character in String is:" + str1.charAt(i));
				break;
			}
		}
	}
}