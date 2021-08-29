//Write an efficient program in Java or C++ to reverse the words in a given String sentence. For example, if the input is "Java is best," then your program should print "best is Java". There is no restriction on preserving white space.

import java.util.regex.Pattern;
public class WordReverse {
	static String reverseWords(String str) {
		Pattern pattern = Pattern.compile("\\s");
		String[] temp = pattern.split(str);
		String result = "";
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		}
		return result;
	}
	public static void main(String[] args) {
		String s1 = "Java is best";
		System.out.println(reverseWords(s1));
	}
}