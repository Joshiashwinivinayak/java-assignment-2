//Write a program to calculate the sum of first 10 natural number.

public class Sum_Of_First_10_Natural_Numbers {
	public static void main(String[] args)   {
		int i, num = 10, sum = 0;
		for (i = 1; i <= num; ++i)  {
			sum = sum + i;
		}
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);
	}
}