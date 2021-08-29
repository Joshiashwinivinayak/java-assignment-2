//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.

import java.util.Scanner;
public class SumAgain {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int number1, number2;
		char choice;
		do {
			System.out.print("Enter the first number:");
			number1 = sc.nextInt();
			System.out.print("Enter the second number:");
			number2 = sc.nextInt();
			int sum = number1 + number2;
			System.out.println("Sum of numbers: " + sum);
			System.out.print("Do you want to continue y/n? ");
			choice = sc.next().charAt(0);
			System.out.println();
		} while (choice == 'y' || choice == 'Y');
	}
}