//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.


import java.util.Scanner;
class ReverseOfNumber{
   public static void main(String args[]) {
      int num=0;
      int reversenum =0;
      System.out.print("Input the number:");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }
      System.out.println("Reverse of input number is:"+reversenum);
   }
}