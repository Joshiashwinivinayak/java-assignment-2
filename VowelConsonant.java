//Java Program to Check Whether a character is Vowel or Consonant

import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:");
        ch=sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}