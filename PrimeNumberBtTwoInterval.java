//Java Program to Display Prime Number between two intervels

import java.util.Scanner;
public class PrimeNumberBtTwoInterval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low, high;
		System.out.print("Enter the low number:");
		low = sc.nextInt();
		System.out.print("Enter the high number:");
		high = sc.nextInt();
		while (low < high) {
			boolean flag = false;
			for (int i = 2; i <= low / 2; ++i) {
				if (low % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag && low != 0 && low != 1)
				System.out.print(low + " ");
			++low;
		}
	}
}