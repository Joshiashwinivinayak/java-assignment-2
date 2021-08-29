//Write a program to find the factorial value of any number entered through the keyboard. 

import java.util.Scanner;
public class Factorial{
   public static void main(String args[]){
      int i =1, factorial=1, number;
      System.out.print("Enter the number to which you need to find the factorial:");
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();

      while(i <=number) {
         factorial = factorial * i;
         i++;
      }
      System.out.println("Factorial of the given number is:"+factorial);
   }
}