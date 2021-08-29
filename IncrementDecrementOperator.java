//Increment ++ and Decrement -- Operator Overloading in Java Programming


import java.util.Scanner;
class IncrementDecrementOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int var1, var2;
        System.out.print("Enter the first variable:");
        var1=sc.nextInt();
        System.out.print("Enter the second variable:");
        var2=sc.nextInt();
        System.out.println(var1++);
        System.out.println(++var2);
        System.out.println(var1--);
        System.out.println(--var2);
    }
}