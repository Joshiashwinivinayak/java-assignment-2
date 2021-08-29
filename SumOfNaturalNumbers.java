//Java program to Find Sum of Natural Numbers using Recursion

import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        number=sc.nextInt();
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
    }
    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
                    else
            return num;
    }
}