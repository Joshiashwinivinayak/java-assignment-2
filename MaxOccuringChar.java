//Write an efficient Java/C/Python program to return the maximum occurring character in the input string, e.g., if the input string is "Java" then the function should return 'a'.

class MaxOccuringChar {
	static char MaxOccurringChar(char str[]) {
		int freq[] = new int[26];
		int max = -1;
		char result = 0;
		int len = str.length;
		for (int i = 0; i < len; i++) {
			if (str[i] != ' ') {
				freq[str[i] - 'a']++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (max < freq[i]) {
				max = freq[i];
				result = (char)(i + 'a');
			}
		}
		return result;
	}
	public static void main(String[] args) {
		char str[] = "sample program mammle".toCharArray();
		System.out.println("Maximum occurring character = " + getMaxOccurringChar(str));
	}
}