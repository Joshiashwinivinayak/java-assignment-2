//Java program to Calculate Factorial of a Number Using Recursion

import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args) {
        int num ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=sc.nextInt();
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
} 