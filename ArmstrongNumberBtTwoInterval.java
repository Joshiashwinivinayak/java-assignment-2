//Java Program to Display Armstrong Number Between Two Intervals integers


import java.util.Scanner;
class ArmstrongNumberBtTwoInterval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low, high;
		System.out.print("Enter the low number:");
		low = sc.nextInt();
		System.out.print("Enter the high number:");
		high = sc.nextInt();
		for (int number = low + 1; number < high; ++number) {
			int digits = 0;
			int result = 0;
			int originalNumber = number;
			while (originalNumber != 0) {
				originalNumber /= 10;
				++digits;
			}
			originalNumber = number;
			while (originalNumber != 0) {
				int remainder = originalNumber % 10;
				result += Math.pow(remainder, digits);
				originalNumber /= 10;
			}
			if (result == number) {
				System.out.print(number + " ");
			}
		}
	}
}