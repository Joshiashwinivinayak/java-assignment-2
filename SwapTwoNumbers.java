//Java Program to Swap Two Numbers


import java.util.Scanner;  
class SwapTwoNumbers {  
    public static void main(String[] args) {  
       int x, y, t;
       Scanner sc = new Scanner(System.in);  
       System.out.print("Enter the value of X:");  
       x = sc.nextInt();  
       System.out.print("Enter the value of Y:");
       y = sc.nextInt();  
       System.out.println("before swapping numbers X="+x +"  Y="+ y); 
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping X="+x +"  Y=" + y);  
       System.out.println( );  
    }    
}  